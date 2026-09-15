package org.example.room.service;

import org.example.room.client.RoomTypeClient;
import org.example.room.model.Room;
import org.example.room.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    private final RoomRepository roomRepository;
    private final RoomTypeClient roomTypeClient;

    public RoomService(RoomRepository roomRepository,
                       RoomTypeClient roomTypeClient) {
        this.roomRepository = roomRepository;
        this.roomTypeClient = roomTypeClient;
    }

    public List<Room> getAll() {
        return roomRepository.findAll();
    }

    public Room create(Room room) {
        roomTypeClient.getRoomTypeById(room.getRoomTypeId());

        return roomRepository.save(room);
    }
}