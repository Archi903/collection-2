package rally;

import java.util.ArrayList;
import java.util.List;

public class ListCars {

    private final List<Transport> allTransport = new ArrayList<>();

    public ListCars() {
    }

    public List<Transport> getAllTransport() {
        return allTransport;
    }


    public void addCar(Transport transport) {
        this.allTransport.add(transport);
    }


}
