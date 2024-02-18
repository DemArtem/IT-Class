package IT_Class.M15_Recursion;

public class Submarine {
    public static void main(String[] args) {
       submarine(0);
    }
    static void submarine(int depth){ //используем аргумент для контроля количества рекурсивных вызовов
        if (depth == 5) return; //2.выход из рекурсии (условие + return)
        System.out.println("hi " + depth); //3.полезная работа
        submarine(depth+1); //4.рекурсивный вызов (погружение)
        System.out.println("hi " + depth); //3.полезная работа
    }
}
