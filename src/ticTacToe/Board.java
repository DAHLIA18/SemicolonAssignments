package ticTacToe;

import static ticTacToe.Mark.*;


public class Board {
    private final Mark [][] boardSurface;

    public Board(){
        boardSurface = new Mark[][]{{E, E, E}, {E, E, E}, {E, E, E}};
    }

    public void displayBoardSurface() {
        for (Mark[] marks : boardSurface) {
            System.out.print(" | ");
            for (int j = 0; j < boardSurface.length; j++) {
                System.out.print(marks[j]);
                System.out.print(" | ");
            }
            System.out.println();
            System.out.println();
        }
    }

    public Mark [][] getBoardSurface() {
        return boardSurface;
    }

    public boolean isAWinner() {
        if(isAWinnerOnRowZero()) return true;
        else if(isAWinnerOnRowOne()) return true;
        else if(isAWinnerOnRowTwo()) return true;
        else if(isAWinnerOnColumnZero()) return true;
        else if(isAWinnerOnColumnOne()) return true;
        else if(isAWinnerOnColumnTwo()) return true;
        else if(isAWinnerOnForwardDiagonal()) return true;
        else if(isAWinnerOnBackwardDiagonal()) return true;
        return false;
    }

    private boolean isAWinnerOnRowZero(){
        boolean isX = boardSurface[0][0] == X && boardSurface[0][1] == X && boardSurface[0][2] == X;
        boolean isO = boardSurface[0][0] == O && boardSurface[0][1] == O && boardSurface[0][2] == O;
        return isX || isO;
    }

    private boolean isAWinnerOnRowOne(){
        boolean isX = boardSurface[1][0] == X && boardSurface[1][1] == X && boardSurface[1][2] == X;
        boolean isO = boardSurface[1][0] == O && boardSurface[1][1] == O && boardSurface[1][2] == O;
        return isX || isO;
    }

    private boolean isAWinnerOnRowTwo(){
        boolean isX = boardSurface[2][0] == X && boardSurface[2][1] == X && boardSurface[2][2] == X;
        boolean isO = boardSurface[2][0] == O && boardSurface[2][1] == O && boardSurface[2][2] == O;
        return isX || isO;
    }

    private boolean isAWinnerOnColumnZero(){
        boolean isX = boardSurface[0][0] == X && boardSurface[1][0] == X && boardSurface[2][0] == X;
        boolean isO = boardSurface[0][0] == O && boardSurface[1][0] == O && boardSurface[2][0] == O;
        return isX || isO;
    }
    private boolean isAWinnerOnColumnOne(){
        boolean isX = boardSurface[0][1] == X && boardSurface[1][1] == X && boardSurface[2][1] == X;
        boolean isO = boardSurface[0][1] == O && boardSurface[1][1] == O && boardSurface[2][1] == O;
        return isX || isO;
    }

    private boolean isAWinnerOnColumnTwo(){
        boolean isX = boardSurface[0][2] == X && boardSurface[1][2] == X && boardSurface[2][2] == X;
        boolean isO = boardSurface[0][2] == O && boardSurface[1][2] == O && boardSurface[2][2] == O;
        return isX || isO;
    }

    private boolean isAWinnerOnForwardDiagonal(){
        boolean isX = boardSurface[0][0] == X && boardSurface[1][1] == X && boardSurface[2][2] == X;
        boolean isO = boardSurface[0][0] == O && boardSurface[1][1] == O && boardSurface[2][2] == O;
        return isX || isO;
    }

    private boolean isAWinnerOnBackwardDiagonal(){
        boolean isX = boardSurface[0][2] == X && boardSurface[1][1] == X && boardSurface[2][0] == X;
        boolean isO = boardSurface[0][2] == O && boardSurface[1][1] == O && boardSurface[2][0] == O;
        return isX || isO;
    }

    public boolean isATie() {
        return !checkEmptyForTie() && !isAWinner();
    }

    private boolean checkEmptyForTie(){
        for (Mark[] marks : boardSurface) {
            for (int j = 0; j < boardSurface.length; j++) {
                if (marks[j] == E) {
                    return true;
                }
            }
        }
        return false;
    }

}