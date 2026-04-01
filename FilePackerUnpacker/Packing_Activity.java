
////////////////////////////////FILE PACKER UNPACKER /////////////////////////////////////////
import java.io.*;
import java.util.*;



///////////////////////////////////////////////////////////////////////////////////////////
//
//    Author        : Neha Navin Desai
//    Date          : 30/01/2025
//    Class Name    : program606
//    Description   : Displaying packing of the project (final packing with encryption)
//    Input and Output:
/*
                Enter the name of folder :
                Marvellous
                Enter the name of packed file:
                PackX.txt
                Folder is present
                Number of files in the folder are : 5 
*/
///////////////////////////////////////a////////////////////////////////////////////////////

class program606
{

    public static void main(String A[])  throws Exception
    {
        String Header = null;
    
        byte Key = 0x11;
        int iRet = 0;

        int i = 0 , j = 0;

        byte Buffer[] = new byte[1024];

        byte bHeader[] = new byte[100]; //bcoz we need to convert it 
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of folder : ");
        String foldername = sobj.nextLine();

        System.out.println("Enter the name of packed file: ");
        String Packname = sobj.nextLine();

        File fobj = new File(foldername);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            File Packobj = new  File(Packname);
            Packobj.createNewFile();
            FileOutputStream foobj = new FileOutputStream(Packobj);

            FileInputStream fiobj = null;
            System.out.println("Folder is present");
            File fArr[] = fobj.listFiles();

            System.out.println("Number of files in the folder are : "+fArr.length);


            for( i = 0; i<fArr.length;i++) //jevdya files tevdya vela firnar
            {
                fiobj = new FileInputStream(fArr[i]); // ji pahili file asen ti yein
                
               

                if((fArr[i].getName().endsWith(".txt")) == true) // to see files with only particular extension
                {

                        //header formation
                    Header = fArr[i].getName() + " " + fArr[i].length();  //header banla
                    
                    for(j = Header.length() ; j < 100 ; j++)
                    {
                        Header = Header + " ";
                    }

                    bHeader = Header.getBytes();

                     //write header into packed file
                    foobj.write(bHeader,0,100);

              
                // Read the data from input files from Marvellous folder

                   while((iRet = fiobj.read(Buffer)) != -1)
                    {
                        //encryption logic
                        for(j = 0; j < iRet ; j++)
                        
                        {
                            Buffer[j]= (byte)(Buffer[j] ^ Key);
                        }

                        //write the files data into packed file
                        foobj.write(Buffer , 0 , iRet);
                    } 

                }

                fiobj.close();  
            }
            foobj.close();
        }
        else
        {
            System.out.println("There is no such folder");
        }

    }
}
