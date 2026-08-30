package o6;
import d.a;
import d.b;
import j.i;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.Choreographer;
import android.view.View;
import com.google.android.gms.internal.mlkit_vision_digital_ink.u0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import y6.q;

/* loaded from: classes.dex */
public final class j extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: c0, reason: collision with root package name */
    public static final boolean f21814c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final List f21815d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final ThreadPoolExecutor f21816e0;
    public final k6.i A;
    public boolean B;
    public x6.c C;
    public int D;
    public boolean E;
    public boolean F;
    public final Matrix G;
    public Bitmap H;
    public Canvas I;
    public Rect J;
    public RectF K;
    public p6.a L;
    public Rect M;
    public Rect N;
    public RectF O;
    public RectF P;
    public Matrix Q;
    public final float[] R;
    public Matrix S;
    public boolean T;
    public final Semaphore U;
    public Handler V;
    public f W;
    public final f X;
    public float Y;
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f21817a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f21818b0;

    /* renamed from: u, reason: collision with root package name */
    public a f21819u;

    /* renamed from: v, reason: collision with root package name */
    public final a7.f f21820v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f21821w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f21822x;

    /* renamed from: y, reason: collision with root package name */
    public t6.a f21823y;

    /* renamed from: z, reason: collision with root package name */
    public u0 f21824z;

    static {
        boolean z3;
        if (Build.VERSION.SDK_INT <= 25) {
            z3 = true;
        } else {
            z3 = false;
        }
        f21814c0 = z3;
        f21815d0 = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        f21816e0 = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new a7.e());
    }

    public j() {
        a7.f fVar = new a7.f();
        this.f21820v = fVar;
        this.f21821w = true;
        this.Z = 1;
        this.f21822x = new ArrayList();
        this.A = new k6.i(13);
        this.B = true;
        this.D = 255;
        this.f21817a0 = 1;
        this.F = false;
        this.G = new Matrix();
        this.R = new float[9];
        this.T = false;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: o6.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                j jVar = j.this;
                int i = jVar.f21818b0;
                boolean z3 = true;
                if (i == 0) {
                    i = 1;
                }
                if (i != 2) {
                    z3 = false;
                }
                if (z3) {
                    jVar.invalidateSelf();
                    return;
                }
                x6.c cVar = jVar.C;
                if (cVar != null) {
                    cVar.m(jVar.f21820v.a());
                }
            }
        };
        this.U = new Semaphore(1);
        this.X = new f(this, 0);
        this.Y = -3.4028235E38f;
        fVar.addUpdateListener(animatorUpdateListener);
    }

    public static void d(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final boolean a(Context context) {
        if (this.f21821w) {
            if (context != null) {
                Matrix matrix = a7.l.f341a;
                if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void b() {
        a aVar = this.f21819u;
        if (aVar == null) {
            return;
        }
        j6.e eVar = q.f30955a;
        Rect rect = aVar.f21792k;
        List list = Collections.EMPTY_LIST;
        x6.c cVar = new x6.c(this, new x6.e(list, aVar, "__container", -1L, 1, -1L, null, list, new v6.d(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, 1, null, false, null, null, 1), aVar.f21791j, aVar);
        this.C = cVar;
        cVar.J = this.B;
    }

    public final void c() {
        a aVar = this.f21819u;
        if (aVar == null) {
            return;
        }
        int i = this.f21817a0;
        int i10 = Build.VERSION.SDK_INT;
        boolean z3 = aVar.f21796o;
        int i11 = aVar.f21797p;
        int b10 = q0.b(i);
        boolean z9 = false;
        if (b10 != 1 && (b10 == 2 || ((z3 && i10 < 28) || i11 > 4 || i10 <= 25))) {
            z9 = true;
        }
        this.F = z9;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        x6.c cVar = this.C;
        if (cVar != null) {
            int i = this.f21818b0;
            boolean z3 = true;
            if (i == 0) {
                i = 1;
            }
            if (i != 2) {
                z3 = false;
            }
            f fVar = this.X;
            ThreadPoolExecutor threadPoolExecutor = f21816e0;
            a7.f fVar2 = this.f21820v;
            Semaphore semaphore = this.U;
            if (z3) {
                try {
                    semaphore.acquire();
                } catch (InterruptedException unused) {
                    if (z3) {
                        semaphore.release();
                        if (cVar.I != fVar2.a()) {
                            threadPoolExecutor.execute(fVar);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (z3) {
                        semaphore.release();
                        if (cVar.I != fVar2.a()) {
                            threadPoolExecutor.execute(fVar);
                        }
                    }
                    throw th;
                }
            }
            if (z3 && m()) {
                l(fVar2.a());
            }
            if (this.F) {
                i(canvas, cVar);
            } else {
                e(canvas);
            }
            this.T = false;
            if (z3) {
                semaphore.release();
                if (cVar.I != fVar2.a()) {
                    threadPoolExecutor.execute(fVar);
                }
            }
        }
    }

    public final void e(Canvas canvas) {
        x6.c cVar = this.C;
        a aVar = this.f21819u;
        if (cVar != null && aVar != null) {
            Matrix matrix = this.G;
            matrix.reset();
            if (!getBounds().isEmpty()) {
                matrix.preTranslate(r3.left, r3.top);
                matrix.preScale(r3.width() / aVar.f21792k.width(), r3.height() / aVar.f21792k.height());
            }
            cVar.c(canvas, matrix, this.D, null);
        }
    }

    public final Context f() {
        Drawable.Callback callback = getCallback();
        if (callback == null || !(callback instanceof View)) {
            return null;
        }
        return ((View) callback).getContext();
    }

    public final u6.f g() {
        u6.f fVar = null;
        for (String str : f21815d0) {
            a aVar = this.f21819u;
            int size = aVar.f21789g.size();
            for (int i = 0; i < size; i++) {
                u6.f fVar2 = (u6.f) aVar.f21789g.get(i);
                String str2 = fVar2.f25879a;
                if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                    fVar = fVar2;
                    break;
                }
            }
            fVar = null;
            if (fVar != null) {
                break;
            }
        }
        return fVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.D;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        a aVar = this.f21819u;
        if (aVar == null) {
            return -1;
        }
        return aVar.f21792k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        a aVar = this.f21819u;
        if (aVar == null) {
            return -1;
        }
        return aVar.f21792k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        float c10;
        float b10;
        if (this.C == null) {
            this.f21822x.add(new d(this, 1));
            return;
        }
        c();
        boolean a10 = a(f());
        a7.f fVar = this.f21820v;
        if (a10 || fVar.getRepeatCount() == 0) {
            if (isVisible()) {
                fVar.G = true;
                boolean d2 = fVar.d();
                Iterator it = fVar.f310v.iterator();
                while (it.hasNext()) {
                    Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
                    if (Build.VERSION.SDK_INT >= 26) {
                        animatorListener.onAnimationStart(fVar, d2);
                    } else {
                        animatorListener.onAnimationStart(fVar);
                    }
                }
                if (fVar.d()) {
                    c10 = fVar.b();
                } else {
                    c10 = fVar.c();
                }
                fVar.h((int) c10);
                fVar.f314z = 0L;
                fVar.C = 0;
                if (fVar.G) {
                    fVar.g(false);
                    Choreographer.getInstance().postFrameCallback(fVar);
                }
                this.Z = 1;
            } else {
                this.Z = 2;
            }
        }
        if (!a(f())) {
            u6.f g8 = g();
            if (g8 != null) {
                k((int) g8.f25880b);
            } else {
                if (fVar.f312x < 0.0f) {
                    b10 = fVar.c();
                } else {
                    b10 = fVar.b();
                }
                k((int) b10);
            }
            fVar.g(true);
            fVar.e(fVar.d());
            if (!isVisible()) {
                this.Z = 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(android.graphics.Canvas r11, x6.c r12) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.i(android.graphics.Canvas, x6.c):void");
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable.Callback callback;
        if (!this.T) {
            this.T = true;
            if ((!f21814c0 || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        a7.f fVar = this.f21820v;
        if (fVar == null) {
            return false;
        }
        return fVar.G;
    }

    public final void j() {
        float b10;
        if (this.C == null) {
            this.f21822x.add(new d(this, 0));
            return;
        }
        c();
        boolean a10 = a(f());
        a7.f fVar = this.f21820v;
        if (a10 || fVar.getRepeatCount() == 0) {
            if (isVisible()) {
                fVar.G = true;
                fVar.g(false);
                Choreographer.getInstance().postFrameCallback(fVar);
                fVar.f314z = 0L;
                if (fVar.d() && fVar.B == fVar.c()) {
                    fVar.h(fVar.b());
                } else if (!fVar.d() && fVar.B == fVar.b()) {
                    fVar.h(fVar.c());
                }
                Iterator it = fVar.f311w.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(fVar);
                }
                this.Z = 1;
            } else {
                this.Z = 3;
            }
        }
        if (!a(f())) {
            if (fVar.f312x < 0.0f) {
                b10 = fVar.c();
            } else {
                b10 = fVar.b();
            }
            k((int) b10);
            fVar.g(true);
            fVar.e(fVar.d());
            if (!isVisible()) {
                this.Z = 1;
            }
        }
    }

    public final void k(final int i) {
        if (this.f21819u == null) {
            this.f21822x.add(new i() { // from class: o6.h
                @Override // o6.i
                public final void run() {
                    j.this.k(i);
                }
            });
        } else {
            this.f21820v.h(i);
        }
    }

    public final void l(final float f10) {
        a aVar = this.f21819u;
        if (aVar == null) {
            this.f21822x.add(new i() { // from class: o6.g
                @Override // o6.i
                public final void run() {
                    j.this.l(f10);
                }
            });
        } else {
            this.f21820v.h(a7.g.e(aVar.f21793l, aVar.f21794m, f10));
        }
    }

    public final boolean m() {
        a aVar = this.f21819u;
        if (aVar == null) {
            return false;
        }
        float f10 = this.Y;
        float a10 = this.f21820v.a();
        this.Y = a10;
        if (Math.abs(a10 - f10) * aVar.b() < 50.0f) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.D = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        a7.a("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z9) {
        boolean isVisible = isVisible();
        boolean visible = super.setVisible(z3, z9);
        if (z3) {
            int i = this.Z;
            if (i == 2) {
                h();
                return visible;
            }
            if (i == 3) {
                j();
                return visible;
            }
        } else {
            a7.f fVar = this.f21820v;
            if (fVar.G) {
                this.f21822x.clear();
                fVar.g(true);
                Iterator it = fVar.f311w.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(fVar);
                }
                if (!isVisible()) {
                    this.Z = 1;
                }
                this.Z = 3;
                return visible;
            }
            if (isVisible) {
                this.Z = 1;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        h();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f21822x.clear();
        a7.f fVar = this.f21820v;
        fVar.g(true);
        fVar.e(fVar.d());
        if (!isVisible()) {
            this.Z = 1;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
