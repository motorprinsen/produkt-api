package com.example.produktapi.IntegrationAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class ValidateResponse {
    public static final String BaseURL= "https://webshop-agil-testautomatiserare.netlify.app/index.html";
    @Test
    public void basicValidate(){
        Response response = RestAssured.get(BaseURL);
        int code = response.getStatusCode();
        System.out.println(code);
        Assert.assertEquals(200,code);
        String content = response.getContentType();
        System.out.println(content);
        Assert.assertEquals("text/html; charset=UTF-8",content);
        Headers header = response.getHeaders();
        System.out.println(header);
    }
    @Test
    public void getHeader(){
        Response response = RestAssured.get(BaseURL);
        Headers header=response.getHeaders();
        System.out.println("Header is;   "+header);
        int size= header.size();
        System.out.println("Header Size Is:  "+size);
        String val = header.getValue("header1");
        System.out.println("Header Name is:   "+val);
    }
    @Test
    public void timeDemo(){
        Response response = RestAssured.get(BaseURL);
        System.out.println(response.getTime());
        System.out.println(response.getTimeIn(TimeUnit.MINUTES));
    }
    @Test
    public void basicValidateExample(){
         RestAssured.get(BaseURL)
                 .then()
                 .statusCode(200)
                 .contentType(ContentType.HTML);




    }
}
