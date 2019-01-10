public class ab{
    public static void main(String[] args) {
        food object[] = new food[2];
        object[0] = new fish();
        object[1] = new vegi();

        for(int x=0;x<2;x++){
            object[x].eat();
        }
    }
}