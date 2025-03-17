
import java.util.Scanner;

/*3.	Input an integer n.
 Calculate and display the squares and cubes of all integers from 1 to n using two different threads. */

public class Pro3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the total number of turms:-");
        int y = sc.nextInt();

        Calculate t1 = new Calculate(y);
        Calculate t2 = new Calculate(y);
        t1.setName("squ");
        t2.setName("cub");
        t1.start();
        t2.start();

    }
}

class Calculate extends Thread {

    int x;

    public Calculate(int x) {
        this.x = x;
    }

    public void run() {

        for (int i = 1; i <= x; i++) {
            if (Thread.currentThread().getName().equals("squ")) {
                System.out.println("square is :-" + Math.pow(i, 2));
            } else if (Thread.currentThread().getName().equals("cub")) {
                System.out.println("cube is :-" + Math.pow(i, 3));
            }
        }
    }
}