package com.mori.boatwerks.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ron.mori on 3/12/16.
 */
@RestController
public class FirstController {

    @Autowired
    @Qualifier("helloMsg")
    private String helloMsg;

    @RequestMapping("/")
    public String index() {
        return "Hello Bitches"; //helloMsg;
    }
}

