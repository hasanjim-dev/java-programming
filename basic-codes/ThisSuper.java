class Parent
{
    String name = "Parent";

    void display()
    {
        System.out.println("Parent class");
    }
}

class Child extends Parent
{
    String name = "Child";

    void show()
    {
        System.out.println("This name: " + this.name);
        System.out.println("Super name: " + super.name);

        this.display();
        super.display();
    }

    void display()
    {
        System.out.println("Child class");
    }
}

class ThisSuper
{
    public static void main(String[] args)
    {
        Child child = new Child();

        child.show();
    }
}