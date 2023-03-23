package io.renren.modules.demo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @author  zzx
 * @date
 */
@Data
public class CourseDTO {

    @NotEmpty(message = "课程不能为空")
    @ApiModelProperty(value = "课程")
    private String Course;

}
