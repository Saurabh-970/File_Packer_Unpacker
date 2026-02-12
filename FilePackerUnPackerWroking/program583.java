import java.io.*;
import java.util.*;

class program583   
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of floder : ");
        String FloderName = sobj.nextLine();

        File fobj = new File(FloderName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            System.out.println("Floder is present");

            File fArr[] = fobj.listFiles();

            System.out.println("Number of files in the folder are : "+fArr.length);

            for(int i = 0; i< fArr.length; i++)
            {
                System.out.println("File name : "+fArr[i].getName());
                System.out.println("File size : "+fArr[i].length());
            }
        }
        else
        {
            System.out.println("There is no such floder");
        }
    }
}