package com.thoughtworks.lean.quartz.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by yongliuli on 7/27/16.
 */
@Configuration
public class ApiConfig {
    @LoadBalanced
    @Bean(name = "apiRestTemplate")
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
