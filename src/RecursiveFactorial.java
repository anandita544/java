import java.math.BigInteger;
import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        BigInteger num = sc.nextBigInteger();

        if (num.compareTo(BigInteger.ZERO) >= 0 && num.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
            BigInteger result = factorial(num.intValue());
            System.out.println("Factorial of " + num + " is " + result);
        } else if (num.compareTo(BigInteger.ZERO) >= 0) {
            BigInteger result = factorial(num);
            System.out.println("Factorial of " + num + " is " + result);
        } else {
            System.out.println("Factorial is not defined for negative numbers.");
        }
    }

    public static BigInteger factorial(BigInteger num) {
        if (num.equals(BigInteger.ZERO) || num.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        } else {
            return num.multiply(factorial(num.subtract(BigInteger.ONE)));
        }
    }

    public static BigInteger factorial(int num) {
        return factorial(BigInteger.valueOf(num));
    }
}
