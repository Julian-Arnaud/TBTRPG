package mvp.stuff;

/**
 * @author Julian ARNAUD
 * @date 05/02/2016
 **/
public abstract class Item {

    private String name;

    public Item(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                '}';
    }
}
