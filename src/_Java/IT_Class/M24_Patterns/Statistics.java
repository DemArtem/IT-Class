package _Java.IT_Class.M24_Patterns;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

//Вложенный статический класс
public class Statistics {
    public static void main(String[] args) {
        int count = 10;
        double[] arr = new double[count];
        Random random = new Random(20);
        for (int i = 0; i < count; i++)
            arr[i] = random.nextDouble() * 10;

        //System.out.println(Arrays.toString(arr));
        DecimalFormat df = new DecimalFormat("0.00");
        Arrays.stream(arr).forEach(e -> System.out.print(df.format(e) + " "));

        Stats.Results results = Stats.calculate(arr);
        System.out.printf("Min: %f, max: %f, average: %f, std: %f%n",
                results.getMin(), results.getMax(), results.getAverage(), results.getStd());
    }
}

    //Класс служит для вычисления минимального, максимального значения, среднего арифметического и с.к.о.
class Stats {
    //Почему эти геттеры не перенесены в основной класс
    //Видимо, интерфейс основного класса нежелательно изменять
    public static class Results {
        private double min;
        private double max;
        private double average;
        private double std;

        Results(double min, double max, double average, double std) {
            this.min = min;
            this.max = max;
            this.average = average;
            this.std = std;
        }

        public double getMin() {
            return min;
        }

        public double getMax() {
            return max;
        }

        public double getAverage() {
            return average;
        }

        public double getStd() {
            return std;
        }
    }

    public static Results calculate(double[] arr) {
        double sum = 0, count = arr.length,
                min = Double.MAX_VALUE, max = Double.MIN_VALUE,
                average, std;
        for (double elem : arr) {
            sum += elem;
            if (min > elem) min = elem;
            if (max < elem) max = elem;
        }
        average = sum / count;
        std = 0;
        for (double elem : arr)
            std += (elem - average) * (elem - average);
        std /= (count - 1);
        return new Results(min, max, average, std);
    }
}