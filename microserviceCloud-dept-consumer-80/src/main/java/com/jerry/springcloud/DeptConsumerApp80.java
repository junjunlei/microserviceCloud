package com.jerry.springcloud;
import com.jerry.myRule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;


/**
 * 消费者启动类
 * @author Jerry
 * @create 2019-08-11 9:52
 *
 * @RibbonClient 引入自定义轮询规则
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RibbonClient(name = "microserviceCloud-dept",configuration = MySelfRule.class)
@EnableFeignClients(basePackages= {"com.jerry.springcloud"})
public class DeptConsumerApp80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerApp80.class,args);
    }
}
