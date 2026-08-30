package d8;

import eg.p0;
import fg.z;
import kotlin.jvm.internal.l;
import qe.t;

/* loaded from: classes.dex */
public final class c {
    public static final b Companion = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f15772a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15773b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15774c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15775d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15776f;

    /* renamed from: g, reason: collision with root package name */
    public final String f15777g;

    /* renamed from: h, reason: collision with root package name */
    public final long f15778h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f15779j;

    /* renamed from: k, reason: collision with root package name */
    public final z f15780k;

    /* renamed from: l, reason: collision with root package name */
    public final int f15781l;

    public /* synthetic */ c(int i, String str, String str2, String str3, int i10, boolean z3, int i11, String str4, long j10, String str5, String str6, z zVar, int i12) {
        z zVar2;
        if (1 == (i & 1)) {
            this.f15772a = str;
            if ((i & 2) == 0) {
                this.f15773b = "stickers";
            } else {
                this.f15773b = str2;
            }
            if ((i & 4) == 0) {
                this.f15774c = "";
            } else {
                this.f15774c = str3;
            }
            if ((i & 8) == 0) {
                this.f15775d = 1;
            } else {
                this.f15775d = i10;
            }
            if ((i & 16) == 0) {
                this.e = false;
            } else {
                this.e = z3;
            }
            if ((i & 32) == 0) {
                this.f15776f = 0;
            } else {
                this.f15776f = i11;
            }
            if ((i & 64) == 0) {
                this.f15777g = "";
            } else {
                this.f15777g = str4;
            }
            if ((i & 128) == 0) {
                this.f15778h = 0L;
            } else {
                this.f15778h = j10;
            }
            if ((i & 256) == 0) {
                this.i = null;
            } else {
                this.i = str5;
            }
            if ((i & 512) == 0) {
                this.f15779j = null;
            } else {
                this.f15779j = str6;
            }
            if ((i & 1024) == 0) {
                zVar2 = new z(t.f24024u);
            } else {
                zVar2 = zVar;
            }
            this.f15780k = zVar2;
            if ((i & 2048) == 0) {
                this.f15781l = 1;
                return;
            } else {
                this.f15781l = i12;
                return;
            }
        }
        p0.e(i, 1, a.f15771a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (l.a(this.f15772a, cVar.f15772a) && l.a(this.f15773b, cVar.f15773b) && l.a(this.f15774c, cVar.f15774c) && this.f15775d == cVar.f15775d && this.e == cVar.e && this.f15776f == cVar.f15776f && l.a(this.f15777g, cVar.f15777g) && this.f15778h == cVar.f15778h && l.a(this.i, cVar.i) && l.a(this.f15779j, cVar.f15779j) && l.a(this.f15780k, cVar.f15780k) && this.f15781l == cVar.f15781l) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int d2 = p.a.d(this.f15778h, g3.a.e(this.f15777g, p.a.b(this.f15776f, p.a.c(p.a.b(this.f15775d, g3.a.e(this.f15774c, g3.a.e(this.f15773b, this.f15772a.hashCode() * 31, 31), 31), 31), 31, this.e), 31), 31), 31);
        int i = 0;
        String str = this.i;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (d2 + hashCode) * 31;
        String str2 = this.f15779j;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return Integer.hashCode(this.f15781l) + ((this.f15780k.f17001u.hashCode() + ((i10 + i) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder q10 = p.a.q("PackRow(id=", this.f15772a, ", kind=", this.f15773b, ", name=");
        q10.append(this.f15774c);
        q10.append(", version=");
        q10.append(this.f15775d);
        q10.append(", premium=");
        q10.append(this.e);
        q10.append(", price_coins=");
        q10.append(this.f15776f);
        q10.append(", archive_path=");
        q10.append(this.f15777g);
        q10.append(", archive_bytes=");
        q10.append(this.f15778h);
        g3.a.t(q10, ", archive_sha256=", this.i, ", thumb_path=", this.f15779j);
        q10.append(", manifest=");
        q10.append(this.f15780k);
        q10.append(", min_app_version=");
        q10.append(this.f15781l);
        q10.append(")");
        return q10.toString();
    }
}
