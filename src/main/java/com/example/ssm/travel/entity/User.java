package com.example.ssm.travel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * 用户表(User)实体类
 *
 * @author makejava
 * @since 2021-12-11 10:47:17
 */
@TableName("t_user")
public class User implements Serializable {
    private static final long serialVersionUID = 977750783626149659L;
    /**
     * 用户id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 登录账号
     */
    @NotEmpty(message = "用户名不能为空")
    @Size(min = 4, max = 20, message = "用户名长度为4-20位")
    private String username;
    /**
     * 登录密码
     */
    @NotEmpty(message = "密码不能为空")
    @Size(min = 6, max = 20, message = "密码长度为6-20位")
    private String password;
    /**
     * 姓名
     */
    @NotEmpty(message = "姓名不能为空")
    @Size(min = 2, max = 20, message = "姓名长度为2-20位")
    private String name;
    /**
     * 角色：管理员admin，房东landlord，导游guide，旅客guest
     */
    @NotEmpty(message = "角色不能为空")
    private String role;
    /**
     * 手机号
     */
    @NotEmpty(message = "手机号不能为空")
    @Size(min = 11, max = 11, message = "手机号为11位")
    private String phone;
    /**
     * 身份证
     */
    @Size(min = 18, message = "身份证为18位")
    private String idcard;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 角色名称
     */
    @TableField(exist = false)
    private String roleName;

    /**
     * 导游剩余名额
     */
    @TableField(exist = false)
    private Integer guideRemainingCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getRoleName() {
        if ("admin".equals(this.role)) {
            return "管理员";
        }
        if ("landlord".equals(this.role)) {
            return "旅店老板";
        }
        if ("guide".equals(this.role)) {
            return "导游";
        }
        if ("guest".equals(this.role)) {
            return "旅客";
        }
        return roleName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getGuideRemainingCount() {
        return guideRemainingCount;
    }

    public void setGuideRemainingCount(Integer guideRemainingCount) {
        this.guideRemainingCount = guideRemainingCount;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
