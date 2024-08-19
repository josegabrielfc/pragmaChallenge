package com.pragma.challenge.domain.service;

import com.pragma.challenge.domain.model.Category;
import com.pragma.challenge.domain.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public Category createCategory(String name, String description) {
        if (name.length() > 50) {
            throw new IllegalArgumentException("El nombre no puede tener mas de 50 caracteres.");
        }
        if (description.length() > 90) {
            throw new IllegalArgumentException("La descripción no puede tener mas de 90 caracteres.");
        }
        if (categoryRepository.findByName(name).isPresent()) {
            throw new IllegalArgumentException("El nombre de la categoria ya existe.");
        }
        Category category = new Category();
        category.setName(name);
        category.setDescription(description);
        return categoryRepository.save(category);
    }
}