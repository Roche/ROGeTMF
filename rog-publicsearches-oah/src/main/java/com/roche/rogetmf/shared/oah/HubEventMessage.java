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
package com.roche.rogetmf.shared.oah;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Represents the JS object supplied by OAH on event callback 
 * @author Krzysztof Jurkowski
 *
 */
public class HubEventMessage extends JavaScriptObject {
	protected HubEventMessage() {}

	/** 
	 * @return name of the event that triggered the callback
	 */
	//@formatter:off
	public final native String getEventName()/*-{ 
		console.log("HubEventMessage::getEventName");
		
		return this.eventName; 
	}-*/;
	
	/**
	 * @return OAH message that arrived with the event
	 */
	public final native OpenAjaxMessage getMessage()/*-{ 
		console.log("HubEventMessage::getMessage");
		
		return this.message; 
	}-*/;
	
}
