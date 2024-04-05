import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String Str=sc.nextLine();
        String reverseStr="";
        for (int i= Str.length()-1;i>=0;i--){
            reverseStr+=Str.charAt(i);
        }
        System.out.println("string before reversring"+ " "+Str);
        System.out.println("string after reversring"+ " "+reverseStr);

    }
}
