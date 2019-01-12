package com.cunxp.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: cunxiaopan
 * @Date: 2019/1/12 9:54 PM
 * @Description:
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

  @Value("${server.port}")
  String port;

  @GetMapping
  public String index(@RequestParam(value = "name", defaultValue = "eureka client") String name) {
    return "Hello ! This is " + name + " ,I'm from port:" + port;
  }

}
