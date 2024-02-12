package IT_Class.M08_For;
//Кузнечик прыгает на 1 см, затем на 2, на 3 и т.д.
//Через сколько прыжков он взберется на травинку высотой 50 см?

public class GrasshopperWhile {
    public static void main(String[] args) {
        int height = 0;//на земле
        int hope = 1;//первый прыжок
        for (int i = 1; i < 20; i++) {
            height += hope;//след прыжок на единицу вверх
            hope++;
            if (height > 50) height = 50;
            System.out.println(i++ + " " + height);
            if (height == 50)
                break;
        }

        height = 0;
        hope = 1;
        int i =1;
        while(height<50){
            height += hope;//след прыжок на единицу вверх
            hope++;
            if (height > 50) height = 50;
            System.out.println(i++ + " " + height);

        }
    }
}