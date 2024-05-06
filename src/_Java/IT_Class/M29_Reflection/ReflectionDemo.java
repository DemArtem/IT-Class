package _Java.IT_Class.M29_Reflection;

import java.lang.reflect.Field;

public class ReflectionDemo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Clazz clazz = new Clazz();
        int number = clazz.getNumber();
        System.out.println(number);

        Field field = clazz.getClass().getDeclaredField("name");
        //field.setAccessible(true);
        field.set(clazz,1);
        System.out.println((int)field.get(clazz));
    }
}
class Clazz {
    private int number;
    private String name = "default";
    private int value;

    //Закомментировать
    public Clazz(int number, String name, int value) {
        this.number = number;

        this.name
                = name;
        this.value = value;
    }

    public Clazz(){} //Добавить позже

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {

        this.name
                = name;
    }

    private void printData() {
        System.out.println("number=" + number + ", name=" + name+ ", value="+ value);
    }
}