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

package com.j2eecn.fb.service.http;

import com.j2eecn.fb.service.FeedBackServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.j2eecn.fb.service.FeedBackServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.j2eecn.fb.model.FeedBackSoap}.
 * If the method in the service utility returns a
 * {@link com.j2eecn.fb.model.FeedBack}, that is translated to a
 * {@link com.j2eecn.fb.model.FeedBackSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Administrator
 * @see FeedBackServiceHttp
 * @see com.j2eecn.fb.model.FeedBackSoap
 * @see com.j2eecn.fb.service.FeedBackServiceUtil
 * @generated
 */
public class FeedBackServiceSoap {
	public static void addEntry(com.j2eecn.fb.model.FeedBackSoap entry,
		com.liferay.portal.service.ServiceContext serviceContext, byte[] bytes)
		throws RemoteException {
		try {
			FeedBackServiceUtil.addEntry(com.j2eecn.fb.model.impl.FeedBackModelImpl.toModel(
					entry), serviceContext, bytes);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(FeedBackServiceSoap.class);
}