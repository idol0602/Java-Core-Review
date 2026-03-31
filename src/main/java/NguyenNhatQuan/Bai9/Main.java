package NguyenNhatQuan.Bai9;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Callable<Integer> task1 = () -> {
            int sum = 0;
            for(int i=1; i<=10; i++) {
                sum += i;
            }
            return sum;
        };

        Callable<Integer> task2 = () -> {
            int sum = 0;
            for(int i=1; i<=10; i++) {
                sum += i;
            }
            return sum;
        };

        Future<Integer> future1 = executorService.submit(task1);
        Future<Integer> future2 = executorService.submit(task2);

        try {
            Integer result1 = future1.get();
            Integer result2 = future2.get();
            System.out.println(result2 + result1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }
}
