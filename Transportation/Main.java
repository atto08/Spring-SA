package Transportation;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus(1234,50);
        Taxi taxi = new Taxi(7896,80);
        System.out.println("버스시작--------------------");
        bus.startDrive();
        bus.getPassengers(20);
        bus.useFuel(50);
        bus.addFuel(10);
        System.out.println("---------------------버스끝");
        System.out.println("택시시작--------------------");
        taxi.startDrive();
        taxi.getPassengers(3);
        taxi.getDestination("서울",10);
        taxi.useFuel(70);
        taxi.getPassengers(3);
        taxi.getDestination("안산",15);
        taxi.useFuel(30);
        taxi.alertState();
        System.out.println("---------------------택시끝");
    }
}
