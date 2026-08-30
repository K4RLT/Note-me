package p;
import x.d;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: b, reason: collision with root package name */
    public static final q0 f22231b = new q0(new v1((r0) null, (t1) null, (b0) null, (v0) null, (LinkedHashMap) null, 63));

    /* renamed from: c, reason: collision with root package name */
    public static final q0 f22232c = new q0(new v1((r0) null, (t1) null, (b0) null, (v0) null, (LinkedHashMap) null, 47));

    /* renamed from: a, reason: collision with root package name */
    public final v1 f22233a;

    public q0(v1 v1Var) {
        this.f22233a = v1Var;
    }

    public final q0 a(q0 q0Var) {
        boolean z3;
        v1 v1Var = q0Var.f22233a;
        r0 r0Var = v1Var.f22278a;
        v1 v1Var2 = this.f22233a;
        if (r0Var == null) {
            r0Var = v1Var2.f22278a;
        }
        t1 t1Var = v1Var.f22279b;
        if (t1Var == null) {
            t1Var = v1Var2.f22279b;
        }
        b0 b0Var = v1Var.f22280c;
        if (b0Var == null) {
            b0Var = v1Var2.f22280c;
        }
        v0 v0Var = v1Var.f22281d;
        if (v0Var == null) {
            v0Var = v1Var2.f22281d;
        }
        if (!v1Var.e && !v1Var2.e) {
            z3 = false;
        } else {
            z3 = true;
        }
        return new q0(new v1(r0Var, t1Var, b0Var, v0Var, z3, qe.d(v1Var2.f22282f, v1Var.f22282f)));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof q0) && ((q0) obj).f22233a.equals(this.f22233a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22233a.hashCode();
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        if (equals(f22231b)) {
            return "ExitTransition.None";
        }
        if (equals(f22232c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb2 = new StringBuilder("ExitTransition: \nFade - ");
        v1 v1Var = this.f22233a;
        r0 r0Var = v1Var.f22278a;
        String str4 = null;
        if (r0Var != null) {
            str = r0Var.toString();
        } else {
            str = null;
        }
        sb2.append(str);
        sb2.append(",\nSlide - ");
        t1 t1Var = v1Var.f22279b;
        if (t1Var != null) {
            str2 = t1Var.toString();
        } else {
            str2 = null;
        }
        sb2.append(str2);
        sb2.append(",\nShrink - ");
        b0 b0Var = v1Var.f22280c;
        if (b0Var != null) {
            str3 = b0Var.toString();
        } else {
            str3 = null;
        }
        sb2.append(str3);
        sb2.append(",\nScale - ");
        v0 v0Var = v1Var.f22281d;
        if (v0Var != null) {
            str4 = v0Var.toString();
        }
        sb2.append(str4);
        sb2.append(",\nKeepUntilTransitionsFinished - ");
        sb2.append(v1Var.e);
        return sb2.toString();
    }
}
