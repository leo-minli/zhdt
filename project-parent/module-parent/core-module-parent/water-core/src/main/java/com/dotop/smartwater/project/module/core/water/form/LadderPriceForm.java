package com.dotop.smartwater.project.module.core.water.form;

import com.dotop.smartwater.dependence.core.common.BaseForm;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 收费区间-费用组成单价
 * 

 *
 */
// 表存在
@Data
@EqualsAndHashCode(callSuper = false)
public class LadderPriceForm extends BaseForm {

	private String id;
	/* 收费类型ID */
	private String typeid;
	/* 收费区间ID */
	private Long ladderid;
	/* 费用组成名称 */
	private String name;
	/* 费用组成ID */
	/*private String compriseid;*/
	/* 收费区间中费用组成单价 */
	private Double price;
	/* 创建时间 */
	private String createtime;

}
