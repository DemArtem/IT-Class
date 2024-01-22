package M15_Strings;

public class MexicanWave {
    public static void main(String[] args) throws InterruptedException {
        //Hello, hEllo, heLlo, helLo, hellO
        String s = "hello";
        System.out.print(s);
        int index = 0;
        while (true) {
            Thread.sleep(300); //замедление программы
            for (int i = 0; i < 5; i++) {
                System.out.print("\b");
            }
            StringBuilder sb = new StringBuilder(s);
            Character c = sb.charAt(index);
            sb.setCharAt(index,c.toString().toUpperCase().charAt(0));
            System.out.print(sb);
            index++;
            if (index == 5) index = 0;
        }
    }
}