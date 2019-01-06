public class multiArrays{
    public static void main(String[] args) {
        int firstArray[][]={{3,4,5,2},{4,3,5,7},{4,6,8,3}};
        int secondArray[][]={{4,2,4,5},{5},{54,6}};

        System.out.println("This is the first array");
        display(firstArray);
        
        System.out.println("This is the second array");
        display(secondArray);


    }

    public static void display(int x[][]){
        for(int row=0;row<=x.length;row++){
            for(int column=0;column<x[row].length;column++){

                System.out.print(x[row][column] + "\t");

            }

                System.out.println();
        }


    } 
}