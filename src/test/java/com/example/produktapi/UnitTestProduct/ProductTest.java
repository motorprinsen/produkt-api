package com.example.produktapi.UnitTestProduct;

import com.example.produktapi.model.Product;
import com.example.produktapi.repository.ProductRepository;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class ProductTest {
    Product pro= new Product();

    @Test
    public void compareTitle(){
        pro.setTitle("abcd");
        Assert.assertEquals("abcd",pro.getTitle());
    }
    @Test
    public void testGetID(){
        pro.setId(101);
        Assert.assertEquals(Integer.valueOf(101),pro.getId());
    }
    @Test
    public void testGetPrice(){
        pro.setPrice(200.00);
        Assert.assertEquals(Double.valueOf(200.00),pro.getPrice());
    }
    @Test
    public void testGetCategory(){
        pro.setCategory("clothes");
        Assert.assertEquals("clothes",pro.getCategory());
    }
    @Test
    public void testGetImage(){
        pro.setImage("https://fakestoreapi.com/img/51Y5NI-I5jL._AC_UX679_.jpg");
        Assert.assertEquals("https://fakestoreapi.com/img/51Y5NI-I5jL._AC_UX679_.jpg",pro.getImage());
    }
    @Test
    public void testGetDescription(){
        pro.setDescription("sldjdsfvndlkvnfdlvjfjl");
        Assert.assertEquals("sldjdsfvndlkvnfdlvjfjl",pro.getDescription());
    }
@Test
    public void getAllProducts(){
    List<Product> products = new ArrayList<>();
    products.add(new Product("Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",109.95,"Fin väska me plats för dator","men's clothing","https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg"));
    products.add(new Product("Mens Casual Premium Slim Fit T-Shirts",22.3,"Vilken härlig t-shirt, slim fit o casual i ett!","men''s clothing","https://fakestoreapi.com/img/71-3HjGNDUL._AC_SY879._SX._UX._SY._UY_.jpg"));

}
}
