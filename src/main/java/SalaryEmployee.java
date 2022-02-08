public class SalaryEmployee extends Employee {
    public SalaryEmployee(String name, double rate, int hours) {
        super(name, rate, hours);
        this.setPayStrategy(new ConstantPay());
    }
}
