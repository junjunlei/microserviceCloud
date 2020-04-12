package com.jerry.springcloud.cfgbeans;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Jerry
 * @create 2019-08-11 9:22
 */
@Configuration
public class ConfigBean {
    /**
     * Spring Cloud Ribbon 是基于NetFlix Ribbon实现的一套客户端负载均衡工具
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
//    @Bean
//    public IRule myRule(){
//        return new RandomRule();//用重新选择的随机算法替代轮询
//    }
}
