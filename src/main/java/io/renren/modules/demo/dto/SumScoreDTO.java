package io.renren.modules.demo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @author  zzx
 * @date
 */
@Data
public class SumScoreDTO {

    @NotEmpty(message = "班主任姓名不能为空")
    @ApiModelProperty(value = "班主任姓名")
    private String headTeacher;
}
