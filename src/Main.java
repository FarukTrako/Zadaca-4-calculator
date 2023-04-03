import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //zadatak1a
     /*   Main main = new Main();
        main.sum(5, 3);
        main.sum(1, 2, 3);
        main.sum(5, 3, 4, 8);
        main.sum(2000,4,6,8,10);
    }

    int sum(int numA, int numB) {
        int saldo = numA + numB;
        System.out.println(saldo);
        return saldo;
    }

    int sum(int numA, int numB, int numC) {
        int difference = numA - numB - numC;
        System.out.println(difference);
        return difference;
    }

    int sum(int numA, int numB, int numC, int numD) {
        int product = numA * numB * numC;
        System.out.println(product);
        return product;
    }

    int sum(int numA, int numB, int numC, int numD, int numE) {
        int Division = numA / numB / numC;
        System.out.println(Division);
        return Division;

      */


        //zadatak 1aa
       /* Scanner reader = new Scanner(System.in);
        int[] A = new int

        int numberB = 10;
        int total = 5;
        do {
            int total = ;

            while (total>0||total<0);*/
       /*Scanner Scan1 = new Scanner(System.in);
        int total = 15;

        int num;
        if (total < 0 || total > 0) {
            do {
                System.out.println("Enter a positive number: ");
                num = Scan1.nextInt();
            } while (num >= 0);
        } else {
            System.out.println("total is 0, total must be a positive number");
        }*/


        //zadatak 1aaa
       /* Scanner Scan1 = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter a positive number: ");
            num = Scan1.nextInt();
        } while (num >= 0);

        */


        //Zadatak 1.b

      /*  Scanner Scan1 = new Scanner(System.in);
        int num;
        do {
            System.out.println("Please enter any integer: ");
            num = Scan1.nextInt();
        } while (num!=-1000);
        System.out.println("Exit number -1000 is detected");
*/

//Zadatak 1.c

        /* Scanner Scan1 = new Scanner(System.in);
        int num;
        int num2;
        do {
            System.out.println("Please enter any integer: ");
            num = Scan1.nextInt();
            num2 = Scan1.nextInt();
            int total = num+num2;
            System.out.println(total);
        } while (num!=-1000);
        System.out.println("Exit number -1000 is detected");*/

//Zadatak 1.d 1.e
      /*  Scanner Scan1 = new Scanner(System.in);
        int num, num2, total;
        String operation;

        System.out.println("Please enter first number: ");
        num = Scan1.nextInt();
        System.out.println("Please enter second number: ");
        num2 = Scan1.nextInt();
        System.out.println("Please enter operator: +,-,/,* ");
        operation = Scan1.next();

        if (operation.equals("+")) {
            total = num + num2;
            System.out.println(total);
        } else if (operation.equals("-")) {
            total = num - num2;
            System.out.println(total);
        } else if (operation.equals("/")) {
            total = num / num2;
            System.out.println(total);
        } else if (operation.equals("*")) {
            total = num * num2;
            System.out.println(total);
        }*/

        //Zadatak ne radi, nisam skontao kako. Probam u toku dana dodatno

        Scanner Scan1 = new Scanner(System.in);
        int num, num2, total;
        String operation;

       do {
           System.out.println("Please enter first number: ");
           num = Scan1.nextInt();
           System.out.println("Please enter operator: +,-,/,* ");
           operation = Scan1.next();
           System.out.println("Please enter second number: ");
           num2 = Scan1.nextInt();
           System.out.println("Please enter operator: +,-,/,* ");
           operation = Scan1.next();
       } while (operation!= "=");
        if (operation.equals("+")) {
            total = num + num2;
            System.out.println(total);
        } else if (operation.equals("-")) {
            total = num - num2;
            System.out.println(total);
        } else if (operation.equals("/")) {
            total = num / num2;
            System.out.println(total);
        } else if (operation.equals("*")) {
            total = num * num2;
            System.out.println(total);
        }

}
}
