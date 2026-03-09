package com.pedrolima.training.training.employee.exception;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class GlobalExceptionHandlerTest {

    private GlobalExceptionHandler globalExceptionHandler;

    @BeforeEach
    void setUp() {
        globalExceptionHandler = new GlobalExceptionHandler();
    }

    @Test
    void testGlobalExceptionHandlerInstantiation() {
        // Test that GlobalExceptionHandler can be instantiated
        assertNotNull(globalExceptionHandler);
    }

    @Test
    void testGlobalExceptionHandlerIsNotNull() {
        // Verify handler instance is not null
        GlobalExceptionHandler handler = new GlobalExceptionHandler();
        assertNotNull(handler);
    }

    @Test
    void testGlobalExceptionHandlerClassExists() {
        // Verify GlobalExceptionHandler class exists
        assertDoesNotThrow(() -> {
            Class.forName("com.pedrolima.training.training.employee.exception.GlobalExceptionHandler");
        });
    }

    @Test
    void testGlobalExceptionHandlerIsPublic() {
        // Verify GlobalExceptionHandler class is public
        assertTrue(java.lang.reflect.Modifier.isPublic(GlobalExceptionHandler.class.getModifiers()));
    }

    @Test
    void testGlobalExceptionHandlerHasDefaultConstructor() {
        // Test default constructor
        assertDoesNotThrow(() -> {
            new GlobalExceptionHandler();
        });
    }

    @Test
    void testMultipleInstancesAreIndependent() {
        // Test that multiple instances are independent
        GlobalExceptionHandler handler1 = new GlobalExceptionHandler();
        GlobalExceptionHandler handler2 = new GlobalExceptionHandler();
        assertNotNull(handler1);
        assertNotNull(handler2);
        assertNotSame(handler1, handler2);
    }

    @Test
    void testGlobalExceptionHandlerPackage() {
        // Verify package name
        assertEquals("com.pedrolima.training.training.employee.exception",
                     GlobalExceptionHandler.class.getPackageName());
    }

    @Test
    void testGlobalExceptionHandlerClassName() {
        // Verify class name
        assertEquals("GlobalExceptionHandler", GlobalExceptionHandler.class.getSimpleName());
    }
}
