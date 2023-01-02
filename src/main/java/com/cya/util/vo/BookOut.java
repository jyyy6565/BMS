package com.cya.util.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 图书出参对象
 * @Date 2022/9/4 16:35
 * @Author by 公众号【IT学长】
 */
@Data
public class BookOut {

    @ApiModelProperty("书籍ID")
    private Integer id;

    @ApiModelProperty("书籍ISBN编码")
    private String isbn;

    @ApiModelProperty("书名")
    private String name;

    @ApiModelProperty("作者")
    private String author;

    @ApiModelProperty("页数")
    private Integer pages;

    @ApiModelProperty("翻译")
    private String translate;

    @ApiModelProperty("出版社")
    private String publish;

    @ApiModelProperty("定价")
    private Double price;

    @ApiModelProperty("库存")
    private Integer size;

    @ApiModelProperty("分类")
    private String type;

    @ApiModelProperty("出版时间")
    private String publishTime;
}
