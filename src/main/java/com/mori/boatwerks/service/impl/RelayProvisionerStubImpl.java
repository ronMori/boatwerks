package com.mori.boatwerks.service.impl;

import com.mori.boatwerks.model.exception.ServiceException;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.Pin;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rjm on 3/18/2016.
 */
@Component
public class RelayProvisionerStubImpl implements RelayProvisioner {

    @Override
    public List<GpioPinDigitalOutput> provision(Pin[] pins) throws ServiceException {
        return new ArrayList<>();
    }
}
