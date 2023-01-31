public class BmiService {
    public double calculate(double weight , double high) {
        double index;

        high = high / 100;
        index = weight / (high*high);
        return index;


    }
}
