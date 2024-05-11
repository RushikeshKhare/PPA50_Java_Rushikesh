
class Base
{
    public void Fun()
    {
        System.out.println("inside base fun");
    }
    public final void Gun()
    {
        System.out.println("Inside base Gun");
    }
}
class Derived extends Base
{
    public void Fun()
    {
        System.out.println("inside Dervied fun");
    }
    public void Gun()   // we cannot override final method  (Error expected)
    {
        System.out.println("Inside Derived Gun");
    }
}

class final2
{
    public static void main(String A[])
    {

    }
}