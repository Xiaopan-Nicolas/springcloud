package com.cunxp.hystrix.service.impl;

import com.cunxp.hystrix.service.HelloFeignService;
import org.springframework.stereotype.Component;

/**
 * @Author: cunxiaopan
 * @Date: 2019/1/13 12:32 AM
 * @Description:
 */
@Component
public class HelloFeignServiceImpl implements HelloFeignService {

  @Override
  public String sayHello(String name) {
    return "sorry "+name;
  }
}
