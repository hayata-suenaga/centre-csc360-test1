public class ConditionalPay implements PayStrategy {
    static final private int MINIMAL_HOURS = 40;

    public double pay(int hours, double rate) {
        if (hours < MINIMAL_HOURS) return 0;
        return hours * rate ;
    }
}
