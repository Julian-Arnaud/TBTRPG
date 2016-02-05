package mvp.character;

import mvp.stuff.Armor;
import mvp.stuff.Item;
import mvp.stuff.Weapon;

/**
 * @author Julian ARNAUD
 * @date 05/02/2016
 **/
public class Character {

    private boolean isAlive;
    private int lifeMax;
    private int life;
    private Weapon weapon;
    private Armor armor;

    public Character(int life, Weapon weapon, Armor armor){
        this.lifeMax = life;
        this.life = life;
        this.weapon = weapon;
        this.armor = armor;
        this.isAlive = true;
    }

    public void healing(int heal){
        if(life + heal >= lifeMax){
            life = lifeMax;
        }
        else{
            life += heal;
        }
    }

    public void takeDamage(int damage){
        if(life - damage <= 0){
            life = 0;
            isAlive = false;
        }
        else{
            life -= damage;
        }
    }

    public void attack(Character foe){
        if(foe.getState()){
            int damage = this.getWeapon().getDamage() - foe.getArmor().getProtection();
            foe.takeDamage(damage);
            System.out.println(foe.getLife());
        }
    }

    public boolean getState(){
        return isAlive;
    }

    public int getLifeMax(){
        return lifeMax;
    }

    public int getLife(){
        return life;
    }

    public Weapon getWeapon(){
        return weapon;
    }

    public Armor getArmor(){
        return armor;
    }

    @Override
    public String toString() {
        return "Character{" +
                "isAlive=" + isAlive +
                ", lifeMax=" + lifeMax +
                ", life=" + life +
                ", weapon=" + weapon +
                ", armor=" + armor +
                '}';
    }
}
