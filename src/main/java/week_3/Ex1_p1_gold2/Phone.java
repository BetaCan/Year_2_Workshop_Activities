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
    }

    public int getCostOfRun(int ManufacturingCost){
         //total cost of all devices

        for (int i=0; i<phones.size() ;i++)
        {
            //Phone.getManufacturingCost(i);
        }

        return 0;
    }

   // public getCurrentRun(){}

    //public startNewRun(){}

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
