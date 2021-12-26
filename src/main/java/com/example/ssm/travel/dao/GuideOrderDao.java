package com.example.ssm.travel.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.ssm.travel.entity.GuideOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 导游订单(GuideOrder)表数据库访问层
 *
 * @author makejava
 * @since 2021-12-11 10:47:17
 */
@Mapper
public interface GuideOrderDao extends BaseMapper<GuideOrder> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    GuideOrder queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<GuideOrder> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param guideOrder 实例对象
     * @return 对象列表
     */
    List<GuideOrder> queryAll(GuideOrder guideOrder);

    /**
     * 新增数据
     *
     * @param guideOrder 实例对象
     * @return 影响行数
     */
    int insert(GuideOrder guideOrder);

    /**
     * 修改数据
     *
     * @param guideOrder 实例对象
     * @return 影响行数
     */
    int update(GuideOrder guideOrder);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    /**
     * 查询导游某日订单数量
     *
     * @param guideUserId
     * @param guideDate
     * @return
     */
    Integer selectCountByGuideUserIdAndGuideDate(@Param("guideUserId") Integer guideUserId,
                                                 @Param("guideDate") String guideDate);

    /**
     * 根据用户id查询
     *
     * @return
     */
    GuideOrder findByUserIdAndGuideDate(@Param("guideUserId") Integer guideUserId,
                                      @Param("guestUserId") Integer guestUserId,
                                      @Param("guideDate") String guideDate);
}