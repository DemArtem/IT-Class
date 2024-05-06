package _Java.IT_Class.M25_Generic;//Реализуйте метод ifPresent, аналогичный одноименному методу класса Optional и принимающий java.util.function.BiConsumer
import java.util.function.BiConsumer;

public class CustomOptional<T> {

    private T value;

    public CustomOptional(T value) {
        this.value = value;
    }

    public void ifPresent(BiConsumer<T, T> consumer) {
        if (value != null) {
            consumer.accept(value, value);
        }
    }

    public static void main(String[] args) {
        CustomOptional<String> customOptional = new CustomOptional<>("Hello");

        customOptional.ifPresent((val1, val2) -> {
            System.out.println("Value: " + val1 + " " + val2);
        });
    }
}