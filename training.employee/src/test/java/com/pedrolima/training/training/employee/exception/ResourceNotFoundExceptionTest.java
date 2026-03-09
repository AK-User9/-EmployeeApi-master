package com.pedrolima.training.training.employee.exception;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ResourceNotFoundExceptionTest {

    private ResourceNotFoundException resourceNotFoundException;

    @BeforeEach
    void setUp() {
        resourceNotFoundException = new ResourceNotFoundException();
    }

    @Test
    void testResourceNotFoundExceptionInstantiation() {
        // Test that ResourceNotFoundException can be instantiated
        assertNotNull(resourceNotFoundException);
    }

    @Test
    void testResourceNotFoundExceptionIsNotNull() {
        // Verify exception instance is not null
        ResourceNotFoundException exception = new ResourceNotFoundException();
        assertNotNull(exception);
    }

    @Test
    void testResourceNotFoundExceptionClassExists() {
        // Verify ResourceNotFoundException class exists
        assertDoesNotThrow(() -> {
            Class.forName("com.pedrolima.training.training.employee.exception.ResourceNotFoundException");
        });
    }

    @Test
    void testResourceNotFoundExceptionIsPublic() {
        // Verify ResourceNotFoundException class is public
        assertTrue(java.lang.reflect.Modifier.isPublic(ResourceNotFoundException.class.getModifiers()));
    }

    @Test
    void testResourceNotFoundExceptionHasDefaultConstructor() {
        // Test default constructor
        assertDoesNotThrow(() -> {
            new ResourceNotFoundException();
        });
    }

    @Test
    void testMultipleInstancesAreIndependent() {
        // Test that multiple instances are independent
        ResourceNotFoundException exception1 = new ResourceNotFoundException();
        ResourceNotFoundException exception2 = new ResourceNotFoundException();
        assertNotNull(exception1);
        assertNotNull(exception2);
        assertNotSame(exception1, exception2);
    }

    @Test
    void testResourceNotFoundExceptionPackage() {
        // Verify package name
        assertEquals("com.pedrolima.training.training.employee.exception",
                     ResourceNotFoundException.class.getPackageName());
    }

    @Test
    void testResourceNotFoundExceptionClassName() {
        // Verify class name
        assertEquals("ResourceNotFoundException", ResourceNotFoundException.class.getSimpleName());
    }

    @Test
    void testResourceNotFoundExceptionNotAbstract() {
        // Verify ResourceNotFoundException is not abstract
        assertFalse(java.lang.reflect.Modifier.isAbstract(ResourceNotFoundException.class.getModifiers()));
    }
}
