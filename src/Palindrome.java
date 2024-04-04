import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        int i = 0, flag = 0;
        int j = str.length() - 1;
        while (i < j && flag == 0) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = 1;
            } else {
                i++;
                j--;
            }
        }

        if (flag == 0) {
            System.out.println("string is palindorme");
        } else {
            System.out.println("string is not palindrome");
        }
    }

}

