package w7;
import a.a;
import g3.a;

import java.util.List;

/* loaded from: classes.dex */
public final class a5 {
    public static final z4 Companion = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static final pe.g[] f27867g = {null, null, null, null, null, pe.a.c(pe.h.f22690u, new u7.c2(22))};

    /* renamed from: a, reason: collision with root package name */
    public final String f27868a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27869b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27870c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27871d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final List f27872f;

    public /* synthetic */ a5(int i, String str, String str2, String str3, String str4, float f10, List list) {
        if (1 == (i & 1)) {
            this.f27868a = str;
            if ((i & 2) == 0) {
                this.f27869b = "";
            } else {
                this.f27869b = str2;
            }
            if ((i & 4) == 0) {
                this.f27870c = "";
            } else {
                this.f27870c = str3;
            }
            if ((i & 8) == 0) {
                this.f27871d = "";
            } else {
                this.f27871d = str4;
            }
            if ((i & 16) == 0) {
                this.e = 1.0f;
            } else {
                this.e = f10;
            }
            if ((i & 32) == 0) {
                this.f27872f = qe.s.f24023u;
                return;
            } else {
                this.f27872f = list;
                return;
            }
        }
        eg.p0.e(i, 1, y4.f29495a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5)) {
            return false;
        }
        a5 a5Var = (a5) obj;
        if (kotlin.jvm.internal.l.a(this.f27868a, a5Var.f27868a) && kotlin.jvm.internal.l.a(this.f27869b, a5Var.f27869b) && kotlin.jvm.internal.l.a(this.f27870c, a5Var.f27870c) && kotlin.jvm.internal.l.a(this.f27871d, a5Var.f27871d) && Float.compare(this.e, a5Var.e) == 0 && kotlin.jvm.internal.l.a(this.f27872f, a5Var.f27872f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f27872f.hashCode() + a.a(a.e(this.f27871d, a.e(this.f27870c, a.e(this.f27869b, this.f27868a.hashCode() * 31, 31), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder q10 = a.q("FrameDef(id=", this.f27868a, ", packId=", this.f27869b, ", file=");
        a.t(q10, this.f27870c, ", name=", this.f27871d, ", aspect=");
        q10.append(this.e);
        q10.append(", holes=");
        q10.append(this.f27872f);
        q10.append(")");
        return q10.toString();
    }

    public a5(String str, String str2, String str3, String str4, float f10, List list) {
        str.getClass();
        list.getClass();
        this.f27868a = str;
        this.f27869b = str2;
        this.f27870c = str3;
        this.f27871d = str4;
        this.e = f10;
        this.f27872f = list;
    }
}
