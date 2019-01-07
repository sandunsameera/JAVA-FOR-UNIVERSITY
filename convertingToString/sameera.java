public class sameera{
    private int year;
    private int month;
    private int date;

    public sameera(int y, int m, int d){
        year = y;
        month = m;
        date = d;


        System.out.printf("The constructor for this is %s\n" , this);

    }


    public String toString(){
        
        return String.format("%d/%d/%d", date, month, year);
    }
}