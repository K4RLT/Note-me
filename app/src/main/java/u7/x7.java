package u7;
import g3.a;
import l.a;
import p.a;
import u7.a8;

import java.util.List;

/* loaded from: classes.dex */
public final class x7 extends a8 {

    /* renamed from: a, reason: collision with root package name */
    public final int f27042a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27043b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27044c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27045d;
    public final String e;

    public x7(int i, int i10, String str, boolean z3, boolean z9) {
        this.f27042a = i;
        this.f27043b = i10;
        this.f27044c = z3;
        this.f27045d = z9;
        this.e = str;
    }

    @Override // a8
    public final String a() {
        List list = a.f25881a;
        int i = this.f27042a;
        if (i == 0) {
            return "ink";
        }
        return a.g(i, "ink:");
    }

    @Override // a8
    public final boolean b() {
        return this.f27045d;
    }

    @Override // a8
    public final boolean c() {
        return this.f27044c;
    }

    @Override // a8
    public final int d() {
        return this.f27043b;
    }

    public final int e() {
        return this.f27042a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7)) {
            return false;
        }
        x7 x7Var = (x7) obj;
        if (this.f27042a == x7Var.f27042a && this.f27043b == x7Var.f27043b && this.f27044c == x7Var.f27044c && this.f27045d == x7Var.f27045d && kotlin.jvm.internal.a(this.e, x7Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c10 = a.c(a.c(a.b(this.f27043b, Integer.hashCode(this.f27042a) * 31, 31), 31, this.f27044c), 31, this.f27045d);
        String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return c10 + hashCode;
    }

    public final String toString() {
        StringBuilder n10 = a.n("Ink(slot=", this.f27042a, ", z=", ", visible=", this.f27043b);
        n10.append(this.f27044c);
        n10.append(", locked=");
        n10.append(this.f27045d);
        n10.append(", name=");
        return a5.a.k(n10, this.e, ")");
    }
}
