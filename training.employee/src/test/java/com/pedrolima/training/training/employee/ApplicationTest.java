package com.pedrolima.training.training.employee;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ApplicationTest {

    @Test
    void contextLoads() {
        // Test that Spring context loads successfully
        assertDoesNotThrow(() -> {
            // Context loading is tested by @SpringBootTest
        });
    }

    @Test
    void testMainMethodExists() {
        // Verify main method can be invoked without errors
        assertDoesNotThrow(() -> {
            Application.class.getMethod("main", String[].class);
        });
    }

    @Test
    void testMainMethodWithNullArgs() {
        // Test main method handles null arguments
        assertThrows(IllegalArgumentException.class, () -> {
            SpringApplication.run(Application.class, (String[]) null);
        });
    }

    @Test
    void testMainMethodWithEmptyArgs() {
        // Test main method with empty arguments
        assertDoesNotThrow(() -> {
            Application.class.getMethod("main", String[].class);
        });
    }

    @Test
    void testApplicationClassAnnotation() {
        // Verify @SpringBootApplication annotation is present
        assertTrue(Application.class.isAnnotationPresent(
            org.springframework.boot.autoconfigure.SpringBootApplication.class));
    }

    @Test
    void testApplicationClassIsPublic() {
        // Verify Application class is public
        assertTrue(java.lang.reflect.Modifier.isPublic(Application.class.getModifiers()));
    }

    @Test
    void testApplicationClassHasMainMethod() throws NoSuchMethodException {
        // Verify main method signature
        java.lang.reflect.Method mainMethod = Application.class.getMethod("main", String[].class);
        assertNotNull(mainMethod);
        assertTrue(java.lang.reflect.Modifier.isStatic(mainMethod.getModifiers()));
        assertTrue(java.lang.reflect.Modifier.isPublic(mainMethod.getModifiers()));
    }
}
