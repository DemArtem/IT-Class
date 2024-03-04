package IT_Class.M24_Patterns.InnerNested;
/*
В Java существуют 4 типа вложенных (nested) классов:
Статические вложенные классы
Внутренние классы
Локальные классы
Анонимные (безымянные) классы
 */
public class InnerNested {
    public static void main(String[] args) {

    }
}

class Person1{
    private String name;
    Person1(String name){
        this.name = name;
    }

    public void addAccount(String password){
        class Account{
            void display(){
                System.out.printf("Account Login: %s \t Password: %s \n", name, password);
            }
        }
    }
}
