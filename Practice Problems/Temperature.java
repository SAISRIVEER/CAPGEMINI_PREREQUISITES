import java.util.Scanner;

public class Temperature {
    public static  void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        double temp = scanner.nextDouble();
        double fahrenheit= (temp*9/5) +32;
        System.out.println(fahrenheit);
    }
}
