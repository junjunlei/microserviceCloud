package com.jerry.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @EnableCircuitBreaker 对熔断机制的支持
 * 生产者8001
 * @EnableEurekaClient  本服务启动后注册进eureka服务中
 * @author Jerry
 * @create 2019-08-09 20:25
 */
@MapperScan(value = "com.jerry.springcloud.dao")
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class DeptProviderHystrixApp8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderHystrixApp8001.class,args);
    }
}
