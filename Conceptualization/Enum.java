public class Enum {

    public static void main(String[] args) {


        FRUIT type = FRUIT.BANANA;
        switch (type) {
            case BANANA:
                System.out.println("banana");
                break;
            case APPLE:
                System.out.println("apple");
                break;
            case LEMON:
                System.out.println("lemon");
                break;

        }


    }
}

enum FRUIT {BANANA, APPLE, LEMON}

enum COMPANY {GOOGLE, APPLE, MS}

