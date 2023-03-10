package com.project.rentACar.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;


@Table(name="brand")
//@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Brands {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name ="UUID",strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id")
    private String id;
    @Column(length = 50, nullable = false)
    private String name;

    @OneToMany(mappedBy = "brands")
    private List<Models> models;
}
