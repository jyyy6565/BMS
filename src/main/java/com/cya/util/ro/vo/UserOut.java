package com.cya.util.ro.vo;

import com.cya.entity.Users;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description 用户vo类
 */
@Data
public class UserOut extends Users {

    @ApiModelProperty("身份")
    private String ident;

    @ApiModelProperty("生日：yyyy-MM-dd格式")
    private String birth;
}
