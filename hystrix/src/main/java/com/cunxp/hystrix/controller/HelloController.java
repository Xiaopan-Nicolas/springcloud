package com.cunxp.hystrix.controller;

import com.cunxp.hystrix.service.HelloService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: cunxiaopan
 * @Date: 2019/1/12 10:15 PM
 * @Description:   hystrix+ribbon 断路器
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

  @Resource(name = "helloService")
  private HelloService helloService;

  @GetMapping
  public String index(@RequestParam(value = "name",defaultValue = "cunxp") String name ) {
    return helloService.sayHello( name );
  }
}
