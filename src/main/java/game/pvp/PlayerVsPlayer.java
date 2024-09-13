package game.pvp;

import board.GameBoard;
import board.GameBoardsOption;
import game.GameUtilities;
import game.WinChecker;
import player.Player;
import player.PlayerPosition;

import java.util.InputMismatchException;

public class PlayerVsPlayer extends GameBoard{
    
    private final GameUtilities gameUtilities = new GameUtilities();
    private final Player player = new Player();
    private final WinChecker winChecker = new WinChecker();
    private final PlayerPosition playerPosition = new PlayerPosition();



    public void mainGameLoop(GameBoardsOption gameBoardsOption){
        boolean isRunning = true;
        do{
            char[][] board = chooseBoardSize(gameBoardsOption);
            isRunning = movementProcessorLoop(gameBoardsOption, isRunning, board);
        }while (true);
    }

    private boolean movementProcessorLoop(GameBoardsOption gameBoardsOption, boolean isRunning, char[][] board) {
        while (isRunning){
            System.out.println("Time for you " + player.getPlayerMark());
            printBoard(board);
            try{
                int position = gameUtilities.getScanner().nextInt();
                positionValidator(gameBoardsOption, board, position);
                isRunning = winnerValidator(gameBoardsOption, isRunning, board);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                gameUtilities.getScanner().next();
            }
        }
        return isRunning;
    }

    private boolean winnerValidator(GameBoardsOption gameBoardsOption, boolean isRunning, char[][] board) {
        if(winChecker.checkWinningCondition(gameBoardsOption, player.getPlayerXMark(), player.getPlayerOMark())){
            printBoard(board);
            isRunning = false;
        }
        return isRunning;
    }

    private void positionValidator(GameBoardsOption gameBoardsOption, char[][] board, int position) {
        if (position < 0 || position >= board.length * board[0].length) {
            System.out.println("Invalid position. Please enter a valid position.");
            return;
        }
        if (!player.isPositionTaken(position)){
            playerPosition.playerPosition(gameBoardsOption, board, position,player.getPlayerMark());
            player.playerMarkSwitch(position);
         }
    }
}
