package assignment1;

import java.util.Scanner;

public class Simpint {

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        double p=scanner.nextDouble();
        double t=scanner.nextDouble();
        double r=scanner.nextDouble();

        double si= (p*t*r)/100;
        System.out.printf("%.2f",si);
    }
}
