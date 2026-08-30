package k1;

import android.graphics.Path;

/* loaded from: classes.dex */
public abstract class k {
    public static final h a() {
        return new h(new Path());
    }

    public static final Path.Direction b(h0 h0Var) {
        int ordinal = h0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return Path.Direction.CW;
            }
            l4.a.o();
            return null;
        }
        return Path.Direction.CCW;
    }

    public static final void c(String str) {
        throw new IllegalStateException(str);
    }
}
