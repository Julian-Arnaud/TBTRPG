package mvp.stuff;

/**
 * @author Julian ARNAUD
 * @date 09/04/2016
 **/
public enum Element {
    FIRE("FIRE"),
    WATER("WATER"),
    EARTH("EARTH"),
    THUNDER("THUNDER"),
    AIR("AIR"),
    DARK("DARK"),
    LIGHT("LIGHT");

    private Element element;
    private String elementName;

    Element(String name) {
        elementName = name;
    }

    public static Element parse(String name) {
        Element d = null;
        switch (name) {
            case "FIRE":
                d = FIRE;
                break;
            case "WATER":
                d = WATER;
                break;
            case "THUNDER":
                d = THUNDER;
                break;
            case "EARTH":
                d = EARTH;
                break;
            case "AIR":
                d = AIR;
                break;
            case "DARK":
                d = DARK;
                break;
            case "LIGHT":
                d = LIGHT;
                break;
            default:
                break;
        }
        return d;
    }
}
