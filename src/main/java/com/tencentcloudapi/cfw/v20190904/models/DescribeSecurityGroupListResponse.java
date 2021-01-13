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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityGroupListResponse extends AbstractModel{

    /**
    * 列表当前规则总条数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 安全组规则列表数据
    */
    @SerializedName("Data")
    @Expose
    private SecurityGroupListData [] Data;

    /**
    * 不算筛选条数的总条数
    */
    @SerializedName("AllTotal")
    @Expose
    private Long AllTotal;

    /**
    * 访问控制规则全部启用/全部停用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 列表当前规则总条数 
     * @return Total 列表当前规则总条数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 列表当前规则总条数
     * @param Total 列表当前规则总条数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 安全组规则列表数据 
     * @return Data 安全组规则列表数据
     */
    public SecurityGroupListData [] getData() {
        return this.Data;
    }

    /**
     * Set 安全组规则列表数据
     * @param Data 安全组规则列表数据
     */
    public void setData(SecurityGroupListData [] Data) {
        this.Data = Data;
    }

    /**
     * Get 不算筛选条数的总条数 
     * @return AllTotal 不算筛选条数的总条数
     */
    public Long getAllTotal() {
        return this.AllTotal;
    }

    /**
     * Set 不算筛选条数的总条数
     * @param AllTotal 不算筛选条数的总条数
     */
    public void setAllTotal(Long AllTotal) {
        this.AllTotal = AllTotal;
    }

    /**
     * Get 访问控制规则全部启用/全部停用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enable 访问控制规则全部启用/全部停用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 访问控制规则全部启用/全部停用
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enable 访问控制规则全部启用/全部停用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "AllTotal", this.AllTotal);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
