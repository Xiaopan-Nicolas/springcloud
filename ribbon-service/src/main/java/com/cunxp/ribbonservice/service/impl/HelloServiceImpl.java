package com.cunxp.ribbonservice.service.impl;

import com.cunxp.ribbonservice.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: cunxiaopan
 * @Date: 2019/1/12 10:11 PM
 * @Description:
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService {

  @Autowired
  RestTemplate restTemplate;

  @Override
  public String sayHello(String name) {
    return restTemplate.getForObject("http://EUREKA-CLIENT/hello?name="+name,String.class);
  }
}
