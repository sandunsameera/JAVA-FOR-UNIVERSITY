public class tuna{
    private String girlName;

    public void setName(String name){
        girlName = name;

    }

    public String getname(){
        return girlName;
    }

    public void saying(String name){

        System.out.printf("Your first gf was %s",getname());
    }
}