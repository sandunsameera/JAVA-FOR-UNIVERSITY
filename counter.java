
import java.util.Scanner;
public class counter{

    public static void main(String[] args){
        int number;
        int sum=0;
        int avg;
        int i=0;
        int n;

        System.out.println("Enter amount of numbers you use: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();


        while(i<n){
            System.out.println("Enter your number ");
            Scanner num = new Scanner(System.in);
            number = num.nextInt();
            sum = sum + number;
            i++;
            avg = sum/i;
            System.out.println("your sum :  " + sum);
            System.out.println("your average :  " + avg);


        }
    }


}