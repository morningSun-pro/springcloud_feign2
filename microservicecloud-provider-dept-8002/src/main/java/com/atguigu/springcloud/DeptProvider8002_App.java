package com.atguigu.springcloud;
 
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
 
@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = {"com.atguigu.springcloud.mapper"})
public class DeptProvider8002_App
{
 public static void main(String[] args) {
	SpringApplication.run(DeptProvider8002_App.class, args);
 }
}
 
