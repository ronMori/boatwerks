package com.mori.boatwerks.web;

import com.mori.boatwerks.model.MyBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ron.mori on 3/12/16.
 */
@RestController
@RequestMapping("first")
public class FirstController {

    private static final Logger LOG = LoggerFactory.getLogger(FirstController.class);

    @Autowired
    @Qualifier("helloMsg")
    private String helloMsg;

    @Autowired
    private MyBean myBean;

    @RequestMapping("/")
    public String index() {
        LOG.info(myBean.toString());
        return helloMsg;
    }

    @RequestMapping("/myBean")
    public MyBean myProp() {
        return myBean;
    }

}

