abstract class Gadgets {
    abstract void turnOn();
    abstract void turnOff();
}

class TVRemote extends Gadgets {
    @Override
    void turnOn() {
        System.out.println("TV is turned ON.");
    }
    @Override
    void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}

class ACRemote extends Gadgets {
    @Override
    void turnOn() {
        System.out.println("AC is turned ON.");
    }
    @Override
    void turnOff() {
        System.out.println("AC is turned OFF.");
    }
}

class FanRemote extends Gadgets {
    @Override
    void turnOn() {
        System.out.println("Fan is turned ON.");
    }
    @Override
    void turnOff() {
        System.out.println("Fan is turned OFF.");
    }
}

class CoolerRemote extends Gadgets {
    @Override
    void turnOn() {
        System.out.println("Cooler is turned ON.");
    }
    @Override
    void turnOff() {
        System.out.println("Cooler is turned OFF.");
    }
}

public class Main {
    public static void main(String[] args) {
        Gadgets remote;

        remote = new TVRemote();
        remote.turnOn();
        remote.turnOff();

        remote = new ACRemote();
        remote.turnOn();
        remote.turnOff();

        remote = new FanRemote();
        remote.turnOn();
        remote.turnOff();

        remote = new CoolerRemote();
        remote.turnOn();
        remote.turnOff();
    }
}
