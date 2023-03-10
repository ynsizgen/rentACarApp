package com.project.rentACar.business.abstracts;

import com.project.rentACar.business.request.CreateModelRequest;
import com.project.rentACar.business.response.GetAllModelsResponse;

import java.util.List;

public interface ModelService {

    List<GetAllModelsResponse> getAll();
    boolean add(CreateModelRequest createModelRequest);
}
