/*
    object class contains below methods in it

    getClass()
    hashCode()
    equals()
    clone()
    finalize()
*/

import java.rmi.MarshalException;

class Marvellous
{
    public int i,j;
    
    public Marvellous()
    {
        System.out.println("Marvellous Constructor");
    }

    protected void finalize()
    {
        System.out.println("Inside finalize method");
    }
}

class ObjectDemo1
{
    public static void main(String Arg[])
    {
        Marvellous obj = new Marvellous();
        System.out.println(obj.hashCode());     //hashCode();
        obj = null;
        System.gc();
    }
}