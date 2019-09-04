package org.lanqiao.jd.service;

import org.lanqiao.jd.entity.goods;
import org.lanqiao.jd.entity.order;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface JDService {
    public List<order> getAllOrder(Integer user_id,String order_status,Integer pageNum,Integer pageSize,String search_text);
    public int deleteOrder(Integer order_id);
    public int deleteOrderItem(Integer order_id);

    public int calcPageCount(int pageSize,int user_id,String order_status,String search_text);

    public int getOrderCount(int user_id,String order_status);
}
