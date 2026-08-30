package g0;
import a1.a;
import a1.c;
import d1.r;
import m2.g;
import m2.q0;
import r0.m;
import r0.y;

import java.util.Map;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.m implements df.p {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ Map D;
    public final /* synthetic */ int E;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17250u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f17251v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f17252w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q0 f17253x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ df.l f17254y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f17255z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(g gVar, r rVar, q0 q0Var, df.l lVar, int i, boolean z3, int i10, int i11, Map map, int i12, int i13) {
        super(2);
        this.f17250u = i13;
        this.f17251v = gVar;
        this.f17252w = rVar;
        this.f17253x = q0Var;
        this.f17254y = lVar;
        this.f17255z = i;
        this.A = z3;
        this.B = i10;
        this.C = i11;
        this.D = map;
        this.E = i12;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17250u) {
            case 0:
                ((Number) obj2).intValue();
                a(this.f17251v, this.f17252w, this.f17253x, this.f17254y, this.f17255z, this.A, this.B, this.C, this.D, (m) obj, y.L(this.E | 1));
                return pe.z.f22715a;
            default:
                ((Number) obj2).intValue();
                c(this.f17251v, this.f17252w, this.f17253x, this.f17254y, this.f17255z, this.A, this.B, this.C, this.D, (m) obj, y.L(this.E | 1));
                return pe.z.f22715a;
        }
    }
}
