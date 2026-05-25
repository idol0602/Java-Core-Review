package NguyenNhatQuan.Bai32;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for(int i = 1; i<=10; i++) {
            final int soBan = i; // Biến hằng để dùng trong lambda

            Runnable congViec = () -> {
                // In ra tên của nhân viên (luồng) đang phục vụ bàn này
                String tenNhanVien = Thread.currentThread().getName();
                System.out.println(tenNhanVien + " đang phục vụ bàn số " + soBan);

                try {
                    // Giả lập thời gian phục vụ mất 2 giây
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("--- " + tenNhanVien + " đã xong bàn " + soBan + " ---");
            };

            executorService.execute(congViec);
        }

        executorService.shutdown();
    }
}
