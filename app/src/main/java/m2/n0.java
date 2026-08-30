package m2;
import l.a;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f20529a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f20530b;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f20531c;

    /* renamed from: d, reason: collision with root package name */
    public final h0 f20532d;

    public n0(h0 h0Var, h0 h0Var2, h0 h0Var3, h0 h0Var4) {
        this.f20529a = h0Var;
        this.f20530b = h0Var2;
        this.f20531c = h0Var3;
        this.f20532d = h0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (kotlin.jvm.internal.a(this.f20529a, n0Var.f20529a) && kotlin.jvm.internal.a(this.f20530b, n0Var.f20530b) && kotlin.jvm.internal.a(this.f20531c, n0Var.f20531c) && kotlin.jvm.internal.a(this.f20532d, n0Var.f20532d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i10;
        int i11;
        int i12 = 0;
        h0 h0Var = this.f20529a;
        if (h0Var != null) {
            i = h0Var.hashCode();
        } else {
            i = 0;
        }
        int i13 = i * 31;
        h0 h0Var2 = this.f20530b;
        if (h0Var2 != null) {
            i10 = h0Var2.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i13 + i10) * 31;
        h0 h0Var3 = this.f20531c;
        if (h0Var3 != null) {
            i11 = h0Var3.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        h0 h0Var4 = this.f20532d;
        if (h0Var4 != null) {
            i12 = h0Var4.hashCode();
        }
        return i15 + i12;
    }
}
