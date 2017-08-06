/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.j2eecn.fb.service.impl;

import com.j2eecn.fb.model.FeedBack;
import com.j2eecn.fb.service.base.FeedBackLocalServiceBaseImpl;
import com.liferay.portal.UserPortraitSizeException;
import com.liferay.portal.UserPortraitTypeException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.image.ImageBag;
import com.liferay.portal.kernel.image.ImageToolUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PrefsPropsUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Image;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ImageLocalService;
import com.liferay.portal.service.ImageLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.documentlibrary.ImageSizeException;

import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * The implementation of the feed back local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.j2eecn.fb.service.FeedBackLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Administrator
 * @see com.j2eecn.fb.service.base.FeedBackLocalServiceBaseImpl
 * @see com.j2eecn.fb.service.FeedBackLocalServiceUtil
 */
public class FeedBackLocalServiceImpl extends FeedBackLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.j2eecn.fb.service.FeedBackLocalServiceUtil} to access the feed back local service.
	 */
	public FeedBack addEntry(FeedBack entry,ServiceContext serviceContext)
	{
		
		long entryId=0;
		User user=null;
		try {
			 entryId=counterLocalService.increment(FeedBack.class.toString());
			 user = UserLocalServiceUtil.getUserById(serviceContext.getUserId());
		} catch (SystemException e) {
			_log.error(e.getMessage());
			e.printStackTrace();
		} catch (PortalException e) {
			_log.error(e.getMessage());
			e.printStackTrace();
		}
		
		long groupId = serviceContext.getScopeGroupId();
		Date now=new Date();
		long comanyId=serviceContext.getCompanyId();
		
		//pk
		entry.setFbId(entryId);
		entry.setUuid(serviceContext.getUuid());
		
		//audit five
		entry.setCompanyId(comanyId);
		entry.setGroupId(groupId);
		entry.setUserName(user.getScreenName());
		entry.setUserId(user.getUserId());
		entry.setCreateDate(now);
		entry.setModifiedDate(now);
		
		
		try {
			this.addFeedBack(entry);
			String imgURL=this.attachFile(entry.getFbId(), serviceContext);
			entry.setImgURL(imgURL);
			
			this.updateFeedBack(entry);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return entry;
	}
	
	public String attachFile(long fbId,ServiceContext serviceContext)
	{
		String target=StringPool.BLANK;
		File fbImage=(File)serviceContext.getAttribute("FB_IMAGE");
		if(Validator.isNotNull(fbImage))
		{
			try {
				//themeDisplay.getPathImage()
				//http://10.5.27.9:8080/image/feedback/?image_id=101
				Image img=ImageLocalServiceUtil.updateImage(fbId,fbImage);
				target="/feedback/?image_id="+fbId;
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return target;
	}
	
	public void addEntry(FeedBack entry,ServiceContext serviceContext,byte[] bytes)throws PortalException, SystemException
	{

		long entryId=0;
		User user=null;
		try {
			 entryId=counterLocalService.increment(FeedBack.class.toString());
			 user = UserLocalServiceUtil.getUserById(serviceContext.getUserId());
		} catch (SystemException e) {
			_log.error(e.getMessage());
			e.printStackTrace();
		} catch (PortalException e) {
			_log.error(e.getMessage());
			e.printStackTrace();
		}
		
		long groupId = serviceContext.getScopeGroupId();
		Date now=new Date();
		long comanyId=serviceContext.getCompanyId();
		
		//pk
		entry.setFbId(entryId);
		entry.setUuid(serviceContext.getUuid());
		
		//audit five
		entry.setCompanyId(comanyId);
		entry.setGroupId(groupId);
		entry.setUserName(user.getScreenName());
		entry.setUserId(user.getUserId());
		entry.setCreateDate(now);
		entry.setModifiedDate(now);
		
		long imageId=0;
		
		
		try {
			long imageMaxSize = PrefsPropsUtil.getLong(
					PropsKeys.USERS_IMAGE_MAX_SIZE);

				if ((imageMaxSize > 0) &&
					((bytes == null) || (bytes.length > imageMaxSize))) {

					throw new UserPortraitSizeException();
				}
				
			ImageBag imageBag = ImageToolUtil.read(bytes);

			RenderedImage renderedImage = imageBag.getRenderedImage();

			if (renderedImage == null) {
				throw new UserPortraitTypeException();
			}

			renderedImage = ImageToolUtil.scale(
				renderedImage, 120,
				100);

			String contentType = imageBag.getType();

			Image image=ImageLocalServiceUtil.updateImage(
					entryId,
				ImageToolUtil.getBytes(renderedImage, contentType));
			imageId=image.getImageId();
		}
		catch (IOException ioe) {
			throw new ImageSizeException(ioe);
		}
		
		try {
			entry.setImgURL(imageId+"");
			this.addFeedBack(entry);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static Log _log=LogFactoryUtil.getLog(FeedBackLocalServiceImpl.class);
}