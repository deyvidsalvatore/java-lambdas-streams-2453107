package com.challenge1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmployeeUtilsTest {

    private final EmployeeUtils employeeUtils = new EmployeeUtils();

    @Test
    void getFullName() {
        Employee employee = new Employee();
        employee.setFirstName("Jerome");
        employee.setLastName("Donaldson");

        String actualName = employeeUtils.getFullName(employee);

        Assertions.assertEquals("Jerome Donaldson", actualName);
    }

    @Test
    void getManagersLastName() {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee2.setLastName("Westbay");
        employee1.setManager(employee2);

        String actual = employeeUtils.getManagersLastName(employee1);

        Assertions.assertEquals("Westbay", actual);
    }

    @Test
    void hasBeenEmployedLongerThanFiveYears() {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee1.setYearsOfService(10);
        employee2.setYearsOfService(2);

        boolean actual1 = employeeUtils.hasBeenEmployedLongerThanFiveYears(employee1);
        boolean actual2 = employeeUtils.hasBeenEmployedLongerThanFiveYears(employee2);

        Assertions.assertTrue(actual1);
        Assertions.assertFalse(actual2);
    }

    @Test
    void hasMoreThanThreeDirectReports() {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee1.setNumberOfDirectReports(5);
        employee2.setNumberOfDirectReports(2);

        boolean actual1 = employeeUtils.hasMoreThanThreeDirectReports(employee1);
        boolean actual2 = employeeUtils.hasMoreThanThreeDirectReports(employee2);

        Assertions.assertTrue(actual1);
        Assertions.assertFalse(actual2);
    }

    @Test
    void hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports() {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee1.setYearsOfService(4);
        employee1.setNumberOfDirectReports(1);

        employee2.setNumberOfDirectReports(2);
        employee2.setYearsOfService(2);

        boolean actual1 = employeeUtils.hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(employee1);
        boolean actual2 = employeeUtils.hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(employee2);

        Assertions.assertTrue(actual1);
        Assertions.assertFalse(actual2);
    }
}