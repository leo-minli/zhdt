package com.dotop.pipe.core.bo.third;

import com.dotop.smartwater.dependence.core.common.pipe.BasePipeBo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ThirdDataBo extends BasePipeBo {

    /**
     * 主键
     */
    private String id;
    /**
     * 上行时间
     */
    private Date devSendDate;

    private String flwRate;
    private String flwTotalValue;
    private String flwMeasure;
    private String pressureValue;
    /**
     * 设备id
     */
    private String deviceId;
    private String deviceCode;

    /**
     * 厂商名称
     */
    private String factoryName;
}
