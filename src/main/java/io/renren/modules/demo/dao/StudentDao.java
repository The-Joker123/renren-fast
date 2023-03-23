package io.renren.modules.demo.dao;

import io.renren.modules.demo.entity.StudentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 *@author  zzx
 * @email danger.zeng@qq.com
 * @date 2023-02-24 20:47:27
 */
@Mapper
public interface StudentDao extends BaseMapper<StudentEntity> {
	
}
