package rally;

import exception.NoDriveLicenseException;

import java.util.Set;


public class Main {
    public static void main(String[] args){

        ListCars cars = new ListCars();



        DriverA john = new DriverA("John", false, 5);
        DriverB smith = new DriverB("Smith", true, 10);
        DriverC alex = new DriverC("Alex", true, 7);

        Car lada = new Car("Lada", "Granta", 1.6, john);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 5, john);
        Car bmw = new Car("BMW", "Z8", 4, john);
        Car lexus = new Car("Lexus", "IS 350", 3.5, john);

        Bus gaz = new Bus("Газ", "Сибирь", 3, alex);
        Bus mercedes = new Bus("Mercedes", "Viano", 3.8, alex);
        Bus volkswagen = new Bus("Volkswagen", "Transporter", 3.5, alex);
        Bus ford = new Bus("Ford", "Escaper", 2.8, alex);

        Track gazel = new Track("Газель", "Урал", 3, smith);
        Track volvo = new Track("Volvo ", "Siber", 6.5, smith);
        Track fiat = new Track("Fiat", "Drive", 5, smith);
        Track hyundai = new Track("Hyundai", "Pride", 4.3, smith);

        lada.setBodyType(Car.BodyType.HATCHBACK);
        bmw.setBodyType(Car.BodyType.COUPE);
        audi.setBodyType(Car.BodyType.WAGON);
        lexus.setBodyType(Car.BodyType.SEDAN);

        cars.addCar(lada);
        cars.addCar(bmw);
        cars.addCar(audi);
        cars.addCar(lexus);
        cars.addCar(gaz);
        cars.addCar(mercedes);
        cars.addCar(volkswagen);
        cars.addCar(ford);
        cars.addCar(gazel);
        cars.addCar(volvo);
        cars.addCar(fiat);
        cars.addCar(hyundai);

        System.out.println("Количество машин в списке - " + cars.getAllTransport().size());


        Mechanic<Car> willSmith = new Mechanic<>("Will Smith", "Warner");
        Mechanic<Car> jackLite = new Mechanic<>("Jack Lite", "Mobil");
        Mechanic<Car> ivanIvanov = new Mechanic<>("Ivan Ivanov", "Nokian");
        Mechanic<Bus> petrovVladimir = new Mechanic<>("Petro Ivan", "Nokian");
        Mechanic<Bus> komkovDmitry = new Mechanic<>("Komkov Dmitry", "Gaz");
        Mechanic<Bus> sidorovPavel = new Mechanic<>("Sidorov Pavel", "Uaz");
        Mechanic<Track> sazonovRoman = new Mechanic<>("Sazonov Roman", "Sever");
        Mechanic<Track> bornJason = new Mechanic<>("Born Jason", "JBL");
        Mechanic<Track> stathamJason = new Mechanic<>("Statham Jason", "Audi");


        lada.setMechanics(lada, willSmith);
        lada.setMechanics(lada,bornJason);
        lexus.setMechanics(lexus, willSmith);
        bmw.setMechanics(bmw,ivanIvanov);
        volvo.setMechanics(volvo,stathamJason);
        lada.getAllTeam(lada);
        volvo.getAllTeam(volvo);
        lexus.getAllTeam(lexus);
       System.out.println(lada.getMechanics().size());


    }


    public static void check(Driver... driver) {
        for (Driver driver1 : driver) {
            try {
                driver1.check();
                System.out.println(driver1.isDriverLicense());
            } catch (NoDriveLicenseException e) {
                System.out.println("Необходимо указать тип прав!");
            }
        }
    }


    public static void driverAnnounce(Transport<?> transport) {
        System.out.println(transport.getDriver() + " управляет автомобилем " + transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде");
    }
    public void nameOfDriverAndMechanics(Transport<?> transport){
        System.out.println("Автомобиль " + transport.getBrand() + " " + transport.getModel() + ": водитель - " + transport.getDriver() + ", Механик: ");
    }




}