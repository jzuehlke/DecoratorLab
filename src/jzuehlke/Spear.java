package jzuehlke;

public class Spear extends CharacterDecorator
{
    //super constructor
    public Spear(Character tempCharacter)
    {
        super(tempCharacter);
    }

    //override getters
    @Override
    public String getName()
    {
        return tempCharacter.getName() + " The Spear Thrower";
    }
    @Override
    public double getHealth()
    {
        return tempCharacter.getHealth() + 5;
    }
}
