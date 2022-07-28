package com.aoyama.user;

import com.alibaba.cloud.seata.rest.SeataRestTemplateAutoConfiguration;
import com.alibaba.cloud.sentinel.SentinelWebAutoConfiguration;
import io.seata.spring.boot.autoconfigure.SeataAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, SeataAutoConfiguration.class, SentinelWebAutoConfiguration.class, SeataRestTemplateAutoConfiguration.class, MongoAutoConfiguration.class
})
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }
}
