package mvp.stuff;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Julian ARNAUD
 * @date 06/02/2016
 **/
public class ArmorTest {

    @Test
    public void testArmor(){
        Armor armor = new Armor("mail", 7);
        assertEquals("mail", armor.getName());
        assertEquals(armor.getProtection(), 7);
    }
}