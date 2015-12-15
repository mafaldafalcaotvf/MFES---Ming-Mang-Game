package MingMang;

import org.overture.codegen.runtime.*;

import java.util.*;


@SuppressWarnings("all")
public class MingMang {
    public Board board = new Board();
    public Object currentColor = MingMang.quotes.WhiteQuote.getInstance();

    public MingMang() {
        cg_init_MingMang_1();
    }

    public void cg_init_MingMang_1() {
        board = new Board();
        currentColor = MingMang.quotes.WhiteQuote.getInstance();
    }

    public void reset() {
        board.reset();
        currentColor = MingMang.quotes.WhiteQuote.getInstance();
    }

    public Board getBoard() {
        return board;
    }

    public Boolean movePiece(final VDMSeq ci, final VDMSeq cf) {
        VDMSet temp = SetUtil.set();

        if (Utils.equals(currentColor, MingMang.quotes.WhiteQuote.getInstance())) {
            if (board.movePiece(Utils.copy(ci), Utils.copy(cf),
                        ((Object) currentColor))) {
                temp = canConquer(Utils.copy(cf));
                conquer(Utils.copy(cf), Utils.copy(temp));
                changePlayer();

                return true;
            } else {
                return false;
            }
        } else {
            if (board.movePiece(Utils.copy(ci), Utils.copy(cf),
                        ((Object) currentColor))) {
                temp = canConquer(Utils.copy(cf));
                conquer(Utils.copy(cf), Utils.copy(temp));
                changePlayer();

                return true;
            } else {
                return false;
            }
        }
    }

    public Boolean gameOver() {
        Number i = 1L;
        Number j = 1L;
        Object cmp = MingMang.quotes.BlankSpaceQuote.getInstance();
        Boolean whileCond_7 = true;

        while (whileCond_7) {
            whileCond_7 = !(Utils.equals(i, 8L));

            if (!(whileCond_7)) {
                break;
            }

            {
                Boolean whileCond_8 = true;

                while (whileCond_8) {
                    whileCond_8 = !(Utils.equals(j, 8L));

                    if (!(whileCond_8)) {
                        break;
                    }

                    if (Utils.equals(cmp,
                                MingMang.quotes.BlankSpaceQuote.getInstance())) {
                        if (Utils.equals(board.getPiece(SeqUtil.seq(i, j)),
                                    MingMang.quotes.BlankSpaceQuote.getInstance())) {
                            /* skip */
                        } else {
                            if (Utils.equals(board.getPiece(SeqUtil.seq(i, j)),
                                        MingMang.quotes.WhiteQuote.getInstance())) {
                                cmp = MingMang.quotes.WhiteQuote.getInstance();
                            } else {
                                if (Utils.equals(board.getPiece(SeqUtil.seq(i, j)),
                                            MingMang.quotes.BlackQuote.getInstance())) {
                                    cmp = MingMang.quotes.BlackQuote.getInstance();
                                }
                            }
                        }
                    } else {
                        Boolean andResult_9 = false;

                        if (!(Utils.equals(board.getPiece(SeqUtil.seq(i, j)),
                                    MingMang.quotes.BlankSpaceQuote.getInstance()))) {
                            if (!(Utils.equals(board.getPiece(SeqUtil.seq(i, j)),
                                        cmp))) {
                                andResult_9 = true;
                            }
                        }

                        if (andResult_9) {
                            return false;
                        }
                    }

                    j = j.longValue() + 1L;
                }

                i = i.longValue() + 1L;
            }
        }

        return true;
    }

    public void changePlayer() {
        if (Utils.equals(currentColor, MingMang.quotes.WhiteQuote.getInstance())) {
            currentColor = MingMang.quotes.BlackQuote.getInstance();
        } else {
            currentColor = MingMang.quotes.WhiteQuote.getInstance();
        }
    }

