/*
Property of David Kimball
*/

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class CRace extends Character
{
    

    // dwarf, elf, hafling, human, dragonborn, gnome, half-elf, half-orc, tiefling 
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String cRace  = input.nextLine();
        
        if(cRace == "Dwarf")
        {
        }
        else if(cRace == "elf")
        {

        }
        else if(cRace == "hafling")
        {

        }
        else if(cRace == "human")
        {

        }
        else if(cRace == "dragonborn")
        {

        }
        else if(cRace == "gnome")
        {

        }
        else if(cRace == "half-elf")
        {

        }
        else if(cRace == "half-orc")
        {

        }
        else if(cRace == "tiefling")
        {

        }
        else
        {
            System.out.print("Please enter a correct race");
        }


        input.close();;
    }
}