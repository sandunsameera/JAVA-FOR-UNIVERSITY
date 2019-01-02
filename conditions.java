import java.util.Scanner;
public class conditions{

    public static void main(String[] args) {
        int age;
     
        System.out.println("Enter your age: ");
        Scanner input = new Scanner(System.in);
        age = input.nextInt();

        if(age<10){

            if(age<10 && age>5)
            {
                System.out.println("You are seriously small kid ");
            }
            else{
                System.out.println("you are a kid ");
            }
        }

        else{
            System.out.println("you are ready to go ");
        }




    }

}