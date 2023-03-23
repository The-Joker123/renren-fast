package io.renren.modules.demo.service.impl;

import io.renren.modules.demo.dto.StudentDTO;
import io.renren.modules.demo.service.ClassService;
import io.renren.modules.demo.vo.StudentAllListVO;
import org.springframework.stereotype.Service;
import java.util.List;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.modules.demo.dao.ClassDao;
import io.renren.modules.demo.entity.ClassEntity;
import javax.annotation.Resource;


@Service("classService")
public class ClassServiceImpl extends ServiceImpl<ClassDao, ClassEntity> implements ClassService {

    @Resource
    private ClassDao classDao;

    @Override
    public List<StudentAllListVO> listAllStudent() {
        QueryWrapper<StudentAllListVO> query = new QueryWrapper<>();
        //查询所有学生清单
        return classDao.listAllStudent(query);
    }

    @Override
    public List<StudentAllListVO> listStudent(StudentDTO studentDTO) {

        QueryWrapper<StudentAllListVO> query = new QueryWrapper<>();
        //查询大于学生的年龄
        query.ge("a.age",studentDTO.getStudentAge());
        //查询学生性别
        query.eq("a.student_gender",studentDTO.getStudentGender());
        //查询班主任姓名
        query.eq("a.head_teacher",studentDTO.getHeadTeacher());

        return classDao.listAllStudent(query);
    }

}