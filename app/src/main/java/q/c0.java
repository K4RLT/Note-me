package q;
import q.a0;

/* loaded from: classes.dex */
public final class c0 implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f22856a;

    /* renamed from: b, reason: collision with root package name */
    public final w f22857b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22858c;

    /* renamed from: d, reason: collision with root package name */
    public final long f22859d;

    public c0(int i, int i10, w wVar) {
        this.f22856a = i;
        this.f22857b = wVar;
        this.f22858c = i * 1000000;
        this.f22859d = i10 * 1000000;
    }

    @Override // a0
    public final float b(long j10, float f10, float f11, float f12) {
        long j11;
        long j12 = j10 - this.f22859d;
        if (j12 < 0) {
            j12 = 0;
        }
        long j13 = this.f22858c;
        if (j12 > j13) {
            j11 = j13;
        } else {
            j11 = j12;
        }
        if (j11 == 0) {
            return f12;
        }
        return (e(j11, f10, f11, f12) - e(j11 - 1000000, f10, f11, f12)) * 1000.0f;
    }

    @Override // a0
    public final long c(float f10, float f11, float f12) {
        return this.f22859d + this.f22858c;
    }

    @Override // a0
    public final float e(long j10, float f10, float f11, float f12) {
        float f13;
        long j11 = j10 - this.f22859d;
        if (j11 < 0) {
            j11 = 0;
        }
        long j12 = this.f22858c;
        if (j11 > j12) {
            j11 = j12;
        }
        if (this.f22856a == 0) {
            f13 = 1.0f;
        } else {
            f13 = ((float) j11) / ((float) j12);
        }
        float a10 = this.f22857b.a(f13);
        return (f11 * a10) + ((1 - a10) * f10);
    }
}
