// Floder file in copy another file 

import java.io.*;
import java.util.*;

class program578
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        File fobj = new File("Marvellous");

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