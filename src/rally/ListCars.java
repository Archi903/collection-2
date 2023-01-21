package rally;

import java.util.ArrayList;

public class ListCars {

    private final ArrayList<Transport> allTransport;

    public ListCars() {
        this.allTransport = new ArrayList<>();
    }

    public ArrayList<Transport> getAllTransport() {
        return new ArrayList<>(allTransport);
    }

    public void addCar(Transport transport) {
        this.allTransport.add(transport);
    }


}
