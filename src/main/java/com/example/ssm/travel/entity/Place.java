package com.example.ssm.travel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.List;

/**
 * 景点表(Place)实体类
 *
 * @author makejava
 * @since 2021-12-11 10:47:17
 */
@TableName("t_place")
public class Place implements Serializable {
    private static final long serialVersionUID = -94846179766020187L;
    /**
    * 景点id
    */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
    * 景点标题
    */
    private String name;
    /**
    * 景点内容
    */
    private String content;
    /**
    * 景点缩略图
    */
    private String thumbnail;

    /**
     * 幻灯片URL
     */
    private String slideUrl;

    @TableField(exist = false)
    private List<String> slideUrlList;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
