package com.dotop.smartwater.project.module.core.water.vo;

import com.dotop.smartwater.dependence.core.common.BaseVo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**

 * @date 2018/11/22.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class OrderTeamMembersVo extends BaseVo {
	/**
	 *
	 */
	private String id;
	/**
	 * 团队ID
	 */
	private String teamId;
	/**
	 * 成员ID
	 */
	private String userId;
	/**
	 * 成员名称
	 */
	private String userName;
	/**
	 * 工号
	 */
	private String userWorkNum;
	/**
	 * 成员电话
	 */
	private String userPhone;
	/**
	 * 成员职位，1队长，0成员
	 */
	private Integer position;
}
