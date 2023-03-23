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
@TableName("tb_student")
@ApiModel("学生实体类")
public class StudentEntity implements Serializable {
	private static final long serialVersionUID = 1L;


	@ApiModelProperty(value = "学生编号")
	@TableId
	private Long studentId;
	@ApiModelProperty(value = "班级编号")
	private Long classId;
	@ApiModelProperty(value = "学生姓名")
	private String studentName;
	@ApiModelProperty(value = "学生性别")
	private String studentGender;
	@ApiModelProperty(value = "出生日期")
	private Date studentBirth;

}
