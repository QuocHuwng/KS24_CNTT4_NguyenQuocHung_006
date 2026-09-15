package org.example.roomtype.service;

import org.example.roomtype.model.RoomType;
import org.example.roomtype.repository.RoomTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class RoomTypeService {

    private final RoomTypeRepository repository;

    public RoomTypeService(RoomTypeRepository repository) {
        this.repository = repository;
    }

    public RoomType getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("RoomType not found"));
    }
}