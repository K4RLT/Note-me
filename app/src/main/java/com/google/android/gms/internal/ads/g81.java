package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class g81 extends x21 {
    @Override // com.google.android.gms.internal.ads.x21
    public final void k(e81 e81Var, Set set) {
        synchronized (e81Var) {
            try {
                if (e81Var.B == null) {
                    e81Var.B = set;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.x21
    public final int v(e81 e81Var) {
        int i;
        synchronized (e81Var) {
            i = e81Var.C - 1;
            e81Var.C = i;
        }
        return i;
    }
}
