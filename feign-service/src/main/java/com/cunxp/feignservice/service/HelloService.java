package com.cunxp.feignservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: cunxiaopan
 * @Date: 2019/1/12 11:48 PM
 * @Description:
 */
@FeignClient(value = "eureka-client")
public interface HelloService {

  @RequestMapping(value = "/hello",method = RequestMethod.GET)
  String sayHello(@RequestParam String name);

}
