public class ContractEmployee extends Employee {
    public ContractEmployee(String name, double rate, int hours) {
        super(name, rate, hours);
        this.setPayStrategy(new ProportionalPay());
    }
}
