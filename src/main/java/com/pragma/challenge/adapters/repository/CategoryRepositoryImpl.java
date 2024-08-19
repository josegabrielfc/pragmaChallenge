package com.pragma.challenge.adapters.repository;

import com.pragma.challenge.domain.model.Category;
import com.pragma.challenge.domain.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepositoryImpl extends JpaRepository<Category, Long>, CategoryRepository  {
}