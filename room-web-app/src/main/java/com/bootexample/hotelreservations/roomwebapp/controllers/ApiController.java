package com.bootexample.hotelreservations.roomwebapp.controllers;

import com.bootexample.hotelreservations.roomwebapp.entities.Room;
import com.bootexample.hotelreservations.roomwebapp.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {
    private RoomService roomService;
    @Autowired
    public ApiController(RoomService roomService) {
        super();
        this.roomService = roomService;
    }

    @GetMapping("/rooms")
    public List<Room> getAllRooms() {
        return this.roomService.getAllRooms();
    }
}
