package com.cya.repos;

import com.cya.entity.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description 用户jpa 查询
 */
@Repository
public interface NoticeRepository extends JpaRepository<Notice,Integer>{

   /* *//**
     * 用户模糊查询 + 分页 用户信息
     * @param keyword 用户名
     * @param pageable 分页对象
     * @return Page<Users>
     *//*
    @Query(value="select * from users where username like CONCAT('%',:keyword,'%') limit  ",nativeQuery=true)
    Page<Users> findByUsernameLike(@Param(value = "keyword") String keyword,Pageable pageable);

    *//**
     * 用户登录
     * @param username 用户名
     * @param password 密码
     *//*
    Users findByUsernameAndPassword(@Param("username") String username,@Param("password") String password);

    *//**
     * 用户名查询
     * @param username
     * @return
     *//*
    Users findByUsername(@Param("username") String username);*/
}
