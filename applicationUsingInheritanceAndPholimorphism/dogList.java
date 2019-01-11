public class dogList{
    private dog[] theList = new dog[5];
    private int i = 0;

    public void add(dog d){
        if(i<theList.length){
            theList[i] = d;
            System.out.println("Dog is added at index " + i);
            i++; 
        }
    }
}