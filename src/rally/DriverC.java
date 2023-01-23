package rally;

import exception.NoDriveLicenseException;

public class DriverC extends Driver{
    public DriverC(String name, boolean driverLicense, int experience){
        super(name, driverLicense, experience);
    }

    @Override
    public void startCar() {
        System.out.println("Начать движение");
    }

    @Override
    public void stopCar() {
        System.out.println("Остановиться");
    }

    @Override
    public void refillCar() {
        System.out.println("заправить авто");
    }
}
