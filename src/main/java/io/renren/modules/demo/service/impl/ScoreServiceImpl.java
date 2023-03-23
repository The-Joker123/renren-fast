package io.renren.modules.demo.service.impl;

import io.renren.modules.demo.dto.CourseDTO;
import io.renren.modules.demo.dto.SumScoreDTO;
import io.renren.modules.demo.vo.AllCourseVO;
import io.renren.modules.demo.vo.ScoreVO;
import io.renren.modules.demo.vo.SumScoreVo;
import org.springframework.stereotype.Service;
import java.util.List;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.modules.demo.dao.ScoreDao;
import io.renren.modules.demo.entity.ScoreEntity;
import io.renren.modules.demo.service.ScoreService;

import javax.annotation.Resource;


@Service("scoreService")
public class ScoreServiceImpl extends ServiceImpl<ScoreDao, ScoreEntity> implements ScoreService {

    @Resource
    private ScoreDao scoreDao;

    @Override
    public List<ScoreVO> queryChineseScoreList(CourseDTO courseDTO) {

        QueryWrapper<ScoreVO> query = new QueryWrapper<>();
        //按课程姓名查询
        query.eq("tse.course_name",courseDTO.getCourse());

        return scoreDao.queryChineseScoreList(query);
    }

    @Override
    public List<SumScoreVo> querySumScoreList(SumScoreDTO sumScoreDTO) {
        QueryWrapper<SumScoreVo> query = new QueryWrapper<>();
        //按班主任姓名查询
        query.eq("tcs.head_teacher",sumScoreDTO.getHeadTeacher());

        return scoreDao.querySumScoreList(query);
    }

    @Override
    public List<AllCourseVO> queryAllCourseList() {
        return scoreDao.queryAllCourseList();
    }
}