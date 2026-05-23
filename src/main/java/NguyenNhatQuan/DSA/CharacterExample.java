package NguyenNhatQuan.DSA;

public class CharacterExample {
    public static void main(String[] args) {
        // chuyển ky tu so sang int
        char c  = '5';
        int num = c - '0';
        // chuyen in sang ky tu so
        int num1 = 9;
        char c1 = (char)(num1 + '0');
        System.out.println(c1);
        // bang tuan suat
        int[] freq = new int[26];
        char c2 = 'b';
        freq[c2 - 'a']++;
        Character.isLetter('a');
        Character.isDigit('9');
        Character.isLetterOrDigit('a');
        Character.isWhitespace(' ');
        Character.isUpperCase('A');
        Character.isLowerCase('c');
    }
}
