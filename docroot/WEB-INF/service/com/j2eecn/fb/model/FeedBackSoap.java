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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.j2eecn.fb.service.http.FeedBackServiceSoap}.
 *
 * @author Administrator
 * @see com.j2eecn.fb.service.http.FeedBackServiceSoap
 * @generated
 */
public class FeedBackSoap implements Serializable {
	public static FeedBackSoap toSoapModel(FeedBack model) {
		FeedBackSoap soapModel = new FeedBackSoap();

		soapModel.setFbId(model.getFbId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatusByUserId(model.getStatusByUserId());
		soapModel.setStatusByUserName(model.getStatusByUserName());
		soapModel.setStatusDate(model.getStatusDate());
		soapModel.setContent(model.getContent());
		soapModel.setType(model.getType());
		soapModel.setImgURL(model.getImgURL());

		return soapModel;
	}

	public static FeedBackSoap[] toSoapModels(FeedBack[] models) {
		FeedBackSoap[] soapModels = new FeedBackSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FeedBackSoap[][] toSoapModels(FeedBack[][] models) {
		FeedBackSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FeedBackSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FeedBackSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FeedBackSoap[] toSoapModels(List<FeedBack> models) {
		List<FeedBackSoap> soapModels = new ArrayList<FeedBackSoap>(models.size());

		for (FeedBack model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FeedBackSoap[soapModels.size()]);
	}

	public FeedBackSoap() {
	}

	public long getPrimaryKey() {
		return _fbId;
	}

	public void setPrimaryKey(long pk) {
		setFbId(pk);
	}

	public long getFbId() {
		return _fbId;
	}

	public void setFbId(long fbId) {
		_fbId = fbId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public long getStatusByUserId() {
		return _statusByUserId;
	}

	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	public String getStatusByUserName() {
		return _statusByUserName;
	}

	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;
	}

	public Date getStatusDate() {
		return _statusDate;
	}

	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	public String getContent() {
		return _content;
	}

	public void setContent(String content) {
		_content = content;
	}

	public int getType() {
		return _type;
	}

	public void setType(int type) {
		_type = type;
	}

	public String getImgURL() {
		return _imgURL;
	}

	public void setImgURL(String imgURL) {
		_imgURL = imgURL;
	}

	private long _fbId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserName;
	private Date _statusDate;
	private String _content;
	private int _type;
	private String _imgURL;
}