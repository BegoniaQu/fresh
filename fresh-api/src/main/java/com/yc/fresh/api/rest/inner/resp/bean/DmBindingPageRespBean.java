package com.yc.fresh.api.rest.inner.resp.bean;

import com.yc.fresh.common.annotation.RespData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by quy on 2019/12/16.
 * Motto: you can do it
 */
@Getter
@Setter
@RespData
@ApiModel(description = "配送人员绑定关系")
public class DmBindingPageRespBean {


    @ApiModelProperty("绑定关系Id")
    private Integer bindId;

    @ApiModelProperty("仓库编码")
    private String warehouseCode;

    @ApiModelProperty("仓库名称")
    private String warehouseName;

    @ApiModelProperty("配送人ID")
    private Long dmId;

    @ApiModelProperty("配送人姓名")
    private String dmName;

    @ApiModelProperty("配送人手机号")
    private String mobile;



}
