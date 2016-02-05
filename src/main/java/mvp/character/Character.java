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
    private Item weapon;
    private Item armor;

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

    public boolean getState(){
        return isAlive;
    }

    public int getLifeMax(){
        return lifeMax;
    }

    public int getLife(){
        return life;
    }

}
