package com.dotop.smartwater.project.module.core.water.form;

import com.dotop.smartwater.dependence.core.common.BaseForm;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**

 * @date 2019/3/4.
 * 数据校准 data_calibration
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class DataCalibrationForm extends BaseForm{
	/**
	 * 主键
	 */
	private String id;

	/**
	 * 发起人
	 */
	private String createBy;

	/**
	 * 发起时间
	 */
	private Date createDate;

	/**
	 * 类型
	 */
	private Integer type;

	/**
	 * 状态
	 */
	private Integer status;

	private Date startTime;

	private Date endTime;
}
