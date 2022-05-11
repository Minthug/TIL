// 앞으로 꾸준히 작성해서 OOP에 관한 시각을 넓혀보자

public class Example01 {
    public static void main(String[] args) {

        CellPhone cellPhone = new CellPhone("Apple","Sliver","Iphone 13 mini",1000,true,true);

        System.out.println("내 핸드폰은 " + cellPhone.modelName + " 입니다. " + "색상은 " + cellPhone.color + "입니다."
        + " 제조사는 " + cellPhone.makeby + " 입니다.");

        cellPhone.power();
        cellPhone.takePicture();
        cellPhone.connectPower();
        cellPhone.speak();
    }
}


class CellPhone {
   public String makeby;
   public String color;
   public String modelName;
   public int price;
   public boolean camera;
   public boolean mic;

   CellPhone(String makeby, String color, String modelName, int price, boolean camera, boolean mic){
    this.makeby = makeby;
    this.color = color;
    this.modelName = modelName;
    this.price = price;
    this.camera = camera;
    this.mic = mic;
    }

    void power() {
        System.out.println("전원이 켜집니다");
    }
    void connectPower() {
        System.out.println("충전기 연결이 되었습니다.");
    }
    void takePicture() {
        System.out.println("사진을 찍습니다.");
    }
    void speak() {
        System.out.println("마이크를 사용합니다");
    }

}
