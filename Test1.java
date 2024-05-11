import java.sql.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

class Test1
{
    public static void main(String Arg[])
    {
        try
        {
            Connection cobj = DriverManager.getConnection("path", "username", "password");

            Statements obj = cobj.createStatement();

            ResultSet robj = sobj.executeQuery("select * from student");

            while (robj)
            {
                System.out.println(robj.getInt("rno"));    
                System.out.println(robj.getString("name"));    
                System.out.println(robj.getString("city"));    
            }
        }
        catch(Exception obj)
        {}
    }

}