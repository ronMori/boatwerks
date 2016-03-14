package com.mori.boatwerks.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Spring boot service config.
 *
 * Created by ron.mori on 3/12/16.
 */
@Configuration
@EnableAutoConfiguration(exclude={
        DataSourceAutoConfiguration.class
})
public class ServiceConfig {

    @Bean
    @Qualifier("helloMsg")
    public String getHelloMsg() {
        return "Hello Bitches";
    }
}
