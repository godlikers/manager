package com.manager.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pengcong on 2019/9/18.
 */
@RestController
public class TestController {

    @PreAuthorize("hasAuthority('ME')")
    @GetMapping("test")
    public String test() {
        return "test";
    }


}
