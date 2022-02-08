import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Employees {
    final private List<Employee> employees;

    public Employees() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee newEmployee) {
        employees.add(newEmployee);
    }

    public void setHoursForEmployee(String name, int newHours) throws NoSuchElementException {
        Employee employee = findEmployeeByName(name);
        if (employee == null)
            throw new NoSuchElementException("Employee with the name " + name + " does not exist");
        employee.setHours(newHours);
    }

    public List<Double> payAll() {
        List<Double> pays = new ArrayList<>();
        for (Employee employee : employees) {
            pays.add(employee.pay());
        }
        return pays;
    }

    private Employee findEmployeeByName(String name) {
        for (Employee employee : employees) {
            if (employee.name.equals(name)) {
                return employee;
            }
        }
        return null;
    }
}
