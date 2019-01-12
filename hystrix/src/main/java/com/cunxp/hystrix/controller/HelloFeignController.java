package com.cunxp.hystrix.controller;

import com.cunxp.hystrix.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: cunxiaopan
 * @Date: 2019/1/13 12:28 AM
 * @Description: feign 断路器（有些版本feign默认关闭断路器功能，需要手动配置开启 feign.hystrix.enabled=true）
 */
@RestController
public class HelloFeignController {

  @Autowired
  private HelloFeignService helloFeignService;

  @GetMapping(value = "/hi")
  public String sayHello(@RequestParam(value = "name", defaultValue = "cunxp") String name) {
    return helloFeignService.sayHello(name);
  }
}
