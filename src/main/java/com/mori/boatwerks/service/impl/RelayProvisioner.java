package com.mori.boatwerks.service.impl;

import com.mori.boatwerks.model.exception.ServiceException;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.Pin;

import java.util.List;

/**
 * relay provisioner.
 * <p/>
 * Created by rjm on 3/18/2016.
 */
public interface RelayProvisioner {

    /**
     * provision relays.
     *
     * @param pins - ordered list of pins to provision.
     * @return list of provisioned GPIO output relays.
     * @throws ServiceException
     */
    List<GpioPinDigitalOutput> provision(Pin[] pins) throws ServiceException;
}
