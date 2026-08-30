package qc;
import p.a;

import java.util.List;

/* loaded from: classes.dex */
public final class t0 extends w1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23937a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23938b;

    /* renamed from: c, reason: collision with root package name */
    public final List f23939c;

    /* renamed from: d, reason: collision with root package name */
    public final w1 f23940d;
    public final int e;

    public t0(String str, String str2, List list, w1 w1Var, int i) {
        this.f23937a = str;
        this.f23938b = str2;
        this.f23939c = list;
        this.f23940d = w1Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            t0 t0Var = (t0) ((w1) obj);
            if (this.f23937a.equals(t0Var.f23937a)) {
                String str = t0Var.f23938b;
                String str2 = this.f23938b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f23939c.equals(t0Var.f23939c)) {
                        w1 w1Var = t0Var.f23940d;
                        w1 w1Var2 = this.f23940d;
                        if (w1Var2 != null ? w1Var2.equals(w1Var) : w1Var == null) {
                            if (this.e == t0Var.e) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f23937a.hashCode() ^ 1000003) * 1000003;
        int i = 0;
        String str = this.f23938b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f23939c.hashCode()) * 1000003;
        w1 w1Var = this.f23940d;
        if (w1Var != null) {
            i = w1Var.hashCode();
        }
        return ((hashCode3 ^ i) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f23937a);
        sb2.append(", reason=");
        sb2.append(this.f23938b);
        sb2.append(", frames=");
        sb2.append(this.f23939c);
        sb2.append(", causedBy=");
        sb2.append(this.f23940d);
        sb2.append(", overflowCount=");
        return a.j(this.e, "}", sb2);
    }
}
