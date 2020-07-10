package com.youzhuaniot.demo;

import com.youzhuan.iot.YzIotService;
import com.youzhuan.iot.model.Appliance;
import com.youzhuan.iot.model.ControlRequest;
import com.youzhuan.iot.model.ControlResult;
import java.util.List;

/**
 * @author 樱花满地集于我心
 * Create By 2020-07-02
 */
public class CustomService extends YzIotService {

    @Override
    public List<Appliance> discoverAppliance(String param) {
        return null;
    }

    @Override
    public ControlResult applianceControl(ControlRequest controlRequest) {
        return null;
    }
}
