package org.lanqiao.jdlogin.demo.mapper;

import org.lanqiao.jdlogin.demo.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    String checkUser(String userName);
}