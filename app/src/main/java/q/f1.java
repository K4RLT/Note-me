package q;
import b1.v;
import l.a;
import r0.e1;
import r0.g1;
import r0.i1;
import r0.y;

import r0.n2;

/* loaded from: classes.dex */
public final class f1 implements n2 {
    public boolean A;
    public final i1 B;
    public q C;
    public final g1 D;
    public boolean E;
    public final r0 F;
    public final /* synthetic */ g1 G;

    /* renamed from: u, reason: collision with root package name */
    public final l1 f22894u;

    /* renamed from: v, reason: collision with root package name */
    public final i1 f22895v;

    /* renamed from: w, reason: collision with root package name */
    public final i1 f22896w;

    /* renamed from: x, reason: collision with root package name */
    public final i1 f22897x;

    /* renamed from: y, reason: collision with root package name */
    public final i1 f22898y;

    /* renamed from: z, reason: collision with root package name */
    public final e1 f22899z;

    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.Map, java.lang.Object] */
    public f1(g1 g1Var, Object obj, q qVar, l1 l1Var) {
        this.G = g1Var;
        this.f22894u = l1Var;
        i1 B = y.B(obj);
        this.f22895v = B;
        Object obj2 = null;
        i1 B2 = y.B(e.r(0.0f, 0.0f, null, 7));
        this.f22896w = B2;
        this.f22897x = y.B(new a1((z) B2.getValue(), l1Var, obj, B.getValue(), qVar));
        this.f22898y = y.B(Boolean.TRUE);
        this.f22899z = new e1(-1.0f);
        this.B = y.B(obj);
        this.C = qVar;
        this.D = new g1(a().b());
        Float f10 = (Float) t1.f23012b.get(l1Var);
        if (f10 != null) {
            float floatValue = f10.floatValue();
            q qVar2 = (q) l1Var.f22943a.invoke(obj);
            int b10 = qVar2.b();
            for (int i = 0; i < b10; i++) {
                qVar2.e(i, floatValue);
            }
            obj2 = this.f22894u.f22944b.invoke(qVar2);
        }
        this.F = e.r(0.0f, 0.0f, obj2, 3);
    }

    public final a1 a() {
        return (a1) this.f22897x.getValue();
    }

    public final void b() {
        if (this.f22899z.h() == -1.0f) {
            this.E = true;
            boolean a10 = kotlin.jvm.internal.a(a().f22843w, a().f22844x);
            i1 i1Var = this.B;
            if (a10) {
                i1Var.setValue(a().f22843w);
            } else {
                i1Var.setValue(a().f(0L));
                this.C = a().d(0L);
            }
        }
    }

    public final void e(Object obj, boolean z3) {
        k s0Var;
        i1 i1Var = this.f22895v;
        boolean a10 = kotlin.jvm.internal.a(null, i1Var.getValue());
        g1 g1Var = this.D;
        i1 i1Var2 = this.f22897x;
        z zVar = this.F;
        if (a10) {
            i1Var2.setValue(new a1(zVar, this.f22894u, obj, obj, this.C.c()));
            this.A = true;
            g1Var.i(a().b());
            return;
        }
        i1 i1Var3 = this.f22896w;
        if (z3 && !this.E) {
            if (((z) i1Var3.getValue()) instanceof r0) {
                zVar = (z) i1Var3.getValue();
            }
        } else {
            zVar = (z) i1Var3.getValue();
        }
        g1 g1Var2 = this.G;
        long e = g1Var2.e();
        i1 i1Var4 = g1Var2.f22908h;
        long j10 = 0;
        if (e <= 0) {
            s0Var = zVar;
        } else {
            s0Var = new s0(zVar, g1Var2.e());
        }
        i1Var2.setValue(new a1(s0Var, this.f22894u, obj, i1Var.getValue(), this.C));
        g1Var.i(a().b());
        this.A = false;
        i1Var4.setValue(Boolean.TRUE);
        if (g1Var2.g()) {
            v vVar = g1Var2.i;
            int size = vVar.size();
            for (int i = 0; i < size; i++) {
                f1 f1Var = (f1) vVar.get(i);
                j10 = Math.max(j10, f1Var.D.h());
                f1Var.b();
            }
            i1Var4.setValue(Boolean.FALSE);
        }
    }

    public final void f(Object obj, Object obj2, z zVar) {
        this.f22895v.setValue(obj2);
        this.f22896w.setValue(zVar);
        if (kotlin.jvm.internal.a(a().f22844x, obj) && kotlin.jvm.internal.a(a().f22843w, obj2)) {
            return;
        }
        e(obj, false);
    }

    public final void g(Object obj, z zVar) {
        Object value;
        if (!this.A || !kotlin.jvm.internal.a(obj, null)) {
            i1 i1Var = this.f22895v;
            boolean a10 = kotlin.jvm.internal.a(i1Var.getValue(), obj);
            e1 e1Var = this.f22899z;
            if (a10 && e1Var.h() == -1.0f) {
                return;
            }
            i1Var.setValue(obj);
            this.f22896w.setValue(zVar);
            float h3 = e1Var.h();
            i1 i1Var2 = this.B;
            if (h3 == -3.0f) {
                value = obj;
            } else {
                value = i1Var2.getValue();
            }
            i1 i1Var3 = this.f22898y;
            boolean z3 = true;
            e(value, !((Boolean) i1Var3.getValue()).booleanValue());
            if (e1Var.h() != -3.0f) {
                z3 = false;
            }
            i1Var3.setValue(Boolean.valueOf(z3));
            if (e1Var.h() >= 0.0f) {
                long b10 = a().b();
                i1Var2.setValue(a().f(e1Var.h() * ((float) b10)));
            } else if (e1Var.h() == -3.0f) {
                i1Var2.setValue(obj);
            }
            this.A = false;
            e1Var.i(-1.0f);
        }
    }

    @Override // n2
    public final Object getValue() {
        return this.B.getValue();
    }

    public final String toString() {
        return "current value: " + this.B.getValue() + ", target: " + this.f22895v.getValue() + ", spec: " + ((z) this.f22896w.getValue());
    }
}
