package NguyenNhatQuan.JavaCore.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Python", "C++", "JavaScript", "Go", "Java");
        List<String> result = languages
                .stream()
                .filter(lang -> lang.length() > 3)
                .distinct()
                .map(String :: toLowerCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);

        List<Integer> list = languages
                .stream()
                .map(lang -> lang.length())
                .collect(Collectors.toList());
        System.out.println(list);

        Map<Integer, List<String>> groupedByLength = languages
                .stream()
                .collect(Collectors.groupingBy(lang -> lang.length()));
        System.out.println(groupedByLength);
    }
}
