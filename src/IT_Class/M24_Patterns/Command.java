package IT_Class.M24_Patterns;

import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;
import java.util.List;

public class Command {
    public static void main(String[] args) {
        Remote remote = new Remote();
        Lamp lamp = new Lamp();
        Fan fan = new Fan();
        remote.addCommand(new CommandLampOn(lamp));
        remote.addCommand(new CommandLampOff(lamp));
        remote.addCommand(new CommandLampDim(lamp));

        remote.execute(0);
        remote.execute(2);
    }
}

interface ICommand{
    void execute();
}

class Remote{
    private List<ICommand> commands = new ArrayList<>();
    public void addCommand(ICommand command){
        commands.add(command);
    }

    public void execute(int index){
        commands.get(index).execute();
    }
}

class Lamp {
    public void turnOn() {
        System.out.println("The lamp is turned on");
    }

    public void turnOff() {
        System.out.println("The lamp is turned off");
    }

    public void turnDim() {
        System.out.println("The lamp is dimmed");
    }
}

class Fan {
    public void spinOn() {
        System.out.println("The fan is spinning");
    }

    public void spinOff() {
        System.out.println("The fan is not spinning");
    }
}

class CommandLampOn implements ICommand{

    private Lamp lamp;
    CommandLampOn(Lamp lamp) {
        this.lamp = lamp;
    }
    @Override
    public void execute() {
        lamp.turnOn();
    }
}

class CommandLampOff implements ICommand {
    private Lamp lamp;

    CommandLampOff(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.turnOff();
    }
}

class CommandLampDim implements ICommand {
    private Lamp lamp;

    CommandLampDim(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.turnDim();
    }
}

class CommandFanOn implements ICommand {
    private Fan fan;

    CommandFanOn(Fan fan) {

        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.spinOn();
    }
}