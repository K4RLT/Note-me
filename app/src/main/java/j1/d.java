package j1;
import a.a;

import wa.o8;
import wa.q8;
import wa.t8;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f18767a;

    /* renamed from: b, reason: collision with root package name */
    public final float f18768b;

    /* renamed from: c, reason: collision with root package name */
    public final float f18769c;

    /* renamed from: d, reason: collision with root package name */
    public final float f18770d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f18771f;

    /* renamed from: g, reason: collision with root package name */
    public final long f18772g;

    /* renamed from: h, reason: collision with root package name */
    public final long f18773h;

    static {
        t8.a(0L, 0.0f, 0.0f, 0.0f, 0.0f);
    }

    public d(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13) {
        this.f18767a = f10;
        this.f18768b = f11;
        this.f18769c = f12;
        this.f18770d = f13;
        this.e = j10;
        this.f18771f = j11;
        this.f18772g = j12;
        this.f18773h = j13;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (Float.compare(this.f18767a, dVar.f18767a) != 0 || Float.compare(this.f18768b, dVar.f18768b) != 0 || Float.compare(this.f18769c, dVar.f18769c) != 0 || Float.compare(this.f18770d, dVar.f18770d) != 0 || !o8.a(this.e, dVar.e) || !o8.a(this.f18771f, dVar.f18771f) || !o8.a(this.f18772g, dVar.f18772g) || !o8.a(this.f18773h, dVar.f18773h)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.f18773h) + p.a.d(this.f18772g, p.a.d(this.f18771f, p.a.d(this.e, p.a(p.a(p.a(Float.hashCode(this.f18767a) * 31, 31, this.f18768b), 31, this.f18769c), 31, this.f18770d), 31), 31), 31);
    }

    public final String toString() {
        String str = q8.a(this.f18767a) + ", " + q8.a(this.f18768b) + ", " + q8.a(this.f18769c) + ", " + q8.a(this.f18770d);
        long j10 = this.e;
        long j11 = this.f18771f;
        boolean a10 = o8.a(j10, j11);
        long j12 = this.f18772g;
        long j13 = this.f18773h;
        if (a10 && o8.a(j11, j12) && o8.a(j12, j13)) {
            int i = (int) (j10 >> 32);
            int i10 = (int) (j10 & 4294967295L);
            if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i10)) {
                return "RoundRect(rect=" + str + ", radius=" + q8.a(Float.intBitsToFloat(i)) + ')';
            }
            return "RoundRect(rect=" + str + ", x=" + q8.a(Float.intBitsToFloat(i)) + ", y=" + q8.a(Float.intBitsToFloat(i10)) + ')';
        }
        return "RoundRect(rect=" + str + ", topLeft=" + ((Object) o8.b(j10)) + ", topRight=" + ((Object) o8.b(j11)) + ", bottomRight=" + ((Object) o8.b(j12)) + ", bottomLeft=" + ((Object) o8.b(j13)) + ')';
    }
}
