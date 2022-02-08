public class HourlyEmployee extends Employee {
    public HourlyEmployee(String name, double rate, int hours) {
        super(name, rate, hours);
        this.setPayStrategy(new ProgressivePay());
    }
}
