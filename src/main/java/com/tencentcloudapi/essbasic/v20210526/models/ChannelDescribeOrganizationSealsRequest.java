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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelDescribeOrganizationSealsRequest extends AbstractModel {

    /**
    * 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 返回最大数量，最大为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页查询偏移量，默认为0，最大为20000
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询信息类型
支持的值如下：
<ul><li>0-默认，不返回授权用户信息</li>
<li>1-返回授权用户信息</li>
</ul>
    */
    @SerializedName("InfoType")
    @Expose
    private Long InfoType;

    /**
    * 印章id（没有输入返回所有）

注:  `没有输入返回所有记录，最大返回100条。`
    */
    @SerializedName("SealId")
    @Expose
    private String SealId;

    /**
    * 印章类型列表，目前支持传入以下类型：
<ul><li>OFFICIAL-企业公章</li>
<li>CONTRACT-合同专用章</li>
<li>ORGANIZATION_SEAL-企业印章(图片上传创建)</li>
<li>LEGAL_PERSON_SEAL-法定代表人章</li>
</ul>

注:  `为空时查询所有类型的印章。`
    */
    @SerializedName("SealTypes")
    @Expose
    private String [] SealTypes;

    /**
     * Get 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。 
     * @return Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。
     * @param Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 返回最大数量，最大为100 
     * @return Limit 返回最大数量，最大为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回最大数量，最大为100
     * @param Limit 返回最大数量，最大为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页查询偏移量，默认为0，最大为20000 
     * @return Offset 分页查询偏移量，默认为0，最大为20000
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页查询偏移量，默认为0，最大为20000
     * @param Offset 分页查询偏移量，默认为0，最大为20000
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询信息类型
支持的值如下：
<ul><li>0-默认，不返回授权用户信息</li>
<li>1-返回授权用户信息</li>
</ul> 
     * @return InfoType 查询信息类型
支持的值如下：
<ul><li>0-默认，不返回授权用户信息</li>
<li>1-返回授权用户信息</li>
</ul>
     */
    public Long getInfoType() {
        return this.InfoType;
    }

    /**
     * Set 查询信息类型
支持的值如下：
<ul><li>0-默认，不返回授权用户信息</li>
<li>1-返回授权用户信息</li>
</ul>
     * @param InfoType 查询信息类型
支持的值如下：
<ul><li>0-默认，不返回授权用户信息</li>
<li>1-返回授权用户信息</li>
</ul>
     */
    public void setInfoType(Long InfoType) {
        this.InfoType = InfoType;
    }

    /**
     * Get 印章id（没有输入返回所有）

注:  `没有输入返回所有记录，最大返回100条。` 
     * @return SealId 印章id（没有输入返回所有）

注:  `没有输入返回所有记录，最大返回100条。`
     */
    public String getSealId() {
        return this.SealId;
    }

    /**
     * Set 印章id（没有输入返回所有）

注:  `没有输入返回所有记录，最大返回100条。`
     * @param SealId 印章id（没有输入返回所有）

注:  `没有输入返回所有记录，最大返回100条。`
     */
    public void setSealId(String SealId) {
        this.SealId = SealId;
    }

    /**
     * Get 印章类型列表，目前支持传入以下类型：
<ul><li>OFFICIAL-企业公章</li>
<li>CONTRACT-合同专用章</li>
<li>ORGANIZATION_SEAL-企业印章(图片上传创建)</li>
<li>LEGAL_PERSON_SEAL-法定代表人章</li>
</ul>

注:  `为空时查询所有类型的印章。` 
     * @return SealTypes 印章类型列表，目前支持传入以下类型：
<ul><li>OFFICIAL-企业公章</li>
<li>CONTRACT-合同专用章</li>
<li>ORGANIZATION_SEAL-企业印章(图片上传创建)</li>
<li>LEGAL_PERSON_SEAL-法定代表人章</li>
</ul>

注:  `为空时查询所有类型的印章。`
     */
    public String [] getSealTypes() {
        return this.SealTypes;
    }

    /**
     * Set 印章类型列表，目前支持传入以下类型：
<ul><li>OFFICIAL-企业公章</li>
<li>CONTRACT-合同专用章</li>
<li>ORGANIZATION_SEAL-企业印章(图片上传创建)</li>
<li>LEGAL_PERSON_SEAL-法定代表人章</li>
</ul>

注:  `为空时查询所有类型的印章。`
     * @param SealTypes 印章类型列表，目前支持传入以下类型：
<ul><li>OFFICIAL-企业公章</li>
<li>CONTRACT-合同专用章</li>
<li>ORGANIZATION_SEAL-企业印章(图片上传创建)</li>
<li>LEGAL_PERSON_SEAL-法定代表人章</li>
</ul>

注:  `为空时查询所有类型的印章。`
     */
    public void setSealTypes(String [] SealTypes) {
        this.SealTypes = SealTypes;
    }

    public ChannelDescribeOrganizationSealsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelDescribeOrganizationSealsRequest(ChannelDescribeOrganizationSealsRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.InfoType != null) {
            this.InfoType = new Long(source.InfoType);
        }
        if (source.SealId != null) {
            this.SealId = new String(source.SealId);
        }
        if (source.SealTypes != null) {
            this.SealTypes = new String[source.SealTypes.length];
            for (int i = 0; i < source.SealTypes.length; i++) {
                this.SealTypes[i] = new String(source.SealTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "InfoType", this.InfoType);
        this.setParamSimple(map, prefix + "SealId", this.SealId);
        this.setParamArraySimple(map, prefix + "SealTypes.", this.SealTypes);

    }
}

