package MingMang.quotes;

import org.overture.codegen.runtime.*;

import java.util.*;


@SuppressWarnings("all")
public class BlankSpaceQuote {
    private static int hc = 0;
    private static BlankSpaceQuote instance = null;

    public BlankSpaceQuote() {
        if (Utils.equals(hc, 0)) {
            hc = super.hashCode();
        }
    }

    public static BlankSpaceQuote getInstance() {
        if (Utils.equals(instance, null)) {
            instance = new BlankSpaceQuote();
        }

        return instance;
    }

    public int hashCode() {
        return hc;
    }

    public boolean equals(final Object obj) {
        return obj instanceof BlankSpaceQuote;
    }

    public String toString() {
        return "<BlankSpace>";
    }
}
