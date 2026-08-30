package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes.dex */
public final class jq0 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedBlockingDeque f7509a = new LinkedBlockingDeque();

    /* renamed from: b, reason: collision with root package name */
    public final Callable f7510b;

    /* renamed from: c, reason: collision with root package name */
    public final wx f7511c;

    public jq0(qc0 qc0Var, wx wxVar) {
        this.f7510b = qc0Var;
        this.f7511c = wxVar;
    }

    public final synchronized void a(int i) {
        LinkedBlockingDeque linkedBlockingDeque = this.f7509a;
        int size = i - linkedBlockingDeque.size();
        for (int i10 = 0; i10 < size; i10++) {
            linkedBlockingDeque.add(this.f7511c.j(this.f7510b));
        }
    }

    public final synchronized ac.b b() {
        a(1);
        return (ac.b) this.f7509a.poll();
    }
}
