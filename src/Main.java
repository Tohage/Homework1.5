public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 91;
        double bmi = service.calculate(weight);
        System.out.println("Индекс массы тела = " + bmi);
    }
}
