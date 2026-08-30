package k7;
import a.a;

import eg.p0;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class c {
    public static final b Companion = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f19594a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19595b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19596c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19597d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final int f19598f;

    /* renamed from: g, reason: collision with root package name */
    public final float f19599g;

    /* renamed from: h, reason: collision with root package name */
    public final float f19600h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final float f19601j;

    /* renamed from: k, reason: collision with root package name */
    public final String f19602k;

    /* renamed from: l, reason: collision with root package name */
    public final long f19603l;

    public /* synthetic */ c(int i, String str, String str2, int i10, int i11, String str3, int i12, float f10, float f11, float f12, float f13, String str4, long j10) {
        if (4095 == (i & 4095)) {
            this.f19594a = str;
            this.f19595b = str2;
            this.f19596c = i10;
            this.f19597d = i11;
            this.e = str3;
            this.f19598f = i12;
            this.f19599g = f10;
            this.f19600h = f11;
            this.i = f12;
            this.f19601j = f13;
            this.f19602k = str4;
            this.f19603l = j10;
            return;
        }
        p0.e(i, 4095, a.f19593a.d());
        throw null;
    }

    public static c a(c cVar, String str, String str2, String str3, int i) {
        String str4;
        String str5;
        if ((i & 1) != 0) {
            str4 = cVar.f19594a;
        } else {
            str4 = str;
        }
        if ((i & 2) != 0) {
            str5 = cVar.f19595b;
        } else {
            str5 = str2;
        }
        int i10 = cVar.f19596c;
        int i11 = cVar.f19597d;
        String str6 = cVar.e;
        int i12 = cVar.f19598f;
        float f10 = cVar.f19599g;
        float f11 = cVar.f19600h;
        float f12 = cVar.i;
        float f13 = cVar.f19601j;
        long j10 = cVar.f19603l;
        str4.getClass();
        str5.getClass();
        str6.getClass();
        return new c(str4, str5, i10, i11, str6, i12, f10, f11, f12, f13, str3, j10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (l.a(this.f19594a, cVar.f19594a) && l.a(this.f19595b, cVar.f19595b) && this.f19596c == cVar.f19596c && this.f19597d == cVar.f19597d && l.a(this.e, cVar.e) && this.f19598f == cVar.f19598f && Float.compare(this.f19599g, cVar.f19599g) == 0 && Float.compare(this.f19600h, cVar.f19600h) == 0 && Float.compare(this.i, cVar.i) == 0 && Float.compare(this.f19601j, cVar.f19601j) == 0 && l.a(this.f19602k, cVar.f19602k) && this.f19603l == cVar.f19603l) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f19603l) + g3.a.e(this.f19602k, p.a(p.a(p.a(p.a(p.a.b(this.f19598f, g3.a.e(this.e, p.a.b(this.f19597d, p.a.b(this.f19596c, g3.a.e(this.f19595b, this.f19594a.hashCode() * 31, 31), 31), 31), 31), 31), 31, this.f19599g), 31, this.f19600h), 31, this.i), 31, this.f19601j), 31);
    }

    public final String toString() {
        StringBuilder q10 = p.a.q("CanvasElementEntity(id=", this.f19594a, ", notebookId=", this.f19595b, ", spreadIndex=");
        a5.a.n(this.f19596c, this.f19597d, ", pageSide=", ", type=", q10);
        q10.append(this.e);
        q10.append(", zIndex=");
        q10.append(this.f19598f);
        q10.append(", x=");
        a5.a.s(q10, this.f19599g, ", y=", this.f19600h, ", scale=");
        a5.a.s(q10, this.i, ", rotation=", this.f19601j, ", payload=");
        q10.append(this.f19602k);
        q10.append(", createdAt=");
        q10.append(this.f19603l);
        q10.append(")");
        return q10.toString();
    }

    public c(String str, String str2, int i, int i10, String str3, int i11, float f10, float f11, float f12, float f13, String str4, long j10) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f19594a = str;
        this.f19595b = str2;
        this.f19596c = i;
        this.f19597d = i10;
        this.e = str3;
        this.f19598f = i11;
        this.f19599g = f10;
        this.f19600h = f11;
        this.i = f12;
        this.f19601j = f13;
        this.f19602k = str4;
        this.f19603l = j10;
    }
}
