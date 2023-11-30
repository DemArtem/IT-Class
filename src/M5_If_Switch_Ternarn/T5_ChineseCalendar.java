package M5_If_Switch_Ternarn;

/*
Организовать ввод с клавиатуры даты рождения человека. Программа должна вывести знак зодиака и название
года по китайскому календарю.
 */
public class T5_ChineseCalendar {
    public static void main(String[] args) {
        //"Крыса","Бык","Тигр","Кролик","Дракон","Змея","Лошадь","Овца","Обезьяна","Петух","Собака","Свинья"
        String[] yearsName ={"Крыса","Бык","Тигр","Кролик","Дракон","Змея","Лошадь","Овца","Обезьяна","Петух","Собака","Свинья"};
        int yearStart = 2019;
        int year = 2023;
        int index = 0;
        if (year>=yearStart){
            index = (year-yearStart)%12;
        }
        else {
            index = 12-(yearStart-year)%12;
        }
        System.out.println(yearsName[index]);
    }
}
