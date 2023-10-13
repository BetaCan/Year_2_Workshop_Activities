package week_3.Ex1_p1_gold;

public class Customer {

    private String familyName;
    private String[] givenNames;
    private String[] addressLines;


    public Customer (String name, String address)
    {
        //splits name
        String[] names = name.split(" ");
        for (int i = 0; i<names.length; i++)
        {
            names[i]=names[i].trim();
        }
        //assign array elements to class attributes
        familyName = names[names.length-1];
        givenNames = new String[names.length];
        //store just the given name
        for (int i=0;i<names.length-1;i++)
        {
            givenNames[i]=names[i];
        }


        //splits address into array,
        addressLines = address.split(",");
        for (int i=0; i<addressLines.length; i++){
            addressLines[i]=addressLines[i].trim();
        }

    }

    public String getFamilyName()
    {
        return familyName;

    }

    public String[] getGivenNames()
    {
        return givenNames;

    }

    public String getGivenName(int n)
    {
        return givenNames[n-1];

    }
    public String[] getAddressLines()
    {

        return addressLines;

    }

    public String getAddressLine(int n)
    {

        return addressLines[n-1];

    }

}
