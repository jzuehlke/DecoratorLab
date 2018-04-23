package jzuehlke;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter your character name: ");
        Character basicCharacter = new BasicCharacter(kb.nextLine());

        int count = 1;
        String[] options = {"\nA) Sword", "\nB) Spear", "\nC) Shield"};

        while(count <= 2)
        {
            System.out.println("\nChoose weapon " + count + ": ");
            for(int i = 0; i < options.length; i++)
            {
                System.out.print(options[i]);
            }

            System.out.println("");
            String choice = kb.nextLine().toUpperCase();

            switch(choice)
            {
                case "A":
                    basicCharacter = new Sword(basicCharacter);
                    options[0] = "";
                    count++;
                    break;
                case "B":
                    basicCharacter = new Spear(basicCharacter);
                    options[1] = "";
                    count++;
                    break;
                case "C":
                    basicCharacter = new Shield(basicCharacter);
                    options[2] = "";
                    count++;
                    break;
                default:
                    basicCharacter = new Starving(basicCharacter);
                    count = 3;
                    break;
            }
        }
        System.out.println("\nName: " + basicCharacter.getName()
            + "\nHealth: " + basicCharacter.getHealth());
    }
}
