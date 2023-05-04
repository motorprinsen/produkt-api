package com.example.produktapi.IntegrationAPI;

import io.restassured.RestAssured;
import org.junit.Test;

public class SendGet {
public static final String BaseURL= "https://webshop-agil-testautomatiserare.netlify.app/index.html";
   @Test
    public void peek(){
       RestAssured.get(BaseURL)
       .peek();
   }
   @Test
    public void prettyPeek(){
       RestAssured.get(BaseURL)
               .prettyPeek();
   }
   @Test
    public void print(){
       RestAssured.get(BaseURL)
               .print();
          }
@Test
    public void prettyPrint(){
       RestAssured.get(BaseURL)
               .prettyPrint();
}
}
