import java.util.Scanner;
public class PeakElement {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of elements in the array");
        int size = sc.nextInt();
        System.out.println("enter " + size + "elements");
        int[] arr = new int [size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int peak = arr[0];
        if (size == 1) {
            System.out.println("peak element is" + arr[0]);
            System.exit(0);
        }
        for (int i = 0; i < size; i++) {

                if (i == 0) {
                    if (arr[i + 1] <= arr[i]) {
                        peak = arr[i];
                    }
                } else if (i == size - 1) {
                    if (arr[i - 1] <= arr[i]) {
                        peak = arr[i];
                    }
                } else if (arr[i - 1] <= arr[i] && arr[i + 1] <= arr[i]) {
                    peak = arr[i];
                }


            }
            System.out.println("peak element is" + peak);
        }
    }
