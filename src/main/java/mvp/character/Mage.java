package mvp.character;

/**
 * @author Julian ARNAUD
 * @date 07/02/2016
 **/
public class Mage extends Job {



    public Mage(){
        super();
        initializeStats();
    }

    public void initializeStats(){
        this.setStrength(7);
        this.setDefense(6);
        this.setDexterity(10);
        this.setDodge(10);
        this.setMagic(14);
        this.setSpirit(13);
    }

    public void levelUp(){

    }
}
