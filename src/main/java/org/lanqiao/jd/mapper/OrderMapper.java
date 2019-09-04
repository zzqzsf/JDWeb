package org.lanqiao.jd.mapper;

import org.lanqiao.jd.entity.order;

public interface orderMapper {
    int deleteByPrimaryKey(Integer order_id);

    int insert(order record);

    int insertSelective(order record);

    order selectByPrimaryKey(Integer order_id);

    int updateByPrimaryKeySelective(order record);

    int updateByPrimaryKey(order record);
}