package com.bootexample.hotelreservations.roomwebapp.controllers;

import com.bootexample.hotelreservations.roomwebapp.entities.Room;
import com.bootexample.hotelreservations.roomwebapp.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rooms")
public class RoomController {
    private RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        super();
        this.roomService = roomService;
    }

    @GetMapping
    public String getAllRooms(Model model) {
        model.addAttribute("rooms", this.roomService.getAllRooms());
        return "rooms";
    }

}
