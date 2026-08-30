package p;
import d1.r;
import q.f1;
import q.g1;
import q.j1;
import q.k1;
import q.z;
import r0.m;
import r0.y;
import z0.c;

import ya.i9;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.m implements df.p {
    public final /* synthetic */ Object A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f22156u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g1 f22157v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f22158w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f22159x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f22160y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f22161z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g1 g1Var, r rVar, k1 k1Var, df.l lVar, c cVar, int i) {
        super(2);
        this.f22156u = 1;
        this.f22157v = g1Var;
        this.f22158w = rVar;
        this.A = k1Var;
        this.f22159x = lVar;
        this.f22160y = cVar;
        this.f22161z = i;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22156u) {
            case 0:
                ((Number) obj2).intValue();
                r rVar = (r) this.f22158w;
                df.l lVar = (df.l) this.f22159x;
                df.l lVar2 = (df.l) this.A;
                c cVar = (c) this.f22160y;
                androidx.compose.animation.a.b(this.f22157v, rVar, lVar, lVar2, cVar, (m) obj, y.L(this.f22161z | 1));
                return pe.z.f22715a;
            case 1:
                ((Number) obj2).intValue();
                r rVar2 = (r) this.f22158w;
                k1 k1Var = (k1) this.A;
                df.l lVar3 = (df.l) this.f22159x;
                c cVar2 = (c) this.f22160y;
                i9.b(this.f22157v, rVar2, k1Var, lVar3, cVar2, (m) obj, y.L(this.f22161z | 1));
                return pe.z.f22715a;
            default:
                ((Number) obj2).intValue();
                f1 f1Var = (f1) this.f22158w;
                z zVar = (z) this.f22160y;
                j1.a(this.f22157v, f1Var, this.f22159x, this.A, zVar, (m) obj, y.L(this.f22161z | 1));
                return pe.z.f22715a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(g1 g1Var, Object obj, Object obj2, Object obj3, Object obj4, int i, int i10) {
        super(2);
        this.f22156u = i10;
        this.f22157v = g1Var;
        this.f22158w = obj;
        this.f22159x = obj2;
        this.A = obj3;
        this.f22160y = obj4;
        this.f22161z = i;
    }
}
