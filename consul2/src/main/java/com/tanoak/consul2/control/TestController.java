package com.tanoak.consul2.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tanoak@qq.com
 * @date 2018/10/20 23:32
 * @Desc
 */
@RestController
public class TestController {
    
    @GetMapping
    public String home(){
        return "hello home consul-2" ;
    }
}
