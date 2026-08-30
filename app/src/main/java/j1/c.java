package j1;
import a.a;

import wa.q8;

/* loaded from: classes.dex */
public final class c {
    public static final c e = new c(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f18763a;

    /* renamed from: b, reason: collision with root package name */
    public final float f18764b;

    /* renamed from: c, reason: collision with root package name */
    public final float f18765c;

    /* renamed from: d, reason: collision with root package name */
    public final float f18766d;

    public c(float f10, float f11, float f12, float f13) {
        this.f18763a = f10;
        this.f18764b = f11;
        this.f18765c = f12;
        this.f18766d = f13;
    }

    public static c a(c cVar, float f10, float f11, float f12, int i) {
        if ((i & 1) != 0) {
            f10 = cVar.f18763a;
        }
        float f13 = cVar.f18764b;
        if ((i & 4) != 0) {
            f11 = cVar.f18765c;
        }
        if ((i & 8) != 0) {
            f12 = cVar.f18766d;
        }
        return new c(f10, f13, f11, f12);
    }

    public final long b() {
        float f10 = this.f18765c;
        float f11 = this.f18763a;
        float f12 = ((f10 - f11) / 2.0f) + f11;
        float f13 = this.f18766d;
        float f14 = this.f18764b;
        return (Float.floatToRawIntBits(((f13 - f14) / 2.0f) + f14) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32);
    }

    public final long c() {
        float f10 = this.f18765c - this.f18763a;
        float f11 = this.f18766d - this.f18764b;
        return (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public final long d() {
        return (Float.floatToRawIntBits(this.f18763a) << 32) | (Float.floatToRawIntBits(this.f18764b) & 4294967295L);
    }

    public final c e(c cVar) {
        return new c(Math.max(this.f18763a, cVar.f18763a), Math.max(this.f18764b, cVar.f18764b), Math.min(this.f18765c, cVar.f18765c), Math.min(this.f18766d, cVar.f18766d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Float.compare(this.f18763a, cVar.f18763a) == 0 && Float.compare(this.f18764b, cVar.f18764b) == 0 && Float.compare(this.f18765c, cVar.f18765c) == 0 && Float.compare(this.f18766d, cVar.f18766d) == 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        boolean z3;
        boolean z9 = false;
        if (this.f18763a >= this.f18765c) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f18764b >= this.f18766d) {
            z9 = true;
        }
        return z3 | z9;
    }

    public final boolean g(c cVar) {
        boolean z3;
        boolean z9;
        boolean z10;
        boolean z11 = false;
        if (this.f18763a < cVar.f18765c) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (cVar.f18763a < this.f18765c) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z12 = z3 & z9;
        if (this.f18764b < cVar.f18766d) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z13 = z12 & z10;
        if (cVar.f18764b < this.f18766d) {
            z11 = true;
        }
        return z13 & z11;
    }

    public final c h(float f10, float f11) {
        return new c(this.f18763a + f10, this.f18764b + f11, this.f18765c + f10, this.f18766d + f11);
    }

    public final int hashCode() {
        return Float.hashCode(this.f18766d) + p.a(p.a(Float.hashCode(this.f18763a) * 31, 31, this.f18764b), 31, this.f18765c);
    }

    public final c i(long j10) {
        int i = (int) (j10 >> 32);
        int i10 = (int) (j10 & 4294967295L);
        return new c(Float.intBitsToFloat(i) + this.f18763a, Float.intBitsToFloat(i10) + this.f18764b, Float.intBitsToFloat(i) + this.f18765c, Float.intBitsToFloat(i10) + this.f18766d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + q8.a(this.f18763a) + ", " + q8.a(this.f18764b) + ", " + q8.a(this.f18765c) + ", " + q8.a(this.f18766d) + ')';
    }
}
