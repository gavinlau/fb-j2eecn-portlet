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
 * Provides a wrapper for {@link FeedBackLocalService}.
 *
 * @author Administrator
 * @see FeedBackLocalService
 * @generated
 */
public class FeedBackLocalServiceWrapper implements FeedBackLocalService,
	ServiceWrapper<FeedBackLocalService> {
	public FeedBackLocalServiceWrapper(
		FeedBackLocalService feedBackLocalService) {
		_feedBackLocalService = feedBackLocalService;
	}

	/**
	* Adds the feed back to the database. Also notifies the appropriate model listeners.
	*
	* @param feedBack the feed back
	* @return the feed back that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.j2eecn.fb.model.FeedBack addFeedBack(
		com.j2eecn.fb.model.FeedBack feedBack)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _feedBackLocalService.addFeedBack(feedBack);
	}

	/**
	* Creates a new feed back with the primary key. Does not add the feed back to the database.
	*
	* @param fbId the primary key for the new feed back
	* @return the new feed back
	*/
	@Override
	public com.j2eecn.fb.model.FeedBack createFeedBack(long fbId) {
		return _feedBackLocalService.createFeedBack(fbId);
	}

	/**
	* Deletes the feed back with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fbId the primary key of the feed back
	* @return the feed back that was removed
	* @throws PortalException if a feed back with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.j2eecn.fb.model.FeedBack deleteFeedBack(long fbId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _feedBackLocalService.deleteFeedBack(fbId);
	}

	/**
	* Deletes the feed back from the database. Also notifies the appropriate model listeners.
	*
	* @param feedBack the feed back
	* @return the feed back that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.j2eecn.fb.model.FeedBack deleteFeedBack(
		com.j2eecn.fb.model.FeedBack feedBack)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _feedBackLocalService.deleteFeedBack(feedBack);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _feedBackLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _feedBackLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.j2eecn.fb.model.impl.FeedBackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _feedBackLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.j2eecn.fb.model.impl.FeedBackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _feedBackLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _feedBackLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _feedBackLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.j2eecn.fb.model.FeedBack fetchFeedBack(long fbId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _feedBackLocalService.fetchFeedBack(fbId);
	}

	/**
	* Returns the feed back with the matching UUID and company.
	*
	* @param uuid the feed back's UUID
	* @param companyId the primary key of the company
	* @return the matching feed back, or <code>null</code> if a matching feed back could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.j2eecn.fb.model.FeedBack fetchFeedBackByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _feedBackLocalService.fetchFeedBackByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the feed back matching the UUID and group.
	*
	* @param uuid the feed back's UUID
	* @param groupId the primary key of the group
	* @return the matching feed back, or <code>null</code> if a matching feed back could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.j2eecn.fb.model.FeedBack fetchFeedBackByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _feedBackLocalService.fetchFeedBackByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the feed back with the primary key.
	*
	* @param fbId the primary key of the feed back
	* @return the feed back
	* @throws PortalException if a feed back with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.j2eecn.fb.model.FeedBack getFeedBack(long fbId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _feedBackLocalService.getFeedBack(fbId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _feedBackLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the feed back with the matching UUID and company.
	*
	* @param uuid the feed back's UUID
	* @param companyId the primary key of the company
	* @return the matching feed back
	* @throws PortalException if a matching feed back could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.j2eecn.fb.model.FeedBack getFeedBackByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _feedBackLocalService.getFeedBackByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the feed back matching the UUID and group.
	*
	* @param uuid the feed back's UUID
	* @param groupId the primary key of the group
	* @return the matching feed back
	* @throws PortalException if a matching feed back could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.j2eecn.fb.model.FeedBack getFeedBackByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _feedBackLocalService.getFeedBackByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the feed backs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.j2eecn.fb.model.impl.FeedBackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of feed backs
	* @param end the upper bound of the range of feed backs (not inclusive)
	* @return the range of feed backs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.j2eecn.fb.model.FeedBack> getFeedBacks(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _feedBackLocalService.getFeedBacks(start, end);
	}

	/**
	* Returns the number of feed backs.
	*
	* @return the number of feed backs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getFeedBacksCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _feedBackLocalService.getFeedBacksCount();
	}

	/**
	* Updates the feed back in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param feedBack the feed back
	* @return the feed back that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.j2eecn.fb.model.FeedBack updateFeedBack(
		com.j2eecn.fb.model.FeedBack feedBack)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _feedBackLocalService.updateFeedBack(feedBack);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _feedBackLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_feedBackLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _feedBackLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public com.j2eecn.fb.model.FeedBack addEntry(
		com.j2eecn.fb.model.FeedBack entry,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return _feedBackLocalService.addEntry(entry, serviceContext);
	}

	@Override
	public java.lang.String attachFile(long fbId,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return _feedBackLocalService.attachFile(fbId, serviceContext);
	}

	@Override
	public void addEntry(com.j2eecn.fb.model.FeedBack entry,
		com.liferay.portal.service.ServiceContext serviceContext, byte[] bytes)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_feedBackLocalService.addEntry(entry, serviceContext, bytes);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public FeedBackLocalService getWrappedFeedBackLocalService() {
		return _feedBackLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedFeedBackLocalService(
		FeedBackLocalService feedBackLocalService) {
		_feedBackLocalService = feedBackLocalService;
	}

	@Override
	public FeedBackLocalService getWrappedService() {
		return _feedBackLocalService;
	}

	@Override
	public void setWrappedService(FeedBackLocalService feedBackLocalService) {
		_feedBackLocalService = feedBackLocalService;
	}

	private FeedBackLocalService _feedBackLocalService;
}