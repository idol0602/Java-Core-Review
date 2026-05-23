package NguyenNhatQuan.DSA;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Thứ 2");
        deque.addLast("Thứ 3");
        deque.offerFirst("Thứ 1");
        deque.offerLast("Thứ 4");

        System.out.println("Deque ban đầu " + deque);
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        String first = deque.pollFirst();
        String last = deque.pollLast();

        System.out.println("Vừa xóa đầu " + first);
        System.out.println("Vừa xóa cuối " + last);
        System.out.println("Deque còn lại " + deque);

        System.out.println("Deque có rỗng ko " + deque.isEmpty());
    }
}
