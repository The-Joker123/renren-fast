package io.renren.modules.demo.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author  zzx
 * @date
 */
@Data
public class ScoreVO implements Serializable {
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
    @ApiModelProperty(value = "最小成绩")
    private String minScore;
    @ApiModelProperty(value = "最高成绩")
    private String maxScore;
    @ApiModelProperty(value = "平均成绩")
    private String avgScore;

}