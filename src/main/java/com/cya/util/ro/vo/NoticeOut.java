package com.cya.util.ro.vo;

import com.cya.entity.Notice;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description 用户vo类
 */
@Data
public class NoticeOut extends Notice {

    @ApiModelProperty("发布时间：yyyy-MM-dd格式")
    private String date1;
}
