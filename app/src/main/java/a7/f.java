package a7;
import g.b;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.os.Build;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class f extends ValueAnimator implements Choreographer.FrameCallback {
    public o6.a F;

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArraySet f309u = new CopyOnWriteArraySet();

    /* renamed from: v, reason: collision with root package name */
    public final CopyOnWriteArraySet f310v = new CopyOnWriteArraySet();

    /* renamed from: w, reason: collision with root package name */
    public final CopyOnWriteArraySet f311w = new CopyOnWriteArraySet();

    /* renamed from: x, reason: collision with root package name */
    public float f312x = 1.0f;

    /* renamed from: y, reason: collision with root package name */
    public boolean f313y = false;

    /* renamed from: z, reason: collision with root package name */
    public long f314z = 0;
    public float A = 0.0f;
    public float B = 0.0f;
    public int C = 0;
    public float D = -2.14748365E9f;
    public float E = 2.14748365E9f;
    public boolean G = false;

    public final float a() {
        o6.a aVar = this.F;
        if (aVar == null) {
            return 0.0f;
        }
        float f10 = this.B;
        float f11 = aVar.f21793l;
        return (f10 - f11) / (aVar.f21794m - f11);
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.f310v.add(animatorListener);
    }

    @Override // android.animation.Animator
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f311w.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f309u.add(animatorUpdateListener);
    }

    public final float b() {
        o6.a aVar = this.F;
        if (aVar == null) {
            return 0.0f;
        }
        float f10 = this.E;
        if (f10 == 2.14748365E9f) {
            return aVar.f21794m;
        }
        return f10;
    }

    public final float c() {
        o6.a aVar = this.F;
        if (aVar == null) {
            return 0.0f;
        }
        float f10 = this.D;
        if (f10 == -2.14748365E9f) {
            return aVar.f21793l;
        }
        return f10;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f310v.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        e(d());
        g(true);
    }

    public final boolean d() {
        if (this.f312x < 0.0f) {
            return true;
        }
        return false;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        float c10;
        float b10;
        boolean z3 = false;
        if (this.G) {
            g(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        o6.a aVar = this.F;
        if (aVar != null && this.G) {
            long j11 = this.f314z;
            long j12 = 0;
            if (j11 != 0) {
                j12 = j10 - j11;
            }
            float abs = ((float) j12) / ((1.0E9f / aVar.f21795n) / Math.abs(this.f312x));
            float f10 = this.A;
            if (d()) {
                abs = -abs;
            }
            float f11 = f10 + abs;
            float c11 = c();
            float b11 = b();
            PointF pointF = g.f315a;
            if (f11 >= c11 && f11 <= b11) {
                z3 = true;
            }
            float b12 = b(f11, c(), b());
            this.A = b12;
            this.B = b12;
            this.f314z = j10;
            if (!z3) {
                if (getRepeatCount() != -1 && this.C >= getRepeatCount()) {
                    if (this.f312x < 0.0f) {
                        b10 = c();
                    } else {
                        b10 = b();
                    }
                    this.A = b10;
                    this.B = b10;
                    g(true);
                    f();
                    e(d());
                } else {
                    if (getRepeatMode() == 2) {
                        this.f313y = !this.f313y;
                        this.f312x = -this.f312x;
                    } else {
                        if (d()) {
                            c10 = b();
                        } else {
                            c10 = c();
                        }
                        this.A = c10;
                        this.B = c10;
                    }
                    this.f314z = j10;
                    f();
                    Iterator it = this.f310v.iterator();
                    while (it.hasNext()) {
                        ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                    }
                    this.C++;
                }
            } else {
                f();
            }
            if (this.F != null) {
                float f12 = this.B;
                float f13 = this.D;
                if (f12 < f13 || f12 > this.E) {
                    throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(f13), Float.valueOf(this.E), Float.valueOf(this.B)));
                }
            }
        }
    }

    public final void e(boolean z3) {
        Iterator it = this.f310v.iterator();
        while (it.hasNext()) {
            Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z3);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    public final void f() {
        Iterator it = this.f309u.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    public final void g(boolean z3) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z3) {
            this.G = false;
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float c10;
        float b10;
        float c11;
        if (this.F == null) {
            return 0.0f;
        }
        if (d()) {
            c10 = b() - this.B;
            b10 = b();
            c11 = c();
        } else {
            c10 = this.B - c();
            b10 = b();
            c11 = c();
        }
        return c10 / (b10 - c11);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(a());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        if (this.F == null) {
            return 0L;
        }
        return r0.b();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public final void h(float f10) {
        if (this.A == f10) {
            return;
        }
        float b10 = b(f10, c(), b());
        this.A = b10;
        this.B = b10;
        this.f314z = 0L;
        f();
    }

    public final void i(float f10, float f11) {
        float f12;
        float f13;
        if (f10 <= f11) {
            o6.a aVar = this.F;
            if (aVar == null) {
                f12 = -3.4028235E38f;
            } else {
                f12 = aVar.f21793l;
            }
            if (aVar == null) {
                f13 = Float.MAX_VALUE;
            } else {
                f13 = aVar.f21794m;
            }
            float b10 = b(f10, f12, f13);
            float b11 = b(f11, f12, f13);
            if (b10 == this.D && b11 == this.E) {
                return;
            }
            this.D = b10;
            this.E = b11;
            h((int) b(this.B, b10, b11));
            return;
        }
        l4.a.i("minFrame (", f10, ") must be <= maxFrame (", f11, ")");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.G;
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.f310v.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.f309u.clear();
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.f310v.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f311w.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f309u.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final ValueAnimator setDuration(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.f313y) {
            this.f313y = false;
            this.f312x = -this.f312x;
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j10) {
        setDuration(j10);
        throw null;
    }
}
