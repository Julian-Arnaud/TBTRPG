package mvp.character;

/**
 * @author Julian ARNAUD
 * @date 06/02/2016
 **/
public class Stats {
    /**
     * Advanced attributes of a character
     * From 3 to 18
     * Influence the damage output for physical strike
     */
    private int strength;
    private int defense;
    private int magic;
    private int spirit;

    public Stats(int strength, int defense, int magic, int spirit) {
        this.strength = strength;
        this.defense = defense;
        this.magic = magic;
        this.spirit = spirit;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getSpirit() {
        return spirit;
    }

    public void setSpirit(int spirit) {
        this.spirit = spirit;
    }
}
