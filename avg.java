public class avg{
    public static void main(String[] args) {

        
        System.out.println(average(3,5,6,3,5,6,3));
        
    }

    public static int average(int...number){
        int total=0;
        for(int x:number){
            total=total+x;
        }

            return total/number.length;
    }
}