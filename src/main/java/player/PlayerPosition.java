package player;

import board.GameBoardsOption;

public class PlayerPosition {

    private static final int BARD_SIZE_3X3 = 3;
    private static final int BARD_SIZE_5X5 = 5;

    public void playerPosition(GameBoardsOption gameBoardsOption, char[][] board, int pos, char player) {
        switch (gameBoardsOption) {
            case BOARD_3X3 -> markPositioner(board, pos, player, BARD_SIZE_3X3);
            case BOARD_5X5 -> markPositioner(board, pos, player, BARD_SIZE_5X5);
            default -> System.out.println("Unsupported board size");
        }
    }

    private void markPositioner(char[][] board, int pos, char mark, int boardSize) {
        int maxPos = boardSize * boardSize;
        if (positionChecker(pos, maxPos)) return;
        int row = (pos - 1) / boardSize;
        int col = (pos - 1) % boardSize;
        row *= 2;
        col *= 2;
        board[row][col] = mark;
    }

    private static boolean positionChecker(int pos, int maxPos) {
        if (pos < 1 || pos > maxPos) {
            System.out.println("wrong position");
            return true;
        }
        return false;
    }
}