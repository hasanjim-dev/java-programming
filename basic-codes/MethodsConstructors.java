class StudentInfo
{
    String name;
    int age;

    StudentInfo(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class MethodsConstructors
{
    static int add(int a, int b)
    {
        return a + b;
    }

    public static void main(String[] args)
    {
        StudentInfo student = new StudentInfo("Hasan", 20);

        student.display();

        System.out.println("Sum: " + add(10, 20));
    }
}