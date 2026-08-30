package w7;
import g3.a;

/* loaded from: classes.dex */
public final class a8 {
    public static final z7 Companion = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f27891a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27892b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27893c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27894d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final float f27895f;

    /* renamed from: g, reason: collision with root package name */
    public final float f27896g;

    /* renamed from: h, reason: collision with root package name */
    public final int f27897h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final float f27898j;

    public /* synthetic */ a8(int i, String str, String str2, String str3, String str4, String str5, float f10, float f11, int i10, float f12, float f13) {
        if (3 == (i & 3)) {
            this.f27891a = str;
            this.f27892b = str2;
            if ((i & 4) == 0) {
                this.f27893c = "";
            } else {
                this.f27893c = str3;
            }
            if ((i & 8) == 0) {
                this.f27894d = "";
            } else {
                this.f27894d = str4;
            }
            if ((i & 16) == 0) {
                this.e = "";
            } else {
                this.e = str5;
            }
            if ((i & 32) == 0) {
                this.f27895f = 1.0f;
            } else {
                this.f27895f = f10;
            }
            if ((i & 64) == 0) {
                this.f27896g = 0.0f;
            } else {
                this.f27896g = f11;
            }
            if ((i & 128) == 0) {
                this.f27897h = -7697776;
            } else {
                this.f27897h = i10;
            }
            if ((i & 256) == 0) {
                this.i = 0.85f;
            } else {
                this.i = f12;
            }
            if ((i & 512) == 0) {
                this.f27898j = 0.4f;
                return;
            } else {
                this.f27898j = f13;
                return;
            }
        }
        eg.p0.e(i, 3, y7.f29502a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8)) {
            return false;
        }
        a8 a8Var = (a8) obj;
        if (kotlin.jvm.internal.l.a(this.f27891a, a8Var.f27891a) && kotlin.jvm.internal.l.a(this.f27892b, a8Var.f27892b) && kotlin.jvm.internal.l.a(this.f27893c, a8Var.f27893c) && kotlin.jvm.internal.l.a(this.f27894d, a8Var.f27894d) && kotlin.jvm.internal.l.a(this.e, a8Var.e) && Float.compare(this.f27895f, a8Var.f27895f) == 0 && Float.compare(this.f27896g, a8Var.f27896g) == 0 && this.f27897h == a8Var.f27897h && Float.compare(this.i, a8Var.i) == 0 && Float.compare(this.f27898j, a8Var.f27898j) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f27898j) + a.a(a.b(this.f27897h, a.a(a.a(a.e(this.e, a.e(this.f27894d, a.e(this.f27893c, a.e(this.f27892b, this.f27891a.hashCode() * 31, 31), 31), 31), 31), 31, this.f27895f), 31, this.f27896g), 31), 31, this.i);
    }

    public final String toString() {
        StringBuilder q10 = a.q("OrnamentDef(id=", this.f27891a, ", mesh=", this.f27892b, ", tex=");
        a.t(q10, this.f27893c, ", normal=", this.f27894d, ", name=");
        q10.append(this.e);
        q10.append(", scale=");
        q10.append(this.f27895f);
        q10.append(", rotDeg=");
        q10.append(this.f27896g);
        q10.append(", argb=");
        q10.append(this.f27897h);
        q10.append(", metallic=");
        q10.append(this.i);
        q10.append(", roughness=");
        q10.append(this.f27898j);
        q10.append(")");
        return q10.toString();
    }
}
