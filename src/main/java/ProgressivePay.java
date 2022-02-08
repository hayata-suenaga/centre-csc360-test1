public class ProgressivePay implements PayStrategy {
    static final private int BASE_HOURS = 40;
    static final private double FACTOR = 1.5;

    public double pay(int hours, double rate) {
        if (hours > BASE_HOURS) {
            double amount = 0;
            amount += BASE_HOURS * rate;
            amount += (hours - BASE_HOURS) * rate * FACTOR;
            return amount;
        }
        return hours * rate;
    }
}
