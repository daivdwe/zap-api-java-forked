/*
 * Zed Attack Proxy (ZAP) and its related class files.
 *
 * ZAP is an HTTP/HTTPS proxy for assessing web application security.
 *
 * Copyright 2020 The ZAP Development Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.zaproxy.clientapi.gen;

import java.util.HashMap;
import java.util.Map;
import org.zaproxy.clientapi.core.ApiResponse;
import org.zaproxy.clientapi.core.ClientApi;
import org.zaproxy.clientapi.core.ClientApiException;

/** This file was automatically generated. */
@SuppressWarnings("javadoc")
public class Wappalyzer {

    private final ClientApi api;

    public Wappalyzer(ClientApi api) {
        this.api = api;
    }

    /**
     * Lists all the sites recognized by the Technology Detection add-on.
     *
     * <p>This component is optional and therefore the API will only work if it is installed
     */
    public ApiResponse listSites() throws ClientApiException {
        return api.callApi("wappalyzer", "view", "listSites", null);
    }

    /**
     * Lists all sites and their associated applications (technologies).
     *
     * <p>This component is optional and therefore the API will only work if it is installed
     */
    public ApiResponse listAll() throws ClientApiException {
        return api.callApi("wappalyzer", "view", "listAll", null);
    }

    /**
     * Lists all the applications (technologies) associated with a specific site.
     *
     * <p>This component is optional and therefore the API will only work if it is installed
     */
    public ApiResponse listSite(String site) throws ClientApiException {
        Map<String, String> map = new HashMap<>();
        map.put("site", site);
        return api.callApi("wappalyzer", "view", "listSite", map);
    }
}
