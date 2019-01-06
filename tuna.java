public class tuna{
    int hour;
    int minute;
    int second;

    public tuna(){
        this(0,0,0);
    }
    public tuna(int h){
        this(h,0,0);
    }
    public tuna(int h, int m){
        this(h,s,0);
    }

    public tuna(int h, int m,int s){
        setTime(h,m,s);
    }


    public void setTime(int h,int m,int s){

        setHour(h);
        setMinute(m);
        setSecond(s);

    }
}