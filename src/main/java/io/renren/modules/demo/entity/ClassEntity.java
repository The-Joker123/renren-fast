package io.renren.modules.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 
 * 
 *@author  zzx
 * @email danger.zeng@qq.com
 * @date 2023-02-24 20:47:27
 */
@Data
@TableName("tb_class")
@ApiModel("班级实体类")
public class ClassEntity implements Serializable {
	private static final long serialVersionUID = 1L;


	@ApiModelProperty(value = "班级编号")
	@TableId
	private Long classId;
	@ApiModelProperty(value = "班级名称")
	private String className;
	@ApiModelProperty(value = "年级")
	private String classGrade;
	@ApiModelProperty(value = "班主任姓名")
	private String headTeacher;

}
