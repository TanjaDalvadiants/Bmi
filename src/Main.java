public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 121;
        double hight = 165;
        double bmi = service.calculate( weight , hight );

        System.out.printf("%.2f", bmi);
    }
}