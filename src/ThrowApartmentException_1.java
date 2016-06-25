/**
 * Created by Frank Hall on 6/25/2016.
 */
public class ThrowApartmentException
{
    public static void main(String[] args)  throws ApartmentException
    {
        Apartment[] apartment = new Apartment[6];
        String[] number = {"c12", "c12", "c12", "c12", "c2", "c122"};
        int[] beds = {3, 3, 5, 30, 3, 3};
        double [] rent = { 900.00, 9000.00, 900.00, 900.00, 900.00, 900.00};



        for(int x = 0; x < apartment.length; x++)
        {
            try
            {
                apartment[x] = new Apartment("1234 Cherry Hill", number[x], beds[x], rent[x]);
                System.out.println("Apartment rented!");
            }
            catch (ApartmentException e)
            {
                System.out.println("Error - " + e.getMessage());
            }
        }
    }
}
