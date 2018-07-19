package com.example.eurekabussnissserviceuserclientfegin;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
//@EnableHystrix//开启断路器功能
//@EnableHystrixDashboard和@EnableCircuitBreaker，必须是两个
@EnableHystrixDashboard
@EnableCircuitBreaker
public class EurekaBussnissServiceUserClientFeginApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaBussnissServiceUserClientFeginApplication.class, args);
    }

    /**
     * Hystrix仪表盘
     * springboot 版本如果是2.0则需要添加 ServletRegistrationBean
     * 因为springboot的默认路径不是 "/hystrix.stream"，
     * 只要在自己的项目里配置上下面的servlet就可以了
     * @return
     */
    @Bean
    public ServletRegistrationBean getServlet() {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}
