class AnimalSound
{
    void sound()
    {
        System.out.println("Animal makes a sound.");
    }
}

class DogSound extends AnimalSound
{
    void sound()
    {
        System.out.println("Dog barks.");
    }
}

class CatSound extends AnimalSound
{
    void sound()
    {
        System.out.println("Cat meows.");
    }
}

class Polymorphism
{
    public static void main(String[] args)
    {
        AnimalSound animal;

        animal = new DogSound();
        animal.sound();

        animal = new CatSound();
        animal.sound();
    }
}