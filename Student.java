class Person
{
    String name;
    int age;
    String address;
     void display()
    {
        System.out.println("Age:"+age + "Name:"+name + "Address:"+address);
    }
}

class Employee extends Person
{
    int employeeId;
    int Salary;

    public Employee(int a, String n, String addr, int e, int s)
    {
        age = a;
        address = addr;
        name = n;
        employeeId = e;
        Salary = s;
    }

        void display()
        {
            System.out.println("Age:"+age + "Address:"+address + "Name:"+name + "EmployeeId:"+employeeId + "Salary:"+Salary);
        }

}

public class Student
{
    public static void main(String[]args)
    {
        Person obj = new Employee(22,"Akhil","Surkhet", 101, 2000000);
        obj.display();
    }
}