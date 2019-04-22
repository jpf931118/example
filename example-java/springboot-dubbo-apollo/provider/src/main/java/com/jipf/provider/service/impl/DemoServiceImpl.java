package com.jipf.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jipf.api.DemoService;

@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {

        return "hello " + name;
    }
}
