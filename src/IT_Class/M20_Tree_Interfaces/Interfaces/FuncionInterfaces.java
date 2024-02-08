package IT_Class.M20_Tree_Interfaces.Interfaces;

public class FuncionInterfaces {
    public static void main(String[] args) {
        //создаем лампочку (функциональное выражение)
        ElectricalDevice lamp = state -> {
            System.out.println(state ? "Лампочка включена" : "Лампочка выключена");
        };

        //Вкл или Выкл кнопку
        Button button = new Button(lamp);
        button.switchOnOff();
        button.switchOnOff();
        System.out.println("");

        //Вкл или Выкл утюг
        Button button1 = new Button(new Iron()); //анонимный объект
        button1.switchOnOff();
        button1.switchOnOff();
        System.out.println("");

        //Вкл или Выкл фен
        Button button2 = new Button(new ElectricalDevice() {
            @Override
            public void switchOnOff(boolean state) {
                System.out.println(state ? "Фен включен" : "Фен выключен");
            }
        });
        button2.switchOnOff();
        button2.switchOnOff();
        System.out.println("");
    }
}

//электрическая кнопка
class Button{
    protected boolean state = false; //по умолчанию кнопка выкл
    private ElectricalDevice device;
    public Button(ElectricalDevice device) { //конструктор
        this.device = device;
    }

    public void switchOnOff(){
        state = !state;
        if (state)
            System.out.println("Кнопка включена");
        else
            System.out.println("Кнопка выключена");
        device.switchOnOff(state);
    }
}

@FunctionalInterface //аннотация (только один метод)
interface ElectricalDevice{
    void switchOnOff(boolean state);
}

class Iron implements ElectricalDevice{
    @Override
    public void switchOnOff(boolean state) {
        System.out.println(state ? "Утюг включен" : "Утюг выключен");
    }
}