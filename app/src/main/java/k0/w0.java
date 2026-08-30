package k0;
import s.k;

import ya.qb;

/* loaded from: classes.dex */
public final class w0 extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19446u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ k f19447v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t0 f19448w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(k kVar, t0 t0Var, int i) {
        super(0);
        this.f19446u = i;
        this.f19447v = kVar;
        this.f19448w = t0Var;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f19446u) {
            case 0:
                this.f19448w.b();
                qb.a(this.f19447v);
                return pe.z.f22715a;
            default:
                this.f19448w.k();
                qb.a(this.f19447v);
                return pe.z.f22715a;
        }
    }
}
