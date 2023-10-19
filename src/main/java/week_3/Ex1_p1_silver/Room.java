package week_3.Ex1_p1_silver;

public class Room {
    private int level;
    private double width;
    private double length;


    public Room(int level, double width,double length){
        this.length=length;
        this.width=width;
        this.level=level;

    }

    public Room(){

    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
