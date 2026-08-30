package com.google.android.gms.internal.ads;
import d.d;
import k9.a0;
import l9.d;
import l9.i;

/* loaded from: classes.dex */
public final class lz extends jz {
    @Override // com.google.android.gms.internal.ads.jz
    public final boolean b(String str) {
        String d2 = l9.d.d(str, "MD5");
        h00 h00Var = (h00) this.f7585w.get();
        if (h00Var != null && d2 != null) {
            h00Var.u0(d2, this);
        }
        int i = k9.a0.f19634b;
        l9.i.f("VideoStreamNoopCache is doing nothing.");
        m(str, d2, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.jz
    public final void l() {
    }
}
