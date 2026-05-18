package com.meuprojetoLogisc.backend.repository;

/*
* O Spring automaticamente cria:

save()
findAll()
delete()
findById()

porque herdou:

JpaRepository
* */
import com.meuprojetoLogisc.backend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}