package com.example.produktapi;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = ProduktapiApplication.class)
public class UnitTests {
    @Test
    @DisplayName("Should always pass")
    void shouldAlwaysPass() {
        assertTrue(true);
    }
}
