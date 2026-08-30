package x;
import r0.y;
import x.v0;

import r0.i1;

/* loaded from: classes.dex */
public final class a implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f29931a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29932b;

    /* renamed from: c, reason: collision with root package name */
    public final i1 f29933c = y.B(j3.c.e);

    /* renamed from: d, reason: collision with root package name */
    public final i1 f29934d = y.B(Boolean.TRUE);

    public a(int i, String str) {
        this.f29931a = i;
        this.f29932b = str;
    }

    @Override // v0
    public final int a(y2.c cVar) {
        return e().f18875b;
    }

    @Override // v0
    public final int b(y2.c cVar, y2.m mVar) {
        return e().f18876c;
    }

    @Override // v0
    public final int c(y2.c cVar) {
        return e().f18877d;
    }

    @Override // v0
    public final int d(y2.c cVar, y2.m mVar) {
        return e().f18874a;
    }

    public final j3.c e() {
        return (j3.c) this.f29933c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                if (this.f29931a == ((a) obj).f29931a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void f(q3.q0 q0Var, int i) {
        int i10 = this.f29931a;
        if (i != 0 && (i & i10) == 0) {
            return;
        }
        this.f29933c.setValue(q0Var.f23423a.g(i10));
        this.f29934d.setValue(Boolean.valueOf(q0Var.f23423a.q(i10)));
    }

    public final int hashCode() {
        return this.f29931a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f29932b);
        sb2.append('(');
        sb2.append(e().f18874a);
        sb2.append(", ");
        sb2.append(e().f18875b);
        sb2.append(", ");
        sb2.append(e().f18876c);
        sb2.append(", ");
        return a5.a.i(sb2, e().f18877d, ')');
    }
}
