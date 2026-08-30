package x;
import l.a;
import r0.y;
import x.v0;

import r0.i1;

/* loaded from: classes.dex */
public final class u0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f30007a;

    /* renamed from: b, reason: collision with root package name */
    public final i1 f30008b;

    public u0(c0 c0Var, String str) {
        this.f30007a = str;
        this.f30008b = y.B(c0Var);
    }

    @Override // v0
    public final int a(y2.c cVar) {
        return e().f29949b;
    }

    @Override // v0
    public final int b(y2.c cVar, y2.m mVar) {
        return e().f29950c;
    }

    @Override // v0
    public final int c(y2.c cVar) {
        return e().f29951d;
    }

    @Override // v0
    public final int d(y2.c cVar, y2.m mVar) {
        return e().f29948a;
    }

    public final c0 e() {
        return (c0) this.f30008b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        return kotlin.jvm.internal.a(e(), ((u0) obj).e());
    }

    public final void f(c0 c0Var) {
        this.f30008b.setValue(c0Var);
    }

    public final int hashCode() {
        return this.f30007a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30007a);
        sb2.append("(left=");
        sb2.append(e().f29948a);
        sb2.append(", top=");
        sb2.append(e().f29949b);
        sb2.append(", right=");
        sb2.append(e().f29950c);
        sb2.append(", bottom=");
        return a5.a.i(sb2, e().f29951d, ')');
    }
}
