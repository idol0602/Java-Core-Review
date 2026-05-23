package NguyenNhatQuan.DSA;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.StreamSupport;

public class StringExample {
    public static void main(String[] args) {
        String str = "  Nguyen Nhat Quan 2026  ";
        System.out.println(str.length());
        System.out.println(str.isEmpty());
        System.out.println("Quan".equals("quan"));
        System.out.println("Quan".equalsIgnoreCase("quan"));
        System.out.println(str.charAt(5));
        System.out.println(str.indexOf("n"));
        System.out.println(str.lastIndexOf("n"));
        System.out.println(str.contains("Nhat"));
        System.out.println(str.startsWith("Nguyen"));
        System.out.println(str.trim());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.replace("2026","developer"));

        String languages = "Java,Spring,React,PostgreSQL";
        String[] arr = languages.split(",");
        System.out.println(arr.toString());
        //join
        String joined = String.join("-",arr);
        String reversed = new StringBuilder(languages).reverse().toString();

        System.out.print(languages.substring(languages.length() - 1));

        Set<String> set = new HashSet<>();

        String str2 = "JAVA";
        for(int i=0; i<str2.length(); i++) {
            for(int j=i+1; j<=str2.length(); j++) {
                set.add(str2.substring(i,j));
            }
        }
        System.out.println(set.toString());
    }
}
