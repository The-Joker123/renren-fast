package io.renren.modules.demo.dto;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author  zzx
 * @date
 */
@Data
public class StudentDTO {

    @NotNull(message = "学生年龄不能为空")
    @ApiModelProperty(value = "学生年龄")
    private Integer studentAge;
    @NotEmpty(message = "学生性别不能为空")
    @ApiModelProperty(value = "学生性别")
    private String studentGender;
    @NotEmpty(message = "班主任姓名不能为空")
    @ApiModelProperty(value = "班主任姓名")
    private String headTeacher;
}
