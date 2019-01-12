package com.cunxp.ribbonservice.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: cunxiaopan
 * @Date: 2019/1/12 10:09 PM
 * @Description:
 */
@Configuration
public class RestTemplateConfig {

  @Bean
  @LoadBalanced
  RestTemplate restTemplate() {
    return new RestTemplate();
  }

}
