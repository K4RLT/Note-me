package k0;
import d1.r;
import o0.a0;
import o0.l1;
import o0.m;
import p1.b;
import r0.y;
import s.k;
import s.l;
import z0.c;

import o0.b2;
import ya.nb;
import ya.wa;

/* loaded from: classes.dex */
public final class b0 extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19230u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f19231v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f19232w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f19233x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f19234y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f19235z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(c3.a0 a0Var, df.a aVar, b bVar, df.l lVar, int i) {
        super(2);
        this.f19230u = 4;
        this.f19233x = a0Var;
        this.f19234y = aVar;
        this.f19235z = bVar;
        this.f19231v = (kotlin.jvm.internal.m) lVar;
        this.f19232w = i;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [kotlin.jvm.internal.m, df.l] */
    /* JADX WARN: Type inference failed for: r4v9, types: [kotlin.jvm.internal.m, df.l] */
    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19230u) {
            case 0:
                ((Number) obj2).intValue();
                b((r) this.f19233x, (r) this.f19234y, (df.l) this.f19235z, (c) this.f19231v, (m) obj, y.L(this.f19232w | 1));
                return pe.z.f22715a;
            case 1:
                ((Number) obj2).intValue();
                a0.a((m) this.f19233x, (l1) this.f19234y, (b2) this.f19235z, (c) this.f19231v, (m) obj, y.L(this.f19232w | 1));
                return pe.z.f22715a;
            case 2:
                ((Number) obj2).intValue();
                wa.a((b) this.f19234y, (String) this.f19235z, (r) this.f19233x, (z1.u0) this.f19231v, (m) obj, y.L(this.f19232w | 1));
                return pe.z.f22715a;
            case 3:
                ((Number) obj2).intValue();
                nb.a((k) this.f19234y, (df.a) this.f19235z, (r) this.f19233x, (kotlin.jvm.internal.m) this.f19231v, (m) obj, y.L(this.f19232w | 1));
                return pe.z.f22715a;
            default:
                ((Number) obj2).intValue();
                l.d((c3.a0) this.f19233x, (df.a) this.f19234y, (b) this.f19235z, (kotlin.jvm.internal.m) this.f19231v, (m) obj, y.L(this.f19232w | 1));
                return pe.z.f22715a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj, Object obj2, Object obj3, c cVar, int i, int i10) {
        super(2);
        this.f19230u = i10;
        this.f19233x = obj;
        this.f19234y = obj2;
        this.f19235z = obj3;
        this.f19231v = cVar;
        this.f19232w = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(b bVar, String str, r rVar, z1.u0 u0Var, int i) {
        super(2);
        this.f19230u = 2;
        this.f19234y = bVar;
        this.f19235z = str;
        this.f19233x = rVar;
        this.f19231v = u0Var;
        this.f19232w = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(k kVar, df.a aVar, r rVar, df.l lVar, int i) {
        super(2);
        this.f19230u = 3;
        this.f19234y = kVar;
        this.f19235z = aVar;
        this.f19233x = rVar;
        this.f19231v = (kotlin.jvm.internal.m) lVar;
        this.f19232w = i;
    }
}
