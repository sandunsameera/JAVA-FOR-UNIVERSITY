public class passArrayToMethod{
    public static void main(String[] args) {
        int arr[]={5,3,6,7,2};

        change(arr);
        for(int y: arr)
        System.out.println(y);

    }

    public static void change(int arr2[]){
        
        for(int counter=0; counter<arr2.length; counter++){
            arr2[counter]+=5;
        }
    }
}