public enum enu{

    sandun("good guy" ,"22"),
    dasun("bit ok" ,"23"),
    sahan("bad boy" ,"27");

    private final String desc;
    private final String year;

    tuna(String description , String birthday ){
        description = desc;
        birthday = year;
    }

    public String getDesc(){
        return desc;
    }

    public String getyear(){
        return year;
    }
}