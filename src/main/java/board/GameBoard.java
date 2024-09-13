package board;

public abstract class GameBoard implements BoardsShape {

    public char[][] chooseBoardSize(GameBoardsOption gameBoardsOption) {
        char[][] board = new char[0][0];
        switch (gameBoardsOption){
            case BOARD_3X3 -> board = board3x3();
            case BOARD_5X5 -> board = board5x5();
        }
        return board;
    }

    public void printBoard(char[][] board) {
        for (char[] chars : board) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }
}
