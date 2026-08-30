package h7;
import l.a;

import eg.p0;

/* loaded from: classes.dex */
public final class m {
    public static final l Companion = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final int f17904a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17905b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17906c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17907d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17908f;

    /* renamed from: g, reason: collision with root package name */
    public final int f17909g;

    /* renamed from: h, reason: collision with root package name */
    public final int f17910h;

    public /* synthetic */ m(int i, int i10, String str, String str2, long j10, String str3, int i11, int i12, int i13) {
        if (30 == (i & 30)) {
            if ((i & 1) == 0) {
                this.f17904a = 1;
            } else {
                this.f17904a = i10;
            }
            this.f17905b = str;
            this.f17906c = str2;
            this.f17907d = j10;
            this.e = str3;
            if ((i & 32) == 0) {
                this.f17908f = 1;
            } else {
                this.f17908f = i11;
            }
            if ((i & 64) == 0) {
                this.f17909g = 1;
            } else {
                this.f17909g = i12;
            }
            if ((i & 128) == 0) {
                this.f17910h = 0;
                return;
            } else {
                this.f17910h = i13;
                return;
            }
        }
        p0.e(i, 30, k.f17903a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f17904a == mVar.f17904a && kotlin.jvm.internal.a(this.f17905b, mVar.f17905b) && kotlin.jvm.internal.a(this.f17906c, mVar.f17906c) && this.f17907d == mVar.f17907d && kotlin.jvm.internal.a(this.e, mVar.e) && this.f17908f == mVar.f17908f && this.f17909g == mVar.f17909g && this.f17910h == mVar.f17910h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17910h) + p.a.b(this.f17909g, p.a.b(this.f17908f, g3.a.e(this.e, p.a.d(this.f17907d, g3.a.e(this.f17906c, g3.a.e(this.f17905b, Integer.hashCode(this.f17904a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScrapManifest(formatVersion=");
        sb2.append(this.f17904a);
        sb2.append(", notebookId=");
        sb2.append(this.f17905b);
        sb2.append(", title=");
        sb2.append(this.f17906c);
        sb2.append(", exportedAt=");
        sb2.append(this.f17907d);
        sb2.append(", originalAppVersion=");
        sb2.append(this.e);
        sb2.append(", minReaderVersion=");
        sb2.append(this.f17908f);
        g3.a.r(this.f17909g, this.f17910h, ", writerVersion=", ", elementCount=", sb2);
        sb2.append(")");
        return sb2.toString();
    }

    public m(String str, String str2, long j10, String str3, int i) {
        str.getClass();
        str2.getClass();
        this.f17904a = 1;
        this.f17905b = str;
        this.f17906c = str2;
        this.f17907d = j10;
        this.e = str3;
        this.f17908f = 1;
        this.f17909g = 2;
        this.f17910h = i;
    }
}
