package org.cine.cinemanagement.service.impl;

import org.cine.cinemanagement.model.Category;
import org.cine.cinemanagement.repository.CategoryRepository;
import org.cine.cinemanagement.service.CategoryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> findAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findCategoryById(Long id) {

        return categoryRepository.findById(id).get();
    }

    @Override
    public Category findCategoryByName(String name) {

        return categoryRepository.findByName(name);
    }

    @Override
    public Category saveCategory(Category category) {

        return categoryRepository.save(category);
    }
}
