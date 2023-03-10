package com.project.rentACar.business.concretes;

import com.project.rentACar.business.request.CreateBrandRequest;
import com.project.rentACar.business.request.UpdateBrandRequest;
import com.project.rentACar.business.response.GetAllBrandsResponse;
import com.project.rentACar.business.response.GetByIdBrandResponse;
import com.project.rentACar.core.utilities.mappers.ModelMapperService;
import com.project.rentACar.entities.Brands;
import com.project.rentACar.business.abstracts.BrandService;
import com.project.rentACar.dataAccess.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brands> brands = this.brandRepository.findAll();
        List<GetAllBrandsResponse> getAllBrandsResponses = brands.stream()
                .map(brand -> this.modelMapperService.forResponse().map(brand,GetAllBrandsResponse.class))
                .collect(Collectors.toList());
        return getAllBrandsResponses;
    }

    @Override
    public boolean add(CreateBrandRequest createBrandRequest) {
        Brands brands = modelMapperService.forRequest().map(createBrandRequest, Brands.class);
        this.brandRepository.save(brands);
        return true;
    }

    @Override
    public GetByIdBrandResponse getById(String id) {
        Brands brands = this.brandRepository.getById(id);
        GetByIdBrandResponse response = this.modelMapperService.forResponse().map(brands, GetByIdBrandResponse.class);
        return response;
    }

    @Override
    public boolean delete(String id) {
        this.brandRepository.delete(this.brandRepository.getById(id));
        return true;
    }

    @Override
    public boolean update(UpdateBrandRequest updateBrandRequest) {
        Brands brands = this.modelMapperService.forRequest().map(updateBrandRequest, Brands.class);
        this.brandRepository.save(brands);
        return true;
    }

}
