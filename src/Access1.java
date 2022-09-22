//Access Modifiers in Java example
public  class Access1
{
    //private variables
    private  int a;
    private  int b;

    protected void display2()
    {
        System.out.println("Protected method");
    }

    public final void display(String str)
    {
        System.out.println("Final" + str);
    }
}
