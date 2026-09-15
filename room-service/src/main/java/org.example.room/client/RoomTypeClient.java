package org.example.room.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "roomtype-service")
public interface RoomTypeClient {

    @GetMapping("/api/roomtypes/{id}")
    Object getRoomTypeById(@PathVariable("id") Long id);
}