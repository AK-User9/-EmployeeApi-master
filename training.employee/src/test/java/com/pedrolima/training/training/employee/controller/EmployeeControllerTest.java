package com.pedrolima.training.training.employee.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeControllerTest {

    private EmployeeController employeeController;

    @BeforeEach
    void setUp() {
        employeeController = new EmployeeController();
    }

    @Test
    void testEmployeeControllerInstantiation() {
        // Test that EmployeeController can be instantiated
        assertNotNull(employeeController);
    }

    @Test
    void testEmployeeControllerIsNotNull() {
        // Verify controller instance is not null
        EmployeeController controller = new EmployeeController();
        assertNotNull(controller);
    }

    @Test
    void testEmployeeControllerClassExists() {
        // Verify EmployeeController class exists
        assertDoesNotThrow(() -> {
            Class.forName("com.pedrolima.training.training.employee.controller.EmployeeController");
        });
    }

    @Test
    void testEmployeeControllerIsPublic() {
        // Verify EmployeeController class is public
        assertTrue(java.lang.reflect.Modifier.isPublic(EmployeeController.class.getModifiers()));
    }

    @Test
    void testEmployeeControllerHasDefaultConstructor() {
        // Test default constructor
        assertDoesNotThrow(() -> {
            new EmployeeController();
        });
    }

    @Test
    void testMultipleInstancesAreIndependent() {
        // Test that multiple instances are independent
        EmployeeController controller1 = new EmployeeController();
        EmployeeController controller2 = new EmployeeController();
        assertNotNull(controller1);
        assertNotNull(controller2);
        assertNotSame(controller1, controller2);
    }

    @Test
    void testEmployeeControllerPackage() {
        // Verify package name
        assertEquals("com.pedrolima.training.training.employee.controller",
                     EmployeeController.class.getPackageName());
    }

    @Test
    void testEmployeeControllerClassName() {
        // Verify class name
        assertEquals("EmployeeController", EmployeeController.class.getSimpleName());
    }

    @Test
    void testEmployeeControllerNotAbstract() {
        // Verify EmployeeController is not abstract
        assertFalse(java.lang.reflect.Modifier.isAbstract(EmployeeController.class.getModifiers()));
    }
}
