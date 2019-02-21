package weaponsTests;

import org.junit.Before;
import org.junit.Test;
import weapons.fighterWeapons.Sword;

import static org.junit.Assert.assertEquals;

public class SwordTest {

    Sword sword;

    @Before
    public void before(){
        sword = new Sword(10, "stab");
    }

    @Test
    public void hasDamageRating(){
        assertEquals(10, sword.getDamage());
    }

    @Test
    public void hasWeaponActiion(){
        assertEquals("stab", sword.getSwordAction());
    }
}
