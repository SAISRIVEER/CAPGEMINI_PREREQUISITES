package assignment1;

import java.util.Scanner;

public class Miles {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        double km= scanner.nextDouble();

        double miles=km*0.621371;
        System.out.println(miles);
    }
}

