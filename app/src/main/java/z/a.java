package z;

import d1.r;
import df.p;
import pe.z;
import r0.y;
import t.n0;
import x.j0;
import ya.we;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.m implements p {
    public final /* synthetic */ r.f A;
    public final /* synthetic */ df.l B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f31657u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f31658v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f31659w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j0 f31660x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n0 f31661y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ boolean f31662z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(r rVar, m mVar, j0 j0Var, Object obj, Object obj2, n0 n0Var, boolean z3, r.f fVar, df.l lVar, int i, int i10, int i11) {
        super(2);
        this.f31657u = i11;
        this.f31658v = rVar;
        this.f31659w = mVar;
        this.f31660x = j0Var;
        this.E = obj;
        this.F = obj2;
        this.f31661y = n0Var;
        this.f31662z = z3;
        this.A = fVar;
        this.B = lVar;
        this.C = i;
        this.D = i10;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31657u) {
            case 0:
                ((Number) obj2).intValue();
                x.f fVar = (x.f) this.E;
                d1.d dVar = (d1.d) this.F;
                we.a(this.f31658v, this.f31659w, this.f31660x, fVar, dVar, this.f31661y, this.f31662z, this.A, this.B, (r0.m) obj, y.L(this.C | 1), this.D);
                return z.f22715a;
            default:
                ((Number) obj2).intValue();
                x.d dVar2 = (x.d) this.E;
                d1.i iVar = (d1.i) this.F;
                we.b(this.f31658v, this.f31659w, this.f31660x, dVar2, iVar, this.f31661y, this.f31662z, this.A, this.B, (r0.m) obj, y.L(this.C | 1), this.D);
                return z.f22715a;
        }
    }
}
