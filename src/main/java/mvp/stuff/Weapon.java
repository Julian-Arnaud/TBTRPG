package mvp.stuff;

/**
 * @author Julian ARNAUD
 * @date 05/02/2016
 **/
public class Weapon extends Item {

    private int damage;

    public Weapon(String name, int damage){
        super(name);
        this.damage = damage;
    }

    public int getDamage(){
        return damage;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "damage=" + damage +
                '}';
    }
}
