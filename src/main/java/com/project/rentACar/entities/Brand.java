package com.project.rentACar.entities;

import com.project.rentACar.enums.VehicleType;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;


@Table(name="brand")
//@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Brand {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name ="UUID",strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    @Column(length = 50, nullable = false)
    private String name;
    @Column(name = "seats",length = 1)
    private int seats;
    @Column(name ="manuel_auto")
    private boolean manuelAuto;
    @Column(name="vehicle_type")
    private VehicleType vehicleType;
    @Column(name="creat_date")
    private Date createDate;
}
