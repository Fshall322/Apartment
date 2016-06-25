/**
 * Created by Frank Hall on 6/25/2016.
 */
public class Apartment
{
    protected String address;
    protected String aptNumber;
    protected int numRooms;
    protected double aptValue;

    public Apartment(String a, String an,int nr, double av) throws ApartmentException
    {
        address = a;
        aptNumber = an;
        numRooms = nr;
        aptValue = av;
        String msg= "";

        if(aptNumber.length() != 3)
            msg = "Apartment number is not 3 digits";
        if(numRooms < 1 || numRooms > 4)
            msg = "Number of rooms is invalid";
        if(aptValue < 500 || aptValue > 2500)
            msg = "Rent is invalid";
        if(!msg.equals(""))
            throw(new ApartmentException(msg));
    }

}
