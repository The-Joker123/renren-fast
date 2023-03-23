package io.renren.modules.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.Query;
import io.renren.modules.demo.service.StudentService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;

import io.renren.modules.demo.dao.StudentDao;
import io.renren.modules.demo.entity.StudentEntity;


@Service("studentService")
public class StudentServiceImpl extends ServiceImpl<StudentDao, StudentEntity> implements StudentService {



}