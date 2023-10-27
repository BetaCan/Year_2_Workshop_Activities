package GateWayTest;

public class Film {

    private String director;
    private int length;

    private String title;



    public Film(){
        this.director="Unknown";
        this.title="Unknown";

        this.length=0;
    }

    public Film(String director, String title, int length){
        this.title=title;
        this.director=director;
        this.length=length;

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {

        if(length>0){
            this.length = length;

        }
        else {
            System.out.println("ERROR");
        }

    }
}
