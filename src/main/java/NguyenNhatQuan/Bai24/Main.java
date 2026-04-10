package NguyenNhatQuan.Bai24;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        q.offer("2");
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println("After poll");
        for(String item : q) {
            System.out.println(item);
        }
    }
}
