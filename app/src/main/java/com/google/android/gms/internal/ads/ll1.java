package com.google.android.gms.internal.ads;
import g5.q;
import q.x;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class ll1 {
    public String a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final nl1 b() {
        if (this instanceof nl1) {
            return (nl1) this;
        }
        x.o("Not a JSON Object: ".concat(toString()));
        return null;
    }

    public final pl1 d() {
        if (this instanceof pl1) {
            return (pl1) this;
        }
        x.o("Not a JSON Primitive: ".concat(toString()));
        return null;
    }

    public final String toString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            bm1 bm1Var = new bm1(new zl1(sb2));
            bm1Var.B = 1;
            rc1.b(bm1Var, this);
            return sb2.toString();
        } catch (IOException e) {
            q.f(e);
            return null;
        }
    }
}
