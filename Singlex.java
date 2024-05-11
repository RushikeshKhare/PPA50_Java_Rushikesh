
class Base
{
    public int A,B;
    public Base()
    {
        System.out.println("Base constructor");
    }
    public void Fun()
    {
        System.out.println("Inside Base Fun");
    }
}

class Derived extends Base          //class Derived : public Base (in c++)
{
    public int X,Y;
    public Derived()
    {
        System.out.println("Derived constructor");
    }
    public void Gun()
    {
        System.out.println("Inside Derived Gun");
    }
}

class Singlex
{
    public static void main(String A[])
    {
        Base bobj1 = new Base();            //no casting
        Derived dobj1 = new Derived();      // no casting
        Base bobj2 = new Derived();         // up casting (A)
        Derived dobj2 = new Base();         // downcasting (NA)
    }
}