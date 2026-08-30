package k7;
import a.a;

import eg.p0;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class f {
    public static final e Companion = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f19605a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19606b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19607c;

    /* renamed from: d, reason: collision with root package name */
    public final float f19608d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f19609f;

    /* renamed from: g, reason: collision with root package name */
    public final int f19610g;

    /* renamed from: h, reason: collision with root package name */
    public final String f19611h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f19612j;

    /* renamed from: k, reason: collision with root package name */
    public final String f19613k;

    /* renamed from: l, reason: collision with root package name */
    public final long f19614l;

    /* renamed from: m, reason: collision with root package name */
    public final long f19615m;

    public /* synthetic */ f(int i, String str, String str2, int i10, float f10, float f11, float f12, int i11, String str3, String str4, String str5, String str6, long j10, long j11) {
        if (6271 == (i & 6271)) {
            this.f19605a = str;
            this.f19606b = str2;
            this.f19607c = i10;
            this.f19608d = f10;
            this.e = f11;
            this.f19609f = f12;
            this.f19610g = i11;
            if ((i & 128) == 0) {
                this.f19611h = null;
            } else {
                this.f19611h = str3;
            }
            if ((i & 256) == 0) {
                this.i = null;
            } else {
                this.i = str4;
            }
            if ((i & 512) == 0) {
                this.f19612j = null;
            } else {
                this.f19612j = str5;
            }
            if ((i & 1024) == 0) {
                this.f19613k = null;
            } else {
                this.f19613k = str6;
            }
            this.f19614l = j10;
            this.f19615m = j11;
            return;
        }
        p0.e(i, 6271, d.f19604a.d());
        throw null;
    }

    public static f a(f fVar, String str, String str2, int i, float f10, float f11, float f12, int i10, String str3, long j10, long j11, int i11) {
        String str4;
        String str5;
        int i12;
        float f13;
        float f14;
        float f15;
        int i13;
        String str6;
        long j12;
        long j13;
        if ((i11 & 1) != 0) {
            str4 = fVar.f19605a;
        } else {
            str4 = str;
        }
        if ((i11 & 2) != 0) {
            str5 = fVar.f19606b;
        } else {
            str5 = str2;
        }
        if ((i11 & 4) != 0) {
            i12 = fVar.f19607c;
        } else {
            i12 = i;
        }
        if ((i11 & 8) != 0) {
            f13 = fVar.f19608d;
        } else {
            f13 = f10;
        }
        if ((i11 & 16) != 0) {
            f14 = fVar.e;
        } else {
            f14 = f11;
        }
        if ((i11 & 32) != 0) {
            f15 = fVar.f19609f;
        } else {
            f15 = f12;
        }
        if ((i11 & 64) != 0) {
            i13 = fVar.f19610g;
        } else {
            i13 = i10;
        }
        String str7 = fVar.f19611h;
        String str8 = fVar.i;
        String str9 = fVar.f19612j;
        if ((i11 & 1024) != 0) {
            str6 = fVar.f19613k;
        } else {
            str6 = str3;
        }
        if ((i11 & 2048) != 0) {
            j12 = fVar.f19614l;
        } else {
            j12 = j10;
        }
        if ((i11 & 4096) != 0) {
            j13 = fVar.f19615m;
        } else {
            j13 = j11;
        }
        fVar.getClass();
        str4.getClass();
        str5.getClass();
        return new f(str4, str5, i12, f13, f14, f15, i13, str7, str8, str9, str6, j12, j13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (l.a(this.f19605a, fVar.f19605a) && l.a(this.f19606b, fVar.f19606b) && this.f19607c == fVar.f19607c && Float.compare(this.f19608d, fVar.f19608d) == 0 && Float.compare(this.e, fVar.e) == 0 && Float.compare(this.f19609f, fVar.f19609f) == 0 && this.f19610g == fVar.f19610g && l.a(this.f19611h, fVar.f19611h) && l.a(this.i, fVar.i) && l.a(this.f19612j, fVar.f19612j) && l.a(this.f19613k, fVar.f19613k) && this.f19614l == fVar.f19614l && this.f19615m == fVar.f19615m) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int b10 = p.a.b(this.f19610g, p.a(p.a(p.a(p.a.b(this.f19607c, g3.a.e(this.f19606b, this.f19605a.hashCode() * 31, 31), 31), 31, this.f19608d), 31, this.e), 31, this.f19609f), 31);
        int i = 0;
        String str = this.f19611h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (b10 + hashCode) * 31;
        String str2 = this.i;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.f19612j;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.f19613k;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return Long.hashCode(this.f19615m) + p.a.d(this.f19614l, (i12 + i) * 31, 31);
    }

    public final String toString() {
        StringBuilder q10 = p.a.q("NotebookEntity(id=", this.f19605a, ", title=", this.f19606b, ", pageCount=");
        q10.append(this.f19607c);
        q10.append(", colorR=");
        q10.append(this.f19608d);
        q10.append(", colorG=");
        a5.a.s(q10, this.e, ", colorB=", this.f19609f, ", orderIndex=");
        q10.append(this.f19610g);
        q10.append(", coverConfig=");
        q10.append(this.f19611h);
        q10.append(", backgroundConfig=");
        g3.a.t(q10, this.i, ", sizeId=", this.f19612j, ", stackId=");
        q10.append(this.f19613k);
        q10.append(", createdAt=");
        q10.append(this.f19614l);
        q10.append(", updatedAt=");
        q10.append(this.f19615m);
        q10.append(")");
        return q10.toString();
    }

    public f(String str, String str2, int i, float f10, float f11, float f12, int i10, String str3, String str4, String str5, String str6, long j10, long j11) {
        str.getClass();
        str2.getClass();
        this.f19605a = str;
        this.f19606b = str2;
        this.f19607c = i;
        this.f19608d = f10;
        this.e = f11;
        this.f19609f = f12;
        this.f19610g = i10;
        this.f19611h = str3;
        this.i = str4;
        this.f19612j = str5;
        this.f19613k = str6;
        this.f19614l = j10;
        this.f19615m = j11;
    }

    public /* synthetic */ f(String str, String str2, int i, float f10, float f11, float f12, int i10, String str3, long j10, long j11) {
        this(str, str2, i, f10, f11, f12, i10, null, null, null, str3, j10, j11);
    }
}
