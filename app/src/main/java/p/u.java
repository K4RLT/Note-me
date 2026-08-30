package p;
import d1.r;
import r0.m;
import r0.y;
import s.k;
import x.s;
import z0.c;

import ya.h9;
import ya.nb;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.m implements df.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f22262u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f22263v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f22264w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f22265x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f22266y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f22267z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(k kVar, df.a aVar, df.l lVar, r rVar, boolean z3, df.a aVar2, c cVar, int i, int i10) {
        super(2);
        this.A = kVar;
        this.B = aVar;
        this.C = (kotlin.jvm.internal.m) lVar;
        this.f22263v = rVar;
        this.f22264w = z3;
        this.D = aVar2;
        this.f22265x = cVar;
        this.f22266y = i;
        this.f22267z = i10;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.internal.m, df.l] */
    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22262u) {
            case 0:
                ((Number) obj2).intValue();
                s sVar = (s) this.A;
                p0 p0Var = (p0) this.B;
                q0 q0Var = (q0) this.C;
                String str = (String) this.D;
                h9.b(sVar, this.f22264w, this.f22263v, p0Var, q0Var, str, this.f22265x, (m) obj, y.L(this.f22266y | 1), this.f22267z);
                return pe.z.f22715a;
            default:
                ((Number) obj2).intValue();
                k kVar = (k) this.A;
                df.a aVar = (df.a) this.B;
                Object r32 = (kotlin.jvm.internal.m) this.C;
                df.a aVar2 = (df.a) this.D;
                nb.b(kVar, aVar, r32, this.f22263v, this.f22264w, aVar2, this.f22265x, (m) obj, y.L(this.f22266y | 1), this.f22267z);
                return pe.z.f22715a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(s sVar, boolean z3, r rVar, p0 p0Var, q0 q0Var, String str, c cVar, int i, int i10) {
        super(2);
        this.A = sVar;
        this.f22264w = z3;
        this.f22263v = rVar;
        this.B = p0Var;
        this.C = q0Var;
        this.D = str;
        this.f22265x = cVar;
        this.f22266y = i;
        this.f22267z = i10;
    }
}