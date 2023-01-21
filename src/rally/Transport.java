package rally;

import java.util.ArrayList;

public abstract class Transport<T extends Driver> implements Competing {

    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;
    private final ArrayList mechanics;

    private static final double DEFAULT_ENGINE_VALUE = 1.5;

    public Transport(String brand, String model, double engineVolume, T driver) {
        this.brand = brand;
        this.model = model;
        setEngineVolume(engineVolume);
        setDriver(driver);
        this.mechanics = new ArrayList();
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = DEFAULT_ENGINE_VALUE;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }


    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }


    public void startCar() {
        System.out.println(getBrand() + " " + model + ": начать движение");
    }

    public void stopCar() {
        System.out.println(getBrand() + " " + model + ": закончить движение");
    }

    public void pitStop() {
        System.out.println("Пит-стоп");
    }

    public abstract void printType();

    public abstract void testCar();

    public ArrayList getMechanics() {
        return new ArrayList (mechanics);
    }

    public void setMechanics(Mechanic mechanics) {
        this.mechanics.add(mechanics);
    }

    public void getAllTeam (){
        System.out.println("У транспорта: " + getBrand() + " " + getModel() + " за рулем " + getDriver() + ", а обслуживает: " + getMechanics());
    }
}
