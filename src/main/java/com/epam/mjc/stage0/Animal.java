package com.epam.mjc.stage0;

public class Animal
{
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur)
    {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription()
    {
        String result = null;
        String pattern;
        String paws = null;
        if (numberOfPaws > 1)
        {
            paws = "paws";
        }
        else
        {
            paws = "paw";
        }
        if (hasFur)
        {
            pattern = "This animal is mostly %s. " +
                    "It has %s %s and " +
                    "a fur.";
        }
        else
        {
            pattern = "This animal is mostly %s. " +
                    "It has %s %s and " +
                    "no fur.";
        }
        result = String.format(pattern, color, numberOfPaws, paws);
        return result;
    }

    public static void main(String[] args)
    {
        Animal animal = new Animal("black", 1, false);
        System.out.println(animal.getDescription());


    }
}
