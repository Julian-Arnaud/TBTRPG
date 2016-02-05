package mvp.stuff;

/**
 * @author Julian ARNAUD
 * @date 05/02/2016
 **/
public class Armor extends Item {

    private int protection;

    public Armor(String name, int protection){
        super(name);
        this.protection = protection;
    }
}
