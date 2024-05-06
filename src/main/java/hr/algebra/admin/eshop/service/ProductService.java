package hr.algebra.admin.eshop.service;

import hr.algebra.admin.eshop.model.Product;
import hr.algebra.admin.eshop.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;
    public List<Product> getAllProducts() { return productRepo.findAll(); }

    public void addProduct(Product product) { productRepo.save(product); }

    public void removeProductById(long id) { productRepo.deleteById(id); }

    public Optional<Product> getProductById(long id) { return productRepo.findById(id); }

    public List<Product> getAllProductsByCategoryId(int id) { return productRepo.findAllByCategoryId(id); }

    public List<Product> searchProductsByName(String name) {
        return productRepo.findByNameContaining(name);
    }

}
