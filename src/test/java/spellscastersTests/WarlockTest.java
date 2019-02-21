package spellscastersTests;

import org.junit.Before;
import org.junit.Test;
import players.spellcasters.Warlock;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;

    @Before
    public void before(){
//       spell = new Potion(20, "shrink");
        warlock = new Warlock("Roger", 100, "lightning Strike", "ogre");
    }

    @Test
    public void hasName(){
        assertEquals("Roger", warlock.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, warlock.getHealthPoints());
    }

//    @Test
//    public void hasSpell(){
//        assertEquals(spell, warlock.getSpell());
//    }

//    @Test
//    public void hasMythicalCreature(){
//        assertEquals(spell, warlock.getMythicalCreature());
//    }

}
