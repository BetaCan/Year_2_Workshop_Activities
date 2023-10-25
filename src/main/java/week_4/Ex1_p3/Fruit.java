package week_4.Ex1_p3;

public class Fruit {

    private String type;

    private String variety;


    public Fruit (String type, String variety){
        this.type=type;
        this.variety=variety;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String toString(){
        return this.type + ", " + this.variety;

    }
}
