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
package org.zaproxy.clientapi.gen;

import java.util.HashMap;
import java.util.Map;
import org.zaproxy.clientapi.core.ApiResponse;
import org.zaproxy.clientapi.core.ClientApi;
import org.zaproxy.clientapi.core.ClientApiException;

/** This file was automatically generated. */
@SuppressWarnings("javadoc")
public class Pscan extends org.zaproxy.clientapi.gen.deprecated.PscanDeprecated {

    private final ClientApi api;

    public Pscan(ClientApi api) {
        super(api);
        this.api = api;
    }

    /**
     * Tells whether or not the passive scan should be performed only on messages that are in scope.
     */
    public ApiResponse scanOnlyInScope() throws ClientApiException {
        return api.callApi("pscan", "view", "scanOnlyInScope", null);
    }

    /** The number of records the passive scanner still has to scan */
    public ApiResponse recordsToScan() throws ClientApiException {
        return api.callApi("pscan", "view", "recordsToScan", null);
    }

    /** Lists all passive scan rules with their ID, name, enabled state, and alert threshold. */
    public ApiResponse scanners() throws ClientApiException {
        return api.callApi("pscan", "view", "scanners", null);
    }

    /**
     * Show information about the passive scan rule currently being run (if any).
     *
     * @deprecated Use the currentTasks view instead.
     */
    @Deprecated
    public ApiResponse currentRule() throws ClientApiException {
        return api.callApi("pscan", "view", "currentRule", null);
    }

    /** Show information about the passive scan tasks currently being run (if any). */
    public ApiResponse currentTasks() throws ClientApiException {
        return api.callApi("pscan", "view", "currentTasks", null);
    }

    /** Gets the maximum number of alerts a passive scan rule should raise. */
    public ApiResponse maxAlertsPerRule() throws ClientApiException {
        return api.callApi("pscan", "view", "maxAlertsPerRule", null);
    }

    /**
     * Sets whether or not the passive scanning is enabled (Note: the enabled state is not
     * persisted).
     */
    public ApiResponse setEnabled(String enabled) throws ClientApiException {
        Map<String, String> map = new HashMap<>();
        map.put("enabled", enabled);
        return api.callApi("pscan", "action", "setEnabled", map);
    }

    /**
     * Sets whether or not the passive scan should be performed only on messages that are in scope.
     */
    public ApiResponse setScanOnlyInScope(String onlyinscope) throws ClientApiException {
        Map<String, String> map = new HashMap<>();
        map.put("onlyInScope", onlyinscope);
        return api.callApi("pscan", "action", "setScanOnlyInScope", map);
    }

    /** Enables all passive scan rules */
    public ApiResponse enableAllScanners() throws ClientApiException {
        return api.callApi("pscan", "action", "enableAllScanners", null);
    }

    /** Disables all passive scan rules */
    public ApiResponse disableAllScanners() throws ClientApiException {
        return api.callApi("pscan", "action", "disableAllScanners", null);
    }

    /** Enables all passive scan rules with the given IDs (comma separated list of IDs) */
    public ApiResponse enableScanners(String ids) throws ClientApiException {
        Map<String, String> map = new HashMap<>();
        map.put("ids", ids);
        return api.callApi("pscan", "action", "enableScanners", map);
    }

    /** Disables all passive scan rules with the given IDs (comma separated list of IDs) */
    public ApiResponse disableScanners(String ids) throws ClientApiException {
        Map<String, String> map = new HashMap<>();
        map.put("ids", ids);
        return api.callApi("pscan", "action", "disableScanners", map);
    }

    /**
     * Sets the alert threshold of the passive scanner with the given ID, accepted values for alert
     * threshold: OFF, DEFAULT, LOW, MEDIUM and HIGH
     */
    public ApiResponse setScannerAlertThreshold(String id, String alertthreshold)
            throws ClientApiException {
        Map<String, String> map = new HashMap<>();
        map.put("id", id);
        map.put("alertThreshold", alertthreshold);
        return api.callApi("pscan", "action", "setScannerAlertThreshold", map);
    }

    /** Sets the maximum number of alerts a passive scan rule should raise. */
    public ApiResponse setMaxAlertsPerRule(String maxalerts) throws ClientApiException {
        Map<String, String> map = new HashMap<>();
        map.put("maxAlerts", maxalerts);
        return api.callApi("pscan", "action", "setMaxAlertsPerRule", map);
    }

    /** Disables all passive scan tags. */
    public ApiResponse disableAllTags() throws ClientApiException {
        return api.callApi("pscan", "action", "disableAllTags", null);
    }

    /** Enables all passive scan tags. */
    public ApiResponse enableAllTags() throws ClientApiException {
        return api.callApi("pscan", "action", "enableAllTags", null);
    }

    /** Clears the passive scan queue. */
    public ApiResponse clearQueue() throws ClientApiException {
        return api.callApi("pscan", "action", "clearQueue", null);
    }
}
