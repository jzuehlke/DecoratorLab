package jzuehlke;

public class Starving extends CharacterDecorator
{
    //super constructor
    public Starving(Character tempCharacter)
    {
        super(tempCharacter);
    }

    //override methods
    @Override
    public String getName()
    {
        return tempCharacter.getName() + " The Hungry";
    }
    @Override
    public double getHealth()
    {
        return tempCharacter.getHealth() - 5;
    }
}
