package com.tuling.cloud.study.user.controller;

import com.tuling.cloud.study.user.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



/**
 * Created by ryan on 2018/10/30.
 */
@RestController
public class OrderController {
    private static final Logger LOGGER= LoggerFactory.getLogger(OrderController.class);
    @Autowired
    private RestTemplate restTemplate;
    //@Autowired
  //  private LoadBalancerClient loadBalancerClient;
    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id)
    {
       // return this.restTemplate.getForObject("http://microservice-provider-user/"+id,User.class);
        return this.restTemplate.getForObject("http://localhost:8001/"+id,User.class);
    }

}
