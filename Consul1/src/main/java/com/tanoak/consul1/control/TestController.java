package com.tanoak.consul1.control;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tanoak@qq.com
 * @date 2018/10/20 23:32
 * @Desc
 */
@RestController
@RefreshScope
public class TestController {
    
    
    @GetMapping
    public String home(){
        return "hello home consul-1" ;
    }
}
