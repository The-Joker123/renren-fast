package io.renren.modules.demo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author  zzx
 * @date
 */
@Data
@ApiModel("测试实体类")
public class AllCourseVO implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "学生编号")
    private Long studentId;
    @ApiModelProperty(value = "学生姓名")
    private String studentName;
    @ApiModelProperty(value = "学生性别")
    private String studentGender;
    @ApiModelProperty(value = "出生日期")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date studentBirth;
    @ApiModelProperty(value = "语文成绩")
    private String chineseScore;
    @ApiModelProperty(value = "数学成绩")
    private String mathsScore;
    @ApiModelProperty(value = "英语成绩")
    private String englishScore;
    @ApiModelProperty(value = "物理成绩")
    private String physicsScore;
    @ApiModelProperty(value = "化学成绩")
    private String chemistryScore;
    @ApiModelProperty(value = "生物成绩")
    private String biologyScore;



}
