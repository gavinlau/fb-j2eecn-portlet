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

package com.j2eecn.fb.service.base;

import com.j2eecn.fb.service.FeedBackServiceUtil;

import java.util.Arrays;

/**
 * @author Administrator
 * @generated
 */
public class FeedBackServiceClpInvoker {
	public FeedBackServiceClpInvoker() {
		_methodName44 = "getBeanIdentifier";

		_methodParameterTypes44 = new String[] {  };

		_methodName45 = "setBeanIdentifier";

		_methodParameterTypes45 = new String[] { "java.lang.String" };

		_methodName50 = "addEntry";

		_methodParameterTypes50 = new String[] {
				"com.j2eecn.fb.model.FeedBack",
				"com.liferay.portal.service.ServiceContext", "byte[][]"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName44.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes44, parameterTypes)) {
			return FeedBackServiceUtil.getBeanIdentifier();
		}

		if (_methodName45.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes45, parameterTypes)) {
			FeedBackServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName50.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes50, parameterTypes)) {
			FeedBackServiceUtil.addEntry((com.j2eecn.fb.model.FeedBack)arguments[0],
				(com.liferay.portal.service.ServiceContext)arguments[1],
				(byte[])arguments[2]);

			return null;
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName44;
	private String[] _methodParameterTypes44;
	private String _methodName45;
	private String[] _methodParameterTypes45;
	private String _methodName50;
	private String[] _methodParameterTypes50;
}