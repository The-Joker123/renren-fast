package io.renren.modules.demo.controller;

import java.util.List;

import io.renren.modules.demo.dto.CourseDTO;
import io.renren.modules.demo.dto.StudentDTO;
import io.renren.modules.demo.dto.SumScoreDTO;
import io.renren.modules.demo.service.ClassService;
import io.renren.modules.demo.service.ScoreService;
import io.renren.modules.demo.vo.AllCourseVO;
import io.renren.modules.demo.vo.ScoreVO;
import io.renren.modules.demo.vo.SumScoreVo;
import io.renren.modules.demo.vo.StudentAllListVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import io.renren.common.utils.R;

import javax.validation.Valid;


/**
 * 
 *
 *@author  zzx
 * @email danger.zeng@qq.com
 * @date 2023-02-24 20:47:27
 */
@RestController
@Api(tags = "校园")
public class SchoolController {
    @Autowired
    private ClassService classService;
    @Autowired
    private ScoreService scoreService;

    /**
     * 查询所有学生清单
     */
    @ApiOperation("第1题：查询所有学生清单")
    @RequestMapping(value = "/queryAllStudentList", method = RequestMethod.GET)
    public R queryAllStudentList(){

        List page = classService.listAllStudent();

        return R.ok("符合条件"+page.size()+"人").put("page", page);
    }

    /**
     * 按条件查询所有学生
     */
    @ApiOperation("第2题：按条件查询所有学生")
    @RequestMapping(value = "/queryStudentList", method = RequestMethod.POST)
    public R queryStudentList(@RequestBody @Valid StudentDTO studentDTO, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return R.error(bindingResult.getAllErrors().get(0).getDefaultMessage());
        }
        List<StudentAllListVO> page = classService.listStudent(studentDTO);

        return R.ok("符合条件"+page.size()+"人").put("page", page);
    }

    /**
     * 查询各班语文成绩汇总
     */
    @ApiOperation("第3题：查询各班语文成绩汇总")
    @RequestMapping(value = "/queryChineseScoreList", method = RequestMethod.POST)
    public R queryChineseScoreList(@RequestBody @Valid CourseDTO courseDTO, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return R.error(bindingResult.getAllErrors().get(0).getDefaultMessage());
        }
        List<ScoreVO> page = scoreService.queryChineseScoreList(courseDTO);

        return R.ok("符合条件"+page.size()+"个").put("page", page);
    }

    /**
     * 查询班里学生的总分清单
     */
    @ApiOperation("第4题：查询班里学生的总分清单")
    @RequestMapping(value = "/querySumScoreList", method = RequestMethod.POST)
    public R querySumScoreList(@RequestBody @Valid SumScoreDTO sumScoreDTO, BindingResult bindingResult){


        if(bindingResult.hasErrors()){
            return R.error(bindingResult.getAllErrors().get(0).getDefaultMessage());
        }
        List<SumScoreVo> page = scoreService.querySumScoreList(sumScoreDTO);

        return R.ok("符合条件"+page.size()+"个").put("page", page);
    }


    /**
     * 查询所有学生清单
     */
    @ApiOperation(value = "第5题：查询总科目汇总")
    @RequestMapping(value = "/queryAllCourse", method = RequestMethod.GET)
    public R queryAllCourseList(){

        List<AllCourseVO> page = scoreService.queryAllCourseList();

        return R.ok("符合条件"+page.size()+"个").put("page", page);
    }


}
