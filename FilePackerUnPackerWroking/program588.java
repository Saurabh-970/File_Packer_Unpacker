import java.io.*;
import java.util.*;

class program588
{
    public static void main(String A[])
    {
        String str = "Hello";

        byte Arr[] = str.getBytes();

        byte Key = 0x11;

        System.out.println("Original data : "+str);

        // Encyption Process
        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = (byte)(Arr[i] ^ Key);
        }

        String output = new String(Arr);

        System.out.println("Encrypted data : "+output);

        // Decyption Process
        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = (byte)(Arr[i] ^ Key);
        }

        String out = new String(Arr);

        System.out.println("Decrypted data : "+out);
    }
}