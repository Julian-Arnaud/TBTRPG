package mvp.stuff;

/**
 * @author Julian ARNAUD
 * @date 09/04/2016
 **/
public class Spell extends Item {

    private int cost;
    private int power;
    private Element element;

    public Spell(String name, Element element, int cost, int power) {
        super(name);
        this.element = element;
        this.cost = cost;
        this.power = power;
    }

    public int getCost() {
        return cost;
    }

    public int getPower() {
        return power;
    }

    public Element getElement() {
        return element;
    }
}
