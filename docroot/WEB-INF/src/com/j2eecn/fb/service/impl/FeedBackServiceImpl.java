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
import com.j2eecn.fb.service.base.FeedBackServiceBaseImpl;
import com.liferay.portal.UserPortraitSizeException;
import com.liferay.portal.UserPortraitTypeException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.image.ImageBag;
import com.liferay.portal.kernel.image.ImageToolUtil;
import com.liferay.portal.kernel.util.PrefsPropsUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.model.Image;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ImageLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portlet.documentlibrary.ImageSizeException;

import java.awt.image.RenderedImage;
import java.io.IOException;
import java.util.Date;

/**
 * The implementation of the feed back remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.j2eecn.fb.service.FeedBackService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Administrator
 * @see com.j2eecn.fb.service.base.FeedBackServiceBaseImpl
 * @see com.j2eecn.fb.service.FeedBackServiceUtil
 */
public class FeedBackServiceImpl extends FeedBackServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.j2eecn.fb.service.FeedBackServiceUtil} to access the feed back remote service.
	 */
	public void addEntry(FeedBack entry,ServiceContext serviceContext,byte[] bytes)throws PortalException, SystemException
	{
		 feedBackLocalService.addEntry(entry, serviceContext, bytes);
	}
}