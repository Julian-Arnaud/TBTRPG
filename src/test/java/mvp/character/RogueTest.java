package mvp.character;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Julian ARNAUD
 * @date 08/03/2016
 **/
public class RogueTest {

    @Test
    public void testRogueStats(){
        Rogue rogue = new Rogue();

        assertEquals(rogue.getStrength(), 11);
        assertEquals(rogue.getDefense(), 8);
        assertEquals(rogue.getDexterity(), 14);
        assertEquals(rogue.getDodge(), 13);
        assertEquals(rogue.getMagic(), 7);
        assertEquals(rogue.getSpirit(), 7);
    }

    @Test
    public void testLevelUp(){
        Rogue rogue = new Rogue();

        assertEquals(rogue.getLevel(), 1);

        rogue.levelUp();

        assertEquals(rogue.getLevel(), 2);
    }
}