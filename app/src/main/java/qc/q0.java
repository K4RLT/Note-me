package qc;
import p.a;

import java.util.List;

/* loaded from: classes.dex */
public final class q0 extends c2 {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f23907a;

    /* renamed from: b, reason: collision with root package name */
    public final List f23908b;

    /* renamed from: c, reason: collision with root package name */
    public final List f23909c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f23910d;
    public final b2 e;

    /* renamed from: f, reason: collision with root package name */
    public final List f23911f;

    /* renamed from: g, reason: collision with root package name */
    public final int f23912g;

    public q0(r0 r0Var, List list, List list2, Boolean bool, b2 b2Var, List list3, int i) {
        this.f23907a = r0Var;
        this.f23908b = list;
        this.f23909c = list2;
        this.f23910d = bool;
        this.e = b2Var;
        this.f23911f = list3;
        this.f23912g = i;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof c2) {
                q0 q0Var = (q0) ((c2) obj);
                if (this.f23907a.equals(q0Var.f23907a)) {
                    List list = q0Var.f23908b;
                    List list2 = this.f23908b;
                    if (list2 == null) {
                        if (list != null) {
                            return false;
                        }
                    } else if (!list2.equals(list)) {
                        return false;
                    }
                    List list3 = q0Var.f23909c;
                    List list4 = this.f23909c;
                    if (list4 == null) {
                        if (list3 != null) {
                            return false;
                        }
                    } else if (!list4.equals(list3)) {
                        return false;
                    }
                    Boolean bool = q0Var.f23910d;
                    Boolean bool2 = this.f23910d;
                    if (bool2 == null) {
                        if (bool != null) {
                            return false;
                        }
                    } else if (!bool2.equals(bool)) {
                        return false;
                    }
                    b2 b2Var = q0Var.e;
                    b2 b2Var2 = this.e;
                    if (b2Var2 == null) {
                        if (b2Var != null) {
                            return false;
                        }
                    } else if (!b2Var2.equals(b2Var)) {
                        return false;
                    }
                    List list5 = q0Var.f23911f;
                    List list6 = this.f23911f;
                    if (list6 == null) {
                        if (list5 != null) {
                            return false;
                        }
                    } else if (!list6.equals(list5)) {
                        return false;
                    }
                    if (this.f23912g == q0Var.f23912g) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (this.f23907a.hashCode() ^ 1000003) * 1000003;
        int i = 0;
        List list = this.f23908b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i10 = (hashCode5 ^ hashCode) * 1000003;
        List list2 = this.f23909c;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        Boolean bool = this.f23910d;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        b2 b2Var = this.e;
        if (b2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = b2Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        List list3 = this.f23911f;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return ((i13 ^ i) * 1000003) ^ this.f23912g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{execution=");
        sb2.append(this.f23907a);
        sb2.append(", customAttributes=");
        sb2.append(this.f23908b);
        sb2.append(", internalKeys=");
        sb2.append(this.f23909c);
        sb2.append(", background=");
        sb2.append(this.f23910d);
        sb2.append(", currentProcessDetails=");
        sb2.append(this.e);
        sb2.append(", appProcessDetails=");
        sb2.append(this.f23911f);
        sb2.append(", uiOrientation=");
        return a.j(this.f23912g, "}", sb2);
    }
}
