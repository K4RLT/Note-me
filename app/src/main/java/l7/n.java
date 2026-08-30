package l7;
import l.a;
import p.a;

import eg.p0;

/* loaded from: classes.dex */
public final class n {
    public static final m Companion = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f19992a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f19993b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f19994c;

    /* renamed from: d, reason: collision with root package name */
    public final float f19995d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f19996f;

    /* renamed from: g, reason: collision with root package name */
    public final float f19997g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f19998h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final String f19999j;

    public /* synthetic */ n(int i, String str, Integer num, Integer num2, float f10, float f11, float f12, float f13, boolean z3, boolean z9, String str2) {
        if (1 == (i & 1)) {
            this.f19992a = str;
            if ((i & 2) == 0) {
                this.f19993b = null;
            } else {
                this.f19993b = num;
            }
            if ((i & 4) == 0) {
                this.f19994c = null;
            } else {
                this.f19994c = num2;
            }
            if ((i & 8) == 0) {
                this.f19995d = 0.0f;
            } else {
                this.f19995d = f10;
            }
            if ((i & 16) == 0) {
                this.e = 0.0f;
            } else {
                this.e = f11;
            }
            if ((i & 32) == 0) {
                this.f19996f = 0.2f;
            } else {
                this.f19996f = f12;
            }
            if ((i & 64) == 0) {
                this.f19997g = 0.2f;
            } else {
                this.f19997g = f13;
            }
            if ((i & 128) == 0) {
                this.f19998h = true;
            } else {
                this.f19998h = z3;
            }
            if ((i & 256) == 0) {
                this.i = false;
            } else {
                this.i = z9;
            }
            if ((i & 512) == 0) {
                this.f19999j = null;
                return;
            } else {
                this.f19999j = str2;
                return;
            }
        }
        p0.e(i, 1, l.f19991a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (kotlin.jvm.internal.a(this.f19992a, nVar.f19992a) && kotlin.jvm.internal.a(this.f19993b, nVar.f19993b) && kotlin.jvm.internal.a(this.f19994c, nVar.f19994c) && Float.compare(this.f19995d, nVar.f19995d) == 0 && Float.compare(this.e, nVar.e) == 0 && Float.compare(this.f19996f, nVar.f19996f) == 0 && Float.compare(this.f19997g, nVar.f19997g) == 0 && this.f19998h == nVar.f19998h && this.i == nVar.i && kotlin.jvm.internal.a(this.f19999j, nVar.f19999j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.f19992a.hashCode() * 31;
        int i = 0;
        Integer num = this.f19993b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = (hashCode3 + hashCode) * 31;
        Integer num2 = this.f19994c;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int c10 = a.c(a.c(a.a(a.a(a.a(a.a((i10 + hashCode2) * 31, 31, this.f19995d), 31, this.e), 31, this.f19996f), 31, this.f19997g), 31, this.f19998h), 31, this.i);
        String str = this.f19999j;
        if (str != null) {
            i = str.hashCode();
        }
        return c10 + i;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapePayload(shape=");
        sb2.append(this.f19992a);
        sb2.append(", fillArgb=");
        sb2.append(this.f19993b);
        sb2.append(", strokeArgb=");
        sb2.append(this.f19994c);
        sb2.append(", strokeWidth=");
        sb2.append(this.f19995d);
        sb2.append(", cornerRadius=");
        a5.a.s(sb2, this.e, ", wFrac=", this.f19996f, ", hFrac=");
        sb2.append(this.f19997g);
        sb2.append(", visible=");
        sb2.append(this.f19998h);
        sb2.append(", locked=");
        sb2.append(this.i);
        sb2.append(", name=");
        sb2.append(this.f19999j);
        sb2.append(")");
        return sb2.toString();
    }

    public n(String str, Integer num, Integer num2, float f10, float f11, float f12, float f13, boolean z3, boolean z9, String str2) {
        str.getClass();
        this.f19992a = str;
        this.f19993b = num;
        this.f19994c = num2;
        this.f19995d = f10;
        this.e = f11;
        this.f19996f = f12;
        this.f19997g = f13;
        this.f19998h = z3;
        this.i = z9;
        this.f19999j = str2;
    }
}
