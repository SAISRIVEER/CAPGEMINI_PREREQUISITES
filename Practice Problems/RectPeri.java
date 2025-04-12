package assignment1;

import java.util.Scanner;

public class RectPeri {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        double l= scanner.nextDouble();
        double h= scanner.nextDouble();
        double p= 2*(l+h);
        System.out.printf("%.2f",p);
    }

}
