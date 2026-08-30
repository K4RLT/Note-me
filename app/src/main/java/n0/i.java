package n0;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import k1.l0;
import k1.r;
import pe.u;

/* loaded from: classes.dex */
public final class i extends View {

    /* renamed from: u */
    public p f20987u;

    /* renamed from: v */
    public Boolean f20988v;

    /* renamed from: w */
    public Long f20989w;

    /* renamed from: x */
    public a6.e f20990x;

    /* renamed from: y */
    public df.a f20991y;

    /* renamed from: z */
    public static final int[] f20986z = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] A = new int[0];

    public static /* synthetic */ void a(i iVar) {
        setRippleState$lambda$2(iVar);
    }

    private final void setRippleState(boolean z3) {
        long j10;
        int[] iArr;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f20990x;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.f20989w;
        if (l10 != null) {
            j10 = l10.longValue();
        } else {
            j10 = 0;
        }
        long j11 = currentAnimationTimeMillis - j10;
        if (!z3 && j11 < 5) {
            a6.e eVar = new a6.e(16, this);
            this.f20990x = eVar;
            postDelayed(eVar, 50L);
        } else {
            if (z3) {
                iArr = f20986z;
            } else {
                iArr = A;
            }
            p pVar = this.f20987u;
            if (pVar != null) {
                pVar.setState(iArr);
            }
        }
        this.f20989w = Long.valueOf(currentAnimationTimeMillis);
    }

    public static final void setRippleState$lambda$2(i iVar) {
        p pVar = iVar.f20987u;
        if (pVar != null) {
            pVar.setState(A);
        }
        iVar.f20990x = null;
    }

    public final void b(v.k kVar, boolean z3, long j10, int i, long j11, float f10, df.a aVar) {
        if (this.f20987u == null || !Boolean.valueOf(z3).equals(this.f20988v)) {
            p pVar = new p(z3);
            setBackground(pVar);
            this.f20987u = pVar;
            this.f20988v = Boolean.valueOf(z3);
        }
        p pVar2 = this.f20987u;
        pVar2.getClass();
        this.f20991y = aVar;
        e(j10, j11, i, f10);
        if (z3) {
            pVar2.setHotspot(j1.b.e(kVar.f27259a), j1.b.f(kVar.f27259a));
        } else {
            pVar2.setHotspot(pVar2.getBounds().centerX(), pVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.f20991y = null;
        a6.e eVar = this.f20990x;
        if (eVar != null) {
            removeCallbacks(eVar);
            a6.e eVar2 = this.f20990x;
            eVar2.getClass();
            eVar2.run();
        } else {
            p pVar = this.f20987u;
            if (pVar != null) {
                pVar.setState(A);
            }
        }
        p pVar2 = this.f20987u;
        if (pVar2 == null) {
            return;
        }
        pVar2.setVisible(false, false);
        unscheduleDrawable(pVar2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            c();
        } else {
            super.draw(canvas);
        }
    }

    public final void e(long j10, long j11, int i, float f10) {
        boolean a10;
        p pVar = this.f20987u;
        if (pVar == null) {
            return;
        }
        Integer num = pVar.f21008w;
        if (num == null || num.intValue() != i) {
            pVar.f21008w = Integer.valueOf(i);
            pVar.setRadius(i);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f10 *= 2;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        long c10 = r.c(j11, f10);
        r rVar = pVar.f21007v;
        if (rVar == null) {
            a10 = false;
        } else {
            a10 = u.a(rVar.f19523a, c10);
        }
        if (!a10) {
            pVar.f21007v = new r(c10);
            pVar.setColor(ColorStateList.valueOf(l0.F(c10)));
        }
        Rect rect = new Rect(0, 0, ff.a.b(j1.e.d(j10)), ff.a.b(j1.e.b(j10)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        pVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        df.a aVar = this.f20991y;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z3, int i, int i10, int i11, int i12) {
    }
}
