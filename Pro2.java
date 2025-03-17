
import java.util.Scanner;

/*
2.	Write a program to read two 1-D arrays of numbers, and 
perform element-wise division on these arrays. Handle arithmetic
 exception & array index out of bound exception.
 */

public class Pro2 {

    public static double[] readArray() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of element of array:-");
        int x = sc.nextInt();

        double arr[] = new double[x];

        for (int i = 0; i < x; i++) {
            System.out.println("enter " + i + " element:-");
            try {
                arr[i] = sc.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter valid numbers.");
                return readArray();
            }
        }

        return arr;
    }

    public static void elementWiseDivision(double arr1[], double arr2[]) {
       
        try {
            int len = Math.min(arr1.length, arr2.length);
            for (int i = 0; i < len; i++) {
                try {

                    if (arr2[i] == 0) {
                        System.out.println("Division by zero");
                    } else {

                        System.out.println("result is :-" + (arr1[i] / arr2[i]));
                    }
                } catch (ArithmeticException e) {
                    System.out.println("Arithmetic exception ");
                }
            }

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: One of the arrays is shorter than the other.");
        }

    }

    public static void main(String[] args) {

        double a1[] = readArray();
        double a2[] = readArray();
        elementWiseDivision(a1, a2);

    }
}
