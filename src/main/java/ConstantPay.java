public class ConstantPay implements PayStrategy {
    static final private int BASE_HOUR = 40;

    public double pay(int hours, double rate) {
        return BASE_HOUR * rate ;
    }
}