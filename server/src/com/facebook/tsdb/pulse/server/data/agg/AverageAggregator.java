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
package com.facebook.tsdb.pulse.server.data.agg;

public class AverageAggregator implements Aggregator {

    private double sum = 0.0;
    private int count = 0;
    
    public void reset() {
        sum = 0.0;
        count = 0;
    }
    
    public void add(double value) {
        sum += value;
        count++;
    }
    
    public double getValue() {
        return sum / count;
    }
}