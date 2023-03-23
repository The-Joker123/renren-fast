package io.renren.modules.demo.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author  zzx
 * @date
 */
@Data
public class StudentAllListVO implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "学生编号")
    @TableId
    private Long studentId;
    @ApiModelProperty(value = "班级名称")
    private String className;
    @ApiModelProperty(value = "年级")
    private String classGrade;
    @ApiModelProperty(value = "班主任姓名")
    private String headTeacher;
    @ApiModelProperty(value = "学生姓名")
    private String studentName;
    @ApiModelProperty(value = "学生性别")
    private String studentGender;
    @ApiModelProperty(value = "出生日期")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date studentBirth;
}