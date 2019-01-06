import java.util.*;
public class secondclass{
    public static void main(String[] args) {
        firstclass firstclassObject = new firstclass();

        System.out.println(firstclassObject.toMilitary());
        firstclassObject.setTime(3, 23, 45);
        System.out.println(firstclassObject.toMilitary());
    }
}