package ticTacToe;

import static ticTacToe.Mark.*;


public class Board {

    private Mark[][] boardSurface;

    public Board() {
        boardSurface = new Mark[][]{{E, E, E}, {E, E, E}, {E, E, E}};

    }

    public Mark[][] getBoardSurface() {
        return boardSurface;
    }

    public void displayBoardSurface() {
        for (Mark[] marks : boardSurface) {
            System.out.print("  | ");
            for (int i = 0; i < boardSurface.length; i++) {
                System.out.print(marks[i]);
                System.out.print(" | ");
            }
            System.out.println();
            System.out.println();
        }
    }
}
