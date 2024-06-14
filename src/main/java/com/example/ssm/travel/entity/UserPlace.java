package com.example.ssm.travel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * 导游与景点关联表(UserPlace)实体类
 *
 * @author makejava
 * @since 2021-12-11 10:47:17
 */
@TableName("t_user_place")
public class UserPlace implements Serializable {
    private static final long serialVersionUID = -14469522870566345L;
    /**
    * id
    */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
    * 导游用户id
    */
    private Integer userId;
    /**
    * 景点id
    */
    private Integer placeId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Integer placeId) {
        this.placeId = placeId;
    }

