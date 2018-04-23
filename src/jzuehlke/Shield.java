package jzuehlke;

public class Shield extends CharacterDecorator
{
    //super constructor
    public Shield(Character tempCharacter)
    {
        super(tempCharacter);
    }

    //override getters
    @Override
    public String getName()
    {
        return tempCharacter.getName() + " The Shieldbearer";
    }
    @Override
    public double getHealth()
    {
        return tempCharacter.getHealth() + 20;
    }
}
