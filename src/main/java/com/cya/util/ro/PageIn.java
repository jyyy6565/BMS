package com.cya.util.ro;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description 分页对象
 * @Date 2022/9/4 16:35
 * @Author by 公众号【IT学长】
 */
@Data
public class PageIn {

    /** 搜索关键字 */
    @ApiModelProperty("搜索关键字")
    private String keyword;
    
    /** 当前页 */
    @ApiModelProperty("当前页")
    private Integer currPage;

    /** 当前页条数 */
    @ApiModelProperty("每页数量")
    private Integer pageSize;
}
