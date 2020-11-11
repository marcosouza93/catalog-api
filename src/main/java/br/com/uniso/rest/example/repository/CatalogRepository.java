package br.com.uniso.rest.example.repository;

import br.com.uniso.rest.example.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogRepository extends JpaRepository<Product, Long> {
}
