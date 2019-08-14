package com.jerry.springCloud;
import com.jerry.myRule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author Jerry
 * @create 2019-08-11 9:52
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MySelfRule.class)//引入自定义轮询规则
public class DeptConsumer_App80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_App80.class,args);
    }
}
