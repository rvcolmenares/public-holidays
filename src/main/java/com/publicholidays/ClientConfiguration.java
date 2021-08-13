package com.publicholidays;

import com.publicholidays.client.nagerdate.NagerDateClient;
import feign.Feign;
import feign.Logger;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class ClientConfiguration {

    @Bean(name = "nagerDateClient")
    public NagerDateClient getNagerDateClient() {
        return Feign.builder()
                .client(new OkHttpClient())
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .logger(new Slf4jLogger(NagerDateClient.class))
                .logLevel(Logger.Level.FULL)
                .target(NagerDateClient.class, "https://date.nager.at/api");
    }

}
