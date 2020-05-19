package com.index.video;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName VideoApplication
 * @Description: TODO
 * @Author Index
 * @Date 2020/5/18
 * @Version V1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class VideoApplication {

    public static void main(String[] args) {
        SpringApplication.run(VideoApplication.class, args);
    }
}
