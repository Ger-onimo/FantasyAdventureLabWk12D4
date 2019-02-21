package spells;

public class fireball extends Spell{

    String action;

    public fireball(int damage) {
        super(damage);
        this.action = "burn";
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
