package com.dotop.smartwater.view.server.core.security.form;

import com.dotop.smartwater.view.server.core.enums.SecurityEnum;
import com.dotop.smartwater.view.server.core.enums.WaterFactoryPondEnum;
import com.dotop.smartwater.dependence.core.common.pipe.BasePipeForm;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class SecuritySwitchForm extends BasePipeForm {
    private String id;
    private Boolean status;
    private SecurityEnum address;
    private String facilityId;
    private WaterFactoryPondEnum pond;
    private Date curr;
    private String userBy;
}
