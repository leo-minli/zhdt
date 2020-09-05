package com.dotop.smartwater.project.module.core.water.bo;

import java.util.Date;

import com.dotop.smartwater.dependence.core.common.BaseBo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 

 * @date 2018年7月6日 下午3:56:39
 * @version 1.0.0
 */
// 表不存在
@Data
@EqualsAndHashCode(callSuper = false)
public class WechatPublicSettingBo extends BaseBo {

	private String wechatpublicid;

	private Date createtime;

	private Date updatetime;

	private String appid;

	private String mchid;

	private String appsecret;

	private String paysecret;

	private String unifiedorderurl;

	private String orderqueryurl;

	private String requestreturnurl;

	private String validtoken;

	private String enterpriseid;

	private String createuser;

	private String gatewayauthorizecode;

	private String gatewayopenidbycode;

	private String domain;

	private String wechatname;// 公众号名称

	private String servicephone;// 服务电话

	private String enterprisename;// 企业名称

	private String paybycardurl;
	
	private String qrcode;// 公众号二维码

}
