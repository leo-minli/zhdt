package com.dotop.smartwater.project.module.core.water.dto;

import java.util.List;

import com.dotop.smartwater.dependence.core.common.BaseDto;
import com.dotop.smartwater.project.module.core.water.model.BodyMap;
import com.dotop.smartwater.project.module.core.water.model.BodyMap;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**

 * @date 2019年3月4日
 * @description
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class WorkCenterProcessFormDto extends BaseDto {

	private String id;
	private String processId;

	private String code;
	private String name;
	private String body;

	private String appBody;

	private List<BodyMap> bodyMap;

	private String formId;

}
