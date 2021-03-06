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

import java.util.Arrays;
import java.util.List;

@Component
public class RoomCleaningClr implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(RoomCleaningClr.class);
    RestTemplate restTemplate = new RestTemplate();
    String url = "http://localhost:8080/api/rooms";

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info(url);

        try {
            Room[] roomObjects = this.restTemplate.getForObject(url, Room[].class);
            List<Room> rooms = Arrays.asList(roomObjects);
            rooms.forEach(System.out::println);
        }
        catch (Exception exception) {
            System.out.println("Exception occurred with the connection of at the json consumer"+
                    "maybe the json producer isn`t running");
        }
    }
}
