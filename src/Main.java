public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        // Рост в метрах
        double height = 1.75;
        // Вес в килограммах
        double weight = 120.5;
        double bmi = service.calculate(height,weight);
        System.out.println(bmi);
    }
}
