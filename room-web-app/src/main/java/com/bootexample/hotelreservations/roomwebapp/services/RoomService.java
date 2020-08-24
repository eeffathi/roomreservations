package com.bootexample.hotelreservations.roomwebapp.services;

import com.bootexample.hotelreservations.roomwebapp.entities.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {
    private static List<Room> roomList = new ArrayList<>();

    static {
        for (int i=0 ; i<10 ; i++) {
            roomList.add(new Room(i, "Room " + i, "R" + i, "Q"));
        }
    }

    public static List<Room> getAllRooms () {
        return roomList;
    }

}
