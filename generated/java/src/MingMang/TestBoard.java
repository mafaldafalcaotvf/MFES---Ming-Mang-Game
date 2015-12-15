package MingMang;

import org.overture.codegen.runtime.*;

import java.util.*;


@SuppressWarnings("all")
public class TestBoard {
    public TestBoard() {
    }

    protected void assertEqual(final Object expected, final Object actual) {
        if (!(Utils.equals(expected, actual))) {
            IO.print("Actual value (");
            IO.print(((Object) actual));
            IO.print(") different from expected (");
            IO.print(((Object) expected));
            IO.println(")\n");
        }
    }

    public void TestAll() {
        TestNewBoard();
        TestMove();
        TestFill();
        TestPiecesInTheMid();
    }

    public void TestPiecesInTheMid() {
        Board board = new Board();
        Object cpW = MingMang.quotes.WhiteQuote.getInstance();
        Object cpBS = MingMang.quotes.BlankSpaceQuote.getInstance();
        Object cpB = MingMang.quotes.BlackQuote.getInstance();
        Boolean aux = false;
        aux = board.movePiece(SeqUtil.seq(1L, 3L), SeqUtil.seq(3L, 3L),
                ((Object) cpW));
        assertEqual(board.pieceInTheMiddleV(SeqUtil.seq(3L, 1L),
                SeqUtil.seq(3L, 4L)), true);
    }

    public void TestFill() {
        Board board = new Board();
        Object cpW = MingMang.quotes.WhiteQuote.getInstance();
        Object cpBS = MingMang.quotes.BlankSpaceQuote.getInstance();
        Object cpB = MingMang.quotes.BlackQuote.getInstance();
        board.fillFromTo(SeqUtil.seq(3L, 3L), SeqUtil.seq(3L, 5L), cpB);
        assertEqual(((Object) board.getPiece(SeqUtil.seq(3L, 4L))),
            ((Object) cpB));
    }

    public void TestNewBoard() {
        Board board = new Board();
        Object cpW = MingMang.quotes.WhiteQuote.getInstance();
        Object cpBS = MingMang.quotes.BlankSpaceQuote.getInstance();
        Object cpB = MingMang.quotes.BlackQuote.getInstance();
        assertEqual(((Object) board.getPiece(SeqUtil.seq(1L, 1L))),
            ((Object) cpW));
        assertEqual(((Object) board.getPiece(SeqUtil.seq(1L, 7L))),
            ((Object) cpW));
        assertEqual(((Object) board.getPiece(SeqUtil.seq(8L, 1L))),
            ((Object) cpW));
        assertEqual(((Object) board.getPiece(SeqUtil.seq(1L, 8L))),
            ((Object) cpB));
        assertEqual(((Object) board.getPiece(SeqUtil.seq(8L, 8L))),
            ((Object) cpB));
        assertEqual(((Object) board.getPiece(SeqUtil.seq(8L, 2L))),
            ((Object) cpB));
        assertEqual(((Object) board.getPiece(SeqUtil.seq(2L, 2L))),
            ((Object) cpBS));
        assertEqual(((Object) board.getPiece(SeqUtil.seq(4L, 4L))),
            ((Object) cpBS));
        assertEqual(((Object) board.getPiece(SeqUtil.seq(6L, 6L))),
            ((Object) cpBS));
    }

    public void TestMove() {
        Board board = new Board();
        Object cpW = MingMang.quotes.WhiteQuote.getInstance();
        Object cpBS = MingMang.quotes.BlankSpaceQuote.getInstance();
        Object cpB = MingMang.quotes.BlackQuote.getInstance();
        Boolean aux = false;
        aux = board.movePiece(SeqUtil.seq(1L, 2L), SeqUtil.seq(2L, 2L),
                ((Object) cpW));
        assertEqual(((Object) board.getPiece(SeqUtil.seq(2L, 2L))),
            ((Object) cpW));
        assertEqual(((Object) board.getPiece(SeqUtil.seq(1L, 2L))),
            ((Object) cpBS));
        aux = board.movePiece(SeqUtil.seq(8L, 7L), SeqUtil.seq(7L, 7L),
                ((Object) cpB));
        assertEqual(((Object) board.getPiece(SeqUtil.seq(7L, 7L))),
            ((Object) cpB));
        assertEqual(((Object) board.getPiece(SeqUtil.seq(8L, 7L))),
            ((Object) cpBS));
        aux = board.movePiece(SeqUtil.seq(5L, 1L), SeqUtil.seq(5L, 2L),
                ((Object) cpW));
        assertEqual(((Object) board.getPiece(SeqUtil.seq(5L, 2L))),
            ((Object) cpW));
        assertEqual(((Object) board.getPiece(SeqUtil.seq(5L, 1L))),
            ((Object) cpBS));
        aux = board.movePiece(SeqUtil.seq(3L, 8L), SeqUtil.seq(3L, 7L),
                ((Object) cpB));
        assertEqual(((Object) board.getPiece(SeqUtil.seq(3L, 7L))),
            ((Object) cpB));
        assertEqual(((Object) board.getPiece(SeqUtil.seq(3L, 8L))),
            ((Object) cpBS));
    }

    public String toString() {
        return "TestBoard{}";
    }
}
