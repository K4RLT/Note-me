package com.google.android.gms.internal.mlkit_vision_digital_ink;
import q1.b;

import com.google.android.gms.internal.ads.i60;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class tt implements ea {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15023a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.ads.hb f15024b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tr f15025c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ or f15026d;
    public final /* synthetic */ ls e;

    public /* synthetic */ tt(int i, com.google.android.gms.internal.ads.hb hbVar, or orVar, tr trVar, ls lsVar) {
        this.f15023a = i;
        this.f15024b = hbVar;
        this.f15025c = trVar;
        this.f15026d = orVar;
        this.e = lsVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
    public final ya l(Object obj) {
        switch (this.f15023a) {
            case 0:
                com.google.android.gms.internal.ads.hb hbVar = this.f15024b;
                i60 i60Var = (i60) hbVar.f6651w;
                ls lsVar = this.e;
                w9 f10 = i60Var.f(lsVar);
                tr trVar = this.f15025c;
                or orVar = this.f15026d;
                c1 c1Var = new c1(hbVar, lsVar, trVar, orVar, 10);
                int i = g2.f14354a;
                return lx.w(n5.k(f10, vv.class, new r0(q1.b(), 3, c1Var), (Executor) hbVar.f6653y)).y(new tt(2, hbVar, orVar, trVar, lsVar), ia.f14473u);
            case 1:
                int i10 = ((fx) obj).f14344u;
                tr trVar2 = this.f15025c;
                or orVar2 = this.f15026d;
                com.google.android.gms.internal.ads.hb.x(trVar2, orVar2, i10);
                cx.b("%s: File couldn't be shared after download %s, filegroup %s", "FileGroupManager", orVar2.D(), trVar2.P());
                return this.f15024b.q(trVar2, orVar2, this.e, trVar2.E());
            default:
                os osVar = (os) obj;
                if (osVar.v() != ds.DOWNLOAD_COMPLETE) {
                    return va.f15125v;
                }
                com.google.android.gms.internal.ads.hb hbVar2 = this.f15024b;
                or orVar3 = this.f15026d;
                tr trVar3 = this.f15025c;
                lx w10 = lx.w(hbVar2.l(osVar, orVar3, trVar3));
                ls lsVar2 = this.e;
                ut utVar = new ut(hbVar2, orVar3, trVar3, osVar, lsVar2, 1);
                Executor executor = (Executor) hbVar2.f6653y;
                return w10.y(utVar, executor).v(fx.class, new tt(1, hbVar2, orVar3, trVar3, lsVar2), executor);
        }
    }
}
