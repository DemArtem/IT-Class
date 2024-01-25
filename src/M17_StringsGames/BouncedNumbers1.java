package M17_StringsGames;

public class BouncedNumbers1 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            if ((Math.abs(i/100 - i/10%10)==1)&&(Math.abs(i%10 - i/10%10)==1)){
                System.out.println(i);
                count++;
                if (count >= 10){
                    break;
                }
            }
        }
    }
}
