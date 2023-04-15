package com.dotori.daram.service;

import com.dotori.daram.model.Room;
import com.dotori.daram.repository.CampusRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CampusService {
    @Autowired
    private CampusRepository campusRepository;

    public List<Room> getAllCampus() {
        return campusRepository.findAll();
    }
}
