package NguyenNhatQuan.Bai8;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {

//        Counter counter = new Counter();
//
//        Thread threadA = new Thread(()-> {
//            for(int i=0; i<100; i++) {
//                counter.increment();
//            }
//        });
//
//        Thread threadB = new Thread(()-> {
//            for(int i=0; i<100; i++) {
//                counter.increment();
//            }
//        });
//
//        threadA.start();
//        threadB.start();
//        threadA.join();
//        threadB.join();
//        System.out.println(counter.count);

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(()-> {
            System.out.println("Thread running");
        });
        executorService.shutdown();
    }
}