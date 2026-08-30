package z7;
import p.a;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f31963a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f31964b;

    /* renamed from: c, reason: collision with root package name */
    public final float f31965c;

    /* renamed from: d, reason: collision with root package name */
    public final int f31966d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f31967f;

    public n(int i, boolean z3, float f10, int i10, int i11) {
        boolean z9;
        if ((i11 & 32) != 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.f31963a = i;
        this.f31964b = z3;
        this.f31965c = f10;
        this.f31966d = i10;
        this.e = z9;
        this.f31967f = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f31963a == nVar.f31963a && this.f31964b == nVar.f31964b && Float.compare(this.f31965c, nVar.f31965c) == 0 && this.f31966d == nVar.f31966d && this.e == nVar.e && this.f31967f == nVar.f31967f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + a.c(a.c(a.b(this.f31966d, a.a(a.c(a.b(this.f31963a, Boolean.hashCode(true) * 31, 31), 31, this.f31964b), 31, this.f31965c), 31), 31, this.e), 31, this.f31967f);
    }

    public final String toString() {
        return "QualityParams(shadowsEnabled=true, shadowMapSize=" + this.f31963a + ", fxaa=" + this.f31964b + ", dynResMinScale=" + this.f31965c + ", msaaSamples=" + this.f31966d + ", ssao=" + this.e + ", contactShadows=" + this.f31967f + ", iblReflections=false)";
    }
}
