package org.cine.cinemanagement.service;

import org.cine.cinemanagement.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> findAllCategories();

    Category findCategoryById(Long id);

    Category findCategoryByName(String name);

    Category saveCategory(Category category);
}
