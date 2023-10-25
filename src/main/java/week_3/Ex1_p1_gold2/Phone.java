package week_3.Ex1_p1_gold2;

import java.util.ArrayList;

public class Phone {
    private String brand;
    private String type;
    private String model;
    private String uniqueID;
    private int manufacturingCost;

    private static ArrayList<Phone> phones = new ArrayList<Phone>();


    public Phone(){

    }

    public Phone(String brand,String type,String model,String uniqueID,int manufacturingCost)
    {
        this.brand=brand;
        this.type=type;
        this.model=model;
        this.uniqueID=uniqueID;
        this.manufacturingCost=manufacturingCost;
        phones.add(this);
    }

    public static int getCostOfRun(){
         //total cost of all devices
        int total=0;
        for (Phone phone:phones){
            total = total+ phone.manufacturingCost;
        }
        return total;

    }

    public static ArrayList<Phone>getCurrentRun(){
        return phones;
    }

    public static void startNewRun(){
        phones.clear();
    }

@Override
public String toString(){
        //the %s is a format specifier in Java that is used within
        // the String.format method. It is used to indicate a
        // placeholder for a string. When the String.format
        // method is called, the %s is replaced with the actual
        // string value provided as an argument.
        return String.format("%s %s %s (%s) @ %s", brand, type,model,uniqueID,manufacturingCost);
}


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public int getManufacturingCost() {
        return manufacturingCost;
    }

    public void setManufacturingCost(int manufacturingCost) {
        this.manufacturingCost = manufacturingCost;
    }
}
