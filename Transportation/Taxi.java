package Transportation;

public class Taxi extends Transportation {
    //필드
    private String destination;  //목적지
    private int distance;        //목적지까지 거리
    private int totalFee;        //누적요금
    private int charge;         //현재 요금
    private int passengers;     //현재 탑승객 수
    private String state = "일반";    //운행상태

    //생성자
    public Taxi(int number, int changeSpeed) {
        super(number, changeSpeed, 4);
    }

    //메소드----------------------
    //탑승객 잔여석 알림함수 + 목적지 거리 계산 요금 함수
    public void printTaxiInformation(int passengers, String destination, int distance){
        getPassengers(passengers);
        getDestination(destination,distance);
    }

    //탑승객 인원 및 잔여석 알림 함수
    public void getPassengers(int passengers) {
        this.passengers = passengers;
        if (maxPassengers >= passengers) {
            System.out.println("탑승객 수 = " + passengers);
            System.out.println("택시 잔여석 = " + (maxPassengers-passengers));

        } else {
            System.out.println("최대 승객 수 초과");
        }
    }

    //목적지 , 목적지까지 거리, 지불할요금 계산, 상태 출력 함수
    public void getDestination(String destination, int distance) {
        this.destination = destination;
        this.distance = distance;
        state = "운행중";
        if (distance <= 1) {
            charge = 3000;
            totalFee += 3000;
        } else {
            charge = 3000 + ((distance - 1) * 1000);
            totalFee += 3000 + ((distance - 1) * 1000);
        }
        System.out.println("기본요금 = " + 3000);
        System.out.println("목적지 = " + destination);
        System.out.println("목적지까지 거리 = " + distance + "km");
        System.out.println("지불할 요금 = " + charge);
        System.out.println("상태 = " + state);
    }

    //사용한 만큼 기름 차감하는 함수
    public void useFuel(int fuel) {
        this.fuel -= fuel;
        System.out.println("주유량 = " + this.fuel);
        System.out.println("누적 요금 = " + totalFee);
    }

    //주유하는 함수
    public void addFuel(int fuel) {
        this.fuel += fuel;
        System.out.println("주유량 = " + this.fuel);
        System.out.println("누적 요금 = " + totalFee);
    }

    public void alertState() {
        if (this.fuel >= 60) {
            state = "운행중";
            System.out.println("상태 = " + state);
            System.out.println("주유량 = " + this.fuel);
        } else if (this.fuel < 60 && this.fuel > 5) {
            state = "운행중";
            System.out.println("상태 = " + state);
            System.out.println("주유량 = " + this.fuel);
        } else {
            state = "운행불가";
            System.out.println("주유량 = " + this.fuel);
            System.out.println("상태 = " + state);
            System.out.println("주유 필요!");
        }
    }
}