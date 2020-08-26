package com.bootexample.hotelreservations.roomwebapp.services;

import com.bootexample.hotelreservations.roomwebapp.entities.Room;
import com.bootexample.hotelreservations.roomwebapp.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {
    private RoomRepository roomRepository;

    @Autowired
    public RoomService(RoomRepository repository){
        super();
        this.roomRepository = repository;
    }
//    private static List<Room> roomList = new ArrayList<>();
//    static {
//        for (int i=0 ; i<10 ; i++) {
//            roomList.add(new Room(i, "Room " + i, "R" + i, "Q"));
//        }
//    }
    public List<Room> getAllRooms() {
        List<Room> roomList = new ArrayList<>();
        this.roomRepository.findAll().forEach(roomList::add);
        return roomList;
    }

}
