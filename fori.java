public class fori{
    public static void main(String[] args) {
        int arr[]={4,3,5,6,4,6};
        int total=0;

        for(int x: arr){

            total=total+x;
            
        }
        System.out.println(total);
    }
}