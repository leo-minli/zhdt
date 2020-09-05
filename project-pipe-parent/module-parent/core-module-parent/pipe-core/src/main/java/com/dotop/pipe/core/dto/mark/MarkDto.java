package com.dotop.pipe.core.dto.mark;

import com.dotop.smartwater.dependence.core.common.pipe.BasePipeDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
public class MarkDto extends BasePipeDto {

	/**
	 * 主键
	 */
	private String id;

	/**
	 * 坐标编号
	 */
	private String code;

	/**
	 * 坐标描述
	 */
	private String desc;

	/**
	 * 经度
	 */
	private BigDecimal longitude;

	/**
	 * 纬度
	 */
	private BigDecimal latitude;

	/**
	 * 状态： 0：不使用，1：使用
	 */
	private String status;

	/**
	 * 用户id
	 */
	private String userId;
}
