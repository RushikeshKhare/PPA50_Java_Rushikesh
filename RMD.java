
class Base
{
    public int A,B;
    public void Fun()
    {
        System.out.println("Inside Base Fun");
    }
    public void Gun()
    {
        System.out.println("Inside base gun");
    }
    public void Sun()
    {
        System.out.println("Inside base sun");
    }
    public void Run()
    {
        System.out.println("Inside Base run");
    }
}

class Derived extends Base          //class Derived : public Base (in c++)
{
    public int X,Y;
    public void Gun()
    {
        System.out.println("Inside Derived Gun");
    }
    public void Run()
    {
        System.out.println("Inside Derived run");
    }
    public void Mun()
    {
        System.out.println("Inside Derived mun");
    }
}

class RMD
{
    public static void main(String A[])
    {
        Base bobj = new Derived();
        bobj.Fun();     // Base Fun
        bobj.Gun();     // Derived Gun
        bobj.Sun();     // Base Sun
        bobj.Run();     // Derived run
        bobj.Mun();     // Error
    }
}