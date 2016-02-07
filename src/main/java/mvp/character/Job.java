package mvp.character;

/**
 * @author Julian ARNAUD
 * @date 06/02/2016
 **/
public abstract class Job {
    /**
     * Advanced attributes of a character
     * From 3 to 18
     * Influence the damage output for physical strike
     */
    private int strength;
    private int defense;
    private int dexterity;
    private int dodge;
    private int magic;
    private int spirit;
    private int level;
    private int exp;

    public Job() {

    }

    public void initializeStats(){
        this.level = 1;
        this.exp = 0;
    }

    public void levelUp(){

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

    public int getDodge() {
        return dodge;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel() {
        this.level ++;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp += exp;
    }
}
