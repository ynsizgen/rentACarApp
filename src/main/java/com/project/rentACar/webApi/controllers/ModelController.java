package com.project.rentACar.webApi.controllers;

import com.project.rentACar.business.abstracts.ModelService;
import com.project.rentACar.business.request.CreateModelRequest;
import com.project.rentACar.business.response.GetAllModelsResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/models")
@AllArgsConstructor
public class ModelController {
    private ModelService modelService;

    @GetMapping("/getAll")
    public ResponseEntity<List<GetAllModelsResponse>> getAll(){
        return new ResponseEntity<>(this.modelService.getAll(), OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Boolean> add(CreateModelRequest createModelRequest){
        return new ResponseEntity<>(this.modelService.add(createModelRequest), CREATED);

    }

}
