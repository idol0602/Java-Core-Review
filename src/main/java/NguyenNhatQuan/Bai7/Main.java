package NguyenNhatQuan.Bai7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<Integer>();
        ls.add(1);
        ls.add(3);
        ls.add(2);
        ls.add(4);
        ls.stream().filter(p -> p % 2 == 0).map(p -> p * 2).sorted((a,b) -> Integer.compare(b,a)).forEach(System.out::println);

        List<List<Integer>> ls2 = new ArrayList<>();
        ls2.add(List.of(1,2,3));
        ls2.add(List.of(4,5,6));
        ls2.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
