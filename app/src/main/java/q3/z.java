package q3;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public final int f23443a;

    /* renamed from: b, reason: collision with root package name */
    public float f23444b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f23445c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23446d;

    public z(int i, Interpolator interpolator, long j10) {
        this.f23443a = i;
        this.f23445c = interpolator;
        this.f23446d = j10;
    }

    public float a() {
        return 1.0f;
    }

    public long b() {
        return this.f23446d;
    }

    public float c() {
        float f10 = this.f23444b;
        Interpolator interpolator = this.f23445c;
        if (interpolator != null) {
            return interpolator.getInterpolation(f10);
        }
        return f10;
    }

    public int d() {
        return this.f23443a;
    }

    public void e(float f10) {
        this.f23444b = f10;
    }
}
