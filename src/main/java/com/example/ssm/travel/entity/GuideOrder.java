package com.example.ssm.travel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;
import java.io.Serializable;

/**
 * 导游订单(GuideOrder)实体类
 *
 * @author makejava
 * @since 2021-12-11 10:47:17
 */
@TableName("t_guide_order")
public class GuideOrder implements Serializable {
    private static final long serialVersionUID = 854532281056538145L;
    /**
    * id
    */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
    * 旅客用户id
    */
    private Integer guestUserId;
    /**
    * 导游用户id
    */
    private Integer guideUserId;
    /**
     * 景点id
     */
    private Integer placeId;
    /**
    * 导游日期
    */
    private Date guideDate;
    /**
    * 下单创建时间
    */
    private Date createTime;

    /**
     * 旅客用户
     */
    @TableField(exist = false)
    private User guestUser;

    /**
     * 导游用户
     */
    @TableField(exist = false)
    private User guideUser;

    /**
     * 景点
     */
    @TableField(exist = false)
    private Place place;




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGuestUserId() {
        return guestUserId;
    }

    public void setGuestUserId(Integer guestUserId) {
        this.guestUserId = guestUserId;
    }

    public Integer getGuideUserId() {
        return guideUserId;
    }

    public void setGuideUserId(Integer guideUserId) {
        this.guideUserId = guideUserId;
    }

    public Date getGuideDate() {
        return guideDate;
    }

    public void setGuideDate(Date guideDate) {
        this.guideDate = guideDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public User getGuestUser() {
        return guestUser;
    }

    public void setGuestUser(User guestUser) {
        this.guestUser = guestUser;
    }

    public User getGuideUser() {
        return guideUser;
    }

    public void setGuideUser(User guideUser) {
        this.guideUser = guideUser;
    }

    public Integer getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Integer placeId) {
        this.placeId = placeId;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}