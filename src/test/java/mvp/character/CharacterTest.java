package mvp.character;

import mvp.stuff.Armor;
import mvp.stuff.Weapon;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Julian ARNAUD
 * @date 06/02/2016
 **/
public class CharacterTest {

    @Test
    public void testValues(){
        Character c1 = new Character("Foul", 15, new Weapon("sword", 15), new Armor("mail", 5));
        assertTrue(c1.getName().equals("Foul"));
        assertEquals(c1.getLifeMax(), 15);
        assertEquals(c1.getLife(), 15);
        assertTrue(c1.getState());
        assertEquals(c1.getWeapon().getDamage(), 15);
        assertEquals(c1.getArmor().getProtection(), 5);
    }

    @Test
    public void testAttackAndHealing(){
        Character c1 = new Character("Foul", 15, new Weapon("sword", 15), new Armor("mail", 5));
        Character c2 = new Character("Bar", 20, new Weapon("axe", 10), new Armor("mail", 5));

        c1.attack(c2);
        assertTrue(c2.getLife() == 10);

        c2.healing(5);
        assertTrue(c2.getLife() == 15);

        c2.healing(10);
        assertTrue(c2.getLife() == c2.getLifeMax());
    }
}