    public VDMSeq recCheckUp(final VDMSeq coord, final Object notCurrent) {
        VDMSeq piece = Utils.copy(coord);
        VDMSeq fail = SeqUtil.seq(10L, 10L);

        if (Utils.equals(board.getPiece(Utils.copy(coord)), currentColor)) {
            return Utils.copy(coord);
        } else {
            Boolean orResult_1 = false;

            if (Utils.equals(((Number) Utils.get(coord, 1L)), 1L)) {
                orResult_1 = true;
            } else {
                orResult_1 = Utils.equals(board.getPiece(Utils.copy(coord)),
                        MingMang.quotes.BlankSpaceQuote.getInstance());
            }

            if (orResult_1) {
                return Utils.copy(fail);
            } else {
                if (Utils.equals(board.getPiece(Utils.copy(coord)), notCurrent)) {
                    Utils.mapSeqUpdate(piece, 1L,
                        ((Number) Utils.get(piece, 1L)).longValue() - 1L);

                    return recCheckUp(Utils.copy(piece), ((Object) notCurrent));
                } else {
                    return Utils.copy(fail);
                }
            }
        }
    }

    public VDMSeq recCheckDown(final VDMSeq coord, final Object notCurrent) {
        VDMSeq piece = Utils.copy(coord);
        VDMSeq fail = SeqUtil.seq(10L, 10L);

        if (Utils.equals(board.getPiece(Utils.copy(coord)), currentColor)) {
            return Utils.copy(coord);
        } else {
            Boolean orResult_2 = false;

            if (Utils.equals(((Number) Utils.get(coord, 1L)), 8L)) {
                orResult_2 = true;
            } else {
                orResult_2 = Utils.equals(board.getPiece(Utils.copy(coord)),
                        MingMang.quotes.BlankSpaceQuote.getInstance());
            }

            if (orResult_2) {
                return Utils.copy(fail);
            } else {
                if (Utils.equals(board.getPiece(Utils.copy(coord)), notCurrent)) {
                    Utils.mapSeqUpdate(piece, 1L,
                        ((Number) Utils.get(piece, 1L)).longValue() + 1L);

                    return recCheckDown(Utils.copy(piece), ((Object) notCurrent));
                } else {
                    return Utils.copy(fail);
                }
            }
        }
    }

    public VDMSeq recCheckLeft(final VDMSeq coord, final Object notCurrent) {
        VDMSeq piece = Utils.copy(coord);
        VDMSeq fail = SeqUtil.seq(10L, 10L);

        if (Utils.equals(board.getPiece(Utils.copy(coord)), currentColor)) {
            return Utils.copy(coord);
        } else {
            Boolean orResult_3 = false;

            if (Utils.equals(((Number) Utils.get(coord, 2L)), 1L)) {
                orResult_3 = true;
            } else {
                orResult_3 = Utils.equals(board.getPiece(Utils.copy(coord)),
                        MingMang.quotes.BlankSpaceQuote.getInstance());
            }

            if (orResult_3) {
                return Utils.copy(fail);
            } else {
                if (Utils.equals(board.getPiece(Utils.copy(coord)), notCurrent)) {
                    Utils.mapSeqUpdate(piece, 2L,
                        ((Number) Utils.get(piece, 2L)).longValue() - 1L);

                    return recCheckDown(Utils.copy(piece), ((Object) notCurrent));
                } else {
                    return Utils.copy(fail);
                }
            }
        }
    }

    public VDMSeq recCheckRight(final VDMSeq coord, final Object notCurrent) {
        VDMSeq piece = Utils.copy(coord);
        VDMSeq fail = SeqUtil.seq(10L, 10L);

        if (Utils.equals(board.getPiece(Utils.copy(coord)), currentColor)) {
            return Utils.copy(coord);
        } else {
            Boolean orResult_4 = false;

            if (Utils.equals(((Number) Utils.get(coord, 2L)), 8L)) {
                orResult_4 = true;
            } else {
                orResult_4 = Utils.equals(board.getPiece(Utils.copy(coord)),
                        MingMang.quotes.BlankSpaceQuote.getInstance());
            }

            if (orResult_4) {
                return Utils.copy(fail);
            } else {
                if (Utils.equals(board.getPiece(Utils.copy(coord)), notCurrent)) {
                    Utils.mapSeqUpdate(piece, 2L,
                        ((Number) Utils.get(piece, 2L)).longValue() + 1L);

                    return recCheckDown(Utils.copy(piece), ((Object) notCurrent));
                } else {
                    return Utils.copy(fail);
                }
            }
        }
    }

