public class apples{
    public static void main(String[] args) {
        tuna tunaObject = new tuna();
        tuna tunaObject1 = new tuna(5);
        tuna tunaObject2 = new tuna(5,8);
        tuna tunaObject3 = new tuna(5,8,2);

        System.out.printf("%s\n", tunaObject.toMilitary());
        System.out.printf("%s\n", tunaObject1.toMilitary());
        System.out.printf("%s\n", tunaObject2.toMilitary());
        System.out.printf("%s\n", tunaObject3.toMilitary());
    }
}