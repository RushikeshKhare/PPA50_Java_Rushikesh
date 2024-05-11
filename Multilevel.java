
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

class DerivedX extends Derived
{
    public int P,Q;
    public DerivedX()
    {
        System.out.println("DerivedX constructor");
    }
    public void sun()
    {
        System.out.println("Inside DerivedX Sun");
    }
}

class Multilevel
{
    public static void main(String A[])
    {
        DerivedX dobj = new DerivedX();
        dobj.Fun();
        dobj.Gun();
        dobj.sun();
    }
}