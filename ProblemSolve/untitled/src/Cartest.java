public class Cartest {
    public static void main(String[] args) {

        Vehicle benz = new Vehicle("CLS","black",230); // 객체 생성

        System.out.println("차의 모델은" + benz.vehicleModel + "이며, " + "색상은 " + benz.color + " 입니다.");
        benz.vehiclePower();  // 메소드 호출
        benz.accelerate();
        benz.stopVehicle();
    }
}

class Vehicle {
    public String vehicleModel; // 필드 선언
    public String color;
    public int maxSpeed;

    public Vehicle(String vehicleModel, String color, int maxSpeed) { // 인스턴스 초기화를 위한 생성자 함수
        this.vehicleModel = vehicleModel;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    void vehiclePower() { // 메서드 선언
        System.out.println("시동을 걸었습니다.");
    }

    void accelerate() {
        System.out.println("가속합니다.");
    }

    void stopVehicle() {
        System.out.println("멈춥니다.");
    }
}