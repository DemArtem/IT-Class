package HomeWorks.HomeWork24_01_20;
public class Task26 {
    public static void main(String[] args) {
        int size = 5;
        int rows = size * 2;
        int cols = size * 2 - 1;

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < size; i++) //создаем строки верхн треуг
            for (int j = size - 1; j < size - 1 + i + 1; j++) //создаем столбцы верхн треуг
                arr[i][j] = i + 5 - j; //заполняем цифрами верхн треуг

        for (int i = size; i < rows; i++) //создаем строки нижн треуг
            for (int j = i - size; j < size; j++) //создаем столбцы нижн треуг
                arr[i][j] = j + 6 - i; //заполняем цифрами нижнн треуг

        for (int i = 0; i < rows; i++) { //убираем нули
            for (int j = 0; j < cols; j++)
                if (arr[i][j] == 0)
                    System.out.print("  ");
                else System.out.print(arr[i][j] + " ");
            System.out.println();

        }
    }
}
