public class ProportionalPay implements PayStrategy {
    public double pay(int hours, double rate) {
        return hours * rate;
    }
}
