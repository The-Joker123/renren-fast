package io.renren.modules.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.modules.demo.dto.CourseDTO;
import io.renren.modules.demo.dto.SumScoreDTO;
import io.renren.modules.demo.vo.AllCourseVO;
import io.renren.modules.demo.vo.ScoreVO;
import io.renren.modules.demo.vo.SumScoreVo;
import io.renren.modules.demo.entity.ScoreEntity;

import java.util.List;

/**
 * 
 *
 *@author  zzx
 * @email danger.zeng@qq.com
 * @date 2023-02-24 20:47:27
 */
public interface ScoreService extends IService<ScoreEntity> {

    List<ScoreVO> queryChineseScoreList(CourseDTO courseDTO);

    List<SumScoreVo> querySumScoreList(SumScoreDTO SumScoreDTO);

    List<AllCourseVO> queryAllCourseList();
}

