import java.util.Scanner;
public class apple{

    public static void main(String[] args){

    

    Scanner input = new Scanner(System.in);
    tuna tunaObject = new tuna();
    System.out.println("Enter your first gf name: ");
    String temp = input.nextLine();
    tunaObject.setName(temp);
    tunaObject.saying(String);
}

}