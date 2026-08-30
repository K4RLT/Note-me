package com.google.android.gms.internal.mlkit_vision_digital_ink;
import q1.b;

import com.google.android.gms.internal.ads.i60;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class hu implements ea {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14439a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.ads.hb f14440b;

    public /* synthetic */ hu(com.google.android.gms.internal.ads.hb hbVar, int i) {
        this.f14439a = i;
        this.f14440b = hbVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
    public final ya l(Object obj) {
        int i = this.f14439a;
        com.google.android.gms.internal.ads.hb hbVar = this.f14440b;
        switch (i) {
            case 0:
                q2 q2Var = (q2) obj;
                if (!q2Var.c()) {
                    return va.f15125v;
                }
                ya c10 = ((qu) hbVar.f6650v).c((tr) q2Var.a());
                t0 t0Var = new t0(6);
                Executor executor = (Executor) hbVar.f6653y;
                int i10 = g2.f14354a;
                return n5.q(c10, new r0(b(), 3, t0Var), executor);
            default:
                return ((wv) ((i60) hbVar.f6651w).f7024b).b(n4.r(((e5) obj).values()));
        }
    }
}
