package o0;
import d1.r;
import e0.a;
import k1.p0;
import q.i0;
import r.l1;
import r0.a1;
import r0.m;
import r0.r;
import r0.y;
import z0.c;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.m implements df.p {
    public final /* synthetic */ long A;
    public final /* synthetic */ float B;
    public final /* synthetic */ float C;
    public final /* synthetic */ c D;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f21374u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f21375v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i0 f21376w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a1 f21377x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l1 f21378y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ p0 f21379z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r rVar, i0 i0Var, a1 a1Var, l1 l1Var, p0 p0Var, long j10, float f10, float f11, c cVar) {
        super(2);
        this.f21375v = rVar;
        this.f21376w = i0Var;
        this.f21377x = a1Var;
        this.f21378y = l1Var;
        this.f21379z = p0Var;
        this.A = j10;
        this.B = f10;
        this.C = f11;
        this.D = cVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21374u) {
            case 0:
                m mVar = (m) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    r rVar = (r) mVar;
                    if (rVar.D()) {
                        rVar.U();
                        return pe.z.f22715a;
                    }
                }
                e0.a(this.f21375v, this.f21376w, this.f21377x, this.f21378y, this.f21379z, this.A, this.B, this.C, this.D, mVar, 384);
                return pe.z.f22715a;
            default:
                ((Number) obj2).intValue();
                int L = y.L(385);
                e0.a(this.f21375v, this.f21376w, this.f21377x, this.f21378y, this.f21379z, this.A, this.B, this.C, this.D, (m) obj, L);
                return pe.z.f22715a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r rVar, i0 i0Var, a1 a1Var, l1 l1Var, p0 p0Var, long j10, float f10, float f11, c cVar, int i) {
        super(2);
        this.f21375v = rVar;
        this.f21376w = i0Var;
        this.f21377x = a1Var;
        this.f21378y = l1Var;
        this.f21379z = p0Var;
        this.A = j10;
        this.B = f10;
        this.C = f11;
        this.D = cVar;
    }
}
