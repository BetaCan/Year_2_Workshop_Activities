package week_4.Ex1_p4;

public class Employee extends Person{

    private int id;


    @Override
    public String toString(){
        return super.toString()+ " " + id;
    }

    public Employee(String firstname, String surname, int id)
    {
        super(firstname,surname);
        this.id=id;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
