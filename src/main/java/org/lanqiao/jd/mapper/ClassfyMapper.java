package org.lanqiao.mapper;

import org.lanqiao.entity.Classfy;
import org.lanqiao.entity.Rank;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClassfyMapper {
//获取分类classfy的所有名字
     List<String> getName();

     List<Rank> selelctRank(String name);
}