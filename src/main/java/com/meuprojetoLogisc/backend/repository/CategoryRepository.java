package com.meuprojetoLogisc.backend.repository;

import com.meuprojetoLogisc.backend.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
