/*
 * Copyright 2017-2019 original authors
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
/**
 *  <p>This class provides a set of common constants for health status  .</p>
 *
 * @author Sergio
 * @since 1.0
 */

package io.micronaut.management.endpoint.health;

/**
 *
 * <p>This class provides a set of common constants to indicate the level of detail to be included in the Health status response.</p>
 *
 * @author Sergio del Amo
 * @since 1.0
 */
public enum HealthLevelOfDetail {
    STATUS_DESCRIPTION_DETAILS,
    STATUS
}
