package com.google.android.gms.internal.mlkit_vision_digital_ink;
import q1.b;

/* loaded from: classes.dex */
public final /* synthetic */ class xu implements ea {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15249a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yu f15250b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ls f15251c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ os f15252d;

    public /* synthetic */ xu(yu yuVar, ls lsVar, os osVar, int i) {
        this.f15249a = i;
        this.f15250b = yuVar;
        this.f15251c = lsVar;
        this.f15252d = osVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
    public final ya l(Object obj) {
        int i = this.f15249a;
        os osVar = this.f15252d;
        ls lsVar = this.f15251c;
        yu yuVar = this.f15250b;
        int i10 = 0;
        switch (i) {
            case 0:
                ya a10 = yuVar.f15306b.a(lsVar, osVar);
                vu vuVar = new vu((Boolean) obj, 0);
                int i11 = g2.f14354a;
                return n5.p(a10, new f2(q1.b(), i10, vuVar), yuVar.f15311h);
            default:
                f9 e = yuVar.e(yuVar.f15306b.a(lsVar, osVar));
                wu wuVar = new wu(yuVar, (hx) obj, i10);
                int i12 = g2.f14354a;
                return n5.q(e, new r0(q1.b(), 3, wuVar), yuVar.f15311h);
        }
    }
}
