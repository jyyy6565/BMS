package com.cya.dao;

import com.cya.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Description
 */
@Mapper
@Component
public interface UsersMapper {

    /**
     * 模糊分页查询用户
     * @param keyword 关键字
     * @return
     */
    List<Users> findListByLike(String keyword);

    /**
     * 编辑用户
     * @param map
     * @return
     */
    int updateUsers(Map<String,Object> map);
}
