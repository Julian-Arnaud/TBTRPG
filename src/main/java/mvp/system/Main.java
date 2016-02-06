package mvp.system;

import mvp.character.Character;
import mvp.stuff.Armor;
import mvp.stuff.Weapon;

/**
 * @author Julian ARNAUD
 * @date 05/02/2016
 **/
public class Main {

    public static void main(String[] args) {
        //Set the stuff
        Weapon sword = new Weapon("Sword", 10);
        Weapon axe = new Weapon("Axe", 7);
        Armor chainmail = new Armor("Chainmail", 5);
        Armor clothes = new Armor("Clothes", 1);

        Character knight = new Character("King's first knight", 50, sword, chainmail);
        Character rogue = new Character("Stupid rogue", 20, axe, clothes);

        while(knight.getState()){
            knight.attack(rogue);
            if(rogue.getState()){
                rogue.attack(knight);
            }
            else{
                break;
            }
        }

        System.out.println(knight.toString());
        System.out.println(rogue.toString());
    }
}
