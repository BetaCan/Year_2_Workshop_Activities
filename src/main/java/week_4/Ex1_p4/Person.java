package week_4.Ex1_p4;

public abstract class Person {

    private String surname;
    private String firstname;

    public Person(String firstname, String surname)
    {
        this.firstname=firstname;
        this.surname=surname;
    }

    @Override
    public String toString(){
        return firstname+" "+ surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
