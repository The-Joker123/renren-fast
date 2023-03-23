package io.renren.modules.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.modules.demo.dto.StudentDTO;
import io.renren.modules.demo.entity.ClassEntity;
import io.renren.modules.demo.vo.StudentAllListVO;

import java.util.List;

/**
 * 
 *
 *@author  zzx
 * @email danger.zeng@qq.com
 * @date 2023-02-24 20:47:27
 */
public interface ClassService extends IService<ClassEntity> {

    List<StudentAllListVO> listAllStudent();

    List<StudentAllListVO> listStudent(StudentDTO studentDTO);

}

