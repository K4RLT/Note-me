package com.google.android.gms.internal.mlkit_vision_digital_ink;
import c1.a;
import de.f;
import de.k;
import mc.c;
import va.n;
import va.p;
import wa.ga;
import wa.ia;
import wa.ja;
import ya.mf;
import ya.nf;
import ya.pf;

/* loaded from: classes.dex */
public final class ql extends a {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f14851w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ql(int i) {
        super(1);
        this.f14851w = i;
    }

    @Override // a
    public final Object i(Object obj) {
        switch (this.f14851w) {
            case 0:
                f c10 = f.c();
                return new nl(c10.b(), (k) c10.a(k.class), new ll(f.c().b(), (il) obj));
            case 1:
                f c11 = f.c();
                return new p(c11.b(), (k) c11.a(k.class), new c(f.c().b(), (n) obj, 11));
            case 2:
                f c12 = f.c();
                return new ja(c12.b(), (k) c12.a(k.class), new ia(f.c().b(), (ga) obj));
            default:
                f c13 = f.c();
                return new pf(c13.b(), (k) c13.a(k.class), new nf(f.c().b(), (mf) obj, 0));
        }
    }
}
