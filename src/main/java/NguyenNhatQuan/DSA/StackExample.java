package NguyenNhatQuan.DSA;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        Iterator<Integer> it = s.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
