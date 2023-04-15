package com.dotori.daram.repository;

import java.util.List;
import com.dotori.daram.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampusRepository extends JpaRepository<Room, Integer> {
}
