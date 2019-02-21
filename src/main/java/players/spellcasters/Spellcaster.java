package players.spellcasters;

import players.Player;

public abstract class Spellcaster extends Player {

    String spell;
    String mythicalCreature;

    public Spellcaster(String name, int healthPoints, String spell, String mythicalCreature) {
        super(name, healthPoints);
        this.spell = spell;
        this.mythicalCreature = mythicalCreature;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public String getMythicalCreature() {
        return mythicalCreature;
    }

    public void setMythicalCreature(String mythicalCreature) {
        this.mythicalCreature = mythicalCreature;
    }
}
