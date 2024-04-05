import java.util.Scanner;
public class Palindrome1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println("string is plaindrome");
        }
        else {
            System.out.println("string is not palindrome");
        }


    }
}
