package M07_CyclesFor_While;

import java.util.Scanner;

////Пользователь вводит имя, и,если оно пусто,
// то производится повторный ввод
public class UserName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.print("Ведите имя: ");
        do{
            name = scanner.nextLine();
        }
        while(name.isEmpty());
        //name.equal("")
        //name.isEmply("")
    }
}
