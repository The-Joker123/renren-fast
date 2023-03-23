package io.renren.modules.demo.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.modules.demo.vo.AllCourseVO;
import io.renren.modules.demo.vo.ScoreVO;
import io.renren.modules.demo.vo.SumScoreVo;
import io.renren.modules.demo.entity.ScoreEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;

/**
 * 
 * 
 *@author  zzx
 * @email danger.zeng@qq.com
 * @date 2023-02-24 20:47:27
 */
@Mapper
public interface ScoreDao extends BaseMapper<ScoreEntity> {

    List<ScoreVO> queryChineseScoreList(@Param("ew") QueryWrapper queryWrapper);

    List<SumScoreVo> querySumScoreList(@Param("ew") QueryWrapper queryWrapper);

    List<AllCourseVO> queryAllCourseList();
}
