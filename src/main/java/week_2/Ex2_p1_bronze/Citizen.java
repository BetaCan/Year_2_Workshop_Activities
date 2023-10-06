package week_2.Ex2_p1_bronze;

public class Citizen
{

    private String givenName;

    private String familyName;

    private int age;

    public Citizen (String givenName, String familyName, int age)
    {
        this.givenName = givenName;
        this.familyName=familyName;
        setAge(age);
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0)
        {
            this.age = 18;
        }
        else
        {
            this.age = age;
        }
    }

    public String getFullName()
    {
        return getGivenName()+" "+getFamilyName();

    }
    public int getTaxableYears(){

            return Math.max(age-18,0);


    }
}