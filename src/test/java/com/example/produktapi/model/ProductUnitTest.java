package com.example.produktapi.model;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;


import java.util.List;


@SpringBootTest
public class ProductUnitTest {


    Product product = new Product();

    //public Product(String title, Double price, String category, String description, String image)


    @Test
    void CheckProductTitle() {
        product.setTitle("Powerboots Original Stövlar");
      String newtitle = product.getTitle();
      Assertions.assertEquals( newtitle,"Powerboots Original Stövlar");
    }
    @Test
    void CheckProductId() {
        product.setId(33);
        int newId = product.getId();
        Assertions.assertEquals( newId,33);
    }
    @Test
    void CheckProductPrice() {
        product.setPrice(33.99);
       double newPrice = product.getPrice();
        Assertions.assertEquals( newPrice,33.99);
    }
    @Test
    void CheckProductCategory() {
        product.setCategory("kängor");
        String newCat = product.getCategory();
        Assertions.assertEquals( newCat,"kängor");
    }
    @Test
    void CheckProductDescription() {
        product.setDescription("Automatiserad testning och testverktyg");
        String newDesc = product.getDescription();
        Assertions.assertEquals( newDesc,"Automatiserad testning och testverktyg");
    }
    @Test
    void CheckProductImage() {
        product.setImage("IMage.jpeg");
        String newImg = product.getImage();
        Assertions.assertEquals(newImg ,"IMage.jpeg");
    }


}
