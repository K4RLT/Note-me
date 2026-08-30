package r2;

import com.google.android.gms.internal.ads.a2;
import com.google.android.gms.internal.ads.l3;
import wa.b9;

/* loaded from: classes.dex */
public final class u implements g {

    /* renamed from: a, reason: collision with root package name */
    public final int f24509a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24510b;

    public u(int i, int i10) {
        this.f24509a = i;
        this.f24510b = i10;
    }

    @Override // r2.g
    public final void a(a2 a2Var) {
        boolean z3;
        if (a2Var.f4316x != -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        l3 l3Var = (l3) a2Var.f4318z;
        if (z3) {
            a2Var.f4316x = -1;
            a2Var.f4317y = -1;
        }
        int e = b9.e(this.f24509a, 0, l3Var.c());
        int e8 = b9.e(this.f24510b, 0, l3Var.c());
        if (e != e8) {
            if (e < e8) {
                a2Var.f(e, e8);
            } else {
                a2Var.f(e8, e);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f24509a == uVar.f24509a && this.f24510b == uVar.f24510b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f24509a * 31) + this.f24510b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingRegionCommand(start=");
        sb2.append(this.f24509a);
        sb2.append(", end=");
        return a5.a.i(sb2, this.f24510b, ')');
    }
}
