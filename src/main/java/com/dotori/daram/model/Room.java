package com.dotori.daram.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="campus")
public class Room {
    @Id
    private String room_code;

    @Column(name = "room_name")
    private String room_name;

    @Column(name = "coords")
    private String coords;

    @Column(name = "location")
    private String location;

    @Column(name = "building_num")
    private Integer building_num;
}
