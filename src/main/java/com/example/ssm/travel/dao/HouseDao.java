package com.example.ssm.travel.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.ssm.travel.common.vo.HouseSearchVO;
import com.example.ssm.travel.entity.House;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 房屋表(House)表数据库访问层
 *
 * @author makejava
 * @since 2021-12-11 10:47:17
 */
@Mapper
public interface HouseDao extends BaseMapper<House> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    House queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<House> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param house 实例对象
     * @return 对象列表
     */
    List<House> queryAll(House house);

    /**
     * 新增数据
     *
     * @param house 实例对象
     * @return 影响行数
     */
    int insert(House house);

    /**
     * 修改数据
     *
     * @param house 实例对象
     * @return 影响行数
     */
    int update(House house);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    /**
     * 客房排名
     *
     * @return
     */
    List<Integer> getHouseRank();

    /**
     * 搜索房子
     * 像这种比较复杂的SQL，我们最好写在XML里，HouseMapper.xml
     * 一个参数时，可以不写 @Param
     * 如果有2个参数，一定要写@param进行参数绑定
     *
     * @param houseSearchVO
     * @param page
     * @return
     */
    List<House> searchHouse(@Param("houseSearchVO") HouseSearchVO houseSearchVO,
                            @Param("page") Page page);
