package com.pragma.challenge.adapters.web;

import com.pragma.challenge.domain.model.Category;
import com.pragma.challenge.domain.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping
    public ResponseEntity<Category> createCategory(@RequestParam String name, @RequestParam String description) {
        Category category = categoryService.createCategory(name, description);
        return ResponseEntity.ok(category);
    }
}