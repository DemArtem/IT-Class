package _Java.IT_Class.M05_If_Switch_Ternarn;

public class Seasons {
    public static void main(String[] args) {
        int n = 11;
        String season = "";
        switch (n) {
            case 12,1,2:
                season = "winter"; break;
            case 3,4,5:
                season = "spring"; break;
            case 6,7,8:
                season = "summer"; break;
            case 9,10,11:
                season = "autumn";
        }
        System.out.println(season);
    }
}
