package r0;
import n.c0;
import n.i0;

/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public x f24329a;

    /* renamed from: b, reason: collision with root package name */
    public int f24330b;

    /* renamed from: c, reason: collision with root package name */
    public a f24331c;

    /* renamed from: d, reason: collision with root package name */
    public df.p f24332d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public c0 f24333f;

    /* renamed from: g, reason: collision with root package name */
    public i0 f24334g;

    public q1(x xVar) {
        this.f24329a = xVar;
    }

    public final boolean a() {
        boolean z3;
        if (this.f24329a != null) {
            a aVar = this.f24331c;
            if (aVar != null) {
                z3 = aVar.a();
            } else {
                z3 = false;
            }
            if (z3) {
                return true;
            }
        }
        return false;
    }

    public final q0 b(Object obj) {
        q0 r8;
        x xVar = this.f24329a;
        if (xVar != null && (r8 = xVar.r(this, obj)) != null) {
            return r8;
        }
        return q0.f24324u;
    }

    public final void c() {
        x xVar = this.f24329a;
        if (xVar != null) {
            xVar.I = true;
            xVar.L.h();
        }
        this.f24329a = null;
        this.f24333f = null;
        this.f24334g = null;
        this.f24332d = null;
    }

    public final void d(boolean z3) {
        int i;
        int i10 = this.f24330b;
        if (z3) {
            i = i10 | 32;
        } else {
            i = i10 & (-33);
        }
        this.f24330b = i;
    }

    public final void e(df.p pVar) {
        this.f24332d = pVar;
    }
}
