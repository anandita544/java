import java.util.Scanner;
public class RecursivePalindrome {
    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();

        palindrome(str);
        if(palindrome(str)){
            System.out.println("string is palindrome");
        }
        else{
            System.out.println("string is not palindrome");
        }

    }
    public static boolean palindrome(String str){
        int i=0;
        int  j=str.length()-1;
        return palindrome(str,i,j);
    }
    public static boolean palindrome(String str,int i,int j){

       while(i<j)
       {
           if(str.charAt(i)!=str.charAt(j)){
               return false;
           }
           else{
               i++;
               j--;
              return palindrome(str,i,j);
           }
       }
       return true;


    }
}
