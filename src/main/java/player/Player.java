package player;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private char playerMark;

    private List<Integer>playerXMark = new ArrayList<>();
    private List<Integer>playerOMark = new ArrayList<>();

    public Player() {
        this.playerMark = 'X';
    }

    public void playerMarkSwitch(int pos){
        if (playerMark == 'X'){
            playerXMark.add(pos);
            playerMark = 'O';
        }else if (playerMark == 'O'){
            playerOMark.add(pos);
            playerMark = 'X';
        }
    }

    public boolean isPositionTaken(int pos){
        if (playerXMark.contains(pos) || playerOMark.contains(pos)){
            System.out.println("Position taken");
        }
        return playerXMark.contains(pos) || playerOMark.contains(pos);
    }

    public List<Integer> getPlayerXMark() {
        return playerXMark;
    }

    public void setPlayerXMark(List<Integer> playerXMark) {
        this.playerXMark = playerXMark;
    }

    public List<Integer> getPlayerOMark() {
        return playerOMark;
    }

    public void setPlayerOMark(List<Integer> playerOMark) {
        this.playerOMark = playerOMark;
    }

    public char getPlayerMark() {
        return playerMark;
    }
}
