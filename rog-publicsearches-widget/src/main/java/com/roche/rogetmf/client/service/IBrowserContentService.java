/*******************************************************************************
 * Copyright © 2015 Hoffmann-La Roche
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.roche.rogetmf.client.service;

import com.roche.rogetmf.shared.oah.OpenAjaxMessage;
import com.roche.rogetmf.shared.oah.ServiceCallback;

/**
 * Interface describing method for communication with an asynchronous service providing JSON data with child nodes of a given parent
 * 
 * @author Krzysztof Jurkowski
 *
 */
public interface IBrowserContentService {

	/**
	 * Provides JSON data with child nodes of a given parent
	 * 
	 * @param type
	 *            Type of the parent node
	 * @param parentId
	 *            Id of the parent node
	 * @param callback
	 *            Callback of asynchronous service - JSON data will be provided to the onSuccess method of the callback
	 */
	public void getBrowserContents(String type, String parentId, ServiceCallback<OpenAjaxMessage> callback);
}
