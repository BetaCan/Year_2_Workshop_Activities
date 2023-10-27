package GateWayTest;


import java.util.ArrayList;
import java.util.List;


public class Cinema {

    private  String name;


    private ArrayList<Film> films;

    public Cinema(){
        this.name="MyCinema";
        this.films = new ArrayList<>();
    }

    public Cinema(String name){
        this.name=name;
        this.films = new ArrayList<>();


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Film> getFilms() {
        return films;
    }

    public void setFilms(ArrayList<Film> films) {
        this.films = films;
    }
}
