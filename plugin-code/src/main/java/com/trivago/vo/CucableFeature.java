/*
 * Copyright 2019 trivago N.V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.trivago.vo;

import java.util.List;

public class CucableFeature {
    private final String name;
    private final List<Integer> lineNumbers;

    public CucableFeature(final String name, final List<Integer> lineNumbers) {
        this.name = name;
        this.lineNumbers = lineNumbers;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getLineNumbers() {
        return lineNumbers;
    }

    public boolean hasValidScenarioLineNumbers() {
        return lineNumbers != null && !lineNumbers.isEmpty();
    }
}
