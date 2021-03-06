package com.dotop.pipe.core.form;

import java.util.List;

import com.dotop.pipe.core.constants.PipeConstants;
import com.dotop.smartwater.dependence.core.common.pipe.BasePipeForm;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class AreaForm extends BasePipeForm {

	// private String enterpriseId;

	// 主键
	private String areaId;

	// 区域编号
	private String areaCode;

	// 区域名字
	private String name;

	// 区域描述
	private String des;

	// 片区颜色
	private String areaColorNum;

	// 水质颜色
	private String scale;

	// 是否根节点(0:非叶子;1:非叶子)
	private Integer isLeaf = PipeConstants.AREA_IS_LEAF;

	// 父节点
	private String parentCode = PipeConstants.AREA_PARENT_CODE;

	private List<PointForm> points;

	// 区域坐标的exten字段
	private String extent;

}
