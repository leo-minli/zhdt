package com.dotop.smartwater.project.module.core.water.vo;

import java.util.List;

import com.dotop.smartwater.dependence.core.common.BaseVo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 绩效考核-模板管理
 * 

 * @date 2019年2月27日
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PerforTemplateVo extends BaseVo {
	/** 主键 */
	private String id;
	/** 模板名称 */
	private String name;
	/** 权重项 */
	private String weights;
	/** 总分数 */
	private String totalScore;
	/** 及格分数 */
	private String passScore;
	/** 报表详情 */
	private String reports;
	/** 报表详情 */
	private List<PerforWeightVo> weightArry;

}
