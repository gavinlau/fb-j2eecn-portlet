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
import com.j2eecn.fb.service.FeedBackLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Administrator
 * @generated
 */
public abstract class FeedBackActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public FeedBackActionableDynamicQuery() throws SystemException {
		setBaseLocalService(FeedBackLocalServiceUtil.getService());
		setClass(FeedBack.class);

		setClassLoader(com.j2eecn.fb.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("fbId");
	}
}