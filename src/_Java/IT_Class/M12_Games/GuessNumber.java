package _Java.IT_Class.M12_Games;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        //комп загадывает число от 1 до 100. надо угадать число
        Random random = new Random();
        int number = random.nextInt(100)+1;
        //System.out.println(number); //загаданное число

        Scanner scanner = new Scanner(System.in);

        int guessed = 0;
        while (guessed !=number) {
            System.out.println("Enter the number: ");
            guessed = scanner.nextInt();
            if (guessed < number) System.out.println("Greater");
            else if (guessed > number) System.out.println("You guessed");
        }
    }
}
