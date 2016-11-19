package mvp.character;

import mvp.stuff.Armor;
import mvp.stuff.Weapon;

/**
 * @author Julian ARNAUD
 * @date 10/09/2016
 **/
public class Hero extends Character {

    private Job job;

    /**
     * Stats of the character
     *
     * @param name
     * @param life
     * @param weapon
     * @param armor
     */
    public Hero(String name, int life, Weapon weapon, Armor armor, Job job) {
        super(name, life, weapon, armor);
        this.job = job;
    }
}
