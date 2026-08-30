package u7;
import g3.a;
import l.a;
import p.a;
import p0.e;

/* loaded from: classes.dex */
public final class s6 {
    public static final r6 Companion = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f26860a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26861b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26862c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26863d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final float f26864f;

    /* renamed from: g, reason: collision with root package name */
    public final float f26865g;

    /* renamed from: h, reason: collision with root package name */
    public final float f26866h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final int f26867j;

    /* renamed from: k, reason: collision with root package name */
    public final float f26868k;

    /* renamed from: l, reason: collision with root package name */
    public final float f26869l;

    /* renamed from: m, reason: collision with root package name */
    public final String f26870m;

    /* renamed from: n, reason: collision with root package name */
    public final String f26871n;

    /* renamed from: o, reason: collision with root package name */
    public final String f26872o;

    public /* synthetic */ s6(int i, String str, String str2, String str3, String str4, String str5, float f10, float f11, float f12, float f13, int i10, float f14, float f15, String str6, String str7, String str8) {
        float f16;
        if (3 == (i & 3)) {
            this.f26860a = str;
            this.f26861b = str2;
            if ((i & 4) == 0) {
                this.f26862c = null;
            } else {
                this.f26862c = str3;
            }
            if ((i & 8) == 0) {
                this.f26863d = null;
            } else {
                this.f26863d = str4;
            }
            if ((i & 16) == 0) {
                this.e = "front";
            } else {
                this.e = str5;
            }
            if ((i & 32) == 0) {
                this.f26864f = 0.5f;
            } else {
                this.f26864f = f10;
            }
            if ((i & 64) == 0) {
                this.f26865g = 0.5f;
            } else {
                this.f26865g = f11;
            }
            if ((i & 128) == 0) {
                this.f26866h = 0.0f;
            } else {
                this.f26866h = f12;
            }
            if ((i & 256) == 0) {
                this.i = 1.0f;
            } else {
                this.i = f13;
            }
            if ((i & 512) == 0) {
                this.f26867j = -7697776;
            } else {
                this.f26867j = i10;
            }
            if ((i & 1024) == 0) {
                this.f26868k = 0.85f;
            } else {
                this.f26868k = f14;
            }
            if ((i & 2048) == 0) {
                f16 = 0.4f;
            } else {
                f16 = f15;
            }
            this.f26869l = f16;
            if ((i & 4096) == 0) {
                this.f26870m = "";
            } else {
                this.f26870m = str6;
            }
            if ((i & 8192) == 0) {
                this.f26871n = "";
            } else {
                this.f26871n = str7;
            }
            if ((i & 16384) == 0) {
                this.f26872o = "";
                return;
            } else {
                this.f26872o = str8;
                return;
            }
        }
        eg.e(i, 3, q6.f26761a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6)) {
            return false;
        }
        s6 s6Var = (s6) obj;
        if (kotlin.jvm.internal.a(this.f26860a, s6Var.f26860a) && kotlin.jvm.internal.a(this.f26861b, s6Var.f26861b) && kotlin.jvm.internal.a(this.f26862c, s6Var.f26862c) && kotlin.jvm.internal.a(this.f26863d, s6Var.f26863d) && kotlin.jvm.internal.a(this.e, s6Var.e) && Float.compare(this.f26864f, s6Var.f26864f) == 0 && Float.compare(this.f26865g, s6Var.f26865g) == 0 && Float.compare(this.f26866h, s6Var.f26866h) == 0 && Float.compare(this.i, s6Var.i) == 0 && this.f26867j == s6Var.f26867j && Float.compare(this.f26868k, s6Var.f26868k) == 0 && Float.compare(this.f26869l, s6Var.f26869l) == 0 && kotlin.jvm.internal.a(this.f26870m, s6Var.f26870m) && kotlin.jvm.internal.a(this.f26871n, s6Var.f26871n) && kotlin.jvm.internal.a(this.f26872o, s6Var.f26872o)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int e = a.e(this.f26861b, this.f26860a.hashCode() * 31, 31);
        int i = 0;
        String str = this.f26862c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (e + hashCode) * 31;
        String str2 = this.f26863d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.f26872o.hashCode() + a.e(this.f26871n, a.e(this.f26870m, a.a(a.a(a.b(this.f26867j, a.a(a.a(a.a(a.a(a.e(this.e, (i10 + i) * 31, 31), 31, this.f26864f), 31, this.f26865g), 31, this.f26866h), 31, this.i), 31), 31, this.f26868k), 31, this.f26869l), 31), 31);
    }

    public final String toString() {
        StringBuilder q10 = a.q("OrnamentSpec(id=", this.f26860a, ", mesh=", this.f26861b, ", tex=");
        a.t(q10, this.f26862c, ", normal=", this.f26863d, ", anchor=");
        q10.append(this.e);
        q10.append(", u=");
        q10.append(this.f26864f);
        q10.append(", v=");
        a5.a.s(q10, this.f26865g, ", rotDeg=", this.f26866h, ", scale=");
        q10.append(this.i);
        q10.append(", argb=");
        q10.append(this.f26867j);
        q10.append(", metallic=");
        a5.a.s(q10, this.f26868k, ", roughness=", this.f26869l, ", slot=");
        a.t(q10, this.f26870m, ", packId=", this.f26871n, ", name=");
        return a5.a.k(q10, this.f26872o, ")");
    }

    public s6(String str, String str2, String str3, String str4, String str5, float f10, float f11, float f12, float f13, int i, float f14, float f15, String str6, String str7, String str8) {
        str.getClass();
        str2.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        this.f26860a = str;
        this.f26861b = str2;
        this.f26862c = str3;
        this.f26863d = str4;
        this.e = str5;
        this.f26864f = f10;
        this.f26865g = f11;
        this.f26866h = f12;
        this.i = f13;
        this.f26867j = i;
        this.f26868k = f14;
        this.f26869l = f15;
        this.f26870m = str6;
        this.f26871n = str7;
        this.f26872o = str8;
    }

    public /* synthetic */ s6(String str, String str2, String str3, String str4, float f10, float f11, int i, float f12, float f13, String str5, String str6, String str7, int i10) {
        this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, "front", 0.5f, 0.5f, (i10 & 128) != 0 ? 0.0f : f10, f11, i, f12, f13, str5, (i10 & 8192) != 0 ? "" : str6, (i10 & 16384) != 0 ? "" : str7);
    }
}
