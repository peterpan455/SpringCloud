package com.leon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * TODO
 * 启动之后，访问 http://localhost:7001/
 * @author Leon
 * @DATE 2020/11/24 17:37
 */
@SpringBootApplication
@EnableEurekaServer //EnableEurekaServer 服务端的启动类，可以接受别人注册进来~
public class EurekaServer_7001 {

    public static void main(String[] args) {
        SpringApplication.run(
                EurekaServer_7001.class,args);
    }
}
