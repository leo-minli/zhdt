package com.dotop.smartwater.project.module.core.water.bo;

import java.math.BigDecimal;
import java.util.List;

import com.dotop.smartwater.dependence.core.common.BaseBo;
import com.dotop.smartwater.project.module.core.water.bo.customize.LadderPriceDetailBo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 账单返回到前端
 * 
 TODO 与OrderExt_有什么区别，请联系
 */
// 表不存在
@Data
@EqualsAndHashCode(callSuper = false)
public class OrderExtBo extends BaseBo {
	/* 账单ID */
	private String id;

	/** 账单ID（多个） */
	private String orderids;

	/* 余额 */
	private Double alreadypay;

	/* 滞纳金 */
	private Double penalty;

	/* 实缴金额 */
	private Double realamount;

	/* 余额抵扣 */
	private Double balance;

	/* 是否自动扣费 */
	private Integer ischargebacks;

	/* 身份证 */
	private String cardid;

	/* 水表用途 */
	private PurposeBo purpose;

	/* 减免类型 */
	private ReduceBo reduce;

	private TradePayBo tradepay;

	/* 选择的优惠券Id */
	private String couponid;

	/* 减免类型 */
	private List<CouponBo> couponList;

	private BigDecimal ownerpay;

	private String tradeno;

	/* 支付二维码值 */
	private String paycard;

	/* 支付方式 */
	private String payMode;

	/* 剩余应缴 */
	private Double surpluspay;

	/* 前端请求IP地址 */
	private String ip;

	private String ownerid;

	/* 水费组成明细 */
	private List<LadderPriceDetailBo> payDetailList;

	private OrderBo order;

	// -----------------------------------------------------

	private String couponinfo;

	private String reduceinfo;

	private String purposeinfo;

	// 收费种类
	private String chargeinfo;

	private String paytypeinfo;

}
