abstract class Shape
{
    abstract void draw();

    void display()
    {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape
{
    void draw()
    {
        System.out.println("Drawing Circle.");
    }
}

class Abstraction
{
    public static void main(String[] args)
    {
        Circle circle = new Circle();

        circle.display();
        circle.draw();
    }
}