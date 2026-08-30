package z0;
import h.a;

import b8.z7;
import df.k;
import df.m;
import df.n;
import df.p;
import df.q;
import df.r;
import df.s;
import df.t;
import df.u;
import df.v;
import df.w;
import java.util.ArrayList;
import kotlin.jvm.internal.b0;
import pe.z;
import r0.q1;
import r0.y;
import t.n1;

/* loaded from: classes.dex */
public final class c implements p, q, r, s, t, u, v, w, df.b, df.c, df.e, df.f, df.g, df.h, df.i, df.j, k, m, n {

    /* renamed from: u, reason: collision with root package name */
    public final int f31755u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f31756v;

    /* renamed from: w, reason: collision with root package name */
    public Object f31757w;

    /* renamed from: x, reason: collision with root package name */
    public q1 f31758x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f31759y;

    public c(int i, Object obj, boolean z3) {
        this.f31755u = i;
        this.f31756v = z3;
        this.f31757w = obj;
    }

    @Override // df.v
    public final /* bridge */ /* synthetic */ Object a(Float f10, Float f11, Float f12, Float f13, Float f14, Float f15, Object obj, Object obj2) {
        return g(f10, f11, f12, f13, f14, f15, (r0.m) obj, ((Number) obj2).intValue());
    }

    @Override // df.q
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3) {
        return j(obj, (r0.m) obj2, ((Number) obj3).intValue());
    }

    @Override // df.s
    public final /* bridge */ /* synthetic */ Object c(Object obj, Number number, Number number2, Object obj2, Number number3) {
        return h(obj, number, number2, (r0.m) obj2, number3.intValue());
    }

    @Override // df.r
    public final /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        return i(obj, obj2, (r0.m) obj3, ((Number) obj4).intValue());
    }

    public final Object e(int i, r0.m mVar) {
        int a10;
        r0.r rVar = (r0.r) mVar;
        rVar.c0(this.f31755u);
        k(rVar);
        if (rVar.f(this)) {
            a10 = a(2, 0);
        } else {
            a10 = a(1, 0);
        }
        int i10 = i | a10;
        Object obj = this.f31757w;
        obj.getClass();
        b0.b(2, obj);
        Object invoke = ((p) obj).invoke(rVar, Integer.valueOf(i10));
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new n1(2, this, c.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 1);
        }
        return invoke;
    }

    public final Object g(final Float f10, final Float f11, final Float f12, final Float f13, final Float f14, final Float f15, r0.m mVar, final int i) {
        int a10;
        r0.r rVar = (r0.r) mVar;
        rVar.c0(this.f31755u);
        k(rVar);
        if (rVar.f(this)) {
            a10 = a(2, 6);
        } else {
            a10 = a(1, 6);
        }
        Object obj = this.f31757w;
        obj.getClass();
        b0.b(8, obj);
        Object a11 = ((v) obj).a(f10, f11, f12, f13, f14, f15, rVar, Integer.valueOf(i | a10));
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new p() { // from class: z0.b
                @Override // df.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    c.this.g(f10, f11, f12, f13, f14, f15, (r0.m) obj2, y.L(i) | 1);
                    return z.f22715a;
                }
            };
        }
        return a11;
    }

    public final Object h(Object obj, Number number, Number number2, r0.m mVar, int i) {
        int a10;
        r0.r rVar = (r0.r) mVar;
        rVar.c0(this.f31755u);
        k(rVar);
        if (rVar.f(this)) {
            a10 = a(2, 3);
        } else {
            a10 = a(1, 3);
        }
        Object obj2 = this.f31757w;
        obj2.getClass();
        b0.b(5, obj2);
        Object c10 = ((s) obj2).c(obj, number, number2, rVar, Integer.valueOf(a10 | i));
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new z7(this, obj, number, number2, i, 3);
        }
        return c10;
    }

    public final Object i(Object obj, Object obj2, r0.m mVar, int i) {
        int a10;
        r0.r rVar = (r0.r) mVar;
        rVar.c0(this.f31755u);
        k(rVar);
        if (rVar.f(this)) {
            a10 = a(2, 2);
        } else {
            a10 = a(1, 2);
        }
        Object obj3 = this.f31757w;
        obj3.getClass();
        b0.b(4, obj3);
        Object d2 = ((r) obj3).d(obj, obj2, rVar, Integer.valueOf(a10 | i));
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new a1.h(this, obj, obj2, i);
        }
        return d2;
    }

    @Override // df.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return e(((Number) obj2).intValue(), (r0.m) obj);
    }

    public final Object j(Object obj, r0.m mVar, int i) {
        int a10;
        r0.r rVar = (r0.r) mVar;
        rVar.c0(this.f31755u);
        k(rVar);
        if (rVar.f(this)) {
            a10 = a(2, 1);
        } else {
            a10 = a(1, 1);
        }
        Object obj2 = this.f31757w;
        obj2.getClass();
        b0.b(3, obj2);
        Object b10 = ((q) obj2).b(obj, rVar, Integer.valueOf(a10 | i));
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new b8.h(i, 4, this, obj);
        }
        return b10;
    }

    public final void k(r0.m mVar) {
        r0.r rVar;
        q1 z3;
        if (this.f31756v && (z3 = (rVar = (r0.r) mVar).z()) != null) {
            rVar.getClass();
            z3.f24330b |= 1;
            if (h.e(this.f31758x, z3)) {
                this.f31758x = z3;
                return;
            }
            ArrayList arrayList = this.f31759y;
            if (arrayList == null) {
                ArrayList arrayList2 = new ArrayList();
                this.f31759y = arrayList2;
                arrayList2.add(z3);
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (h.e((q1) arrayList.get(i), z3)) {
                    arrayList.set(i, z3);
                    return;
                }
            }
            arrayList.add(z3);
        }
    }
}
