package com.project.rentACar.business.request;

import com.project.rentACar.enums.EnumVehicleType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateBrandRequest {
    private String name;
    private int seats;
    private boolean manuelAuto;
    private EnumVehicleType enumVehicleType;

}
