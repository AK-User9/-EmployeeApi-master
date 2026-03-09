package com.pedrolima.training.training.employee.repository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeRepositoryTest {

    private EmployeeRepository employeeRepository;

    @BeforeEach
    void setUp() {
        employeeRepository = new EmployeeRepository();
    }

    @Test
    void testEmployeeRepositoryInstantiation() {
        // Test that EmployeeRepository can be instantiated
        assertNotNull(employeeRepository);
    }

    @Test
    void testEmployeeRepositoryIsNotNull() {
        // Verify repository instance is not null
        EmployeeRepository repository = new EmployeeRepository();
        assertNotNull(repository);
    }

    @Test
    void testEmployeeRepositoryClassExists() {
        // Verify EmployeeRepository class exists
        assertDoesNotThrow(() -> {
            Class.forName("com.pedrolima.training.training.employee.repository.EmployeeRepository");
        });
    }

    @Test
    void testEmployeeRepositoryIsPublic() {
        // Verify EmployeeRepository class is public
        assertTrue(java.lang.reflect.Modifier.isPublic(EmployeeRepository.class.getModifiers()));
    }

    @Test
    void testEmployeeRepositoryHasDefaultConstructor() {
        // Test default constructor
        assertDoesNotThrow(() -> {
            new EmployeeRepository();
        });
    }

    @Test
    void testMultipleInstancesAreIndependent() {
        // Test that multiple instances are independent
        EmployeeRepository repo1 = new EmployeeRepository();
        EmployeeRepository repo2 = new EmployeeRepository();
        assertNotNull(repo1);
        assertNotNull(repo2);
        assertNotSame(repo1, repo2);
    }

    @Test
    void testEmployeeRepositoryPackage() {
        // Verify package name
        assertEquals("com.pedrolima.training.training.employee.repository",
                     EmployeeRepository.class.getPackageName());
    }
}
