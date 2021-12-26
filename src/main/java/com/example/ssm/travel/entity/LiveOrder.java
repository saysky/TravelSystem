package com.example.ssm.travel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;
import java.io.Serializable;

/**
 * 住宿订单表(LiveOrder)实体类
 *
 * @author makejava
 * @since 2021-12-11 10:47:17
 */
@TableName("t_live_order")
public class LiveOrder implements Serializable {
    private static final long serialVersionUID = -29622513983771107L;
    /**
     * 订单id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 民宿id
     */
    private Integer houseId;
    /**
     * 下单旅客用户id
     */
    private Integer guestUserId;
    /**
     * 住宿日期
     */
    private Date liveDate;
    /**
     * 订单创建时间
     */
    private Date createTime;
    /**
     * 订单状态，待支付1，已支付2, 已完成3
     */
    private Integer status;
    /**
     * 价格
     */
    private Double money;

    /**
     * 旅店老板id
     */
    private Integer landlordUserId;

    /**
     * 客房信息
     */
    @TableField(exist = false)
    private House house;

    /**
     * 旅客信息
     */
    @TableField(exist = false)
    private User guestUser;

    /**
     * 旅店老板信息
     */
    @TableField(exist = false)
    private User landlordUser;

    /**
     * 订单状态名称
     */
    @TableField(exist = false)
    private String statusName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Integer getGuestUserId() {
        return guestUserId;
    }

    public void setGuestUserId(Integer guestUserId) {
        this.guestUserId = guestUserId;
    }

    public Date getLiveDate() {
        return liveDate;
    }

    public void setLiveDate(Date liveDate) {
        this.liveDate = liveDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public User getGuestUser() {
        return guestUser;
    }

    public void setGuestUser(User guestUser) {
        this.guestUser = guestUser;
    }

    //    订单状态，待支付1，已支付2, 已完成3
    public String getStatusName() {
        if (1 == this.status) {
            return "待支付";
        }
        if (2 == this.status) {
            return "已支付";
        }
        if (3 == this.status) {
            return "已完成";
        }
        return null;
    }


    public Integer getLandlordUserId() {
        return landlordUserId;
    }

    public void setLandlordUserId(Integer landlordUserId) {
        this.landlordUserId = landlordUserId;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public User getLandlordUser() {
        return landlordUser;
    }

    public void setLandlordUser(User landlordUser) {
        this.landlordUser = landlordUser;
    }
}