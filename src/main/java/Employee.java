public class Employee {
    public String name;
    private final float rate;
    private int hours;
    private PayStrategy payStrategy;

    public Employee(String name, float rate, int hours) {
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

    public float pay() {
        return payStrategy.pay(hours, rate);
    }
}
