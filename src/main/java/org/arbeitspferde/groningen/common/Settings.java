/* Copyright 2012 Google, Inc.
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

package org.arbeitspferde.groningen.common;

public interface Settings {
  public Integer getNumShards();
  public Integer getShardIndex();
  public String getDatastore();
  public String getHistoryDatastore();
  public Integer getPort();
  public Integer getStartupSubservicesDeadlineSeconds();
  public Integer getShutdownSubservicesDeadlineSeconds();
  public String[] getConfigFileNames();
  public String getEventLogPrefix();
  public Integer getEventLogRotateSizeBytes();
  public Integer getEventLogFlushIntervalSeconds();
}
