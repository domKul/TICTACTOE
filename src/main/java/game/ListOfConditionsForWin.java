package game;

import board.GameBoardsOption;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfConditionsForWin {

    private final Map<String, List<Integer>> conditionsForWin3x3 = new HashMap<>();
    private final Map<String, List<Integer>> conditionsForWin5x5 = new HashMap<>();


    //list for 3x3
    public List<Integer> topRow3 = Arrays.asList(1, 2, 3);
    public List<Integer> midRow3 = Arrays.asList(4, 5, 6);
    public List<Integer> bottomRow3 = Arrays.asList(7, 8, 9);
    public List<Integer> leftColumn3 = Arrays.asList(1, 4, 7);
    public List<Integer> midColumn3 = Arrays.asList(2, 5, 8);
    public List<Integer> rightColumn3 = Arrays.asList(3, 6, 9);
    public List<Integer> crossOne3 = Arrays.asList(1, 5, 9);
    public List<Integer> crossTwo3 = Arrays.asList(3, 5, 7);
    //////////////////
    //list for 5x5
    public List<Integer> row15 = Arrays.asList(1, 2, 3, 4, 5);
    public List<Integer> row25 = Arrays.asList(6, 7, 8, 9, 10);
    public List<Integer> row35 = Arrays.asList(11, 12, 13, 14, 15);
    public List<Integer> row45 = Arrays.asList(16, 17, 18, 19, 20);
    public List<Integer> row55 = Arrays.asList(21, 22, 23, 24, 25);
    public List<Integer> column15 = Arrays.asList(1, 6, 11, 16, 21);
    public List<Integer> column25 = Arrays.asList(2, 7, 12, 17, 22);
    public List<Integer> column35 = Arrays.asList(3, 8, 13, 18, 23);
    public List<Integer> column45 = Arrays.asList(4, 9, 14, 19, 24);
    public List<Integer> column55 = Arrays.asList(5, 10, 15, 20, 25);
    public List<Integer> cross12 = Arrays.asList(1, 7, 13, 19, 25);
    public List<Integer> cross22 = Arrays.asList(5, 9, 13, 17, 21);

    public ListOfConditionsForWin() {
        // Initialize conditions for 3x3
        conditionsForWin3x3.put("topRow3", topRow3);
        conditionsForWin3x3.put("midRow3", midRow3);
        conditionsForWin3x3.put("bottomRow3", bottomRow3);
        conditionsForWin3x3.put("leftColumn3", leftColumn3);
        conditionsForWin3x3.put("midColumn3", midColumn3);
        conditionsForWin3x3.put("rightColumn3", rightColumn3);
        conditionsForWin3x3.put("crossOne3", crossOne3);
        conditionsForWin3x3.put("crossTwo3", crossTwo3);

        // Initialize conditions for 5x5
        conditionsForWin5x5.put("row15", row15);
        conditionsForWin5x5.put("row25", row25);
        conditionsForWin5x5.put("row35", row35);
        conditionsForWin5x5.put("row45", row45);
        conditionsForWin5x5.put("row55", row55);
        conditionsForWin5x5.put("column15", column15);
        conditionsForWin5x5.put("column25", column25);
        conditionsForWin5x5.put("column35", column35);
        conditionsForWin5x5.put("column45", column45);
        conditionsForWin5x5.put("column55", column55);
        conditionsForWin5x5.put("cross12", cross12);
        conditionsForWin5x5.put("cross22", cross22);
    }

    public Map<String, List<Integer>> getConditionsForGivenGame(GameBoardsOption gameBoardsOption) {
        Map<String, List<Integer>> result = new HashMap<>();
        switch (gameBoardsOption){
            case BOARD_3X3 -> result = conditionsForWin3x3;
            case BOARD_5X5 -> result = conditionsForWin5x5;
        }
        return result;
    }
}
