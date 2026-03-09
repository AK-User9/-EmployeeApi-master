package com.pedrolima.training.training.employee.exception;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ErrorDetailsTest {

    private ErrorDetails errorDetails;

    @BeforeEach
    void setUp() {
        errorDetails = new ErrorDetails();
    }

    @Test
    void testErrorDetailsInstantiation() {
        // Test that ErrorDetails can be instantiated
        assertNotNull(errorDetails);
    }

    @Test
    void testErrorDetailsIsNotNull() {
        // Verify ErrorDetails instance is not null
        ErrorDetails details = new ErrorDetails();
        assertNotNull(details);
    }

    @Test
    void testErrorDetailsClassExists() {
        // Verify ErrorDetails class exists
        assertDoesNotThrow(() -> {
            Class.forName("com.pedrolima.training.training.employee.exception.ErrorDetails");
        });
    }

    @Test
    void testErrorDetailsIsPublic() {
        // Verify ErrorDetails class is public
        assertTrue(java.lang.reflect.Modifier.isPublic(ErrorDetails.class.getModifiers()));
    }

    @Test
    void testErrorDetailsHasDefaultConstructor() {
        // Test default constructor
        assertDoesNotThrow(() -> {
            new ErrorDetails();
        });
    }

    @Test
    void testMultipleInstancesAreIndependent() {
        // Test that multiple instances are independent
        ErrorDetails details1 = new ErrorDetails();
        ErrorDetails details2 = new ErrorDetails();
        assertNotNull(details1);
        assertNotNull(details2);
        assertNotSame(details1, details2);
    }

    @Test
    void testErrorDetailsPackage() {
        // Verify package name
        assertEquals("com.pedrolima.training.training.employee.exception",
                     ErrorDetails.class.getPackageName());
    }

    @Test
    void testErrorDetailsClassName() {
        // Verify class name
        assertEquals("ErrorDetails", ErrorDetails.class.getSimpleName());
    }

    @Test
    void testErrorDetailsNotAbstract() {
        // Verify ErrorDetails is not abstract
        assertFalse(java.lang.reflect.Modifier.isAbstract(ErrorDetails.class.getModifiers()));
    }
}
