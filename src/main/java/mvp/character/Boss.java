package mvp.character;

import mvp.stuff.Armor;
import mvp.stuff.Weapon;

/**
 * @author Julian ARNAUD
 * @date 09/04/2016
 **/
public class Boss extends Character {
    /**
     * Stats of the character
     *
     * @param name
     * @param life
     * @param weapon
     * @param armor
     */
    public Boss(String name, int life, Weapon weapon, Armor armor) {
        super(name, life, weapon, armor);
    }
}
