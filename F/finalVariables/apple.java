public class apple{
    private int sum;
    private final int NUMBER;

    public apple(int x){
        NUMBER=x;
    }

    public void add(){
        sum=sum+NUMBER;
    }
    
    public String toString(){
        return String.format("sum = %d\n", sum);
        
    }
}