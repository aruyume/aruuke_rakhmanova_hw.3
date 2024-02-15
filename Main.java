import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {1.5, 3.2, -2.3, 2.7, -4.5, 5.1, 6.4, -1.2, 2.5, 3.3, -7.8, 1.2, -2.9, 4.6, 0.8};
        System.out.println(Arrays.toString(numbers));

        boolean findNegOrPos = false;
        double sum = 0;
        int count = 0;

        for (double digits : numbers) {
            if (!findNegOrPos && digits < 0) {
                findNegOrPos = true;
            } else if (findNegOrPos && digits > 0) {
                sum += digits;
                count++;
            }
        }

        double total = sum / count;
        if (findNegOrPos = false) {
            System.out.println("в массиве нет отрицательных чисел");
        } else {
            System.out.println("среднее арифметическое " + total);
            System.out.println("сумма " + sum);
            System.out.println("количество чисел " + count);
        }
    }
}