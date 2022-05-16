public class BmiService {
    public int calculate(int weight) {
        double height = 1.80;
        double bmi = weight / (height * height);
        return (int) bmi;
    }
    }

