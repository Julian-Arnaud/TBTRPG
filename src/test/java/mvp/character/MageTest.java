package mvp.character;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Julian ARNAUD
 * @date 08/03/2016
 **/
public class MageTest {

    @Test
    public void testMageStats(){
        Mage mage = new Mage();

        assertEquals(mage.getStrength(), 7);
        assertEquals(mage.getDefense(), 6);
        assertEquals(mage.getDexterity(), 10);
        assertEquals(mage.getDodge(), 10);
        assertEquals(mage.getMagic(), 14);
        assertEquals(mage.getSpirit(), 13);
    }

    @Test
    public void testLevelUp(){
        Mage mage = new Mage();

        assertEquals(mage.getLevel(), 1);

        mage.levelUp();

        assertEquals(mage.getLevel(), 2);
    }
}