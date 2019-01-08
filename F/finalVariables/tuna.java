public class tuna{
    public static void main(String[] args) {
        apple appleObject = new apple(10);

        for(int i=0;i<5;i++){
            appleObject.add();

            System.out.printf("%s",appleObject);
        }
    }
}