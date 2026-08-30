package com.google.android.gms.internal.mlkit_vision_digital_ink;
import g3.a;
import g5.q;
import g9.n;
import p.a;
import q.f;
import w7.i1;

import com.google.android.gms.internal.ads.ou1;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class j1 extends n9 {
    public g9.n B;
    public final int C;

    public j1(g9.n nVar, int i) {
        this.B = nVar;
        this.C = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n9
    public final String d() {
        da daVar;
        g9.n nVar = this.B;
        if (nVar == null || (daVar = (da) ((ou1) nVar.f17678v).f9238v) == null) {
            return null;
        }
        String k3 = p.a.k("callable=[", daVar.toString(), "]");
        k1 k1Var = (k1) ((AtomicReference) this.B.f17680x).get();
        if (k1Var != null) {
            return w7.i1.d(k3, ", trial=[", k1Var.toString(), "]");
        }
        return k3;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n9
    public final void e() {
        AtomicLong atomicLong;
        long j10;
        int i;
        int i10;
        boolean z3;
        g9.n nVar = this.B;
        this.B = null;
        if (nVar != null) {
            AtomicReference atomicReference = (AtomicReference) nVar.f17680x;
            do {
                atomicLong = (AtomicLong) nVar.f17679w;
                j10 = atomicLong.get();
                i = (int) j10;
                long j11 = j10 >>> 32;
                if (i != Integer.MIN_VALUE) {
                    i10 = (int) j11;
                    if (i == -2147483647) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        i10++;
                    }
                } else {
                    g5.q.f(g3.a.h(j10, "Refcount is: "));
                    return;
                }
            } while (!atomicLong.compareAndSet(j10, (i10 << 32) | (4294967295L & (i - 1))));
            if (!z3) {
                return;
            }
            while (true) {
                k1 k1Var = (k1) atomicReference.get();
                if (k1Var != null) {
                    if (k1Var.B <= this.C) {
                        k1Var.cancel(true);
                        while (!atomicReference.compareAndSet(k1Var, null)) {
                            if (atomicReference.get() == k1Var || atomicReference.get() == k1Var) {
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }
}
