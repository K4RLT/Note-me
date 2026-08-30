package com.google.android.gms.internal.play_billing;
import p.a;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class b1 {
    protected transient int zza;

    public abstract void a(i1 i1Var);

    public final byte[] b() {
        try {
            int d2 = d();
            byte[] bArr = new byte[d2];
            i1 i1Var = new i1(bArr, d2);
            a(i1Var);
            if (d2 - i1Var.f15448d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            l4.a.k(p.a.k("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public abstract int c(p2 p2Var);

    public abstract int d();
}
