package com.google.android.gms.internal.ads;
import g9.r;

import android.content.Context;
import android.view.View;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class d90 extends um1 implements ai {

    /* renamed from: w, reason: collision with root package name */
    public final WeakHashMap f5346w;

    /* renamed from: x, reason: collision with root package name */
    public final Context f5347x;

    /* renamed from: y, reason: collision with root package name */
    public final qp0 f5348y;

    public d90(Context context, Set set, qp0 qp0Var) {
        super(set);
        this.f5346w = new WeakHashMap(1);
        this.f5347x = context;
        this.f5348y = qp0Var;
    }

    public final synchronized void U1(View view) {
        try {
            WeakHashMap weakHashMap = this.f5346w;
            bi biVar = (bi) weakHashMap.get(view);
            if (biVar == null) {
                bi biVar2 = new bi(this.f5347x, view);
                biVar2.F.add(this);
                biVar2.d(3);
                weakHashMap.put(view, biVar2);
                biVar = biVar2;
            }
            if (this.f5348y.X) {
                nl nlVar = sl.W1;
                r rVar = r.e;
                if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                    long longValue = ((Long) rVar.f17698c.a(sl.V1)).longValue();
                    ra raVar = biVar.C;
                    synchronized (raVar.f10164w) {
                        raVar.f10162u = longValue;
                    }
                    return;
                }
            }
            ra raVar2 = biVar.C;
            long j10 = bi.I;
            synchronized (raVar2.f10164w) {
                raVar2.f10162u = j10;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.ai
    public final synchronized void k(zh zhVar) {
        P1(new lx0(20, zhVar));
    }
}
