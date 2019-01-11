import java.util.*;
public class creatingFile{

    public static void main(String[] args) {
        final Formatter x;
        try{
            x = new Formatter("ucsc.txt");
            System.out.println("file is created");
        }

        catch(Exception e){
            System.out.println("You got an error");
        }
    }
}