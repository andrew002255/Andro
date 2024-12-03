package Lesson16;

public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome("Лидер Венере не вредил"));
        System.out.println(isPalindrome("Могу добавить"));
        System.out.println(isPalindrome("Лазер резал"));
    }

    public static boolean isPalindrome(String str) {
        String result = "";
        str = str.toLowerCase().replace(" ", "");
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        return str.equals(result);

    }
}
