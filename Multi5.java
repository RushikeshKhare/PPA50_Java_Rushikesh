// problem in this code that main thread is ending before child thread which should
// not happen and should have stopped till child thread ends which is solved in Multi6
// keeping problem as it is to better understandings

class Demo extends Thread
{
    public void run()
    {
        try
        {
            int i = 0;
            String name = Thread.currentThread().getName();
            for (i = 0; i<= 10; i++)
            {
                System.out.println("Running thread "+ name+" with value :"+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception obj)
        {}
    }
}

class Multi5
{
    public static void main(String A[])
    {
        System.out.println("Current Thread is :"+Thread.currentThread().getName());
        Demo obj1 = new Demo();
        obj1.setName("PPA");
        obj1.start();

        System.out.println("End of main Thread");

    }
}