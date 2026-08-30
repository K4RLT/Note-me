package r2;
import l.a;
import p.a;

import m2.g0;
import m2.p0;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final m2.g f24515a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24516b;

    /* renamed from: c, reason: collision with root package name */
    public final p0 f24517c;

    public x(m2.g gVar, long j10, p0 p0Var) {
        p0 p0Var2;
        this.f24515a = gVar;
        this.f24516b = g0.c(gVar.f20477v.length(), j10);
        if (p0Var != null) {
            p0Var2 = new p0(g0.c(gVar.f20477v.length(), p0Var.f20546a));
        } else {
            p0Var2 = null;
        }
        this.f24517c = p0Var2;
    }

    public static x a(x xVar, m2.g gVar, long j10, int i) {
        p0 p0Var;
        if ((i & 1) != 0) {
            gVar = xVar.f24515a;
        }
        if ((i & 2) != 0) {
            j10 = xVar.f24516b;
        }
        if ((i & 4) != 0) {
            p0Var = xVar.f24517c;
        } else {
            p0Var = null;
        }
        xVar.getClass();
        return new x(gVar, j10, p0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (p0.a(this.f24516b, xVar.f24516b) && kotlin.jvm.internal.a(this.f24517c, xVar.f24517c) && kotlin.jvm.internal.a(this.f24515a, xVar.f24515a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f24515a.hashCode() * 31;
        int i10 = p0.f20545c;
        int d2 = a.d(this.f24516b, hashCode, 31);
        p0 p0Var = this.f24517c;
        if (p0Var != null) {
            i = Long.hashCode(p0Var.f20546a);
        } else {
            i = 0;
        }
        return d2 + i;
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f24515a) + "', selection=" + ((Object) p0.g(this.f24516b)) + ", composition=" + this.f24517c + ')';
    }

    public x(String str, long j10, int i) {
        this(new m2.g((i & 1) != 0 ? "" : str), (i & 2) != 0 ? p0.f20544b : j10, (p0) null);
    }
}
