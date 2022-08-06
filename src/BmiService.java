public class BmiService {

    public double calculate(int weight, double height) {

        double index;
        index = weight / ((height / 100) * (height / 100));

        if (index < 18.5) {
            System.out.println("Дефицит массы тела " + index);
        } else if (index > 18.5 & index <= 24.9) {
            System.out.println("Нормальная масса тела " + index);
        } else if (index > 25 & index <= 29.9) {
            System.out.println("Увеличение массы тела " + index);
        } else if (index > 30 & index <= 34.9) {
            System.out.println("Ожирение 1 степени " + index);
        } else if (index > 35 & index <= 39.9) {
            System.out.println("Ожирение 2 степени " + index);
        } else System.out.println("Ожирение 3 степени " + index);

        return index;
    }
}
