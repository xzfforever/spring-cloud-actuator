package com.xzf.spring.cloud.actuator.indicator;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/6/12.
 */
@Component
public class SelfDefineHealthIndicator extends AbstractHealthIndicator {

    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {

        builder.up().withDetail("selfDefine",true).withDetail("status","ok");
    }

}
