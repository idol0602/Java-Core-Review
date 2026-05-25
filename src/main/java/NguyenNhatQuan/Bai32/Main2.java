package NguyenNhatQuan.Bai32;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.execute(()->{
            System.out.println("oke");
        });

        Future<Integer> future = executorService.submit(() -> {
            int x = 5/0;
            return x;
        });

        try {
            Integer res = future.get();
        } catch (Exception e) {
            System.out.println("Loi");
        } finally {
            executorService.close();
        }
    }
}
