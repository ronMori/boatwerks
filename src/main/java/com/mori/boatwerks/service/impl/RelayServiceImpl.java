package com.mori.boatwerks.service.impl;

import com.mori.boatwerks.model.exception.ServiceException;
import com.mori.boatwerks.service.RelayService;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.RaspiPin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rjm on 3/14/2016.
 */
@Service
public class RelayServiceImpl implements RelayService {

    public static final Logger LOG = LoggerFactory.getLogger(RelayServiceImpl.class);

    @Autowired
    private RelayProvisioner relayProvisioner;

    private final List<GpioPinDigitalOutput> relays = new ArrayList<>();

    private final Pin[] pins = new Pin[]{
        RaspiPin.GPIO_13,
        RaspiPin.GPIO_14,
        RaspiPin.GPIO_23,
        RaspiPin.GPIO_24,
        RaspiPin.GPIO_25,
        RaspiPin.GPIO_26,
        RaspiPin.GPIO_27,
        RaspiPin.GPIO_28
    };

    @PostConstruct
    private void init() throws ServiceException {
        relayProvisioner.provision(pins);
    }

    @Override
    public List<GpioPinDigitalOutput> getAll() throws ServiceException {
        return relays;
    }

    @Override
    public GpioPinDigitalOutput get(int position) throws ServiceException {
        if (position >= relays.size() ) {
            throw new IllegalArgumentException("Position out of range: " + position
                + ", relay size: " + relays.size());
        }
        return relays.get(position);
    }
}
