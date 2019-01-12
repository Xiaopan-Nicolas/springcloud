package com.cunxp.feignservice.controller;

import com.cunxp.feignservice.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: cunxiaopan
 * @Date: 2019/1/12 11:50 PM
 * @Description:
 */
@RestController
public class HelloController {

  @Autowired
  private HelloService helloService;

  @GetMapping(value = "/hello")
  public String sayHello(@RequestParam(value = "name",defaultValue = "cunxp") String name) {
    return helloService.sayHello( name );
  }
}
