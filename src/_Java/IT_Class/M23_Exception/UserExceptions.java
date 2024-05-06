package _Java.IT_Class.M23_Exception;

import static java.lang.Character.isLowerCase;

public class UserExceptions {
    public static void main(String[] args) throws NotEvenException, NotCapitalLetterException {
        int a = 2; //проверка на четность
        if (a % 2 == 1) throw new NotEvenException("not even");

        new Person("Person");//проверка на регистр первой буквы
    }
}

class NotEvenException extends Exception {
    public NotEvenException(String s) {
        super(s);
    }
}

class Person {
    private String name = "";

    Person(String name) throws NotCapitalLetterException {
        this.name = name;
        validateName();
    }

    private void validateName() throws NotCapitalLetterException {
        if (isLowerCase(name.charAt(0))) {
            throw new NotCapitalLetterException("The first letter of name " + name + " must be capital");
        }
    }
}

class NotCapitalLetterException extends Exception {

    NotCapitalLetterException(String str) {
        super(str);
    }
}