    public VDMSet canConquer(final VDMSeq coord) {
        Object notCurrent = MingMang.quotes.BlankSpaceQuote.getInstance();
        VDMSeq fail = SeqUtil.seq(10L, 10L);
        VDMSet ret = SetUtil.set();
        VDMSeq addPiece = SeqUtil.seq();
        VDMSeq piece = Utils.copy(coord);

        if (Utils.equals(currentColor, MingMang.quotes.WhiteQuote.getInstance())) {
            notCurrent = MingMang.quotes.BlackQuote.getInstance();
        } else {
            notCurrent = MingMang.quotes.WhiteQuote.getInstance();
        }

        if (((Number) Utils.get(piece, 1L)).longValue() > 1L) {
            Utils.mapSeqUpdate(piece, 1L,
                ((Number) Utils.get(piece, 1L)).longValue() - 1L);

            if (Utils.equals(board.getPiece(Utils.copy(piece)), notCurrent)) {
                addPiece = recCheckUp(Utils.copy(piece), ((Object) notCurrent));

                if (!(Utils.equals(addPiece, fail))) {
                    ret = SetUtil.union(Utils.copy(ret),
                            SetUtil.set(Utils.copy(addPiece)));
                }
            } else {
                /* skip */
            }

            Utils.mapSeqUpdate(piece, 1L,
                ((Number) Utils.get(piece, 1L)).longValue() + 1L);
        } else {
            /* skip */
        }

        if (((Number) Utils.get(piece, 1L)).longValue() < 8L) {
            Utils.mapSeqUpdate(piece, 1L,
                ((Number) Utils.get(piece, 1L)).longValue() + 1L);

            if (Utils.equals(board.getPiece(Utils.copy(piece)), notCurrent)) {
                addPiece = recCheckDown(Utils.copy(piece), ((Object) notCurrent));

                if (!(Utils.equals(addPiece, fail))) {
                    ret = SetUtil.union(Utils.copy(ret),
                            SetUtil.set(Utils.copy(addPiece)));
                }
            } else {
                /* skip */
            }

            Utils.mapSeqUpdate(piece, 1L,
                ((Number) Utils.get(piece, 1L)).longValue() - 1L);
        } else {
            /* skip */
        }

        if (((Number) Utils.get(piece, 2L)).longValue() > 1L) {
            Utils.mapSeqUpdate(piece, 2L,
                ((Number) Utils.get(piece, 2L)).longValue() - 1L);

            if (Utils.equals(board.getPiece(Utils.copy(piece)), notCurrent)) {
                addPiece = recCheckLeft(Utils.copy(piece), ((Object) notCurrent));

                if (!(Utils.equals(addPiece, fail))) {
                    ret = SetUtil.union(Utils.copy(ret),
                            SetUtil.set(Utils.copy(addPiece)));
                }
            } else {
                /* skip */
            }

            Utils.mapSeqUpdate(piece, 2L,
                ((Number) Utils.get(piece, 2L)).longValue() + 1L);
        } else {
            /* skip */
        }

        if (((Number) Utils.get(piece, 2L)).longValue() < 8L) {
            Utils.mapSeqUpdate(piece, 2L,
                ((Number) Utils.get(piece, 2L)).longValue() + 1L);

            if (Utils.equals(board.getPiece(Utils.copy(piece)), notCurrent)) {
                addPiece = recCheckRight(Utils.copy(piece),
                        ((Object) notCurrent));

                if (!(Utils.equals(addPiece, fail))) {
                    ret = SetUtil.union(Utils.copy(ret),
                            SetUtil.set(Utils.copy(addPiece)));
                }
            } else {
                /* skip */
            }

            Utils.mapSeqUpdate(piece, 2L,
                ((Number) Utils.get(piece, 2L)).longValue() - 1L);
        } else {
            /* skip */
        }

        return Utils.copy(ret);
    }

    public void conquer(final VDMSeq coord, final VDMSet objectives) {
        for (Iterator iterator_1 = objectives.iterator(); iterator_1.hasNext();) {
            VDMSeq p = (VDMSeq) iterator_1.next();
            board.fillFromTo(Utils.copy(coord), Utils.copy(p), currentColor);
        }
    }

    public String toString() {
        return "MingMang{" + "board := " + Utils.toString(board) +
        ", currentColor := " + Utils.toString(currentColor) + "}";
    }
}
