package NguyenNhatQuan;

public class Main {
    interface Greeting {
        void sayHello();
    }

    public static void main(String[] args) {

        //Anonymous Inner class
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("oke");
            }
        };

        greeting.sayHello();
    }
}