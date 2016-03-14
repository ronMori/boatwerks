package com.mori.boatwerks.model;

import com.google.common.base.MoreObjects;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by ron.mori on 3/14/16.
 */
@Component
@ConfigurationProperties(prefix = "my")
public class MyBean {

    private String property;
    private int random;

    public String getProperty() {
        return property;
    }

    public void setProperty(final String property) {
        this.property = property;
    }

    public int getRandom() {
        return random;
    }

    public void setRandom(final int random) {
        this.random = random;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .omitNullValues()
                .add("property", property)
                .add("random", random)
                .toString();
    }
}
