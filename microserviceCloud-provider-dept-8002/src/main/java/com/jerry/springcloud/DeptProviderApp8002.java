package com.jerry.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 生产者8002
 *
 * @author Jerry
 * @EnableEurekaClient 本服务启动后注册进eureka服务中
 * @create 2019-08-09 20:25
 */
@MapperScan(value = "com.jerry.springcloud.dao")
@SpringBootApplication
@EnableEurekaClient
public class DeptProviderApp8002 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderApp8002.class, args);
    }
}
