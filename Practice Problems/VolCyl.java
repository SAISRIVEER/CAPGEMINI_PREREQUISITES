package assignment1;

import java.util.Scanner;

public class VolCyl {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        double r= scanner.nextDouble();
        double h= scanner.nextDouble();
        double vol= Math.PI*r*r*h;
        System.out.printf("%.2f",vol);

    }

}
