package NguyenNhatQuan.DSA;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println(queue.peek());

        while(!queue.isEmpty()) {
            String processed = queue.poll();
            System.out.println("Đang phục vụ " + processed);
        }

        System.out.println(queue.peek());

        System.out.println("Hàng đợi rổng " + queue.isEmpty());
        System.out.println(queue.poll());
    }
}
