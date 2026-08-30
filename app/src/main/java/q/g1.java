package q;
import b0.x;
import b1.v;
import k0.w;
import l.a;
import p.s;
import r0.g1;
import r0.i1;
import r0.l;
import r0.m;
import r0.q1;
import r0.r;
import r0.v0;
import r0.y;

/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f22902a;

    /* renamed from: b, reason: collision with root package name */
    public final g1 f22903b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22904c;

    /* renamed from: d, reason: collision with root package name */
    public final i1 f22905d = y.B(c());
    public final i1 e = y.B(new e1(c(), c()));

    /* renamed from: f, reason: collision with root package name */
    public final r0.g1 f22906f = new r0.g1(0);

    /* renamed from: g, reason: collision with root package name */
    public final r0.g1 f22907g = new r0.g1(Long.MIN_VALUE);

    /* renamed from: h, reason: collision with root package name */
    public final i1 f22908h;
    public final v i;

    /* renamed from: j, reason: collision with root package name */
    public final v f22909j;

    /* renamed from: k, reason: collision with root package name */
    public final i1 f22910k;

    public g1(i0 i0Var, g1 g1Var, String str) {
        this.f22902a = i0Var;
        this.f22903b = g1Var;
        this.f22904c = str;
        Boolean bool = Boolean.FALSE;
        this.f22908h = y.B(bool);
        this.i = new v();
        this.f22909j = new v();
        this.f22910k = y.B(bool);
        y.r(new s(this, 1));
    }

    public final void a(Object obj, m mVar, int i) {
        int i10;
        boolean z3;
        boolean z9;
        int i11;
        boolean h3;
        int i12;
        r rVar = (r) mVar;
        rVar.c0(-1493585151);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h3 = rVar.f(obj);
            } else {
                h3 = rVar.h(obj);
            }
            if (h3) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i12 | i;
        } else {
            i10 = i;
        }
        if ((i & 48) == 0) {
            if (rVar.f(this)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
        }
        boolean z10 = true;
        if ((i10 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i10 & 1, z3)) {
            if (!g()) {
                rVar.a0(1822801203);
                k(obj);
                if (kotlin.jvm.internal.a(obj, c())) {
                    if (this.f22907g.h() != Long.MIN_VALUE) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!z9 && !((Boolean) this.f22908h.getValue()).booleanValue()) {
                        rVar.a0(1824275067);
                        rVar.p(false);
                        rVar.p(false);
                    }
                }
                rVar.a0(1823032494);
                Object O = rVar.O();
                v0 v0Var = l.f24285a;
                if (O == v0Var) {
                    O = y.p(rVar);
                    rVar.k0(O);
                }
                pf.z zVar = (pf.z) O;
                boolean h10 = rVar.h(zVar);
                if ((i10 & 112) != 32) {
                    z10 = false;
                }
                boolean z11 = h10 | z10;
                Object O2 = rVar.O();
                if (z11 || O2 == v0Var) {
                    O2 = new w(zVar, 10, this);
                    rVar.k0(O2);
                }
                y.d(zVar, this, (df.l) O2, rVar);
                rVar.p(false);
                rVar.p(false);
            } else {
                rVar.a0(1824284987);
                rVar.p(false);
            }
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new x(i, 4, this, obj);
        }
    }

    public final long b() {
        v vVar = this.i;
        int size = vVar.size();
        long j10 = 0;
        for (int i = 0; i < size; i++) {
            j10 = Math.max(j10, ((f1) vVar.get(i)).D.h());
        }
        v vVar2 = this.f22909j;
        int size2 = vVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            j10 = Math.max(j10, ((g1) vVar2.get(i10)).b());
        }
        return j10;
    }

    public final Object c() {
        return this.f22902a.f22919b.getValue();
    }

    public final boolean d() {
        v vVar = this.i;
        int size = vVar.size();
        for (int i = 0; i < size; i++) {
            ((f1) vVar.get(i)).getClass();
        }
        v vVar2 = this.f22909j;
        int size2 = vVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            if (((g1) vVar2.get(i10)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        g1 g1Var = this.f22903b;
        if (g1Var != null) {
            return g1Var.e();
        }
        return this.f22906f.h();
    }

    public final d1 f() {
        return (d1) this.e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.f22910k.getValue()).booleanValue();
    }

    public final void h(long j10, boolean z3) {
        long j11;
        i0 i0Var = this.f22902a;
        i1 i1Var = i0Var.f22918a;
        r0.g1 g1Var = this.f22907g;
        if (g1Var.h() == Long.MIN_VALUE) {
            g1Var.i(j10);
            i0Var.f22918a.setValue(Boolean.TRUE);
        } else if (!((Boolean) i1Var.getValue()).booleanValue()) {
            i1Var.setValue(Boolean.TRUE);
        }
        this.f22908h.setValue(Boolean.FALSE);
        v vVar = this.i;
        int size = vVar.size();
        boolean z9 = true;
        for (int i = 0; i < size; i++) {
            f1 f1Var = (f1) vVar.get(i);
            i1 i1Var2 = f1Var.f22898y;
            i1 i1Var3 = f1Var.f22898y;
            if (!((Boolean) i1Var2.getValue()).booleanValue()) {
                if (z3) {
                    j11 = f1Var.a().b();
                } else {
                    j11 = j10;
                }
                f1Var.B.setValue(f1Var.a().f(j11));
                f1Var.C = f1Var.a().d(j11);
                if (f1Var.a().e(j11)) {
                    i1Var3.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) i1Var3.getValue()).booleanValue()) {
                z9 = false;
            }
        }
        v vVar2 = this.f22909j;
        int size2 = vVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            g1 g1Var2 = (g1) vVar2.get(i10);
            if (!kotlin.jvm.internal.a(g1Var2.f22905d.getValue(), g1Var2.c())) {
                g1Var2.h(j10, z3);
            }
            if (!kotlin.jvm.internal.a(g1Var2.f22905d.getValue(), g1Var2.c())) {
                z9 = false;
            }
        }
        if (z9) {
            i();
        }
    }

    public final void i() {
        this.f22907g.i(Long.MIN_VALUE);
        Object value = this.f22905d.getValue();
        i0 i0Var = this.f22902a;
        i0Var.f22919b.setValue(value);
        if (this.f22903b == null) {
            this.f22906f.i(0L);
        }
        i0Var.f22918a.setValue(Boolean.FALSE);
        v vVar = this.f22909j;
        int size = vVar.size();
        for (int i = 0; i < size; i++) {
            ((g1) vVar.get(i)).i();
        }
    }

    public final void j(Object obj, Object obj2) {
        this.f22907g.i(Long.MIN_VALUE);
        i0 i0Var = this.f22902a;
        i0Var.f22918a.setValue(Boolean.FALSE);
        boolean g8 = g();
        i1 i1Var = this.f22905d;
        if (!g8 || !kotlin.jvm.internal.a(c(), obj) || !kotlin.jvm.internal.a(i1Var.getValue(), obj2)) {
            if (!kotlin.jvm.internal.a(c(), obj)) {
                i0Var.f22919b.setValue(obj);
            }
            i1Var.setValue(obj2);
            this.f22910k.setValue(Boolean.TRUE);
            this.e.setValue(new e1(obj, obj2));
        }
        v vVar = this.f22909j;
        int size = vVar.size();
        for (int i = 0; i < size; i++) {
            g1 g1Var = (g1) vVar.get(i);
            g1Var.getClass();
            if (g1Var.g()) {
                g1Var.j(g1Var.c(), g1Var.f22905d.getValue());
            }
        }
        v vVar2 = this.i;
        int size2 = vVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((f1) vVar2.get(i10)).b();
        }
    }

    public final void k(Object obj) {
        i1 i1Var = this.f22905d;
        if (!kotlin.jvm.internal.a(i1Var.getValue(), obj)) {
            this.e.setValue(new e1(i1Var.getValue(), obj));
            if (!kotlin.jvm.internal.a(c(), i1Var.getValue())) {
                this.f22902a.f22919b.setValue(i1Var.getValue());
            }
            i1Var.setValue(obj);
            if (this.f22907g.h() == Long.MIN_VALUE) {
                this.f22908h.setValue(Boolean.TRUE);
            }
            v vVar = this.i;
            int size = vVar.size();
            for (int i = 0; i < size; i++) {
                ((f1) vVar.get(i)).f22899z.i(-2.0f);
            }
        }
    }

    public final String toString() {
        v vVar = this.i;
        int size = vVar.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((f1) vVar.get(i)) + ", ";
        }
        return str;
    }
}
