package assignment1;

import java.util.Scanner;

public class Circlearea {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        double radius= scanner.nextDouble();
        double area= Math.PI*radius*radius*2;
        System.out.printf("%.2f",area);
    }

}
