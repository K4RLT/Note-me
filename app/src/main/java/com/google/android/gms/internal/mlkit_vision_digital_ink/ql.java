package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class ql extends c1.a {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f14851w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ql(int i) {
        super(1);
        this.f14851w = i;
    }

    @Override // c1.a
    public final Object i(Object obj) {
        switch (this.f14851w) {
            case 0:
                de.f c10 = de.f.c();
                return new nl(c10.b(), (de.k) c10.a(de.k.class), new ll(de.f.c().b(), (il) obj));
            case 1:
                de.f c11 = de.f.c();
                return new va.p(c11.b(), (de.k) c11.a(de.k.class), new mc.c(de.f.c().b(), (va.n) obj, 11));
            case 2:
                de.f c12 = de.f.c();
                return new wa.ja(c12.b(), (de.k) c12.a(de.k.class), new wa.ia(de.f.c().b(), (wa.ga) obj));
            default:
                de.f c13 = de.f.c();
                return new ya.pf(c13.b(), (de.k) c13.a(de.k.class), new ya.nf(de.f.c().b(), (ya.mf) obj, 0));
        }
    }
}
