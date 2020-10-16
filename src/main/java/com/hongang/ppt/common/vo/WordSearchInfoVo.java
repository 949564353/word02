package com.hongang.ppt.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class WordSearchInfoVo {


    /**
     * id
     */
    @ApiModelProperty(value = "文档ID")
    private Long id;

    /**ong
     * 文档名称
     */
    @ApiModelProperty(value = "文档名称")
    private String wordName;

    /**
     * 文档地址
     */
    @ApiModelProperty(value = "文档地址")
    private String wordUrl;

    /**
     * 文档大小
     */
    @ApiModelProperty(value = "文档大小")
    private String wordSize;

    /**
     * 文档简介
     */
    @ApiModelProperty(value = "文档简介")
    private String wordShort;

    /**
     * 文档图片url
     */
    @ApiModelProperty(value = "文档图片url")
    private String wordImgUrl;


    /**
     * 是否为vip
     */
    @ApiModelProperty(value = "是否为vip:1、是；0、否")
    private String isVip;


}
