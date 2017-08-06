package com.j2eecn.fb;

import com.j2eecn.fb.model.FeedBack;
import com.j2eecn.fb.model.impl.FeedBackImpl;
import com.j2eecn.fb.service.FeedBackLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.ByteArrayFileInputStream;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletResponseUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.CharPool;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.File;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PrefsPropsUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.StreamUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.model.ResourcePermission;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ResourcePermissionLocalServiceUtil;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.service.permission.GroupPermissionUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.PortletURLFactoryUtil;
import com.liferay.portlet.documentlibrary.FileExtensionException;
import com.liferay.portlet.documentlibrary.FileNameException;
import com.liferay.portlet.documentlibrary.FileSizeException;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil;
import com.liferay.portlet.documentlibrary.util.DLUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.liferay.util.portlet.PortletProps;
/**
 * Portlet implementation class FeebBackPortlet
 */
public class FeedBackPortlet extends MVCPortlet {
	public void addFB(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		_log.info("com.j2eecn.fb-In FeedBackPortlet");
		ServiceContext serviceContext = null;
		try {
			serviceContext = ServiceContextFactory.getInstance(
					DLFileEntry.class.getName(), actionRequest);
		
			
		} catch (PortalException e1) {
			_log.error(e1.getMessage());
			e1.printStackTrace();
		} catch (SystemException e1) {
			_log.error(e1.getMessage());
			e1.printStackTrace();
		}

		User user=null;
		try {
			user = UserLocalServiceUtil.getUser(serviceContext.getUserId());
		} catch (PortalException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (SystemException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	
		//process image
		UploadPortletRequest upLoadResult=PortalUtil.getUploadPortletRequest(actionRequest);
		java.io.File fbFile=upLoadResult.getFile("fbFile");
		if(fbFile.getTotalSpace()>0)
		{
			serviceContext.setAttribute("FB_IMAGE", fbFile);
		}
		
		//process Entry
		FeedBack entry=new FeedBackImpl();
		String content = ParamUtil.getString(actionRequest, "content");
		int type = ParamUtil.getInteger(actionRequest, "type");
		entry.setContent(content);
		entry.setType(type);
		
		FeedBackLocalServiceUtil.addEntry(entry, serviceContext);
		
		//redirect 
		String redirectURL=ParamUtil.getString(upLoadResult, "redirectURL");
		actionResponse.sendRedirect(redirectURL);
		
	}
	private static Log _log = LogFactoryUtil.getLog(FeedBackPortlet.class);
}
