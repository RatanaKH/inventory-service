package com.ratana.khun.inventory_service.repository;

import java.util.List;

import com.ratana.khun.inventory_service.model.entity.Category;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "category", path = "category")
public interface CategoryRepo extends PagingAndSortingRepository<Category, Long> {
    List<Category> findByCode(String code);

    List<Category> findByNameEn(String nameEn);

    List<Category> findByNameKh(String nameKh);
}
