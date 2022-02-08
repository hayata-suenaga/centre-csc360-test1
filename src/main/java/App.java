import java.util.List;

public class App {
    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.addEmployee(new HourlyEmployee("Tom", 20, 45));
        employees.addEmployee(new ContractEmployee("Alex", 20, 45));
        employees.addEmployee(new SalaryEmployee("James", 20, 45));
        System.out.println(employees.payAll());
        employees.setHoursForEmployee("Alex", 50);
        System.out.println(employees.payAll());
    }
}
