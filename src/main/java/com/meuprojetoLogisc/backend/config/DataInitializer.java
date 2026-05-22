package com.meuprojetoLogisc.backend.config;

import com.meuprojetoLogisc.backend.entity.Category;
import com.meuprojetoLogisc.backend.repository.CategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(CategoryRepository categoryRepository) {

        return args -> {

            if (categoryRepository.count() == 0) {

                categoryRepository.save(
                        new Category(null, "Eletrônicos")
                );

                categoryRepository.save(
                        new Category(null, "Móveis")
                );

                categoryRepository.save(
                        new Category(null, "Periféricos")
                );

                System.out.println("Categorias iniciais cadastradas!");
            }

        };

    }

}