package Lesson15;

public class Main {
    public static void main(String[] args) {

        int lowercase = 0;
        int uppercase = 0;
        char ch;
        String s = "\"Hello, World\"";
        System.out.println("Дана строка - " + s);

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            int c = ch;

            if (c >= 'a' && c <= 'z') {
                lowercase++;
            } else if (c >= 'A' && c <= 'Z') {
                uppercase++;

            }
        }
        System.out.print("Количество строчных букв - " + lowercase + ", " + "количество прописных букв - " + uppercase);

    }
}