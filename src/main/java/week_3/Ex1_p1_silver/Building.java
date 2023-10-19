package week_3.Ex1_p1_silver;

public class Building {
    private int streetNumber;
    private String streetName;
    private String postCode;
    private String ownerName;

    double totalFloorSpace;

    private Room[] rooms;


    public Building (int streetNumber, String streetName, String postCode, String ownerName, Room[] rooms)
    {
        this.streetName = streetName;
        this.streetNumber=streetNumber;
        this.postCode=postCode;
        this.ownerName=ownerName;
        this.rooms=rooms;
    }

    public Building()
    {

    }

    public double getTotalFloorSpace(){

        for (int i=0; rooms.length> i;i++)
        {
            totalFloorSpace  = totalFloorSpace +rooms[i].getLength() *rooms[i].getWidth();

        }
        return totalFloorSpace;
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

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }
}
