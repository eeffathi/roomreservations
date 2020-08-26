package com.bootexample.hotelreservations.roomwebapp.repositories;

import com.bootexample.hotelreservations.roomwebapp.entities.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {

}
