package ticTacToe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ticTacToe.exception.TicTacToeException;

import static org.junit.jupiter.api.Assertions.*;
import static ticTacToe.Mark.O;
import static ticTacToe.Mark.X;

public class PlayerTest {

    private Player player1;
    private Player player2;
    private Board gameBoard;


    @BeforeEach
    void setUp() {
        player1 = new Player(X, "xy");
        player2 = new Player(O, "oman");
        gameBoard = new Board();
    }

    @Test
    public void testThatPlayersExist() {
        Player player1 = new Player(X, "xy");
        Player player2 = new Player(O, "oman");
        assertNotNull(player2);
        assertNotNull(player1);
    }

    @Test
    public void testThatBoardExist() {
        Board gameBoard = new Board();
        assertNotNull(gameBoard);
    }

    @Test
    public void testThatBoardEmpty() {
        Board gameBoard = new Board();
        gameBoard.displayBoardSurface();
    }

    @Test
    public void testThatPlayer1CanMarkOnTheBoard() {
        player1.playGame(4, gameBoard);
        Mark[][] boardSurface = gameBoard.getBoardSurface();
        assertEquals(X, boardSurface[1][0]);
    }

    @Test
    public void testThatPlayer2CanMarkOnTheBoard() {
        player2.playGame(6, gameBoard);
        Mark[][] boardSurface = gameBoard.getBoardSurface();
        assertEquals(O, boardSurface[1][2]);
    }

    @Test
    public void testExceptionIsThrownIfAPlayerMarksAWrongPosition() {
        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> player1.playGame(11, gameBoard));
        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> player2.playGame(-2, gameBoard));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> player1.playGame(0, gameBoard));

    }

    @Test
    public void testThatPlayer1CanOnlyMarkAnEmptyPositionOnTheBoard() {
        Mark[][] boardSurface = gameBoard.getBoardSurface();
        player1.playGame(7, gameBoard);
        assertThrows(TicTacToeException.class, () -> player2.playGame(7, gameBoard));
        assertEquals(X, boardSurface[2][0]);
    }

    @Test
    public void testThatPlayer2CanOnlyMarkAnEmptyPositionOnTheBoard() {
        Mark[][] boardSurface = gameBoard.getBoardSurface();
        player2.playGame(8, gameBoard);
        assertThrows(TicTacToeException.class, () -> player1.playGame(8, gameBoard));
        assertEquals(O, boardSurface[2][1]);
    }
}
//    @Test
//    public void testThatTrueIsReturnedWhenPlayer1Wins(){
//        player1
//    }
//}