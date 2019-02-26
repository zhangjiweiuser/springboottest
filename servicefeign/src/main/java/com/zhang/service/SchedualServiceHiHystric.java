package com.zhang.service;

import org.springframework.stereotype.Component;

/**
 * @author jiwei.zhang
 * @date 2019-02-26 下午 18:25
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
