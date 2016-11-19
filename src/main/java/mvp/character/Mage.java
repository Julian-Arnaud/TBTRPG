package mvp.character;

import mvp.stuff.Element;
import mvp.stuff.Spell;

import java.util.ArrayList;

/**
 * @author Julian ARNAUD
 * @date 07/02/2016
 **/
public class Mage extends Job {

    private ArrayList<Spell> spellList;

    public Mage(){
        super();
        initializeStats();
        spellList = new ArrayList<>();
        spellList.add(new Spell("Fire ball", Element.FIRE, 5, 15));
        spellList.add(new Spell("Electric bolt", Element.THUNDER, 8, 21));
        spellList.add(new Spell("Air wall", Element.AIR, 15, 0));
    }

    public void initializeStats(){

        this.setInitialLevel();
        this.setStrength(7);
        this.setDefense(6);
        this.setDexterity(10);
        this.setDodge(10);
        this.setMagic(14);
        this.setSpirit(13);
    }

    public void levelUp(){
        this.nextLevel();
    }
}
