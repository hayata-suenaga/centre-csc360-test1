import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

class EmployeesTest {

    private Employees employees;
    private List<Double> expectedPays;
    final private int HOURS = 45;
    final private double RATE = 20;
    final private double BASE_HOURS = 40;
    final private double FACTOR = 1.5;

    @BeforeEach
    void setUp() {
        employees = new Employees();
        employees.addEmployee(new HourlyEmployee("Tom", RATE, HOURS));
        employees.addEmployee(new ContractEmployee("Alex", RATE, HOURS));
        employees.addEmployee(new SalaryEmployee("James", RATE, HOURS));

        double tomAmount = RATE * BASE_HOURS + RATE * (HOURS - BASE_HOURS) * FACTOR;
        double alexAmount = RATE * HOURS;
        double jamesAmount = RATE * BASE_HOURS;

        expectedPays = new ArrayList<>(Arrays.asList(tomAmount, alexAmount, jamesAmount));
    }

    @Test
    void payAll() {
        /* Check if the returned payment amounts list match with the list of expected payment amounts */
        assertEquals(expectedPays, employees.payAll());
    }

    @Test
    void addEmployee() {
        /* Add a new salary employee */
        employees.addEmployee(new SalaryEmployee("Robert", RATE, HOURS));
        /* Update the expected pays list to add the new employee's expected payment amount */
        double amount = RATE * BASE_HOURS;
        expectedPays.add(amount);
        /* Check if the returned payment amounts list match with the list of expected payment amounts */
        assertEquals(expectedPays, employees.payAll());
    }

    @Test
    void setHoursForEmployee() {
        /* New payment amount for Alex (contract worker) */
        double newAlexAmount = 20 * 50;
        /* Update expectedPays list to reflect Alex's new pay amount */
        expectedPays.set(1, newAlexAmount);
        /* Invoke setHoursForEmployee method on employees to update Alex's hours */
        employees.setHoursForEmployee("Alex", 50);
        /* Check if the returned payment amounts list match with the list of expected payment amounts */
        assertEquals(expectedPays, employees.payAll());
    }
}