package jzuehlke;

import java.lang.Character;

public class Sword extends CharacterDecorator
{
    //super constructor
    public Sword(jzuehlke.Character tempCharacter)
    {
        super(tempCharacter);
    }

    //override getters
    @Override
    public String getName()
    {
        return tempCharacter.getName() + " The Sword Handler";
    }
    @Override
    public double getHealth()
    {
        return tempCharacter.getHealth() + 10;
    }
}
