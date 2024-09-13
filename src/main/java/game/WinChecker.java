package game;

import board.GameBoardsOption;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class WinChecker {

    private final ListOfConditionsForWin conditions = new ListOfConditionsForWin();

    public boolean checkWinningCondition(GameBoardsOption gameBoardsOption, List<Integer> listX, List<Integer> listO) {
        Map<String, List<Integer>> conditionsForGivenGame = conditions.getConditionsForGivenGame(gameBoardsOption);
        return conditionsForGivenGame.values().stream().anyMatch(list-> {
            if(new HashSet<>(listX).containsAll(list)){
                System.out.println("You win X");
                return true;
            }
            if(new HashSet<>(listO).containsAll(list)){
                System.out.println("You win O");
                return true;
            }
            return false;
        });
    }
}
