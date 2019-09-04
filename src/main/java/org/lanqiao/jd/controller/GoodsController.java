package org.lanqiao.jd.controller;

import org.lanqiao.jd.entity.*;
import org.lanqiao.jd.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsController {
    @Autowired
    GoodsService goodsService;
    @RequestMapping("/getgoods")
    public List<Goods>getAllgoods(int goodid){
        return goodsService.getAllgoods(goodid);
    }
    @RequestMapping("/writecart")
    int insert(Cart record) {
        return goodsService.insert(record);
    }

    @RequestMapping("/updatecart")
    int update(Cart record) {
        return goodsService.update(record);
    }
    @RequestMapping("/getfsort")
    List<FirstSort> getFsSort(Integer goodid){
        return goodsService.getFsSort(goodid);
    }
    @RequestMapping("/getimages")
    public List<Image> getAllimage(Image image)
    {
        return goodsService.getAllimage(image.getGoods_id());
    }
    @RequestMapping("/getssort")
    List<SecondSort>getSsSort(Integer goodid){
        return goodsService.getSsSort(goodid);
    }
}
