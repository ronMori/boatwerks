package com.mori.boatwerks.service;

import com.mori.boatwerks.model.exception.ServiceException;
import com.pi4j.io.gpio.GpioPinDigitalOutput;

import java.util.List;

/**
 * Relay service.
 * Created by rjm on 3/14/2016.
 */
public interface RelayService {

    /**
     * get relay by position.
     *
     * @param position - relative position - zero based.
     * @return select relay.
     * @throws ServiceException
     */
    GpioPinDigitalOutput get(int position) throws ServiceException;

    /**
     * get all relays.
     *
     * @return list of relays
     * @throws ServiceException
     */
    List<GpioPinDigitalOutput> getAll() throws ServiceException;

}
