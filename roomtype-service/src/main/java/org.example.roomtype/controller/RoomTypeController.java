package org.example.roomtype.controller;

import org.example.roomtype.model.RoomType;
import org.example.roomtype.service.RoomTypeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/roomtypes")
public class RoomTypeController {

    private final RoomTypeService service;

    public RoomTypeController(RoomTypeService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<RoomType> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getById(id));
    }
}