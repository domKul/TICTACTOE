import board.GameBoardsOption;
import game.pvp.PlayerVsPlayer;

public class Main {
    public static void main(String[] args) {
        PlayerVsPlayer playerVsPlayer = new PlayerVsPlayer();
        playerVsPlayer.mainGameLoop(GameBoardsOption.BOARD_3X3);


    }
}