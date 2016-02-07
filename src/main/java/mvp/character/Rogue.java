package mvp.character;

/**
 * @author Julian ARNAUD
 * @date 07/02/2016
 **/
public class Rogue extends Job {

    public Rogue(){
        super();
        initializeStats();
    }

    public void initializeStats(){
        this.setStrength(11);
        this.setDefense(8);
        this.setDexterity(14);
        this.setDodge(13);
        this.setMagic(7);
        this.setSpirit(7);
    }

    public void levelUp(){

    }
}
