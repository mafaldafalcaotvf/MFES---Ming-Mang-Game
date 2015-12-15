package MingMang;

import org.overture.codegen.runtime.*;

import java.util.*;


@SuppressWarnings("all")
public class Board {
    private VDMMap board = MapUtil.map();

    public Board() {
        cg_init_Board_1();
    }

    public void cg_init_Board_1() {
        board = MapUtil.map(new Maplet(SeqUtil.seq(1L, 1L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(1L, 2L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(1L, 3L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(1L, 4L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(1L, 5L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(1L, 6L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(1L, 7L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(1L, 8L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 1L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 2L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 4L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 5L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 6L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 7L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 8L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 1L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 2L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 4L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 5L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 6L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 7L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 8L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 1L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 2L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 4L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 5L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 6L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 7L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 8L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 1L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 2L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 4L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 5L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 6L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 7L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 8L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 1L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 2L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 4L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 5L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 6L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 7L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 8L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 1L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 2L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 4L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 5L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 6L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 7L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 8L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(8L, 1L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(8L, 2L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(8L, 3L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(8L, 3L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(8L, 4L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(8L, 5L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(8L, 6L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(8L, 7L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(8L, 8L),
                    MingMang.quotes.BlackQuote.getInstance()));
    }

    public void reset() {
        board = MapUtil.map(new Maplet(SeqUtil.seq(1L, 1L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(1L, 2L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(1L, 3L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(1L, 4L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(1L, 5L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(1L, 6L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(1L, 7L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(1L, 8L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 1L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 2L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 4L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 5L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 6L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 7L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 8L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 1L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 2L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 4L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 5L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 6L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 7L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 8L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 1L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 2L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 4L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 5L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 6L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 7L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 8L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 1L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 2L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 4L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 5L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 6L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 7L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 8L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 1L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 2L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 4L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 5L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 6L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 7L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 8L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 1L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 2L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 4L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 5L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 6L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 7L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 8L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(8L, 1L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(8L, 2L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(8L, 3L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(8L, 3L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(8L, 4L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(8L, 5L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(8L, 6L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(8L, 7L),
                    MingMang.quotes.BlackQuote.getInstance()),
                new Maplet(SeqUtil.seq(8L, 8L),
                    MingMang.quotes.BlackQuote.getInstance()));
    }

    public Object getPiece(final VDMSeq coordsXY) {
        return Utils.get(board, coordsXY);
    }

    public Boolean validCoords(final VDMSeq coordsXY) {
        return SetUtil.inSet(coordsXY, MapUtil.dom(Utils.copy(board)));
    }

    public Boolean validColour(final VDMSeq coords, final Object colour) {
        if (Utils.equals(Utils.get(board, coords), colour)) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean canItMove(final Object currentP, final VDMSeq pi,
        final VDMSeq pf) {
        Boolean andResult_3 = false;

        if (Utils.equals(Utils.get(board, pi), currentP)) {
            if (Utils.equals(Utils.get(board, pf),
                        MingMang.quotes.BlankSpaceQuote.getInstance())) {
                andResult_3 = true;
            }
        }

        if (andResult_3) {
            return true;
        }

        return false;
    }

    public Boolean movePiece(final VDMSeq coord, final VDMSeq pfC,
        final Object color) {
        Utils.mapSeqUpdate(board, Utils.copy(coord),
            MingMang.quotes.BlankSpaceQuote.getInstance());
        Utils.mapSeqUpdate(board, Utils.copy(pfC), color);

        return true;
    }

    public Boolean pieceInTheMiddleH(final VDMSeq pi, final VDMSeq pf) {
        Number id = 0L;

        if (((Number) Utils.get(pi, 1L)).longValue() > ((Number) Utils.get(pf,
                    1L)).longValue()) {
            id = ((Number) Utils.get(pi, 1L)).longValue() -
                ((Number) Utils.get(pf, 1L)).longValue();
        } else {
            id = ((Number) Utils.get(pf, 1L)).longValue() -
                ((Number) Utils.get(pi, 1L)).longValue();
        }

        if (Utils.equals(((Number) Utils.get(pi, 2L)),
                    ((Number) Utils.get(pf, 2L)))) {
            return true;
        }

        if (Utils.equals(((Number) Utils.get(pi, 1L)),
                    ((Number) Utils.get(pf, 1L)))) {
            Boolean whileCond_1 = true;

            while (whileCond_1) {
                whileCond_1 = !(Utils.equals(id, 0L));

                if (!(whileCond_1)) {
                    break;
                }

                if (!(Utils.equals(getPiece(SeqUtil.seq(
                                    ((Number) Utils.get(pi, 1L)),
                                    ((Number) Utils.get(pi, 2L)).longValue() +
                                    id.longValue())),
                            MingMang.quotes.BlankSpaceQuote.getInstance()))) {
                    return false;
                }

                id = id.longValue() - 1L;
            }

            return true;
        } else {
            return false;
        }
    }

    public Boolean pieceInTheMiddleV(final VDMSeq pi, final VDMSeq pf) {
        Number id = 0L;

        if (((Number) Utils.get(pi, 2L)).longValue() > ((Number) Utils.get(pf,
                    2L)).longValue()) {
            id = ((Number) Utils.get(pi, 2L)).longValue() -
                ((Number) Utils.get(pf, 2L)).longValue();
        } else {
            id = ((Number) Utils.get(pf, 2L)).longValue() -
                ((Number) Utils.get(pi, 2L)).longValue();
        }

        if (Utils.equals(((Number) Utils.get(pi, 1L)),
                    ((Number) Utils.get(pf, 1L)))) {
            return true;
        }

        if (Utils.equals(((Number) Utils.get(pi, 2L)),
                    ((Number) Utils.get(pf, 2L)))) {
            Boolean whileCond_2 = true;

            while (whileCond_2) {
                whileCond_2 = !(Utils.equals(id, 0L));

                if (!(whileCond_2)) {
                    break;
                }

                if (!(Utils.equals(getPiece(SeqUtil.seq(((Number) Utils.get(
                                        pi, 1L)).longValue() + id.longValue(),
                                    ((Number) Utils.get(pi, 2L)))),
                            MingMang.quotes.BlankSpaceQuote.getInstance()))) {
                    return false;
                }

                id = id.longValue() - 1L;
            }

            return true;
        } else {
            return false;
        }
    }

    public void fillFromTo(final VDMSeq orig, final VDMSeq dest,
        final Object color) {
        VDMSeq org = Utils.copy(orig);
        VDMSeq dst = Utils.copy(dest);

        if (Utils.equals(((Number) Utils.get(org, 1L)),
                    ((Number) Utils.get(dst, 1L)))) {
            if (((Number) Utils.get(org, 2L)).longValue() > ((Number) Utils.get(
                        dst, 2L)).longValue()) {
                Utils.mapSeqUpdate(org, 2L,
                    ((Number) Utils.get(org, 2L)).longValue() - 1L);

                Boolean whileCond_3 = true;

                while (whileCond_3) {
                    whileCond_3 = !(Utils.equals(((Number) Utils.get(org, 2L)),
                            ((Number) Utils.get(dst, 2L))));

                    if (!(whileCond_3)) {
                        break;
                    }

                    Utils.mapSeqUpdate(board, Utils.copy(org), color);
                    Utils.mapSeqUpdate(org, 2L,
                        ((Number) Utils.get(org, 2L)).longValue() - 1L);
                }
            } else {
                Utils.mapSeqUpdate(org, 2L,
                    ((Number) Utils.get(org, 2L)).longValue() + 1L);

                Boolean whileCond_4 = true;

                while (whileCond_4) {
                    whileCond_4 = !(Utils.equals(((Number) Utils.get(org, 2L)),
                            ((Number) Utils.get(dst, 2L))));

                    if (!(whileCond_4)) {
                        break;
                    }

                    Utils.mapSeqUpdate(board, Utils.copy(org), color);
                    Utils.mapSeqUpdate(org, 2L,
                        ((Number) Utils.get(org, 2L)).longValue() + 1L);
                }
            }
        } else {
            if (((Number) Utils.get(org, 1L)).longValue() > ((Number) Utils.get(
                        dst, 1L)).longValue()) {
                Utils.mapSeqUpdate(org, 1L,
                    ((Number) Utils.get(org, 1L)).longValue() - 1L);

                Boolean whileCond_5 = true;

                while (whileCond_5) {
                    whileCond_5 = !(Utils.equals(((Number) Utils.get(org, 1L)),
                            ((Number) Utils.get(dst, 1L))));

                    if (!(whileCond_5)) {
                        break;
                    }

                    Utils.mapSeqUpdate(board, Utils.copy(org), color);
                    Utils.mapSeqUpdate(org, 1L,
                        ((Number) Utils.get(org, 1L)).longValue() - 1L);
                }
            } else {
                Utils.mapSeqUpdate(org, 1L,
                    ((Number) Utils.get(org, 1L)).longValue() + 1L);

                Boolean whileCond_6 = true;

                while (whileCond_6) {
                    whileCond_6 = !(Utils.equals(((Number) Utils.get(org, 1L)),
                            ((Number) Utils.get(dst, 1L))));

                    if (!(whileCond_6)) {
                        break;
                    }

                    Utils.mapSeqUpdate(board, Utils.copy(org), color);
                    Utils.mapSeqUpdate(org, 1L,
                        ((Number) Utils.get(org, 1L)).longValue() + 1L);
                }
            }
        }
    }

    public String toString() {
        return "Board{" + "board := " + Utils.toString(board) + "}";
    }
}
