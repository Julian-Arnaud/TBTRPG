package mvp.room;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Julian ARNAUD
 * @date 08/03/2016
 **/
public class LocationTest {

    @Test
    public void testLocation(){
        Location location = new Location(1,2);

        assertTrue(location.getX() == 1);
        assertTrue(location.getY() == 2);
    }

}