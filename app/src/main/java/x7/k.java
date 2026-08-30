package x7;
import j.c;
import x.p;

import w7.e3;
import w7.q7;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f30215u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f30216v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f30217w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ df.a f30218x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f30219y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f30220z;

    public /* synthetic */ k(p pVar, boolean z3, e3 e3Var, df.a aVar, int i) {
        this.f30215u = 2;
        this.f30217w = pVar;
        this.f30216v = z3;
        this.f30219y = e3Var;
        this.f30218x = aVar;
        this.f30220z = i;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30215u) {
            case 0:
                ((Integer) obj2).getClass();
                c(this.f30216v, (String) this.f30217w, this.f30218x, (df.a) this.f30219y, (r0.m) obj, r0.y.L(this.f30220z | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                c(this.f30216v, (String) this.f30217w, this.f30218x, (df.a) this.f30219y, (r0.m) obj, r0.y.L(this.f30220z | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                q7.a((p) this.f30217w, this.f30216v, (e3) this.f30219y, this.f30218x, (r0.m) obj, r0.y.L(this.f30220z | 1));
                break;
        }
        return pe.z.f22715a;
    }

    public /* synthetic */ k(boolean z3, String str, df.a aVar, df.a aVar2, int i, int i10) {
        this.f30215u = i10;
        this.f30216v = z3;
        this.f30217w = str;
        this.f30218x = aVar;
        this.f30219y = aVar2;
        this.f30220z = i;
    }
}
