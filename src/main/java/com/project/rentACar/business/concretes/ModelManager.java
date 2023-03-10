package com.project.rentACar.business.concretes;

import com.project.rentACar.business.abstracts.ModelService;
import com.project.rentACar.business.request.CreateModelRequest;
import com.project.rentACar.business.response.GetAllModelsResponse;
import com.project.rentACar.core.utilities.mappers.ModelMapperService;
import com.project.rentACar.dataAccess.ModelRepository;
import com.project.rentACar.entities.Models;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ModelManager implements ModelService {

    private ModelRepository modelRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllModelsResponse> getAll() {
        List<Models> models = this.modelRepository.findAll();
        List<GetAllModelsResponse> response = models.stream().map(model -> this.modelMapperService.forResponse().map(model,GetAllModelsResponse.class)).collect(Collectors.toList());
        return response;
    }

    @Override
    public boolean add(CreateModelRequest createModelRequest) {
        Models model = this.modelMapperService.forRequest().map(createModelRequest,Models.class);
        this.modelRepository.save(model);
        return true;
    }


}
