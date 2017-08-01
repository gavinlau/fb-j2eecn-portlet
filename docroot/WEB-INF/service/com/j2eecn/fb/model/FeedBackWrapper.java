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

package com.j2eecn.fb.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FeedBack}.
 * </p>
 *
 * @author Administrator
 * @see FeedBack
 * @generated
 */
public class FeedBackWrapper implements FeedBack, ModelWrapper<FeedBack> {
	public FeedBackWrapper(FeedBack feedBack) {
		_feedBack = feedBack;
	}

	@Override
	public Class<?> getModelClass() {
		return FeedBack.class;
	}

	@Override
	public String getModelClassName() {
		return FeedBack.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("fbId", getFbId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());
		attributes.put("content", getContent());
		attributes.put("type", getType());
		attributes.put("imgURL", getImgURL());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long fbId = (Long)attributes.get("fbId");

		if (fbId != null) {
			setFbId(fbId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		Integer type = (Integer)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String imgURL = (String)attributes.get("imgURL");

		if (imgURL != null) {
			setImgURL(imgURL);
		}
	}

	/**
	* Returns the primary key of this feed back.
	*
	* @return the primary key of this feed back
	*/
	@Override
	public long getPrimaryKey() {
		return _feedBack.getPrimaryKey();
	}

	/**
	* Sets the primary key of this feed back.
	*
	* @param primaryKey the primary key of this feed back
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_feedBack.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the fb ID of this feed back.
	*
	* @return the fb ID of this feed back
	*/
	@Override
	public long getFbId() {
		return _feedBack.getFbId();
	}

	/**
	* Sets the fb ID of this feed back.
	*
	* @param fbId the fb ID of this feed back
	*/
	@Override
	public void setFbId(long fbId) {
		_feedBack.setFbId(fbId);
	}

	/**
	* Returns the group ID of this feed back.
	*
	* @return the group ID of this feed back
	*/
	@Override
	public long getGroupId() {
		return _feedBack.getGroupId();
	}

	/**
	* Sets the group ID of this feed back.
	*
	* @param groupId the group ID of this feed back
	*/
	@Override
	public void setGroupId(long groupId) {
		_feedBack.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this feed back.
	*
	* @return the company ID of this feed back
	*/
	@Override
	public long getCompanyId() {
		return _feedBack.getCompanyId();
	}

	/**
	* Sets the company ID of this feed back.
	*
	* @param companyId the company ID of this feed back
	*/
	@Override
	public void setCompanyId(long companyId) {
		_feedBack.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this feed back.
	*
	* @return the user ID of this feed back
	*/
	@Override
	public long getUserId() {
		return _feedBack.getUserId();
	}

	/**
	* Sets the user ID of this feed back.
	*
	* @param userId the user ID of this feed back
	*/
	@Override
	public void setUserId(long userId) {
		_feedBack.setUserId(userId);
	}

	/**
	* Returns the user uuid of this feed back.
	*
	* @return the user uuid of this feed back
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _feedBack.getUserUuid();
	}

	/**
	* Sets the user uuid of this feed back.
	*
	* @param userUuid the user uuid of this feed back
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_feedBack.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this feed back.
	*
	* @return the user name of this feed back
	*/
	@Override
	public java.lang.String getUserName() {
		return _feedBack.getUserName();
	}

	/**
	* Sets the user name of this feed back.
	*
	* @param userName the user name of this feed back
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_feedBack.setUserName(userName);
	}

	/**
	* Returns the create date of this feed back.
	*
	* @return the create date of this feed back
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _feedBack.getCreateDate();
	}

	/**
	* Sets the create date of this feed back.
	*
	* @param createDate the create date of this feed back
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_feedBack.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this feed back.
	*
	* @return the modified date of this feed back
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _feedBack.getModifiedDate();
	}

	/**
	* Sets the modified date of this feed back.
	*
	* @param modifiedDate the modified date of this feed back
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_feedBack.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the status of this feed back.
	*
	* @return the status of this feed back
	*/
	@Override
	public int getStatus() {
		return _feedBack.getStatus();
	}

	/**
	* Sets the status of this feed back.
	*
	* @param status the status of this feed back
	*/
	@Override
	public void setStatus(int status) {
		_feedBack.setStatus(status);
	}

	/**
	* Returns the status by user ID of this feed back.
	*
	* @return the status by user ID of this feed back
	*/
	@Override
	public long getStatusByUserId() {
		return _feedBack.getStatusByUserId();
	}

	/**
	* Sets the status by user ID of this feed back.
	*
	* @param statusByUserId the status by user ID of this feed back
	*/
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_feedBack.setStatusByUserId(statusByUserId);
	}

	/**
	* Returns the status by user uuid of this feed back.
	*
	* @return the status by user uuid of this feed back
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getStatusByUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _feedBack.getStatusByUserUuid();
	}

	/**
	* Sets the status by user uuid of this feed back.
	*
	* @param statusByUserUuid the status by user uuid of this feed back
	*/
	@Override
	public void setStatusByUserUuid(java.lang.String statusByUserUuid) {
		_feedBack.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	* Returns the status by user name of this feed back.
	*
	* @return the status by user name of this feed back
	*/
	@Override
	public java.lang.String getStatusByUserName() {
		return _feedBack.getStatusByUserName();
	}

	/**
	* Sets the status by user name of this feed back.
	*
	* @param statusByUserName the status by user name of this feed back
	*/
	@Override
	public void setStatusByUserName(java.lang.String statusByUserName) {
		_feedBack.setStatusByUserName(statusByUserName);
	}

	/**
	* Returns the status date of this feed back.
	*
	* @return the status date of this feed back
	*/
	@Override
	public java.util.Date getStatusDate() {
		return _feedBack.getStatusDate();
	}

	/**
	* Sets the status date of this feed back.
	*
	* @param statusDate the status date of this feed back
	*/
	@Override
	public void setStatusDate(java.util.Date statusDate) {
		_feedBack.setStatusDate(statusDate);
	}

	/**
	* Returns the content of this feed back.
	*
	* @return the content of this feed back
	*/
	@Override
	public java.lang.String getContent() {
		return _feedBack.getContent();
	}

	/**
	* Sets the content of this feed back.
	*
	* @param content the content of this feed back
	*/
	@Override
	public void setContent(java.lang.String content) {
		_feedBack.setContent(content);
	}

	/**
	* Returns the type of this feed back.
	*
	* @return the type of this feed back
	*/
	@Override
	public int getType() {
		return _feedBack.getType();
	}

	/**
	* Sets the type of this feed back.
	*
	* @param type the type of this feed back
	*/
	@Override
	public void setType(int type) {
		_feedBack.setType(type);
	}

	/**
	* Returns the img u r l of this feed back.
	*
	* @return the img u r l of this feed back
	*/
	@Override
	public java.lang.String getImgURL() {
		return _feedBack.getImgURL();
	}

	/**
	* Sets the img u r l of this feed back.
	*
	* @param imgURL the img u r l of this feed back
	*/
	@Override
	public void setImgURL(java.lang.String imgURL) {
		_feedBack.setImgURL(imgURL);
	}

	/**
	* @deprecated As of 6.1.0, replaced by {@link #isApproved()}
	*/
	@Override
	public boolean getApproved() {
		return _feedBack.getApproved();
	}

	/**
	* Returns <code>true</code> if this feed back is approved.
	*
	* @return <code>true</code> if this feed back is approved; <code>false</code> otherwise
	*/
	@Override
	public boolean isApproved() {
		return _feedBack.isApproved();
	}

	/**
	* Returns <code>true</code> if this feed back is denied.
	*
	* @return <code>true</code> if this feed back is denied; <code>false</code> otherwise
	*/
	@Override
	public boolean isDenied() {
		return _feedBack.isDenied();
	}

	/**
	* Returns <code>true</code> if this feed back is a draft.
	*
	* @return <code>true</code> if this feed back is a draft; <code>false</code> otherwise
	*/
	@Override
	public boolean isDraft() {
		return _feedBack.isDraft();
	}

	/**
	* Returns <code>true</code> if this feed back is expired.
	*
	* @return <code>true</code> if this feed back is expired; <code>false</code> otherwise
	*/
	@Override
	public boolean isExpired() {
		return _feedBack.isExpired();
	}

	/**
	* Returns <code>true</code> if this feed back is inactive.
	*
	* @return <code>true</code> if this feed back is inactive; <code>false</code> otherwise
	*/
	@Override
	public boolean isInactive() {
		return _feedBack.isInactive();
	}

	/**
	* Returns <code>true</code> if this feed back is incomplete.
	*
	* @return <code>true</code> if this feed back is incomplete; <code>false</code> otherwise
	*/
	@Override
	public boolean isIncomplete() {
		return _feedBack.isIncomplete();
	}

	/**
	* Returns <code>true</code> if this feed back is pending.
	*
	* @return <code>true</code> if this feed back is pending; <code>false</code> otherwise
	*/
	@Override
	public boolean isPending() {
		return _feedBack.isPending();
	}

	/**
	* Returns <code>true</code> if this feed back is scheduled.
	*
	* @return <code>true</code> if this feed back is scheduled; <code>false</code> otherwise
	*/
	@Override
	public boolean isScheduled() {
		return _feedBack.isScheduled();
	}

	@Override
	public boolean isNew() {
		return _feedBack.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_feedBack.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _feedBack.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_feedBack.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _feedBack.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _feedBack.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_feedBack.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _feedBack.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_feedBack.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_feedBack.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_feedBack.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FeedBackWrapper((FeedBack)_feedBack.clone());
	}

	@Override
	public int compareTo(com.j2eecn.fb.model.FeedBack feedBack) {
		return _feedBack.compareTo(feedBack);
	}

	@Override
	public int hashCode() {
		return _feedBack.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.j2eecn.fb.model.FeedBack> toCacheModel() {
		return _feedBack.toCacheModel();
	}

	@Override
	public com.j2eecn.fb.model.FeedBack toEscapedModel() {
		return new FeedBackWrapper(_feedBack.toEscapedModel());
	}

	@Override
	public com.j2eecn.fb.model.FeedBack toUnescapedModel() {
		return new FeedBackWrapper(_feedBack.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _feedBack.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _feedBack.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_feedBack.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FeedBackWrapper)) {
			return false;
		}

		FeedBackWrapper feedBackWrapper = (FeedBackWrapper)obj;

		if (Validator.equals(_feedBack, feedBackWrapper._feedBack)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public FeedBack getWrappedFeedBack() {
		return _feedBack;
	}

	@Override
	public FeedBack getWrappedModel() {
		return _feedBack;
	}

	@Override
	public void resetOriginalValues() {
		_feedBack.resetOriginalValues();
	}

	private FeedBack _feedBack;
}