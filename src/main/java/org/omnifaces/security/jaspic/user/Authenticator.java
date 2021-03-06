/*
 * Copyright 2013 OmniFaces.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.omnifaces.security.jaspic.user;

import java.io.Serializable;
import java.util.List;

/**
 * Base interface to be implemented by user code that provides an actual authenticator.
 * <p>
 * The base interface specifies the data that the authenticator should return (make available).
 * 
 * @author Arjan Tijms
 *
 */
public interface Authenticator extends Serializable {

	String getUserName();
	List<String> getApplicationRoles();
	
}
