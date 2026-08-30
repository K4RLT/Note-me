package com.google.android.gms.internal.ads;
import ac.b;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final /* synthetic */ class pf0 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f9509u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f9510v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f9511w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f9512x;

    public /* synthetic */ pf0(int i, int i10, Object obj, Object obj2) {
        this.f9509u = i10;
        this.f9511w = obj;
        this.f9510v = i;
        this.f9512x = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9509u) {
            case 0:
                Iterator it = ((CopyOnWriteArraySet) this.f9511w).iterator();
                while (it.hasNext()) {
                    ie0 ie0Var = (ie0) this.f9512x;
                    df0 df0Var = (df0) it.next();
                    if (!df0Var.f5417d) {
                        int i = this.f9510v;
                        if (i != -1) {
                            df0Var.f5415b.p(i);
                        }
                        df0Var.f5416c = true;
                        ie0Var.mo205l(df0Var.f5414a);
                    }
                }
                return;
            default:
                ((e81) this.f9511w).u(this.f9510v, (b) this.f9512x);
                return;
        }
    }
}
