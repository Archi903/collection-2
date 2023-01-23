package rally;

import exception.NoDriveLicenseException;

public abstract class Driver {
    private final String name;
    private final boolean driverLicense;
    private final int experience;

    public Driver(String name, boolean driverLicense, int experience){
        this.name = name;
        this.experience = experience;
        this.driverLicense = driverLicense;

    }

    public String getName() {
        return name;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public int getExperience() {
        return experience;
    }


    public abstract void startCar();

    public abstract void stopCar();

    public abstract void refillCar();

    @Override
    public String toString() {
        return "Водитель " + name;
    }

    public void check() throws NoDriveLicenseException {
        if (!driverLicense){
            throw new NoDriveLicenseException("Необходимо указать тип прав!", this);
        }
    }
}
