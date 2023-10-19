package week_3.Ex1_p1_silver;

public class Building {
    private int streetNumber;
    private String streetName;
    private String postCode;
    private int ownerName;



    public double getTotalFloorSpace(Room length, Room width ){
        int i = length * width;
        return i;
    }


    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public int getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(int ownerName) {
        this.ownerName = ownerName;
    }
}
