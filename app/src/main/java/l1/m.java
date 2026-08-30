package l1;

import wa.b9;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements i {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19851u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ q f19852v;

    public /* synthetic */ m(q qVar, int i) {
        this.f19851u = i;
        this.f19852v = qVar;
    }

    @Override // l1.i
    public final double invoke(double d2) {
        switch (this.f19851u) {
            case 0:
                return b9.c(this.f19852v.f19865k.invoke(d2), r10.e, r10.f19861f);
            default:
                return this.f19852v.f19868n.invoke(b9.c(d2, r0.e, r0.f19861f));
        }
    }
}
