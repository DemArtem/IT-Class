package M8_CyclesFor_While;

public class Examples {
    public static void main(String[] args) {
        //Sample 1
        // Сколько раз выполнится цикл?
        for (int i = 0; i < 5; i++)
            System.out.print(i);
        System.out.println();

        //Sample 2
        //Какое число выведет первым и какое вторым?
        for (int i = 0; i <= 10; i = i + 2)
            System.out.print(i++);
        System.out.println();

        //Sample 3
        // Сколько раз выполнится цикл?
        for (int i = 1; i <= 3; i++)
            for (int j = 1; j <= 3; j++)
                System.out.print(i + " " + j);
        System.out.println();

        //Sample 4
        // Сколько раз выполнится цикл?
        for (int i = 1; i <= 3; i++)
            for (int j = 3; j >= i; j--)
                System.out.print("* ");
        System.out.println();

        //Sample 5
        // Сколько раз выполнится цикл?
        for (int i = 1; i <= 3; i++)
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2)
                    break;
                System.out.print(i + " " + j);
            }
        System.out.println();

        //Sample 6
        // Сколько раз выполнится цикл?
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++)
                System.out.print(i + " " + j + "  ");
            if (i == 2)
                break;
        }
        System.out.println();

        //Sample 7
        // Сколько раз выполнится цикл?
        aa:
        for (int i = 1; i <= 3; i++) {
            bb:
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break aa;
                }
                System.out.print(i + " " + j);
            }
        }
        System.out.println();

        //Sample 8
        // Сколько раз выполнится цикл?
        aa:
        for (int i = 1; i <= 3; i++) {
            bb:
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break bb;
                }
                System.out.print(i + " " + j);
            }
        }
        System.out.println();

        //Sample 9
        // Сколько раз выполнится цикл?
        int i = 0;
        while (i <= 3)
            System.out.print(i++);
        System.out.println();

        //Sample 10
        // Сколько раз выполнится цикл?
        i = 0;
        do
            System.out.print(i++);
        while (i <= 3);
        System.out.println();

        //Sample 11
        // Сколько раз выполнится цикл?
        i = 0;
        while (i <= 3)
            System.out.print(++i);
        System.out.println();

        //Sample 12
        // Сколько раз выполнится цикл?
        i = 0;
        do
            System.out.print(++i);
        while (i <= 3);
        System.out.println();

        //Sample 13
        // Сколько раз выполнится цикл?
        i = 1;
        while (i <= 3) {
            int j = 1;
            while (j <= 3)
                System.out.print(j++);
            i++;
        }
        System.out.println();

        //Sample 14
        // Чему равна сумма?
        int x = 1, sum = 0;
        while (x <= 3)
            sum += x++;
        System.out.println("Summation: " + sum);

        //Sample 15
        x = 1;
        sum = 0;
        do
            sum += x++;
        while (x <= 3);
        System.out.println("Summation: " + sum);
    }
}
