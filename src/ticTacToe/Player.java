package ticTacToe;

import ticTacToe.exception.TicTacToeException;

public class Player {

    private final Mark mark;
    private String name;

    public Player(Mark mark, String name) {
        this.mark = mark;
        this.name = name;
    }

    public Mark getMark() {
        return Mark.X;

    }
    public  void playGame(int number, Board board){
          int row = 0;
          int col = number -1;
          if (number <= 0 || number > 9)
              throw  new ArrayIndexOutOfBoundsException("Enter a position between 1-9");
          else {
              var boardSurface = board.getBoardSurface();
              if (number > 3) {
                  row = 1;
                  col = number - 4;
              }
              if (number > 6) {
                  row = 2;
                  col = number - 7;
              }
              if (isEmptyNumber(col, boardSurface[row])){
                  boardSurface [row][col] = mark;
              }
          }

          }

    private boolean isEmptyNumber(int col,Mark[] boardSurface){
        if(boardSurface[col] == Mark.E) return true;
        throw new TicTacToeException("Please move to an empty position");

    }


    }



