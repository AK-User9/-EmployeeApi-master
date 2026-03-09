package com.pedrolima.training.training.employee.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    private Employee employee;

    @BeforeEach
    void setUp() {
        employee = new Employee();
    }

    @Test
    void testEmployeeInstantiation() {
        // Test that Employee can be instantiated
        assertNotNull(employee);
    }

    @Test
    void testEmployeeIsNotNull() {
        // Verify employee instance is not null
        Employee emp = new Employee();
        assertNotNull(emp);
    }

    @Test
    void testEmployeeClassExists() {
        // Verify Employee class exists
        assertDoesNotThrow(() -> {
            Class.forName("com.pedrolima.training.training.employee.model.Employee");
        });
    }

    @Test
    void testEmployeeIsPublic() {
        // Verify Employee class is public
        assertTrue(java.lang.reflect.Modifier.isPublic(Employee.class.getModifiers()));
    }

    @Test
    void testEmployeeHasDefaultConstructor() {
        // Test default constructor
        assertDoesNotThrow(() -> {
            new Employee();
        });
    }

    @Test
    void testMultipleInstancesAreIndependent() {
        // Test that multiple instances are independent
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        assertNotNull(emp1);
        assertNotNull(emp2);
        assertNotSame(emp1, emp2);
    }

    @Test
    void testEmployeePackage() {
        // Verify package name
        assertEquals("com.pedrolima.training.training.employee.model",
                     Employee.class.getPackageName());
    }

    @Test
    void testEmployeeClassName() {
        // Verify class name
        assertEquals("Employee", Employee.class.getSimpleName());
    }

    @Test
    void testEmployeeNotAbstract() {
        // Verify Employee is not abstract
        assertFalse(java.lang.reflect.Modifier.isAbstract(Employee.class.getModifiers()));
    }

    @Test
    void testEmployeeNotInterface() {
        // Verify Employee is not an interface
        assertFalse(Employee.class.isInterface());
    }
}
