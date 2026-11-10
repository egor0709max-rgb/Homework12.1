package app;

public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Елекрика увімкнена");
    }

    private void startCommand() {
        System.out.println("Команда запуску отримана ");
    }

    private void startFuelSystem() {
        System.out.println("Палевна система готова");
    }
}
