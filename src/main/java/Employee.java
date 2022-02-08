public class Employee {
    public String name;
    final private double rate;
    private int hours;
    private PayStrategy payStrategy = null;

    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public void setHours(int newHours) {
        hours = newHours;
    }

    public void setPayStrategy(PayStrategy newPayStrategy) {
        payStrategy = newPayStrategy;
    }

    public double pay() {
        return payStrategy.pay(hours, rate);
    }
}
