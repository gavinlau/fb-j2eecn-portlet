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

package com.j2eecn.fb.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FeedBackService}.
 *
 * @author Administrator
 * @see FeedBackService
 * @generated
 */
public class FeedBackServiceWrapper implements FeedBackService,
	ServiceWrapper<FeedBackService> {
	public FeedBackServiceWrapper(FeedBackService feedBackService) {
		_feedBackService = feedBackService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _feedBackService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_feedBackService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _feedBackService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public void addEntry(com.j2eecn.fb.model.FeedBack entry,
		com.liferay.portal.service.ServiceContext serviceContext, byte[] bytes)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_feedBackService.addEntry(entry, serviceContext, bytes);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public FeedBackService getWrappedFeedBackService() {
		return _feedBackService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedFeedBackService(FeedBackService feedBackService) {
		_feedBackService = feedBackService;
	}

	@Override
	public FeedBackService getWrappedService() {
		return _feedBackService;
	}

	@Override
	public void setWrappedService(FeedBackService feedBackService) {
		_feedBackService = feedBackService;
	}

	private FeedBackService _feedBackService;
}