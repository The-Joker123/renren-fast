package io.renren.modules.demo.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author  zzx
 * @date
 */
@Data
public class SumScoreVo implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "班级名称")
    private String className;
    @ApiModelProperty(value = "年级")
    private String classGrade;
    @ApiModelProperty(value = "班主任姓名")
    private String headTeacher;
    @ApiModelProperty(value = "学生编号")
    private Long studentId;
    @ApiModelProperty(value = "学生姓名")
    private String studentName;
    @ApiModelProperty(value = "学生姓名")
    private String sumScore;



}
