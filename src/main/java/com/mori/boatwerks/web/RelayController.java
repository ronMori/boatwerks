package com.mori.boatwerks.web;

import com.mori.boatwerks.model.exception.ServiceException;
import com.mori.boatwerks.service.RelayService;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by rjm on 3/14/2016.
 */
@RestController
@RequestMapping("relay")
public class RelayController {

    @Autowired
    private RelayService relayService;

    @RequestMapping("/all")
    public List<GpioPinDigitalOutput> getAll() throws ServiceException {
        return relayService.getAll();
    }
}
