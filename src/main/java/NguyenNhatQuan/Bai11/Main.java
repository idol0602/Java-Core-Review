package NguyenNhatQuan.Bai11;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    private static final AtomicInteger count = new AtomicInteger(0);

    public static void increment() {
        count.incrementAndGet();
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) increment();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count);
    }
}
