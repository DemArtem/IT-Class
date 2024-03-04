package IT_Class.M24_Patterns;

public class InnerNested2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.driver.go();
    }
}

class Car{
    //Руль находится внутри автомобиля, поэтому private
    private int wheelAngle = 0; //Angle of rotating
    private boolean ignitionOn = false; //Key of ignition
    //Плейер
    private static boolean playerOn = false; //Car's player
    public  Driver driver = new Driver();

    //Inner class
    public class Driver{
        public void go(){
            wheelAngle = 30;
            ignitionOn = true;
            playerOn = true;
        }
    }
}
