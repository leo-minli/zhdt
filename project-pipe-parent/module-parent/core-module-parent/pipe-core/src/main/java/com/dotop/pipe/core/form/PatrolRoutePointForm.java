package com.dotop.pipe.core.form;

import com.dotop.smartwater.dependence.core.common.pipe.BasePipeForm;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PatrolRoutePointForm extends BasePipeForm {

    /**
     * 巡检路线id
     */
    private String patrolRoutePointId;

    /**
     * 巡检路线点经度
     */
    private String longitude;

    /**
     * 巡检路线点纬度
     */
    private String latitude;

    /**
     * 路线点的id集合(用于查询)
     */
    private List<String> patrolRoutePointIds = new ArrayList<>();
}
