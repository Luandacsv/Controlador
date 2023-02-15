public class Start {

    public static void main(String[] args) {

        ParkingController parking = new ParkingController(100);

        parking.enter(22);

        parking.exit(2);
    }

}
