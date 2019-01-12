package com.cunxp.hystrix.service;

import com.cunxp.hystrix.service.impl.HelloFeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: cunxiaopan
 * @Date: 2019/1/13 12:23 AM
 * @Description:
 */
@FeignClient(value = "eureka-client",fallback = HelloFeignServiceImpl.class)
public interface HelloFeignService {

  @RequestMapping(value = "/hello",method = RequestMethod.GET)
  String sayHello(@RequestParam String name);
}
