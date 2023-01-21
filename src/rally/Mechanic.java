package rally;

import java.util.ArrayList;
import java.util.List;

public class Mechanic<T extends Transport> {

    private final String name;
    private final String company;

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }


    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }


    public void doService(T car){
        System.out.println("Механик " + getName() + " приступает к обслуживанию ТС: " + car.getBrand() + " " + car.getModel());
    }

    public void fixCar(T car){
        System.out.println("Механик " + getName() + " Ремонту ТС: " + car.getBrand() + " " + car.getModel());
    }

    @Override
    public String toString() {
        return "Механик: " + name + " из компании - " + getCompany();
    }
}
