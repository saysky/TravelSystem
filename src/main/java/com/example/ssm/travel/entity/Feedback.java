package com.example.ssm.travel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;
import java.io.Serializable;

/**
 * 反馈表(Feedback)实体类
 *
 * @author makejava
 * @since 2021-12-11 10:47:17
 */
@TableName("t_feedback")
public class Feedback implements Serializable {
    private static final long serialVersionUID = 434590080401265320L;
    /**
    * 反馈id
    */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
    * 反馈人旅客用户id
    */
    private Integer guestUserId;
    /**
    * 反馈标题
    */
    private String title;
    /**
    * 反馈内容
    */
    private String content;

    /**
     * 回复内容
     */
    private String reply;
    /**
    * 反馈时间
    */
    private Date createTime;
    /**
    * 接收人用户id
    */
    private Integer acceptUserId;

    /**
     * 反馈人
     */
    @TableField(exist = false)
    private User guestUser;

    /**
     * 处理人
     */
    @TableField(exist = false)
    private User acceptUser;


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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getAcceptUserId() {
        return acceptUserId;
    }

    public void setAcceptUserId(Integer acceptUserId) {
        this.acceptUserId = acceptUserId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }


    public User getGuestUser() {
        return guestUser;
    }

    public void setGuestUser(User guestUser) {
        this.guestUser = guestUser;
    }

    public User getAcceptUser() {
        return acceptUser;
    }

    public void setAcceptUser(User acceptUser) {
        this.acceptUser = acceptUser;
    }
