package jzuehlke;

public abstract class CharacterDecorator implements Character
{
    protected Character tempCharacter;

    //constructor
    public CharacterDecorator(Character tempCharacter)
    {
        this.tempCharacter = tempCharacter;
    }

    //override getters
    @Override
    public String getName()
    {
        return tempCharacter.getName();
    }
    @Override
    public double getHealth()
    {
        return tempCharacter.getHealth();
    }
}
