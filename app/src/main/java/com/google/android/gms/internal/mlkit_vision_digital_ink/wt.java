package com.google.android.gms.internal.mlkit_vision_digital_ink;
import q1.b;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class wt implements ea {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15198a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.ads.hb f15199b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fs f15200c;

    public /* synthetic */ wt(com.google.android.gms.internal.ads.hb hbVar, fs fsVar, int i) {
        this.f15198a = i;
        this.f15199b = hbVar;
        this.f15200c = fsVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
    public final ya l(Object obj) {
        int i = this.f15198a;
        fs fsVar = this.f15200c;
        com.google.android.gms.internal.ads.hb hbVar = this.f15199b;
        switch (i) {
            case 0:
                es esVar = (es) fsVar.g();
                esVar.l(false);
                fs fsVar2 = (fs) esVar.i();
                return ((qu) hbVar.f6650v).e(fsVar2, (tr) obj);
            default:
                ya d2 = ((qu) hbVar.f6650v).d(fsVar);
                rl rlVar = new rl(3, (q2) obj);
                int i10 = g2.f14354a;
                return n5.p(d2, new f2(b(), 0, rlVar), (Executor) hbVar.f6653y);
        }
    }
}
