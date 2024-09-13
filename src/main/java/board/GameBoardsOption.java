package board;

public enum GameBoardsOption {

    BOARD_3X3(1),
    BOARD_5X5(2);

    final int boardOption;

    GameBoardsOption(int boardOption) {
        this.boardOption = boardOption;
    }
}
