public class apple{
    private String first;
    private String last;
    private static int members = 0;


    public apple(String fn, String ln){
        first = fn;
        last = ln;
        members++;

        System.out.printf("Constructor for apples is %s %s and members are %d\n", first, last, members);
    }
}