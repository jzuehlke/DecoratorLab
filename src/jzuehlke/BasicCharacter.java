package jzuehlke;

public class BasicCharacter implements Character
{
    String name;
    double health;

    //constructor
    public BasicCharacter(String name)
    {
        this.name = name;
        this.health = 0;
    }

    //override getters
    @Override
    public String getName()
    {
        return name;
    }
    @Override
    public double getHealth()
    {
        return 0;
    }
}
