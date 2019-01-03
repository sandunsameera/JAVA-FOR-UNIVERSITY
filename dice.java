import java.util.Random;
public class dice{
    public static void main(String[] args){
        Random dice = new Random();

        int number;
        for(int i=0;i<6;i++){
            number = 1+dice.nextInt(6);
            System.out.println(number);

            if(number == 5){
                System.out.println("You arethe winner");
                break;
            }
        }
    }
}