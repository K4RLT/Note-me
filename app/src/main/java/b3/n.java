package b3;
import l.b;
import l.c;
import a.a;
import s.k;
import s.l;

import c3.a0;
import g0.i2;
import java.util.Arrays;
import k0.v0;
import pe.z;
import r0.y;
import ya.nb;
import z1.h1;
import z1.k1;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1683u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f1684v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f1685w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f1686x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f1687y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(a0 a0Var, df.a aVar, df.l lVar, int i) {
        super(2);
        this.f1683u = 5;
        this.f1684v = a0Var;
        this.f1686x = aVar;
        this.f1687y = (kotlin.jvm.internal.m) lVar;
        this.f1685w = i;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [kotlin.jvm.internal.m, df.a] */
    /* JADX WARN: Type inference failed for: r1v12, types: [kotlin.jvm.internal.m, df.l] */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.internal.m, df.l] */
    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1683u) {
            case 0:
                ((Number) obj2).intValue();
                androidx.compose.ui.viewinterop.a((df.l) this.f1684v, (d1.r) this.f1687y, (df.l) this.f1686x, (r0.m) obj, y.L(this.f1685w | 1));
                return z.f22715a;
            case 1:
                ((Number) obj2).intValue();
                i2 i2Var = (i2) this.f1686x;
                Object[] objArr = (Object[]) this.f1687y;
                i2Var.b(Arrays.copyOf(objArr, objArr.length), (df.l) this.f1684v, (r0.m) obj, y.L(this.f1685w | 1));
                return z.f22715a;
            case 2:
                ((Number) obj2).intValue();
                v0.a((k0.o) this.f1684v, (d1.e) this.f1686x, (z0.c) this.f1687y, (r0.m) obj, y.L(this.f1685w | 1));
                return z.f22715a;
            case 3:
                ((Number) obj2).intValue();
                k kVar = (k) this.f1684v;
                df.a aVar = (df.a) this.f1686x;
                Object r32 = (kotlin.jvm.internal.m) this.f1687y;
                nb.a(kVar, aVar, d1.o.f15687a, r32, (r0.m) obj, y.L(this.f1685w | 1));
                return z.f22715a;
            case 4:
                ((Number) obj2).intValue();
                l.b((String) this.f1684v, (b) this.f1686x, (kotlin.jvm.internal.m) this.f1687y, (r0.m) obj, y.L(this.f1685w | 1));
                return z.f22715a;
            case 5:
                ((Number) obj2).intValue();
                l.c((a0) this.f1684v, (df.a) this.f1686x, (kotlin.jvm.internal.m) this.f1687y, (r0.m) obj, y.L(this.f1685w | 1));
                return z.f22715a;
            case 6:
                ((Number) obj2).intValue();
                x.a((d1.r) this.f1687y, (d1.e) this.f1684v, (z0.c) this.f1686x, (r0.m) obj, y.L(this.f1685w | 1));
                return z.f22715a;
            default:
                ((Number) obj2).intValue();
                h1.c((k1) this.f1684v, (d1.r) this.f1687y, (df.p) this.f1686x, (r0.m) obj, y.L(this.f1685w | 1));
                return z.f22715a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(d1.r rVar, d1.e eVar, z0.c cVar, int i) {
        super(2);
        this.f1683u = 6;
        this.f1687y = rVar;
        this.f1684v = eVar;
        this.f1686x = cVar;
        this.f1685w = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(i2 i2Var, Object[] objArr, df.l lVar, int i) {
        super(2);
        this.f1683u = 1;
        this.f1686x = i2Var;
        this.f1687y = objArr;
        this.f1684v = lVar;
        this.f1685w = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, d1.r rVar, pe.d dVar, int i, int i10) {
        super(2);
        this.f1683u = i10;
        this.f1684v = obj;
        this.f1687y = rVar;
        this.f1686x = dVar;
        this.f1685w = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(String str, b bVar, df.a aVar, int i) {
        super(2);
        this.f1683u = 4;
        this.f1684v = str;
        this.f1686x = bVar;
        this.f1687y = (kotlin.jvm.internal.m) aVar;
        this.f1685w = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k0.o oVar, d1.e eVar, z0.c cVar, int i) {
        super(2);
        this.f1683u = 2;
        this.f1684v = oVar;
        this.f1686x = eVar;
        this.f1687y = cVar;
        this.f1685w = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(k kVar, df.a aVar, df.l lVar, int i) {
        super(2);
        this.f1683u = 3;
        this.f1684v = kVar;
        this.f1686x = aVar;
        this.f1687y = (kotlin.jvm.internal.m) lVar;
        this.f1685w = i;
    }
}