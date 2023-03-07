package com.project.rentACar.business.request;

import com.project.rentACar.enums.VehicleType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateBrandRequest {
    private String id;
    private String name;
    private int seats;
    private boolean manuelAuto;
    private VehicleType vehicleType;
}
