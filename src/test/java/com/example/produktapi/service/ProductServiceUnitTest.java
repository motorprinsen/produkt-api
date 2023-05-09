package com.example.produktapi.service;

import com.example.produktapi.exception.BadRequestException;
import com.example.produktapi.model.Product;
import com.example.produktapi.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;
import java.util.List;
import java.util.Optional;

@SpringBootTest
public class ProductServiceUnitTest {

    Product product = new Product();
    public ProductRepository productRepository;
    ProductService productService = new ProductService(productRepository);




    @Test
    void Test1() {

        productService.getProductById(11);

     //   productService.addProduct(product.setCategory("Tst"),product.setPrice(23.00), product.setDescription("Test222"), product.setTitle("Team1"), product.setImage("test.img")).;

      /*

     public Product addProduct(Product product) {

        Optional<Product> p = productRepository.findByTitle(product.getTitle());
        if (p.isPresent()) {
            throw new BadRequestException("En produkt med titeln: "+ product.getTitle() + " finns redan");
        }
        return productRepository.save(product);
    }



         public Product(String title, Double price, String category, String description, String image) {

        this.title = title;
        this.price = price;
        this.category = category;
        this.description = description;
        this.image = image;
    }

       */
    }

}
