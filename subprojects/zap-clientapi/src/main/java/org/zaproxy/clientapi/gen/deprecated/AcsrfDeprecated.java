/*
 * Zed Attack Proxy (ZAP) and its related class files.
 *
 * ZAP is an HTTP/HTTPS proxy for assessing web application security.
 *
 * Copyright 2017 The ZAP Development Team
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
package org.zaproxy.clientapi.gen.deprecated;

import java.util.HashMap;
import java.util.Map;
import org.zaproxy.clientapi.core.ApiResponse;
import org.zaproxy.clientapi.core.ClientApi;
import org.zaproxy.clientapi.core.ClientApiException;

/** API implementation with deprecated methods, (re)moved from generated class. */
@SuppressWarnings("javadoc")
public class AcsrfDeprecated {

    private final ClientApi api;

    public AcsrfDeprecated(ClientApi api) {
        this.api = api;
    }

    /**
     * @deprecated (1.1.0) Use the method without the API key and use one of the {@code ClientApi}
     *     constructors that allow to set the API key (e.g. {@link ClientApi#ClientApi(String, int,
     *     String)}).
     */
    @Deprecated
    public ApiResponse addOptionToken(String apikey, String string) throws ClientApiException {
        Map<String, String> map = new HashMap<>();
        if (apikey != null) {
            map.put("apikey", apikey);
        }
        map.put("String", string);
        return api.callApi("acsrf", "action", "addOptionToken", map);
    }

    /**
     * @deprecated (1.1.0) Use the method without the API key and use one of the {@code ClientApi}
     *     constructors that allow to set the API key (e.g. {@link ClientApi#ClientApi(String, int,
     *     String)}).
     */
    @Deprecated
    public ApiResponse removeOptionToken(String apikey, String string) throws ClientApiException {
        Map<String, String> map = new HashMap<>();
        if (apikey != null) {
            map.put("apikey", apikey);
        }
        map.put("String", string);
        return api.callApi("acsrf", "action", "removeOptionToken", map);
    }

    /**
     * @deprecated (1.1.0) Use the method without the API key and use one of the {@code ClientApi}
     *     constructors that allow to set the API key (e.g. {@link ClientApi#ClientApi(String, int,
     *     String)}).
     */
    @Deprecated
    public byte[] genForm(String apikey, String hrefid) throws ClientApiException {
        Map<String, String> map = new HashMap<>();
        if (apikey != null) {
            map.put("apikey", apikey);
        }
        map.put("hrefId", hrefid);
        return api.callApiOther("acsrf", "other", "genForm", map);
    }

    /** Generate a form for testing lack of anti-CSRF tokens - typically invoked via ZAP */
    public byte[] genFormWithUrl(String hrefid, String actionurl) throws ClientApiException {
        Map<String, String> map = new HashMap<>();
        map.put("hrefId", hrefid);
        if (actionurl != null) {
            map.put("actionUrl", actionurl);
        }
        return api.callApiOther("acsrf", "other", "genForm", map);
    }
}
