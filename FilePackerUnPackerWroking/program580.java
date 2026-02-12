import java.io.*;
import java.util.*;

class program580   
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of floder : ");
        String FloderName = sobj.nextLine();

        File fobj = new File(FloderName);

        if(fobj.exists())
        {
            System.out.println("Floder is present");
        }
        else
        {
            System.out.println("There is no such floder");
        }
    }
}