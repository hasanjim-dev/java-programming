class Student
{
    String name;
    int age;

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class ClassesObjects
{
    public static void main(String[] args)
    {
        Student student = new Student();

        student.name = "Hasan";
        student.age = 20;

        student.display();
    }
}