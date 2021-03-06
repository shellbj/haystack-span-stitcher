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

import org.apache.kafka.streams.StreamsConfig
import org.apache.kafka.streams.processor.TimestampExtractor
import org.apache.kafka.streams.processor.TopologyBuilder.AutoOffsetReset

/**
  * @param streamsConfig config object to be used for initializing KafkaStreams
  * @param produceTopic producer topic
  * @param consumeTopic consumer topic
  * @param autoOffsetReset auto offset reset policy
  * @param timestampExtractor timestamp extractor
  */
case class KafkaConfiguration(streamsConfig: StreamsConfig,
                              produceTopic: String,
                              consumeTopic: String,
                              autoOffsetReset: AutoOffsetReset,
                              timestampExtractor: TimestampExtractor)
