import java.util.Scanner;
public class arr{
    public static void main(String[] args) {
        int n;
        System.out.println("Please enter number of items you insert ");
        Scanner input = new Scanner(System.in);
        n= input.nextInt();
        int arr[] = new int [n];
        for(int i=0; i<n; i++){
            System.out.println("Enter your number :");
            arr[i] = input.nextInt();
        }

        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}