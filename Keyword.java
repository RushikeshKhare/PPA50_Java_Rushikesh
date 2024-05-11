class Base
{
    public int A,B;

    public Base()
    {
        System.out.println("Inside Base constructor");
        this.A = 10;
        this.B = 20;
    }
    public void fun()
    {
        System.out.println("Inside fun of base ");
    }
}
class Derived extends Base
{
    public int X,Y;
    public Derived(int i, int j)
    {
        super();            // super(); must be always first in constructor
        System.out.println("Inside Derived constructor");
        this.X = i;
        this.Y = j;
    }
    public void gun()
    {
        System.out.println("Inside gun of Derived");
        super.fun();
        System.out.println("Value of A :"+ super.A);
        System.out.println("Value of X :"+ this.X);
    }
}

class Keyword
{
    public static void main(String Arg[])
    {
        Derived dobj = new Derived(11, 21);
        dobj.gun();
    }
}