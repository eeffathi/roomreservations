package com.bootexample.hotelreservations.roomclrapp.roomclrapp;

import com.bootexample.hotelreservations.roomclrapp.roomclrapp.entities.Room;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RoomCleaningClr implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(RoomCleaningClr.class);
    RestTemplate restTemplate = new RestTemplate();
    String url = "localhost:8080/api/rooms";

//    public RoomCleaningClr() {
//        super();
//        this.restTemplate = new RestTemplate();
//    }

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info(url);
        Room[] roomObjects = this.restTemplate.getForObject(url, Room[].class);
        LOGGER.info( "Room objects : " + String.valueOf(roomObjects));
    }
}
