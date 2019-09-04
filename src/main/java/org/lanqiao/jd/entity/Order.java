package org.lanqiao.jd.entity;

import java.util.Date;
import java.util.Set;

public class order {
    private Integer order_id;

    private Integer address_id;

    private String pay_method;

    public Set<orderitem> getOrderitemSet() {
        return orderitemSet;
    }

    public void setOrderitemSet(Set<orderitem> orderitemSet) {
        this.orderitemSet = orderitemSet;
    }

    private Double order_money;

    private Set<orderitem> orderitemSet;

    public Set<goods> getGoodsSet() {
        return goodsSet;
    }

    public void setGoodsSet(Set<goods> goodsSet) {
        this.goodsSet = goodsSet;
    }

    public org.lanqiao.jd.entity.address getAddress() {
        return address;
    }

    public void setAddress(org.lanqiao.jd.entity.address address) {
        this.address = address;
    }

    public org.lanqiao.jd.entity.user getUser() {
        return user;
    }

    public void setUser(org.lanqiao.jd.entity.user user) {
        this.user = user;
    }

    private Date creat_time;

    private String order_status;

    private Integer user_id;

    private Set<goods> goodsSet;

    private org.lanqiao.jd.entity.address address;

    private user user;

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getAddress_id() {
        return address_id;
    }

    public void setAddress_id(Integer address_id) {
        this.address_id = address_id;
    }

    public String getPay_method() {
        return pay_method;
    }

    public void setPay_method(String pay_method) {
        this.pay_method = pay_method == null ? null : pay_method.trim();
    }

    public Double getOrder_money() {
        return order_money;
    }

    public void setOrder_money(Double order_money) {
        this.order_money = order_money;
    }

    public Date getCreat_time() {
        return creat_time;
    }

    public void setCreat_time(Date creat_time) {
        this.creat_time = creat_time;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status == null ? null : order_status.trim();
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}