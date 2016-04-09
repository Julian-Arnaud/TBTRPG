package mvp.character;

import mvp.stuff.Armor;
import mvp.stuff.Weapon;

/**
 * @author Julian ARNAUD
 * @date 15/03/2016
 **/
public class Ennemy extends Character {

    /**
     * Stats of the character
     *
     * @param name
     * @param life
     * @param weapon
     * @param armor
     */
    public Ennemy(String name, int life, Weapon weapon, Armor armor) {
        super(name, life, weapon, armor);
    }
}
