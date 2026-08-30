package com.google.android.gms.internal.mlkit_vision_digital_ink;
import q1.b;

/* loaded from: classes.dex */
public final /* synthetic */ class su implements ea {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14986a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tu f14987b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fs f14988c;

    public /* synthetic */ su(tu tuVar, fs fsVar, int i) {
        this.f14986a = i;
        this.f14987b = tuVar;
        this.f14988c = fsVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
    public final ya l(Object obj) {
        int i = this.f14986a;
        int i10 = 3;
        fs fsVar = this.f14988c;
        tu tuVar = this.f14987b;
        hx hxVar = (hx) obj;
        switch (i) {
            case 0:
                f9 g8 = tuVar.g(tuVar.f15029c.d(fsVar));
                ru ruVar = new ru(tuVar, hxVar, 4);
                int i11 = g2.f14354a;
                return n5.q(g8, new r0(b(), i10, ruVar), tuVar.f15033h);
            case 1:
                f9 g10 = tuVar.g(tuVar.f15029c.f(fsVar));
                ru ruVar2 = new ru(tuVar, hxVar, 5);
                int i12 = g2.f14354a;
                return n5.q(g10, new r0(b(), i10, ruVar2), tuVar.f15033h);
            default:
                f9 g11 = tuVar.g(tuVar.f15029c.a(fsVar));
                ru ruVar3 = new ru(tuVar, hxVar, 0);
                int i13 = g2.f14354a;
                return n5.q(g11, new r0(b(), i10, ruVar3), tuVar.f15033h);
        }
    }
}
