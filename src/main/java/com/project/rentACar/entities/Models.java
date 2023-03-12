package com.project.rentACar.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Table(name="model")
//@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Models {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name ="UUID",strategy = "org.hibernate.id.UUIDGenerator")
    private Long id;
    @Column(length = 50, nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brands brands;

    @OneToMany(mappedBy = "models")
    private List<Cars> cars;
}
