package com.example.ssm.travel.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.ssm.travel.entity.LiveOrder;
import com.example.ssm.travel.entity.UserPlace;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * 住宿订单表(LiveOrder)表数据库访问层
 *
 * @author makejava
 * @since 2021-12-11 10:47:17
 */
@Mapper
public interface LiveOrderDao extends BaseMapper<LiveOrder> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LiveOrder queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<LiveOrder> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param liveOrder 实例对象
     * @return 对象列表
     */
    List<LiveOrder> queryAll(LiveOrder liveOrder);

    /**
     * 新增数据
     *
     * @param liveOrder 实例对象
     * @return 影响行数
     */
    int insert(LiveOrder liveOrder);

    /**
     * 修改数据
     *
     * @param liveOrder 实例对象
     * @return 影响行数
     */
    int update(LiveOrder liveOrder);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    Integer selectCountByHouseIdAndLiveDate(@Param("houseId") Integer houseId,
                                            @Param("liveDate") String liveDate);
