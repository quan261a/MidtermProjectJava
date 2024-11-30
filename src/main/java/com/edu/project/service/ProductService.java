package com.edu.project.service;

import com.edu.project.model.Category;
import com.edu.project.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductService {

	List<Product> getAllProductByCategoryId(int id);

	Optional<Product> getProductById(long id);

	void removeProductById(long id);

	void updateProduct(Product product);

	List<Product> getAllProduct();

	Page<Product> searchProducts(String keyword, int page, int size);

	Page<Product> getAllProducts(int page, int size, String search, String category);

	List<Category> getCategories();

}
