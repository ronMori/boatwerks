package com.mori.boatwerks.service.impl;

import com.mori.boatwerks.model.exception.ServiceException;
import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.PinState;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * PI relay provisioner.
 * <p/>
 * Created by rjm on 3/18/2016.
 */
@Profile("pi")
@Component
public class RelayProvisionerPiImpl implements RelayProvisioner {

    private final GpioController gpio = GpioFactory.getInstance();

    @Override
    public List<GpioPinDigitalOutput> provision(Pin[] pins) throws ServiceException {
        List<GpioPinDigitalOutput> relays = new ArrayList<>();
        int ndx = 1;
        for (Pin pin : pins) {
            relays.add(
                gpio.provisionDigitalOutputPin(pin, Integer.toString(ndx++), PinState.LOW)
            );
        }
        return relays;
    }
}
