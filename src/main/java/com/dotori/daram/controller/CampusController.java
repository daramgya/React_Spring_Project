package com.dotori.daram.controller;

import com.dotori.daram.model.Room;
import com.dotori.daram.service.CampusService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// /api/campus
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class CampusController {
    @Autowired
    private CampusService campusService;

    @GetMapping("/campus")
    public List<Room> getAllCampus() {
        return campusService.getAllCampus();
    }

}
