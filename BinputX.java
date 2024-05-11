import java.io.*;

class BinputX
{
    public static void main(String Arg[])
    {
        try
        {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));     // same code as above line 7 & 8 but in single line
        
        System.out.println("Enter your name :");
        String name = bobj.readLine();

        System.out.println("Welcome : "+ name);
        }
        catch(IOException obj)
        {

        }
    }
}