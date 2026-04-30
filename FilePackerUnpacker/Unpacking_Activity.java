
//////////////////////////////// FILE PACKER UNPACKER /////////////////////////////////////////
import java.io.*;
import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////
//
//    Author        : Saurabh Ravindra Bhonsle
//    Date          : 30/01/2025
//    Class Name    : program614
//    Description   : Unpacking  Activity with decryption
//    Input         : Enter the name of packed file :
//                    PackX.txt                                       
//    Output        : extracted all files from packed with decryption
/*
                    File name : a.txt
                    File size : 10
                    File name : b.txt
                    File size : 20
                    File name : c.txt
                    File size : 30
                    File name : d.txt
                    File size : 40
*/
///////////////////////////////////////////////////////////////////////////////////////////

class program614
{
    public static void main(String A[])  throws Exception
    {
        //Variable Creation
        int FileSize = 0;
        int i = 0;
        int iRet = 0;

        Scanner sobj = null;

        String Filename = null;
        String Header = null;
        String Tokens[] = null;

        File fpackobj = null;
        File fobj = null;            //for creating new file 

        FileInputStream fiobj = null;
        FileOutputStream foobj = null;

        byte bHeader[] = new byte[100];
        byte Buffer[] = null;
        byte Key = 0x11;
       

        sobj = new Scanner(System.in);

        System.out.println("Enter the name of packed file : ");
        Filename = sobj.nextLine();

        fpackobj = new File(Filename);

        if(fpackobj.exists() == false)
        {
            System.out.println("Error : there is no such packed file");
            return;
        }

        fiobj = new FileInputStream(fpackobj);

        //read the header

        while((iRet = fiobj.read(bHeader,0,100)) != -1)
        {
            

            Header = new String(bHeader);

            Header = Header.trim(); // removed extra whitespaces which were created due to for in packed file

            Tokens = Header.split(" ");

            System.out.println("File name : "+Tokens[0]);
            System.out.println("File size : "+Tokens[1]);

            fobj = new File(Tokens[0]);
            fobj.createNewFile();

            foobj = new FileOutputStream(fobj);

            FileSize = Integer.parseInt(Tokens[1]);
            //Buffer for reading the data
            Buffer = new byte[FileSize];

            // read from packed file
            fiobj.read(Buffer,0,FileSize);

            //Decryption logic
            for(i = 0 ; i < FileSize ; i++)
            {
                Buffer[i] = (byte)(Buffer[i] ^ Key);
            }
            // write into extracted file
            foobj.write(Buffer,0,FileSize);
        


        }
 
    }
     
}
