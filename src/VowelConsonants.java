import java.util.Scanner;

public class VowelConsonants {
    public static void main(String[] args) {
        int vowelCount = 0;
        int consonantCount = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        str = str.toLowerCase();
        for (int i = 0; i < str.length() - 1; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else if (Character.isLetter(ch)) {
                consonantCount++;
            }
        }
        System.out.println(" total number of vowels in a string" + " " + vowelCount);
        System.out.println(" total number of consonants in a string" + " " + consonantCount);
    }

}
