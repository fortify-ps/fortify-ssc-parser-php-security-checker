package com.fortify.ssc.parser.php.security_checker;

/**
 * (c) Copyright [2017] Micro Focus or one of its affiliates.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

public enum CustomVulnAttribute implements com.fortify.plugin.spi.VulnerabilityAttribute {
	DependencyVersion(AttrType.STRING),
	AdvisoryLink(AttrType.STRING),
	AdvisoryCve(AttrType.STRING),
    ;

    private final AttrType attributeType;

    CustomVulnAttribute(final AttrType attributeType) {
        this.attributeType = attributeType;
    }

    @Override
    public String attributeName() {
        return name();
    }

    @Override
    public AttrType attributeType() {
        return attributeType;
    }
}
