package rally;

public class Bus extends Transport<DriverC> {

    public enum BodyType {
        VERYSMALL(null, 10),
        SMALL(null, 25),
        MEDIUM(40, 50),
        BIG(60, 80),
        VERYBIG(100, 120);


        private final Integer lowBound;
        private final Integer topBound;

        BodyType(Integer lowBound, Integer topBound) {
            this.lowBound = lowBound;
            this.topBound = topBound;
        }
        @Override
        public String toString() {
            return String.format("Вместимость: %s %s", (lowBound != null ? "от " + lowBound + " мест" : ""),
                    topBound != null ? "до " + topBound + " мест" : "");

        }

    }

    private BodyType bodyType;

    public Bus(String brand, String model, double engineVolume, DriverC driver) {
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
    public void bestLap() {
        int maxBound = 15;
        int minBound = 10;
        int bestTime = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время для " + getBrand() + " " + getModel() + " " + ": " + bestTime + " минут");
    }

    @Override
    public void maxSpeed() {
        int maxBound = 130;
        int minBound = 90;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость у " + getBrand() + " " + getModel() + " " + ": " + maxSpeed + "км");
    }


    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public void printType() {
        if (bodyType == null){
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(bodyType);
        }
    }

    @Override
    public String toString() {
        return "Вместимость: " + ". Машина: " +
                ", Бренд = " + getBrand() +
                ", модель = " + getModel() +
                ", мощность двигателя = " + getEngineVolume();
    }
    @Override
    public void testCar() {
        System.out.println("Пройти диагностику");
    }


}

