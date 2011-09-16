/*
 * Copyright 2011 Facebook, Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.facebook.tsdb.pulse.client.service.json;

import com.facebook.tsdb.pulse.client.model.MetricHeader;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONParser;

public class MetricHeaderDecoder extends JSONDecoder<MetricHeader> {

    @Override
    MetricHeader decode(String jsonText) {
        JSONObject jsonObj = JSONParser.parseStrict(jsonText).isObject();
        return MetricHeader.fromJSONObject(jsonObj);
    }

}