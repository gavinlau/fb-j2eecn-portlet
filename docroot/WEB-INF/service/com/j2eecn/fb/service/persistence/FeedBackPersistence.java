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

package com.j2eecn.fb.service.persistence;

import com.j2eecn.fb.model.FeedBack;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the feed back service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Administrator
 * @see FeedBackPersistenceImpl
 * @see FeedBackUtil
 * @generated
 */
public interface FeedBackPersistence extends BasePersistence<FeedBack> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FeedBackUtil} to access the feed back persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the feed backs where type = &#63;.
	*
	* @param type the type
	* @return the matching feed backs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.j2eecn.fb.model.FeedBack> findByType(int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the feed backs where type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.j2eecn.fb.model.impl.FeedBackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param type the type
	* @param start the lower bound of the range of feed backs
	* @param end the upper bound of the range of feed backs (not inclusive)
	* @return the range of matching feed backs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.j2eecn.fb.model.FeedBack> findByType(int type,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the feed backs where type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.j2eecn.fb.model.impl.FeedBackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param type the type
	* @param start the lower bound of the range of feed backs
	* @param end the upper bound of the range of feed backs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching feed backs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.j2eecn.fb.model.FeedBack> findByType(int type,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first feed back in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feed back
	* @throws com.j2eecn.fb.NoSuchFeedBackException if a matching feed back could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.fb.model.FeedBack findByType_First(int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.fb.NoSuchFeedBackException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first feed back in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feed back, or <code>null</code> if a matching feed back could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.fb.model.FeedBack fetchByType_First(int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last feed back in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feed back
	* @throws com.j2eecn.fb.NoSuchFeedBackException if a matching feed back could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.fb.model.FeedBack findByType_Last(int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.fb.NoSuchFeedBackException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last feed back in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feed back, or <code>null</code> if a matching feed back could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.fb.model.FeedBack fetchByType_Last(int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the feed backs before and after the current feed back in the ordered set where type = &#63;.
	*
	* @param fbId the primary key of the current feed back
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feed back
	* @throws com.j2eecn.fb.NoSuchFeedBackException if a feed back with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.fb.model.FeedBack[] findByType_PrevAndNext(long fbId,
		int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.j2eecn.fb.NoSuchFeedBackException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the feed backs where type = &#63; from the database.
	*
	* @param type the type
	* @throws SystemException if a system exception occurred
	*/
	public void removeByType(int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of feed backs where type = &#63;.
	*
	* @param type the type
	* @return the number of matching feed backs
	* @throws SystemException if a system exception occurred
	*/
	public int countByType(int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the feed back in the entity cache if it is enabled.
	*
	* @param feedBack the feed back
	*/
	public void cacheResult(com.j2eecn.fb.model.FeedBack feedBack);

	/**
	* Caches the feed backs in the entity cache if it is enabled.
	*
	* @param feedBacks the feed backs
	*/
	public void cacheResult(
		java.util.List<com.j2eecn.fb.model.FeedBack> feedBacks);

	/**
	* Creates a new feed back with the primary key. Does not add the feed back to the database.
	*
	* @param fbId the primary key for the new feed back
	* @return the new feed back
	*/
	public com.j2eecn.fb.model.FeedBack create(long fbId);

	/**
	* Removes the feed back with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fbId the primary key of the feed back
	* @return the feed back that was removed
	* @throws com.j2eecn.fb.NoSuchFeedBackException if a feed back with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.fb.model.FeedBack remove(long fbId)
		throws com.j2eecn.fb.NoSuchFeedBackException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.j2eecn.fb.model.FeedBack updateImpl(
		com.j2eecn.fb.model.FeedBack feedBack)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the feed back with the primary key or throws a {@link com.j2eecn.fb.NoSuchFeedBackException} if it could not be found.
	*
	* @param fbId the primary key of the feed back
	* @return the feed back
	* @throws com.j2eecn.fb.NoSuchFeedBackException if a feed back with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.fb.model.FeedBack findByPrimaryKey(long fbId)
		throws com.j2eecn.fb.NoSuchFeedBackException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the feed back with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fbId the primary key of the feed back
	* @return the feed back, or <code>null</code> if a feed back with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.j2eecn.fb.model.FeedBack fetchByPrimaryKey(long fbId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the feed backs.
	*
	* @return the feed backs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.j2eecn.fb.model.FeedBack> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.j2eecn.fb.model.FeedBack> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the feed backs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.j2eecn.fb.model.impl.FeedBackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of feed backs
	* @param end the upper bound of the range of feed backs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of feed backs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.j2eecn.fb.model.FeedBack> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the feed backs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of feed backs.
	*
	* @return the number of feed backs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}