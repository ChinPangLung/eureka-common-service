package com.example.eurekabussnissserviceuserclientribbon;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
//import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix //注解以开启 Hystrix 特性
@EnableCircuitBreaker //Hystrix仪表盘 服务熔断（ribbon 单服务实例监控）
//@EnableHystrixDashboard //Hystrix仪表盘 （ribbon 单服务实例监控）
public class EurekaBussnissServiceUserClientRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaBussnissServiceUserClientRibbonApplication.class, args);
    }

    @Bean
    @LoadBalanced //开启客户端负载均衡
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /**
     * Hystrix仪表盘
     * springboot 版本如果是2.0则需要添加 ServletRegistrationBean
     * 因为springboot的默认路径不是 "/hystrix.stream"，
     * 只要在自己的项目里配置上下面的servlet就可以了
     * @return
     */
    /*@Bean
    public ServletRegistrationBean getServlet() {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }*/
}
