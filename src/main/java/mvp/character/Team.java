package mvp.character;

import java.util.ArrayList;

/**
 * @author Julian ARNAUD
 * @date 15/11/2016
 **/
public class Team {
    private ArrayList<Character> team;
    private int nbUp;

    public Team(ArrayList<Character> t) {
        this.team = t;
        this.nbUp = team.size();
    }

    public int getNbUp() {
        return nbUp;
    }

    public void updateNbUp() {
        int tmp = 0;
        for (int i = 0; i < team.size(); ++i) {
            if (!team.get(i).getState()) {
                tmp++;
            }
        }
        this.nbUp = tmp;
    }

    public ArrayList<Character> getTeam() {
        return team;
    }

    public void setTeam(ArrayList<Character> team) {
        this.team = team;
    }
}
