package rally;

import java.util.ArrayList;

public class Car extends Transport<DriverA> {



    public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        WAGON("Универсал"),
        OFFROAD("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private final String settingBody;

        BodyType(String settingBody) {
            this.settingBody = settingBody;
        }

        @Override
        public String toString() {
            return "Тип кузова: " +
                    settingBody;
        }
    }


    private BodyType bodyType;

    public Car(String brand, String model, double engineVolume, DriverA driver) {
        super(brand, model, engineVolume, driver);
    }


    @Override
    public void startCar() {
        super.startCar();
    }

    public void stopCar() {
        super.stopCar();
    }

    @Override
    public void pitStop() {
        super.pitStop();
    }

    @Override
    public void bestLap() {
        int maxBound = 8;
        int minBound = 3;
        int bestTime = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время для " + getBrand() + " " + getModel() + " " + ": " + bestTime + " минут");
    }

    @Override
    public void maxSpeed() {
        int maxBound = 250;
        int minBound = 140;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость у " + getBrand() + " " + getModel() + " " + ": " + maxSpeed + "км");
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void printType() {
        if (bodyType == null){
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(bodyType);
        }
    }
    @Override
    public void testCar() {
        System.out.println("Пройти диагностику");
    }


    @Override
    public String toString() {
        return "Тип кузова: " + bodyType.settingBody + ". Машина: " +
                "Бренд = " + getBrand() +
                ", модель = " + getModel() +
                ", мощность двигателя = " + getEngineVolume();

    }

}
