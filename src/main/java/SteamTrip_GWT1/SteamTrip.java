package SteamTrip_GWT1;

public class SteamTrip {
    private String tripName;

    private int seats;

    private int seatsBooked;

    public SteamTrip(){
        this.tripName="Unknown";
        this.seats=0;
        this.seatsBooked=0;

    }

    public SteamTrip(String tripName,int seats){
        this.tripName=tripName;
        this.seats=seats;
        this.seatsBooked=0;

    }

    public void bookSeat(){

        if (seatsAvailable()){
        this.seatsBooked+= 1;}
    }

    public boolean seatsAvailable(){
        if (seats>seatsBooked)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public String getTripName() {
        return tripName;
    }

    public void setTripName(String tripName) {
        this.tripName = tripName;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {

        this.seats = seats;
    }

    public int getSeatsBooked() {

       // return seatsBooked;


        if (seatsAvailable()){

            return seatsBooked;}
        else {
            return 0;
        }
    }

    public void setSeatsBooked(int seatsBooked) {
        this.seatsBooked = seatsBooked;



    }
}
