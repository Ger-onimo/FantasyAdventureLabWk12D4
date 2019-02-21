package players.fighters;

import interfaces.IAttack;
import players.Player;
import weapons.Weapon;

public abstract class Fighter extends Player implements IAttack {

    Weapon weapon;


    public Fighter(String name, int healthPoints, Weapon weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public int attack() {
        return this.weapon.getDamage();
    }
}
