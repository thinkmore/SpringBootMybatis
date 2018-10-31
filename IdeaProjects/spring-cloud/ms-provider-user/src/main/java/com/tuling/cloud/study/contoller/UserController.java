package com.tuling.cloud.study.contoller;

import com.tuling.cloud.study.entity.User;
import com.tuling.cloud.study.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.Registration;
import java.util.Map;
import java.util.Set;

/**
 * Created by ryan on 2018/10/29.
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

//    @Autowired
    private Registration registration;



    @GetMapping("/{id}")
    public User findById(@PathVariable Long id)
    {
        User findOne=this.userRepository.getOne(id);
        return findOne;
    }
  /*  @GetMapping("/getIpAndPort")
    public String findById()
    {
        return this.registration.getName();
    }*/
}
