package spellscastersTests;

import org.junit.Before;
import org.junit.Test;
import players.spellcasters.Wizard;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void before(){
//       spell = new Potion(20, "shrink");
        wizard = new Wizard("Davina", 100, "shrink", "dragon");
    }

    @Test
    public void hasName(){
        assertEquals("Davina", wizard.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, wizard.getHealthPoints());
    }

//    @Test
//    public void hasWeapon(){
//        assertEquals(spell, wizard.getSpell());
//    }

    //    @Test
//    public void hasMythicalCreature(){
//        assertEquals(spell, wizard.getMythicalCreature());
//    }


}
