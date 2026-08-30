package l5;
import g.b;

import java.util.Locale;
import kotlin.jvm.internal.l;
import ya.i0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f19922a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19923b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19924c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19925d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final int f19926f;

    /* renamed from: g, reason: collision with root package name */
    public final int f19927g;

    public f(int i, int i10, String str, String str2, String str3, boolean z3) {
        int i11;
        str.getClass();
        str2.getClass();
        this.f19922a = str;
        this.f19923b = str2;
        this.f19924c = z3;
        this.f19925d = i;
        this.e = str3;
        this.f19926f = i10;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        if (mf.f.n(upperCase, "INT")) {
            i11 = 3;
        } else if (!mf.f.n(upperCase, "CHAR") && !mf.f.n(upperCase, "CLOB") && !mf.f.n(upperCase, "TEXT")) {
            if (mf.f.n(upperCase, "BLOB")) {
                i11 = 5;
            } else if (!mf.f.n(upperCase, "REAL") && !mf.f.n(upperCase, "FLOA") && !mf.f.n(upperCase, "DOUB")) {
                i11 = 1;
            } else {
                i11 = 4;
            }
        } else {
            i11 = 2;
        }
        this.f19927g = i11;
    }

    public final boolean equals(Object obj) {
        boolean z3;
        boolean z9;
        if (this != obj) {
            if (obj instanceof f) {
                if (this.f19925d > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                f fVar = (f) obj;
                int i = fVar.f19926f;
                if (fVar.f19925d > 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z3 == z9 && l.a(this.f19922a, fVar.f19922a) && this.f19924c == fVar.f19924c) {
                    String str = fVar.e;
                    int i10 = this.f19926f;
                    String str2 = this.e;
                    if ((i10 != 1 || i != 2 || str2 == null || i0.a(str2, str)) && ((i10 != 2 || i != 1 || str == null || i0.a(str, str2)) && ((i10 == 0 || i10 != i || (str2 == null ? str == null : i0.a(str2, str))) && this.f19927g == fVar.f19927g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.f19922a.hashCode() * 31) + this.f19927g) * 31;
        if (this.f19924c) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((hashCode + i) * 31) + this.f19925d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |Column {\n            |   name = '");
        sb2.append(this.f19922a);
        sb2.append("',\n            |   type = '");
        sb2.append(this.f19923b);
        sb2.append("',\n            |   affinity = '");
        sb2.append(this.f19927g);
        sb2.append("',\n            |   notNull = '");
        sb2.append(this.f19924c);
        sb2.append("',\n            |   primaryKeyPosition = '");
        sb2.append(this.f19925d);
        sb2.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        sb2.append(str);
        sb2.append("'\n            |}\n        ");
        return mf.b(mf.g.d(sb2.toString()));
    }
}
