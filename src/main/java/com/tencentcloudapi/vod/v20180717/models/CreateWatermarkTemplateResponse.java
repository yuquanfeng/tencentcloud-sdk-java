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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateWatermarkTemplateResponse  extends AbstractModel{

    /**
    * 水印模板唯一标识。
    */
    @SerializedName("Definition")
    @Expose
    private Integer Definition;

    /**
    * 水印图片地址，仅当 Type 为 image，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取水印模板唯一标识。
     * @return Definition 水印模板唯一标识。
     */
    public Integer getDefinition() {
        return this.Definition;
    }

    /**
     * 设置水印模板唯一标识。
     * @param Definition 水印模板唯一标识。
     */
    public void setDefinition(Integer Definition) {
        this.Definition = Definition;
    }

    /**
     * 获取水印图片地址，仅当 Type 为 image，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @return ImageUrl 水印图片地址，仅当 Type 为 image，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * 设置水印图片地址，仅当 Type 为 image，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageUrl 水印图片地址，仅当 Type 为 image，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
