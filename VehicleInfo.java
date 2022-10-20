import java.io.Serializable;

public class VehicleInfo implements Serializable {

    Integer numberOfWheels;
    Integer mileaga;
    String nameOfvehicle;

    VehicleInfo(String nameOfvehicle, Integer mileaga, Integer numberOfWheels)
    {
        this.nameOfvehicle = nameOfvehicle;
        this.numberOfWheels = numberOfWheels;
        this.mileaga = mileaga;
    }
}
