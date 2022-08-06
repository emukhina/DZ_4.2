public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();
        // рост вводить в см
        // вес вводить в кг
        double index = service.calculate(53,164);

    }
}