package com.jerry.springCloud;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Jerry
 * @create 2019-08-09 20:25
 */
@MapperScan(value = "com.jerry.springCloud.dao")
@SpringBootApplication
@EnableEurekaClient  //本服务启动后注册进eureka服务中
public class DeptProvider_App8002 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_App8002.class,args);
    }
}
