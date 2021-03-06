package com.dotop.smartwater.project.module.core.water.form;

import com.dotop.smartwater.dependence.core.common.BaseForm;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
public class PaymentTradeOrderForm extends BaseForm {
    private String tradeid;
    private String tradeNumber;
    private String tradeName;
    private String amount;
    private String userid;
    private String userno;
    private String userName;
    private String userPhone;
    private String userAddr;
    private String status;
    private Date payTime;
    private Date createDate;
    private String merge;
    private String enterpriseid;
    private String extra;
    private String callbackUrl;
    private String businessId;
    private String operatorid;

    private String detail;
}