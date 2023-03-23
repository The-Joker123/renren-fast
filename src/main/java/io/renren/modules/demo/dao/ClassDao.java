package io.renren.modules.demo.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.modules.demo.vo.StudentAllListVO;
import io.renren.modules.demo.entity.ClassEntity;
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
public interface ClassDao extends BaseMapper<ClassEntity> {

    List<StudentAllListVO> listAllStudent(@Param("ew") QueryWrapper queryWrapper);
}
