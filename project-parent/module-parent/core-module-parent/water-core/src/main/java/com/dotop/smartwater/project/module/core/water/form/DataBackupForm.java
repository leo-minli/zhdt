package com.dotop.smartwater.project.module.core.water.form;

import java.util.Date;

import com.dotop.smartwater.dependence.core.common.BaseForm;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 数据备份记录表
 * 

 * @date 2019年2月21日
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class DataBackupForm extends BaseForm {

	/**
	 * 数据备份id
	 */
	private String backupId;

	/**
	 * 文件名称
	 */
	private String fileName;

	/**
	 * 文件路径
	 */
	private String fileSrc;

	/**
	 * 备份类型 (手动备份 自动备份)
	 */
	private String backupType;

	/**
	 * 备份日期
	 */
	private Date backupDate;

	/**
	 * 备份企业 水司 运维
	 */
	private String backupOwner;
	
	/**
	 *  条件查询开始时间 
	 */
	private Date startDate;
	
	/**
	 * 条件查询 结束时间
	 */
	private Date endDate;

}
