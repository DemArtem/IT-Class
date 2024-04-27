package StreamAPI;

import java.util.stream.Stream;

public class DoubleStreams {
    public static void main(String[] args) {
        //Taylor series for e^x
        final double x = 1; //Должно быть effectively final
        double a = 1, b = 1;

        Stream.iterate(new double[]{1, x, a, b}, t -> new double[]{++t[0], t[1] += t[2] / t[3], t[2] = t[2] * x, t[3] *= t[0]})
                .limit(10)
                .mapToDouble(t -> t[1])
                .forEach(System.out::println);

        //Taylor series for sin(x)
        double x2 = Math.PI/2;
        a = x2; b = 1;
        Stream.iterate(new double[]{1, 0, a, b},
                        t -> new double[]{t[0]+=2, t[1] += t[2] / t[3], t[2] *= -x2*x2, t[3] *= t[0]*(t[0]-1)})
                .takeWhile(t -> Math.abs(t[2]/t[3])>1e-10)//takeWhile = считаем до того, пока
                .mapToDouble(t -> t[1])
                .forEach(System.out::println);


        //Вернуть последний элемент
        double result = Stream.iterate(new double[]{1, 0, a, b},
                        t -> new double[]{t[0]+=2, t[1] += t[2] / t[3], t[2] *= -x2*x2, t[3] *= t[0]*(t[0]-1)})
                .takeWhile(t -> Math.abs(t[2]/t[3])>1e-10)
                .mapToDouble(t -> t[1])
                .reduce((first, second) -> second)
                .orElse(0);
        System.out.println(result);
    }
}