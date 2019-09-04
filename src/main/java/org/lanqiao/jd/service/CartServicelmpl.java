package org.lanqiao.jd.service;

import org.lanqiao.jd.entity.Address;
import org.lanqiao.jd.entity.Cart;
import org.lanqiao.jd.entity.Order;
import org.lanqiao.jd.entity.OrderItem;
import org.lanqiao.jd.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartServicelmpl implements CartService {
    @Autowired
    CartMapper cartMapper ;

    @Autowired
    GoodsMapper goodsMapper;
    @Autowired
    AddressMapper addressMapper;
    @Autowired
    RegionMapper regionMapper;
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    OrderItemMapper orderItemMapper;


    @Override
    public List<Cart> selectCartGoods(Integer userId) {
        return  cartMapper.selectCartGoods(userId);
    }

    @Override
    public int changeGoodsNum(Integer goodsNum,Integer userId, Integer goodsId) {
        return cartMapper.changeGoodsNum(goodsNum,userId,goodsId);
    }

    @Override
    public int deleteCartGoods(Integer userId, Integer goodsId) {
        return cartMapper.deleteCartGoods(userId,goodsId);
    }


    @Override
    @Transactional
    public int createOrder(List<OrderItem> orderItems, Order order) {
        orderMapper.insertSelective(order);
        for (OrderItem oi :orderItems) {
            System.out.println(order.getOrderId());
            oi.setOrderId(order.getOrderId());
            System.out.println(oi);
            orderItemMapper.insertSelective(oi);
        }
        return 0;
    }

    @Override
    public List<Object> selectRegion(Integer userId) {
        List<Object> addressList = new ArrayList<Object>();
        Address address=addressMapper.selectAddr(userId);
        int addressId=address.getAddressId();
        addressList.add(addressId);
        int proviceId=address.getProviceId();
        String provice = regionMapper.select(proviceId);
        addressList.add(provice);
        int cityId=address.getCityId();
        String city = regionMapper.select(cityId);
        addressList.add(city);
        int districtId=address.getDistrictId();
        String district = regionMapper.select(districtId);
        addressList.add(district);
        return addressList;
    }
}
