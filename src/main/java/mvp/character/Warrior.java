package mvp.character;

/**
 * @author Julian ARNAUD
 * @date 07/02/2016
 **/
public class Warrior extends Job {

    public Warrior() {
        super();
        initializeStats();
    }

    public void initializeStats(){
        this.setStrength(13);
        this.setDefense(14);
        this.setDexterity(10);
        this.setDodge(8);
        this.setMagic(7);
        this.setSpirit(8);
    }

    public void levelUp(){
        
    }
}
