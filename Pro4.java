
import java.util.Scanner;

/*4.	Given a 2-D array of size 3⨯3, write a multithreaded program to compute the sum of all the elements. 
Use three separate threads for computing the sum of each row of the matrix.  */

class sumOfAll extends Thread {

    int x[];
    int total = 0;
    int rowind;

    public sumOfAll(int x[], int r) {
        this.x = x;
        rowind = r;
    }

    public sumOfAll() {
    }

    public void run() {
        for (int i = 0; i < x.length; i++) {
            total = total + x[i];
        }
        System.out.println("Sum of row " + rowind + ": " + total);
    }

    int rowTotal() {
        return total;
    }
}

public class Pro4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter columns of matrix:-");
        int col = sc.nextInt();

        System.out.println("enter row of matrix:-");
        int row = sc.nextInt();

        int mat[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("enter matrix elemet at position of " + i + " " + j + ":-");
                mat[i][j] = sc.nextInt();
            }
        }

        sumOfAll s1[] = new sumOfAll[row];
        try {
            for (int i = 0; i < row; i++) {
                s1[i] = new sumOfAll(mat[i], i + 1);
                s1[i].start();
                s1[i].join();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        int total = 0;
        for(int i = 0 ; i < row ; i++){
            total = total + s1[i].rowTotal();
        }

        System.out.println("matrix total is :-"+total);
    }
}
