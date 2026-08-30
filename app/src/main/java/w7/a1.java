package w7;
import h8.b;
import r0.m;
import r0.y;

import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class a1 implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f27832u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f27833v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f27834w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f27835x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f27836y;

    public /* synthetic */ a1(u7.d dVar, u7.m3 m3Var, int i, int i10, int i11) {
        this.f27832u = 2;
        this.f27836y = dVar;
        this.f27833v = m3Var;
        this.f27834w = i;
        this.f27835x = i10;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        switch (this.f27832u) {
            case 0:
                u7.d dVar = (u7.d) this.f27836y;
                float floatValue = ((Float) obj).floatValue();
                float floatValue2 = ((Float) obj2).floatValue();
                u7.m3 m3Var = this.f27833v;
                int i = this.f27834w;
                int i10 = this.f27835x;
                Iterator it = m3Var.k1(i, i10).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj3 = it.next();
                        if (kotlin.jvm.internal.l.a(((u7.d) obj3).f26033a, dVar.f26033a)) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                u7.d dVar2 = (u7.d) obj3;
                if (dVar2 != null) {
                    m3Var.p1(i, i10, dVar2.f26033a, dVar2.f26037f + floatValue, dVar2.f26038g + floatValue2, dVar2.f26039h, dVar2.i, null);
                }
                return pe.z.f22715a;
            case 1:
                u7.d dVar3 = (u7.d) this.f27836y;
                float floatValue3 = ((Float) obj).floatValue();
                float floatValue4 = ((Float) obj2).floatValue();
                u7.m3 m3Var2 = this.f27833v;
                int i11 = this.f27834w;
                int i12 = this.f27835x;
                Iterator it2 = m3Var2.k1(i11, i12).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj4 = it2.next();
                        if (kotlin.jvm.internal.l.a(((u7.d) obj4).f26033a, dVar3.f26033a)) {
                        }
                    } else {
                        obj4 = null;
                    }
                }
                u7.d dVar4 = (u7.d) obj4;
                if (dVar4 != null) {
                    m3Var2.p1(i11, i12, dVar4.f26033a, dVar4.f26037f, dVar4.f26038g, floatValue3, floatValue4, null);
                }
                return pe.z.f22715a;
            case 2:
                ((Integer) obj2).getClass();
                int L = y.L(1);
                b((u7.d) this.f27836y, this.f27833v, this.f27834w, this.f27835x, (m) obj, L);
                return pe.z.f22715a;
            default:
                ((Integer) obj2).getClass();
                int L2 = y.L(1);
                b(this.f27833v, this.f27834w, this.f27835x, (df.a) this.f27836y, (m) obj, L2);
                return pe.z.f22715a;
        }
    }

    public /* synthetic */ a1(u7.m3 m3Var, int i, int i10, df.a aVar, int i11) {
        this.f27832u = 3;
        this.f27833v = m3Var;
        this.f27834w = i;
        this.f27835x = i10;
        this.f27836y = aVar;
    }

    public /* synthetic */ a1(u7.m3 m3Var, int i, int i10, u7.d dVar, int i11) {
        this.f27832u = i11;
        this.f27833v = m3Var;
        this.f27834w = i;
        this.f27835x = i10;
        this.f27836y = dVar;
    }
}
