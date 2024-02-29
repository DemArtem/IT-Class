package IT_Class.M23_Exception;

import java.lang.reflect.Executable;

public class ThrowsExceptions {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println(getSeasons(-1));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        getMethodCaller();
    }

    static String getSeasons(int monthNumber) {
        if (monthNumber<1 || monthNumber>12)
            throw new IllegalArgumentException(String.format("month: %d is invalid, the number should be in a range 1..12", monthNumber));
        if (monthNumber < 3) return "winter";
        else if (monthNumber < 6) return "spring";
        else if (monthNumber < 9) return "summer";
        else if (monthNumber < 12) return "autumn";
        else return "winter";
    }

    static void getMethodCaller() throws Exception {
        Exception e = new Exception("my message");

        //раскрутка стека
        String className = e.getStackTrace()[0].getClassName();
        System.out.println(className);

        String methodName = e.getStackTrace()[1].getMethodName();
        System.out.println(methodName);

        int line = e.getStackTrace()[0].getLineNumber();
        System.out.println(line);
    }
}
