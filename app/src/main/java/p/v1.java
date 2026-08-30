package p;
import l.a;
import p.b0;
import p.r0;
import p.t1;
import p.v0;
import p.v1;

import java.util.Map;

/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f22278a;

    /* renamed from: b, reason: collision with root package name */
    public final t1 f22279b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f22280c;

    /* renamed from: d, reason: collision with root package name */
    public final v0 f22281d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f22282f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ v1(r0 r10, t1 r11, b0 r12, v0 r13, java.util.LinkedHashMap r14, int r15) {
        /*
            r9 = this;
            r0 = r15 & 1
            r1 = 0
            if (r0 == 0) goto L7
            r3 = r1
            goto L8
        L7:
            r3 = r10
        L8:
            r10 = r15 & 2
            if (r10 == 0) goto Le
            r4 = r1
            goto Lf
        Le:
            r4 = r11
        Lf:
            r10 = r15 & 4
            if (r10 == 0) goto L15
            r5 = r1
            goto L16
        L15:
            r5 = r12
        L16:
            r10 = r15 & 8
            if (r10 == 0) goto L1c
            r6 = r1
            goto L1d
        L1c:
            r6 = r13
        L1d:
            r10 = r15 & 16
            if (r10 == 0) goto L24
            r10 = 0
        L22:
            r7 = r10
            goto L26
        L24:
            r10 = 1
            goto L22
        L26:
            r10 = r15 & 32
            if (r10 == 0) goto L2c
            qe.t r14 = qe.t.f24024u
        L2c:
            r2 = r9
            r8 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.v1.<init>(r0, t1, b0, v0, java.util.LinkedHashMap, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        if (kotlin.jvm.internal.a(this.f22278a, v1Var.f22278a) && kotlin.jvm.internal.a(this.f22279b, v1Var.f22279b) && kotlin.jvm.internal.a(this.f22280c, v1Var.f22280c) && kotlin.jvm.internal.a(this.f22281d, v1Var.f22281d) && this.e == v1Var.e && kotlin.jvm.internal.a(this.f22282f, v1Var.f22282f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = 0;
        r0 r0Var = this.f22278a;
        if (r0Var == null) {
            hashCode = 0;
        } else {
            hashCode = r0Var.hashCode();
        }
        int i10 = hashCode * 31;
        t1 t1Var = this.f22279b;
        if (t1Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = t1Var.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        b0 b0Var = this.f22280c;
        if (b0Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = b0Var.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        v0 v0Var = this.f22281d;
        if (v0Var != null) {
            i = v0Var.hashCode();
        }
        return this.f22282f.hashCode() + a.c((i12 + i) * 31, 31, this.e);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f22278a + ", slide=" + this.f22279b + ", changeSize=" + this.f22280c + ", scale=" + this.f22281d + ", hold=" + this.e + ", effectsMap=" + this.f22282f + ')';
    }

    public v1(r0 r0Var, t1 t1Var, b0 b0Var, v0 v0Var, boolean z3, Map map) {
        this.f22278a = r0Var;
        this.f22279b = t1Var;
        this.f22280c = b0Var;
        this.f22281d = v0Var;
        this.e = z3;
        this.f22282f = map;
    }
}
