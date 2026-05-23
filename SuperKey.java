class SuperKey1
{
    int a = 5;
}

class SuperKey2 extends SuperKey1
{
    int a = 10;
    void show()
    {
        System.out.println(a);
        System.out.println(super.a);
    }
}

public class SuperKey
{
    public static void main(String[]args)
    {
        SuperKey2 obj = new SuperKey2();
        obj.show();
        
    }
}