package x7;
import j.e;

import u7.i7;
import w7.h8;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f30267u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f30268v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f30269w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f30270x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f30271y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ df.a f30272z;

    public /* synthetic */ r(i7 i7Var, boolean z3, boolean z9, df.a aVar, boolean z10, int i) {
        this.f30267u = 2;
        this.f30271y = i7Var;
        this.f30268v = z3;
        this.f30269w = z9;
        this.f30272z = aVar;
        this.f30270x = z10;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30267u) {
            case 0:
                ((Integer) obj2).getClass();
                int L = r0.y.L(24577);
                e(this.f30268v, this.f30269w, this.f30270x, (df.l) this.f30271y, this.f30272z, (r0.m) obj, L);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int L2 = r0.y.L(24577);
                e(this.f30268v, this.f30269w, this.f30270x, (df.l) this.f30271y, this.f30272z, (r0.m) obj, L2);
                break;
            default:
                ((Integer) obj2).getClass();
                int L3 = r0.y.L(1);
                h8.a((i7) this.f30271y, this.f30268v, this.f30269w, this.f30272z, this.f30270x, (r0.m) obj, L3);
                break;
        }
        return pe.z.f22715a;
    }

    public /* synthetic */ r(boolean z3, boolean z9, boolean z10, df.l lVar, df.a aVar, int i, int i10) {
        this.f30267u = i10;
        this.f30268v = z3;
        this.f30269w = z9;
        this.f30270x = z10;
        this.f30271y = lVar;
        this.f30272z = aVar;
    }
}
