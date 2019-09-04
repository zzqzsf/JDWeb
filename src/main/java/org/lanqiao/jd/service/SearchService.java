package org.lanqiao.service;

import org.lanqiao.entity.Brand;
import org.lanqiao.entity.Goods;
import org.lanqiao.entity.Rank;
import org.lanqiao.entity.RankDetail;

import java.util.List;

public interface SearchService {

    List<Goods> fuzzySearch(String name, Integer pageSize, Integer pageNum);
    List<Goods> orderBy(String name,Integer orderByState,Integer pageSize,Integer pageNum);
    List<Goods> priceInterval(String name,Double lowPrice,Double highPrice,Integer pageSize,Integer pageNum);
    List<Goods> brandSearch(String name,String brandName,Integer pageSize,Integer pageNum);
    List<Brand> insertBrand(String name);
    List<Rank> selelctRank(String name);
    List<RankDetail> sellectDetail(String name,Integer index);
}
