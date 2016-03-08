package mvp.character;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Julian ARNAUD
 * @date 08/03/2016
 **/
public class WarriorTest {

    @Test
    public void testWarriorStats(){
        Warrior warrior = new Warrior();

        assertEquals(warrior.getStrength(), 13);
        assertEquals(warrior.getDefense(), 14);
        assertEquals(warrior.getDexterity(), 10);
        assertEquals(warrior.getDodge(), 8);
        assertEquals(warrior.getMagic(), 7);
        assertEquals(warrior.getSpirit(), 8);
    }

    @Test
    public void testLevelUp(){
        Warrior warrior = new Warrior();

        assertEquals(warrior.getLevel(), 1);

        warrior.levelUp();

        assertEquals(warrior.getLevel(), 2);
    }

}