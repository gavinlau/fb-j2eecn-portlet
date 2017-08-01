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

package com.j2eecn.fb.model.impl;

import com.j2eecn.fb.model.FeedBack;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FeedBack in entity cache.
 *
 * @author Administrator
 * @see FeedBack
 * @generated
 */
public class FeedBackCacheModel implements CacheModel<FeedBack>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{fbId=");
		sb.append(fbId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append(", content=");
		sb.append(content);
		sb.append(", type=");
		sb.append(type);
		sb.append(", imgURL=");
		sb.append(imgURL);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FeedBack toEntityModel() {
		FeedBackImpl feedBackImpl = new FeedBackImpl();

		feedBackImpl.setFbId(fbId);
		feedBackImpl.setGroupId(groupId);
		feedBackImpl.setCompanyId(companyId);
		feedBackImpl.setUserId(userId);

		if (userName == null) {
			feedBackImpl.setUserName(StringPool.BLANK);
		}
		else {
			feedBackImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			feedBackImpl.setCreateDate(null);
		}
		else {
			feedBackImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			feedBackImpl.setModifiedDate(null);
		}
		else {
			feedBackImpl.setModifiedDate(new Date(modifiedDate));
		}

		feedBackImpl.setStatus(status);
		feedBackImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			feedBackImpl.setStatusByUserName(StringPool.BLANK);
		}
		else {
			feedBackImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			feedBackImpl.setStatusDate(null);
		}
		else {
			feedBackImpl.setStatusDate(new Date(statusDate));
		}

		if (content == null) {
			feedBackImpl.setContent(StringPool.BLANK);
		}
		else {
			feedBackImpl.setContent(content);
		}

		feedBackImpl.setType(type);

		if (imgURL == null) {
			feedBackImpl.setImgURL(StringPool.BLANK);
		}
		else {
			feedBackImpl.setImgURL(imgURL);
		}

		feedBackImpl.resetOriginalValues();

		return feedBackImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fbId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		status = objectInput.readInt();
		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
		content = objectInput.readUTF();
		type = objectInput.readInt();
		imgURL = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(fbId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeInt(status);
		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);

		if (content == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(content);
		}

		objectOutput.writeInt(type);

		if (imgURL == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(imgURL);
		}
	}

	public long fbId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
	public String content;
	public int type;
	public String imgURL;
}