package gr.aueb.cf.ch14;

public class ValidationUtils {

    public static boolean isStringBetween1And31(String str) {
        return !str.isEmpty() && str.length() <= 31;
    }

    public static boolean isNumberBetween1And10(int num) {
        return num >= 1 && num<= 10;
    }
}
