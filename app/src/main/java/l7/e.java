package l7;
import l.a;
import p.a;

import androidx.ink.storage.DecompressedBytes;
import eg.p0;
import java.util.List;

/* loaded from: classes.dex */
public final class e {
    public static final d Companion = new Object();

    /* renamed from: q, reason: collision with root package name */
    public static final pe.g[] f19968q;

    /* renamed from: a, reason: collision with root package name */
    public final String f19969a;

    /* renamed from: b, reason: collision with root package name */
    public final b f19970b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19971c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f19972d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f19973f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f19974g;

    /* renamed from: h, reason: collision with root package name */
    public final List f19975h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final float f19976j;

    /* renamed from: k, reason: collision with root package name */
    public final float f19977k;

    /* renamed from: l, reason: collision with root package name */
    public final float f19978l;

    /* renamed from: m, reason: collision with root package name */
    public final float f19979m;

    /* renamed from: n, reason: collision with root package name */
    public final String f19980n;

    /* renamed from: o, reason: collision with root package name */
    public final float f19981o;

    /* renamed from: p, reason: collision with root package name */
    public final List f19982p;

    /* JADX WARN: Type inference failed for: r0v0, types: [l7.d, java.lang.Object] */
    static {
        fg.o oVar = new fg.o(7);
        pe.h hVar = pe.h.f22690u;
        f19968q = new pe.g[]{null, pe.a.c(hVar, oVar), null, null, null, null, null, pe.a.c(hVar, new fg.o(8)), null, null, null, null, null, null, null, pe.a.c(hVar, new fg.o(9))};
    }

    public /* synthetic */ e(int i, String str, b bVar, boolean z3, boolean z9, String str2, Integer num, boolean z10, List list, boolean z11, float f10, float f11, float f12, float f13, String str3, float f14, List list2) {
        List list3;
        if (1 == (i & 1)) {
            this.f19969a = str;
            if ((i & 2) == 0) {
                this.f19970b = null;
            } else {
                this.f19970b = bVar;
            }
            if ((i & 4) == 0) {
                this.f19971c = true;
            } else {
                this.f19971c = z3;
            }
            if ((i & 8) == 0) {
                this.f19972d = false;
            } else {
                this.f19972d = z9;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = str2;
            }
            if ((i & 32) == 0) {
                this.f19973f = null;
            } else {
                this.f19973f = num;
            }
            if ((i & 64) == 0) {
                this.f19974g = false;
            } else {
                this.f19974g = z10;
            }
            if ((i & 128) == 0) {
                this.f19975h = null;
            } else {
                this.f19975h = list;
            }
            if ((i & 256) == 0) {
                this.i = false;
            } else {
                this.i = z11;
            }
            if ((i & 512) == 0) {
                this.f19976j = 0.0f;
            } else {
                this.f19976j = f10;
            }
            if ((i & 1024) == 0) {
                this.f19977k = 0.0f;
            } else {
                this.f19977k = f11;
            }
            if ((i & 2048) == 0) {
                this.f19978l = 1.0f;
            } else {
                this.f19978l = f12;
            }
            if ((i & 4096) == 0) {
                this.f19979m = 1.0f;
            } else {
                this.f19979m = f13;
            }
            if ((i & 8192) == 0) {
                this.f19980n = null;
            } else {
                this.f19980n = str3;
            }
            if ((i & 16384) == 0) {
                this.f19981o = 1.0f;
            } else {
                this.f19981o = f14;
            }
            if ((i & DecompressedBytes.DECOMPRESSED_BYTES_INITIAL_CAPACITY) == 0) {
                list3 = qe.s.f24023u;
            } else {
                list3 = list2;
            }
            this.f19982p = list3;
            return;
        }
        p0.e(i, 1, c.f19967a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (kotlin.jvm.internal.a(this.f19969a, eVar.f19969a) && this.f19970b == eVar.f19970b && this.f19971c == eVar.f19971c && this.f19972d == eVar.f19972d && kotlin.jvm.internal.a(this.e, eVar.e) && kotlin.jvm.internal.a(this.f19973f, eVar.f19973f) && this.f19974g == eVar.f19974g && kotlin.jvm.internal.a(this.f19975h, eVar.f19975h) && this.i == eVar.i && Float.compare(this.f19976j, eVar.f19976j) == 0 && Float.compare(this.f19977k, eVar.f19977k) == 0 && Float.compare(this.f19978l, eVar.f19978l) == 0 && Float.compare(this.f19979m, eVar.f19979m) == 0 && kotlin.jvm.internal.a(this.f19980n, eVar.f19980n) && Float.compare(this.f19981o, eVar.f19981o) == 0 && kotlin.jvm.internal.a(this.f19982p, eVar.f19982p)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.f19969a.hashCode() * 31;
        int i = 0;
        b bVar = this.f19970b;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        int c10 = a.c(a.c((hashCode5 + hashCode) * 31, 31, this.f19971c), 31, this.f19972d);
        String str = this.e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i10 = (c10 + hashCode2) * 31;
        Integer num = this.f19973f;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int c11 = a.c((i10 + hashCode3) * 31, 31, this.f19974g);
        List list = this.f19975h;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int a10 = a.a(a.a(a.a(a.a(a.c((c11 + hashCode4) * 31, 31, this.i), 31, this.f19976j), 31, this.f19977k), 31, this.f19978l), 31, this.f19979m);
        String str2 = this.f19980n;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.f19982p.hashCode() + a.a((a10 + i) * 31, 31, this.f19981o);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImagePayload(localPath=");
        sb2.append(this.f19969a);
        sb2.append(", frameShape=");
        sb2.append(this.f19970b);
        sb2.append(", visible=");
        sb2.append(this.f19971c);
        sb2.append(", locked=");
        sb2.append(this.f19972d);
        sb2.append(", name=");
        sb2.append(this.e);
        sb2.append(", frameColorArgb=");
        sb2.append(this.f19973f);
        sb2.append(", halfClip=");
        sb2.append(this.f19974g);
        sb2.append(", slotPaths=");
        sb2.append(this.f19975h);
        sb2.append(", flipH=");
        sb2.append(this.i);
        sb2.append(", cropL=");
        sb2.append(this.f19976j);
        sb2.append(", cropT=");
        a5.a.s(sb2, this.f19977k, ", cropR=", this.f19978l, ", cropB=");
        sb2.append(this.f19979m);
        sb2.append(", framePath=");
        sb2.append(this.f19980n);
        sb2.append(", frameAspect=");
        sb2.append(this.f19981o);
        sb2.append(", frameHoles=");
        sb2.append(this.f19982p);
        sb2.append(")");
        return sb2.toString();
    }

    public e(String str, b bVar, boolean z3, boolean z9, String str2, Integer num, boolean z10, List list, boolean z11, float f10, float f11, float f12, float f13, String str3, float f14, List list2) {
        str.getClass();
        list2.getClass();
        this.f19969a = str;
        this.f19970b = bVar;
        this.f19971c = z3;
        this.f19972d = z9;
        this.e = str2;
        this.f19973f = num;
        this.f19974g = z10;
        this.f19975h = list;
        this.i = z11;
        this.f19976j = f10;
        this.f19977k = f11;
        this.f19978l = f12;
        this.f19979m = f13;
        this.f19980n = str3;
        this.f19981o = f14;
        this.f19982p = list2;
    }
}
