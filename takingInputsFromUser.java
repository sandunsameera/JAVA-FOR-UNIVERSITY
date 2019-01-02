import java.util.Scanner;
public class takingInputsFromUser{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enteu your name here: ");
        String name = input.nextLine();
        System.out.println("Your name is : " + name);
        
    }
}