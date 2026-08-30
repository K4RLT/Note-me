package w7;
import g3.a;
import w7.r9;
import w7.s9;

import java.util.List;

/* loaded from: classes.dex */
public final class s9 {
    public static final r9 Companion = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final pe.g[] f29079n;

    /* renamed from: a, reason: collision with root package name */
    public final String f29080a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29081b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f29082c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f29083d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final String f29084f;

    /* renamed from: g, reason: collision with root package name */
    public final String f29085g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f29086h;
    public final List i;

    /* renamed from: j, reason: collision with root package name */
    public final List f29087j;

    /* renamed from: k, reason: collision with root package name */
    public final List f29088k;

    /* renamed from: l, reason: collision with root package name */
    public final List f29089l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f29090m;

    /* JADX WARN: Type inference failed for: r0v0, types: [r9, java.lang.Object] */
    static {
        u7.c2 c2Var = new u7.c2(23);
        pe.h hVar = pe.h.f22690u;
        f29079n = new pe.g[]{null, null, null, null, null, null, null, null, pe.a.c(hVar, c2Var), pe.a.c(hVar, new u7.c2(24)), pe.a.c(hVar, new u7.c2(25)), pe.a.c(hVar, new u7.c2(26)), null};
    }

    public /* synthetic */ s9(int i, String str, String str2, boolean z3, boolean z9, String str3, String str4, String str5, boolean z10, List list, List list2, List list3, List list4, boolean z11) {
        if (3 == (i & 3)) {
            this.f29080a = str;
            this.f29081b = str2;
            if ((i & 4) == 0) {
                this.f29082c = false;
            } else {
                this.f29082c = z3;
            }
            if ((i & 8) == 0) {
                this.f29083d = false;
            } else {
                this.f29083d = z9;
            }
            if ((i & 16) == 0) {
                this.e = "bundled";
            } else {
                this.e = str3;
            }
            if ((i & 32) == 0) {
                this.f29084f = null;
            } else {
                this.f29084f = str4;
            }
            if ((i & 64) == 0) {
                this.f29085g = "";
            } else {
                this.f29085g = str5;
            }
            if ((i & 128) == 0) {
                this.f29086h = false;
            } else {
                this.f29086h = z10;
            }
            int i10 = i & 256;
            qe.s sVar = qe.s.f24023u;
            if (i10 == 0) {
                this.i = sVar;
            } else {
                this.i = list;
            }
            if ((i & 512) == 0) {
                this.f29087j = sVar;
            } else {
                this.f29087j = list2;
            }
            if ((i & 1024) == 0) {
                this.f29088k = sVar;
            } else {
                this.f29088k = list3;
            }
            if ((i & 2048) == 0) {
                this.f29089l = sVar;
            } else {
                this.f29089l = list4;
            }
            if ((i & 4096) == 0) {
                this.f29090m = false;
                return;
            } else {
                this.f29090m = z11;
                return;
            }
        }
        eg.p0.e(i, 3, q9.f28962a.d());
        throw null;
    }

    public static s9 a(s9 s9Var, String str, boolean z3, boolean z9, List list, List list2, boolean z10) {
        String str2 = s9Var.f29081b;
        String str3 = s9Var.f29084f;
        String str4 = s9Var.f29085g;
        boolean z11 = s9Var.f29086h;
        List list3 = s9Var.i;
        List list4 = s9Var.f29088k;
        s9Var.getClass();
        str.getClass();
        str2.getClass();
        str4.getClass();
        list3.getClass();
        list4.getClass();
        list2.getClass();
        return new s9(str, str2, z3, z9, "cloud", str3, str4, z11, list3, list, list4, list2, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9)) {
            return false;
        }
        s9 s9Var = (s9) obj;
        if (kotlin.jvm.internal.l.a(this.f29080a, s9Var.f29080a) && kotlin.jvm.internal.l.a(this.f29081b, s9Var.f29081b) && this.f29082c == s9Var.f29082c && this.f29083d == s9Var.f29083d && kotlin.jvm.internal.l.a(this.e, s9Var.e) && kotlin.jvm.internal.l.a(this.f29084f, s9Var.f29084f) && kotlin.jvm.internal.l.a(this.f29085g, s9Var.f29085g) && this.f29086h == s9Var.f29086h && kotlin.jvm.internal.l.a(this.i, s9Var.i) && kotlin.jvm.internal.l.a(this.f29087j, s9Var.f29087j) && kotlin.jvm.internal.l.a(this.f29088k, s9Var.f29088k) && kotlin.jvm.internal.l.a(this.f29089l, s9Var.f29089l) && this.f29090m == s9Var.f29090m) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int e = a.e(this.e, a.c(a.c(a.e(this.f29081b, this.f29080a.hashCode() * 31, 31), 31, this.f29082c), 31, this.f29083d), 31);
        String str = this.f29084f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Boolean.hashCode(this.f29090m) + ((this.f29089l.hashCode() + ((this.f29088k.hashCode() + ((this.f29087j.hashCode() + ((this.i.hashCode() + a.c(a.e(this.f29085g, (e + hashCode) * 31, 31), 31, this.f29086h)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder q10 = a.q("StickerPack(id=", this.f29080a, ", name=", this.f29081b, ", premium=");
        q10.append(this.f29082c);
        q10.append(", tape=");
        q10.append(this.f29083d);
        q10.append(", delivery=");
        a.t(q10, this.e, ", thumb=", this.f29084f, ", unlock=");
        q10.append(this.f29085g);
        q10.append(", diecut=");
        q10.append(this.f29086h);
        q10.append(", files=");
        q10.append(this.i);
        q10.append(", frames=");
        q10.append(this.f29087j);
        q10.append(", tapes=");
        q10.append(this.f29088k);
        q10.append(", ornaments=");
        q10.append(this.f29089l);
        q10.append(", taller=");
        q10.append(this.f29090m);
        q10.append(")");
        return q10.toString();
    }

    public s9(String str, String str2, boolean z3, boolean z9, String str3, String str4, String str5, boolean z10, List list, List list2, List list3, List list4, boolean z11) {
        this.f29080a = str;
        this.f29081b = str2;
        this.f29082c = z3;
        this.f29083d = z9;
        this.e = str3;
        this.f29084f = str4;
        this.f29085g = str5;
        this.f29086h = z10;
        this.i = list;
        this.f29087j = list2;
        this.f29088k = list3;
        this.f29089l = list4;
        this.f29090m = z11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ s9(java.lang.String r15, java.lang.String r16, java.util.ArrayList r17) {
        /*
            r14 = this;
            r8 = 0
            r13 = 0
            r3 = 0
            r4 = 0
            java.lang.String r5 = "bundled"
            r6 = 0
            java.lang.String r7 = ""
            qe.s r9 = qe.s.f24023u
            r11 = r9
            r12 = r9
            r0 = r14
            r1 = r15
            r2 = r16
            r10 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.s9.<init>(java.lang.String, java.lang.String, java.util.ArrayList):void");
    }
}
