package mvp.stuff;

/**
 * @author Julian ARNAUD
 * @date 09/04/2016
 **/
public class Spell extends Item {

    private int cost;
    private int power;
    private Element element;

    public Spell(String name, Element element) {
        super(name);
        this.element = element;
    }
}
