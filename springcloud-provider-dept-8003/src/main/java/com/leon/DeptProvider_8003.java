package com.leon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * TODO
 *
 * @author Leon
 * @DATE 2020/11/24 18:13
 */
@SpringBootApplication
@EnableEurekaClient //EnableEurekaClient 客户端的启动类，在服务启动后自动向注册中心注册服务
@EnableDiscoveryClient //服务信息展示
public class DeptProvider_8003 {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8003.class,args);
    }
}
