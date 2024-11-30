package com.edu.project.service.impl;

import com.edu.project.model.Category;
import com.edu.project.model.Product;
import com.edu.project.repository.CategoryRepository;
import com.edu.project.repository.ProductRepository;
import com.edu.project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepository productRepository;
    @Autowired
    CategoryRepository categoryRepository;

    @Override
	public List<Product> getAllProduct() {
        return productRepository.findAll();
    }//findAll

    @Override
    public Page<Product> searchProducts(String keyword, int page, int size) {
        return null;
    }

    @Override
    public Page<Product> getAllProducts(int page, int size, String search, String category) {
        Pageable pageable = PageRequest.of(page, size);
        if (category.equals("all")) {
            // Nếu danh mục là "all", tìm tất cả sản phẩm với chuỗi tìm kiếm
            return productRepository.findByNameContainingIgnoreCase(search, pageable);
        } else {
            // Tìm sản phẩm theo danh mục và chuỗi tìm kiếm
            return productRepository.findByCategoryAndNameContaining(category, search, pageable);
        }
    }



    @Override
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    @Override
	public void updateProduct(Product product) {
        productRepository.save(product);
    }//add or update (tuy vao pri-key)

    @Override
	public void removeProductById(long id) {
        productRepository.deleteById(id);
    }//delete dua vao pri-key

    @Override
	public Optional<Product> getProductById(long id) {
        return productRepository.findById(id);
    }//search theo id

    @Override
	public List<Product> getAllProductByCategoryId(int id) {
        return productRepository.findAllByCategory_Id(id);
    }
    //findList theo ProductDTO.categoryId

}
