package ticTacToe;

import ticTacToe.exception.TicTacToeException;

import static ticTacToe.Mark.E;

public class Player {
    private String name;
    private final Mark mark;

    public Player(Mark mark, String name){
        this.mark = mark;
        this.name = name;
    }

    public Mark getMark() {
        return mark;
    }

    public void playGame(int position, Board board) {
        int row = 0;
        int col = position - 1;
        if(position <= 0 || position > 9) throw new
                ArrayIndexOutOfBoundsException("Enter a position between 1-9");
        else {
            var boardSurface = board.getBoardSurface();
            if(position > 3){
                row = 1;
                col = position - 4;
            }
            if(position > 6){
                row = 2;
                col = position - 7;
            }
            if(isEmptyPosition(col, boardSurface[row])){
                boardSurface[row][col] = mark;

            }
        }
    }


    private boolean isEmptyPosition(int col, Mark[] boardSurface) {
        if(boardSurface[col] == E) return  true;
        throw new TicTacToeException("You Can Only Move To An Empty Position");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    }



