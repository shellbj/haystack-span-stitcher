/*
 *  Copyright 2017 Expedia, Inc.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */
package com.expedia.www.haystack.span.stitcher.config.entities

/**
  * @param maxEntries maximum number of records in the state store, one record is one stitched-span object
  * @param pollIntervalMillis poll interval to gather the stitched-spans that are ready to emit out to sink
  * @param stitchWindowMillis time window for which unique traceId will be hold to gather its child spans
  * @param loggingEnabled enable the logging for resiliency
  * @param streamsCloseTimeoutMillis: maximum time allowed to close the kafka streams
  */
case class StitchConfiguration(maxEntries: Int,
                               pollIntervalMillis: Long,
                               stitchWindowMillis: Long,
                               loggingEnabled: Boolean,
                               streamsCloseTimeoutMillis: Long)
