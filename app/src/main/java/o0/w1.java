package o0;
import d1.r;
import r0.m;
import r0.y;

import java.util.Map;

/* loaded from: classes.dex */
public final class w1 extends kotlin.jvm.internal.m implements df.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ Map E;
    public final /* synthetic */ df.l F;
    public final /* synthetic */ m2.q0 G;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ m2.g f21727u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f21728v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f21729w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f21730x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f21731y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ long f21732z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(m2.g gVar, r rVar, long j10, long j11, long j12, long j13, int i, boolean z3, int i10, int i11, Map map, df.l lVar, m2.q0 q0Var, int i12) {
        super(2);
        this.f21727u = gVar;
        this.f21728v = rVar;
        this.f21729w = j10;
        this.f21730x = j11;
        this.f21731y = j12;
        this.f21732z = j13;
        this.A = i;
        this.B = z3;
        this.C = i10;
        this.D = i11;
        this.E = map;
        this.F = lVar;
        this.G = q0Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int L = y.L(3505);
        x1.c(this.f21727u, this.f21728v, this.f21729w, this.f21730x, this.f21731y, this.f21732z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, (m) obj, L);
        return pe.z.f22715a;
    }
}
