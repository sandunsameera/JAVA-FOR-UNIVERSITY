public class abc{
    public static void main(String[] args) {
      animal[] theList = new animal[2];
      dog d = new dog();
      fishi f = new fishi();

      theList[0] =d;
      theList[1] =f;

      for(animal x: theList){
          x.noise();
      }

    }
}