package com.dotop.smartwater.project.third.meterread.webservice.service.water;

import com.dotop.smartwater.dependence.core.common.BaseService;
import com.dotop.smartwater.dependence.core.exception.FrameworkRuntimeException;
import com.dotop.smartwater.project.module.core.water.bo.DeviceUplinkBo;
import com.dotop.smartwater.project.module.core.water.vo.DeviceUplinkVo;
import com.dotop.smartwater.project.module.core.water.vo.DeviceVo;

import java.util.List;

/**
 * 对接水务系统的设备最新上传用水量数据接口
 *
 *
 */
public interface IWaterDeviceUplinkService extends BaseService<DeviceUplinkBo, DeviceUplinkVo> {


    /**
     * 根据设备水表号查询最新的用水量和最新上传时间
     *
     * @param deviceVos
     * @return
     * @throws FrameworkRuntimeException
     */
    List<DeviceUplinkVo> list(List<DeviceVo> deviceVos) throws FrameworkRuntimeException;


}
