package Transportation;

public class Transportation {
    //필드
    int number;    //차 번호
    int fuel;      //차 연료
    int speed;    //차 속도
    int changeSpeed;   //변경된 차 속도
    int maxPassengers;  //최대 탑승객인원

    //생성자
    public Transportation(int number, int fuel, int speed, int changeSpeed, int maxPassengers){
        this.number = number;
        this.fuel = fuel;
        this.speed = speed;
        this.changeSpeed = changeSpeed;
        this.maxPassengers = maxPassengers;
    }
    //생성자 오버로딩
    public Transportation(int number, int changeSpeed, int maxPassengers){
        this(number, 100 , 0, changeSpeed,maxPassengers);
    }

    //운행시작 함수
    public void startDrive(){
        System.out.println("운행 시작합니다.");
    }
}
