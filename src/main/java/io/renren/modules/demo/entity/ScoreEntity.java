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
@TableName("tb_score")
@ApiModel("成绩实体类")
public class ScoreEntity implements Serializable {
	private static final long serialVersionUID = 1L;


	@ApiModelProperty(value = "成绩编号")
	@TableId
	private Long scoreId;
	@ApiModelProperty(value = "学生编号")
	private Long studentId;
	@ApiModelProperty(value = "课程名称")
	private String courseName;
	@ApiModelProperty(value = "课程成绩")
	private Double score;

}
