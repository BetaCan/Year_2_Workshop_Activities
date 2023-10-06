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
        this.age=setAge(age);
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

    public int setAge(int age) {
        if (this.age<0)
        {
            return this.age = 18;
        }
        else
        {
            return this.age = age;
        }
    }

    public String getFullName()
    {
        return getGivenName()+" "+getFamilyName();

    }
    public int getTaxableYears(){
        return 0;
    }
}