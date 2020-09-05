package com.dotop.smartwater.project.module.core.water.vo;

import com.dotop.smartwater.dependence.core.common.BaseVo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class PerforExamVo extends BaseVo{
	
	/** 主键*/
	private String id;
	/** 批次号*/
	private String number;
	/** 考核名称*/
	private String name;
	/** 模板ID*/
	private String templateId;
	/** 模板名称*/
	private String templateName;
	/** 总分数*/
	private String totalScore;
	/** 及格分数*/
	private String passScore;
	/** 考核人数*/
	private String examines;
	/** 审核人员数量*/
	private String audits;
	/** 开始时间*/
	private String startDate;
	/** 结束时间*/
	private String endDate;
	/** 是否填报*/
	private String isFill;
	/** 状态（0-未开始 1-处理中 2-已结束）*/
	private String status;

}
