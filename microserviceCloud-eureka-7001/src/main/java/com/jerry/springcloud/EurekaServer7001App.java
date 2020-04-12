package com.jerry.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka 注册中心7001
 * @EnableEurekaServer 标注是Eureka服务端启动类  接受其他微服务注册
 * @author Jerry
 * @create 2019-08-11 11:26
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7001App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001App.class,args);
    }
}
