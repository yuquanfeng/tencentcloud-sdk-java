/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRabbitMQQueuesResponse extends AbstractModel {

    /**
    * 列表信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueueInfoList")
    @Expose
    private RabbitMQQueueListInfo [] QueueInfoList;

    /**
    * 数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 列表信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueueInfoList 列表信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RabbitMQQueueListInfo [] getQueueInfoList() {
        return this.QueueInfoList;
    }

    /**
     * Set 列表信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueueInfoList 列表信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueueInfoList(RabbitMQQueueListInfo [] QueueInfoList) {
        this.QueueInfoList = QueueInfoList;
    }

    /**
     * Get 数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeRabbitMQQueuesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRabbitMQQueuesResponse(DescribeRabbitMQQueuesResponse source) {
        if (source.QueueInfoList != null) {
            this.QueueInfoList = new RabbitMQQueueListInfo[source.QueueInfoList.length];
            for (int i = 0; i < source.QueueInfoList.length; i++) {
                this.QueueInfoList[i] = new RabbitMQQueueListInfo(source.QueueInfoList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "QueueInfoList.", this.QueueInfoList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

