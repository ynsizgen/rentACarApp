package com.project.rentACar.business.response;

import com.project.rentACar.enums.EnumVehicleType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllBrandsResponse {
    private String id;
    private String name;
    private int seats;
    private boolean manuelAuto;
    private EnumVehicleType enumVehicleType;

}
