package com.epam.mjc.stage0;

public class Bird extends Animal
{
    public Bird()
    {
        super("blue", 2, false);
    }
    @Override
    public String getDescription(){
        String stringOfSuper = super.getDescription();
        String result = stringOfSuper + " Moreover, it has 2 wings and can fly.";
        return result;
    }

    public static void main(String[] args)
    {
        Bird bird = new Bird();
        System.out.println(bird.getDescription());
    }
}
