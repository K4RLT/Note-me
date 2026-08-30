package com.google.android.gms.internal.mlkit_vision_digital_ink;
import g2.a;
import q1.b;

import com.google.android.gms.internal.ads.z11;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class vt implements da {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15150u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.ads.hb f15151v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ fs f15152w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ea f15153x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15154y;

    public /* synthetic */ vt(com.google.android.gms.internal.ads.hb hbVar, fs fsVar, ea eaVar, ArrayList arrayList, int i) {
        this.f15150u = i;
        this.f15151v = hbVar;
        this.f15152w = fsVar;
        this.f15153x = eaVar;
        this.f15154y = arrayList;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.da
    public final ya zza() {
        switch (this.f15150u) {
            case 0:
                com.google.android.gms.internal.ads.hb hbVar = this.f15151v;
                return ((s5) hbVar.E).i(new vt(hbVar, this.f15152w, this.f15153x, this.f15154y, 1), (Executor) hbVar.f6653y);
            default:
                com.google.android.gms.internal.ads.hb hbVar2 = this.f15151v;
                fs fsVar = this.f15152w;
                iw a10 = g2.a(new z11(hbVar2, 12, fsVar));
                Executor executor = (Executor) hbVar2.f6653y;
                return n5.q(n5.o(a10, executor), new r0(q1.b(), 3, new du(hbVar2, fsVar, this.f15153x, this.f15154y)), executor);
        }
    }
}
