package org.lanqiao.jd.mapper;

import org.lanqiao.jd.entity.Goods;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsMapper {
    int deleteByPrimaryKey(Integer goodsId);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer goodsId);

    int selectGoodsId(String goodsName);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}