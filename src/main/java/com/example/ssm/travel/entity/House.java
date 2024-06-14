package com.example.ssm.travel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;
import java.io.Serializable;
import java.util.List;

/**
 * 房屋表(House)实体类
 *
 * @author makejava
 * @since 2021-12-11 10:47:17
 */
@TableName("t_house")
public class House implements Serializable {
    private static final long serialVersionUID = -93498402629218202L;
    /**
    * 民宿id
    */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
    * 标题
    */
    private String title;
    /**
    * 内容
    */
    private String content;
    /**
    * 缩略图
    */
    private String thumbnail;
    /**
     * 轮播图集合
     */
    private String slideUrl;
    /**
    * 价格/单日
    */
    private Double money;
    /**
    * 房东用户id
    */
    private Integer userId;
    /**
    * 发布时间
    */
    private Date createTime;

    @TableField(exist = false)
    private List<String> slideUrlList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public String getSlideUrl() {
        return slideUrl;
    }

    public void setSlideUrl(String slideUrl) {
        this.slideUrl = slideUrl;
    }


    public List<String> getSlideUrlList() {
        return slideUrlList;
    }

    public void setSlideUrlList(List<String> slideUrlList) {
        this.slideUrlList = slideUrlList;
    }
