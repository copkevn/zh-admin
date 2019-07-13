package com.zhenghao.admin.monitor.controller;

import com.zhenghao.admin.monitor.entity.ServerBaseEntity;
import com.zhenghao.admin.monitor.entity.ServerInstantEntity;
import com.zhenghao.admin.common.entity.Result;
import com.zhenghao.admin.common.util.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 🙃
 * 🙃 服务器监控controller
 * 🙃
 *
 * @author:zhaozhenghao
 * @Email :736720794@qq.com
 * @date :2019/04/07 13:37
 * ServerMonitorController.java
 */
@RestController
@RequestMapping("${zh-admin.api.prefix}/monitor/server")
public class MonitorServerController {

    @Autowired
    private ServerBaseEntity base;

    @Autowired
    private ServerInstantEntity instant;

    @GetMapping("/base")
    public Result<ServerBaseEntity> baseInfo() {
        base.init();
        return CommonUtils.msg(base);
    }

    @GetMapping("/instant")
    public Result<ServerInstantEntity> instantInfo() {
        instant.init();
        return CommonUtils.msg(instant);
    }
}
