package HomeWorks.HW07_Arr2;
public class Task0 {
    public static void main(String[] args) {
        int size = 5;
        int rows = size;
        int cols = size;

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) //создаем строки треуг
            for (int j = 0; j < i+1; j++) //создаем столбцы треуг
                arr[i][j] = 5 - i + j; //заполняем цифрами треуг

        for (int i = 0; i < rows; i++) { //убираем нули
            for (int j = 0; j < cols; j++)
                if (arr[i][j] == 0)
                    System.out.print("  ");
                else System.out.print(arr[i][j] + " ");
            System.out.println();

        }
    }
}
