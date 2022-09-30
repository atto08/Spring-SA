package Transportation;

public class Bus extends Transportation {
    private int passengers;  //현재 탑승객 수
    private int charge = 0;  //누적 요금
    private String state = "운행";  //운행상태

    //생성자
    public Bus(int number, int changeSpeed) {
        super(number, changeSpeed, 30);
    }

    //메소드
    //탑승승객 인원, 잔여석, 누적요금 계산 및 출력 함수.
    public void getPassengers(int passengers) {
        this.passengers = passengers;
        if (maxPassengers >= passengers) {
            System.out.println("탑승객 수 = " + passengers);
            maxPassengers -= passengers;
            System.out.println("버스 잔여석: " + maxPassengers);
            charge += passengers * 1000;
            System.out.println("요금 = " + passengers * 1000);
        } else {
            System.out.println("최대 승객 수 초과");
        }
    }

    //사용한 만큼 기름 차감하고 남은 주유량 alert하는 함수
    public void useFuel(int fuel) {
        this.fuel -= fuel;
        alertState();
    }

    //주유하고 주유량 alert하는 함수
    public void addFuel(int fuel) {
        this.fuel += fuel;
        alertState();
    }

    //주유량 알려주는 함수.
    public void alertState() {
        if (this.fuel >= 60) {
            state = "운행";
            System.out.println("상태 = " + state);
            System.out.println("주유량 = " + this.fuel);
        } else if (this.fuel < 60 && this.fuel > 5) {
            state = "차고지행";
            System.out.println("상태 = " + state);
            System.out.println("주유량 = " + this.fuel);
        } else {
            System.out.println("주유 필요!");
        }
    }
}
