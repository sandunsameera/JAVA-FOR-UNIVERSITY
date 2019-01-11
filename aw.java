import java.io.*;
public class aw{
    public static void main(String[] args) {
        File x = new File("C://Zoo//as");

        if(x.exists()){
            System.out.println(x.getName() + " file exists");
        }
        else
            System.out.println(x.getName() + " not exists");
    }
}
