package mvp.system;

import mvp.character.Character;
import mvp.character.Team;

import java.util.ArrayList;

/**
 * @author Julian ARNAUD
 * @date 10/09/2016
 **/
public class Fight {
    private Team ennemies;
    private Team characters;
    private int victory; //1 = état initial, 0 = défaite, 2 = victoire
    private ArrayList<Character> battleOrder;

    public Fight(ArrayList<Character> characters, ArrayList<Character> ennemies) {
        this.characters = new Team(characters);
        this.ennemies = new Team(ennemies);
        this.victory = 1;
    }

    public void initializeBattleOrder() {
        ArrayList<Character> tmp = characters.getTeam();
        tmp = ennemies.getTeam();

    }

    public boolean fight() {
        return false;
    }
}
