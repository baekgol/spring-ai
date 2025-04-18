/*
 * Copyright 2023-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.ai.vectorstore.observation.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Configuration properties for vector store observations.
 *
 * @author Christian Tzolov
 * @since 1.0.0
 */
@ConfigurationProperties(VectorStoreObservationProperties.CONFIG_PREFIX)
public class VectorStoreObservationProperties {

	public static final String CONFIG_PREFIX = "spring.ai.vectorstore.observations";

	/**
	 * Whether to include the search response content in the observations.
	 */
	private boolean includeQueryResponse = false;

	public boolean isIncludeQueryResponse() {
		return this.includeQueryResponse;
	}

	public void setIncludeQueryResponse(boolean includeQueryResponse) {
		this.includeQueryResponse = includeQueryResponse;
	}

}
