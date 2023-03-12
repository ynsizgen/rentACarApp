package com.project.rentACar.business.request;

import com.project.rentACar.enums.EnumVehicleType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateBrandRequest {
    private Long id;

    @NotNull(message = "İsim girilmedi")
    @NotEmpty
    @Size(min = 3 , max = 20)
    private String name;
}
