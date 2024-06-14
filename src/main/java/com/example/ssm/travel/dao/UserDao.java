package com.example.ssm.travel.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.ssm.travel.common.vo.GuideSearchVO;
import com.example.ssm.travel.common.vo.PlaceSearchVO;
import com.example.ssm.travel.entity.Feedback;
import com.example.ssm.travel.entity.Place;
import com.example.ssm.travel.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 用户表(User)表数据库访问层
 *
 * @author makejava
 * @since 2021-12-11 10:47:17
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    User queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<User> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param user 实例对象
     * @return 对象列表
     */
    List<User> queryAll(User user);

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 影响行数
     */
    int insert(User user);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 影响行数
     */
    int update(User user);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    /**
     * 搜索导游
     * 像这种比较复杂的SQL，我们最好写在XML里，PlaceMapper.xml
     * 一个参数时，可以不写 @Param
     * 如果有2个参数，一定要写@param进行参数绑定
     *
     * @param guideSearchVO
     * @param page
     * @return
     */
    List<User> searchGuide(@Param("guideSearchVO") GuideSearchVO guideSearchVO,
                            @Param("page") Page page);

