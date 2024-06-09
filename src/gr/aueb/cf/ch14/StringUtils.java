package gr.aueb.cf.ch14;

public class StringUtils {

    public static String reverseString(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return reversed;
    }

    public static String uppercaseString(String str) {
        String uppercase = str.toUpperCase();
        return uppercase;
    }

    public static boolean isRegressiveString(String str) {
        String reverse = reverseString(str);
        return str.equals(reverse);
    }

    public static void main(String[] args) {
        String string = "hello";
        System.out.println(reverseString(string));
        System.out.println(uppercaseString(string));
    }
}
