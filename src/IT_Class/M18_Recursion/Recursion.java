package IT_Class.M18_Recursion;

public class Recursion {
    static int index = 0;
    public static void main(String[] args) {
        //recurse(); //1.точка входа в рекурсию
        //recurse(0);
        System.out.println(sum(5));
    }

    static void recurse(){
        if (index==5) return; //2.выход из рекурсии (условие + return)
        index++; //3.полезная работа
        System.out.println("hi"); //полезная работа
        recurse(); //4.рекурсивный вызов (погружение)
    }

    static void recurse(int index){ //используем аргумент для контроля количества рекурсивных вызовов
        if (index==5) return; //2.выход из рекурсии (условие + return)
        System.out.println("hi"); //3.полезная работа
        recurse(index+1); //4.рекурсивный вызов (погружение)
    }

    static int sum(int number){
        if (number==0) return 0;
        return number+sum(number-1);
    }
}
