import java.util.*;

class pattern{

public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("How maney time you want to repete loop :- ");
    int bb = sc.nextInt();

for(int i=1 ; i<=bb ;i++){

    for(int j=bb;j>=i;j--){
        System.out.print(" ");

    }

    for(int k=1;k<=i ;k++){

        System.out.print("* ");
    }

    System.out.println();
}

int count = 2;

for(int i=bb-1;i>=1;i--){

for(int j=1;j<=count;j++){

System.out.print(" ");

}

for(int k=i ; k>=1 ; k--){
    System.out.print("* ");
}

count++;

System.out.println();

}


}

}