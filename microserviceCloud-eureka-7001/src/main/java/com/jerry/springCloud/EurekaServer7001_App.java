package com.jerry.springCloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Jerry
 * @create 2019-08-11 11:26
 */
@SpringBootApplication
@EnableEurekaServer    //标注是Eureka服务端启动类  接受其他微服务注册
public class EurekaServer7001_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001_App.class,args);
    }
}
