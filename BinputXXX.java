import java.io.*;

class BinputXX
{
    public static void main(String Arg[]) throws IOException
    {

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));     // same code as above line 7 & 8 but in single line
        
        System.out.println("Enter First number :");
        int No1 = Integer.parseInt(bobj.readLine());

        System.out.println("Enter second number :");
        int No2 = Integer.parseInt(bobj.readLine());

        int Ans = No1 + No2;
        System.out.println(Ans);
    }
}