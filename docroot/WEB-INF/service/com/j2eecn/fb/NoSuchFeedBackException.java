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

package com.j2eecn.fb;

import com.liferay.portal.NoSuchModelException;

/**
 * @author Administrator
 */
public class NoSuchFeedBackException extends NoSuchModelException {

	public NoSuchFeedBackException() {
		super();
	}

	public NoSuchFeedBackException(String msg) {
		super(msg);
	}

	public NoSuchFeedBackException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchFeedBackException(Throwable cause) {
		super(cause);
	}

}