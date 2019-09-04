package org.lanqiao.controller;

import org.lanqiao.entity.Brand;
import org.lanqiao.entity.Goods;
import org.lanqiao.entity.Rank;
import org.lanqiao.entity.RankDetail;
import org.lanqiao.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class serachController {
    @Autowired
    SearchService searchService;

    @RequestMapping("/fuzzySearch")
    public List<Goods> fuzzySearch(String name, Integer pageSize, Integer pageNum) {
        return searchService.fuzzySearch(name,pageSize,pageNum);
    }

    @RequestMapping("/orderBy")
    public List<Goods> orderBy(String name,Integer orderByState,Integer pageSize,Integer pageNum) {
        return searchService.orderBy(name,orderByState,pageSize,pageNum);
    }

    @RequestMapping("/priceInterval")
    public List<Goods> priceInterval(String name, Double lowPrice, Double highPrice,Integer pageSize,Integer pageNum) {
        return searchService.priceInterval(name,lowPrice,highPrice,pageSize,pageNum);
    }

    @RequestMapping("/brandSearch")
    public List<Goods> brandSearch(String name,String brandName,Integer pageSize,Integer pageNum) {
        return searchService.brandSearch(name,brandName,pageSize,pageNum);
    }
    @RequestMapping("/insertBrand")
    public List<Brand> insertBrand(String name) {
        List<Brand> brands=searchService.insertBrand(name);
        return searchService.insertBrand(name);
    }

    @RequestMapping("/selectRank")
    public List<Rank> selelctRank(String name){
        return searchService.selelctRank(name);
    }
    @RequestMapping("/selectDetail")
    public List<RankDetail> sellectDetail(String name,Integer index) {
        return searchService.sellectDetail(name,index);
    }
}
