package com.yc.fresh.api.rest.inner.req.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Created by quy on 2019/11/22.
 * Motto: you can do it
 */
@Getter
@Setter
@ApiModel(description = "增加分类请求")
@JsonIgnoreProperties(ignoreUnknown = true)
public class GdCategoryAddReqBean {

    @ApiModelProperty(value = "分类名", required = true)
    @NotBlank
    private String name;

    @ApiModelProperty(value = "展示顺序：正整数", required = true)
    @NotNull
    private Integer sort;

    @ApiModelProperty(value = "所属父类,本身就是一级分类时请忽略此字段")
    private Integer parentId;

    @ApiModelProperty(value = "图片路径(相对路径)", required = true)
    @NotBlank
    private String picPath;
}
