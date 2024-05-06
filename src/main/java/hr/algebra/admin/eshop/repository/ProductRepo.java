package hr.algebra.admin.eshop.repository;

import hr.algebra.admin.eshop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> {

    List<Product> findAllByCategoryId(int id);

    List<Product> findByNameContaining(String name);
}
