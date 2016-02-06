package mvp.stuff;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Julian ARNAUD
 * @date 06/02/2016
 **/
public class WeaponTest {

    @Test
    public void testWeapon(){
        Weapon weapon = new Weapon("bat", 2);
        assertTrue(weapon.getName().equals("bat"));
        assertEquals(weapon.getDamage(), 2);
    }

}