package n1;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import c2.s2;
import j.i0;
import k1.p;
import k1.q;
import y2.m;

/* loaded from: classes.dex */
public final class l extends View {
    public static final s2 E = new s2(3);
    public y2.c A;
    public m B;
    public df.l C;
    public b D;

    /* renamed from: u, reason: collision with root package name */
    public final o1.a f21103u;

    /* renamed from: v, reason: collision with root package name */
    public final q f21104v;

    /* renamed from: w, reason: collision with root package name */
    public final m1.b f21105w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f21106x;

    /* renamed from: y, reason: collision with root package name */
    public Outline f21107y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f21108z;

    public l(o1.a aVar, q qVar, m1.b bVar) {
        super(aVar.getContext());
        this.f21103u = aVar;
        this.f21104v = qVar;
        this.f21105w = bVar;
        setOutlineProvider(E);
        this.f21108z = true;
        this.A = m1.c.f20427a;
        this.B = m.f30814u;
        d.f21036a.getClass();
        this.C = a.f21011w;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        q qVar = this.f21104v;
        k1.a aVar = qVar.f19512a;
        Canvas canvas2 = aVar.f19463a;
        aVar.f19463a = canvas;
        y2.c cVar = this.A;
        m mVar = this.B;
        float width = getWidth();
        float height = getHeight();
        long floatToRawIntBits = (Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        b bVar = this.D;
        df.l lVar = this.C;
        m1.b bVar2 = this.f21105w;
        y2.c l10 = bVar2.p0().l();
        m o10 = bVar2.p0().o();
        p j10 = bVar2.p0().j();
        long r8 = bVar2.p0().r();
        b bVar3 = (b) bVar2.p0().f18637w;
        i0 p02 = bVar2.p0();
        p02.G(cVar);
        p02.H(mVar);
        p02.F(aVar);
        p02.I(floatToRawIntBits);
        p02.f18637w = bVar;
        aVar.l();
        try {
            lVar.invoke(bVar2);
            aVar.s();
            i0 p03 = bVar2.p0();
            p03.G(l10);
            p03.H(o10);
            p03.F(j10);
            p03.I(r8);
            p03.f18637w = bVar3;
            qVar.f19512a.f19463a = canvas2;
            this.f21106x = false;
        } catch (Throwable th) {
            aVar.s();
            i0 p04 = bVar2.p0();
            p04.G(l10);
            p04.H(o10);
            p04.F(j10);
            p04.I(r8);
            p04.f18637w = bVar3;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f21108z;
    }

    public final q getCanvasHolder() {
        return this.f21104v;
    }

    public final View getOwnerView() {
        return this.f21103u;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f21108z;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (!this.f21106x) {
            this.f21106x = true;
            super.invalidate();
        }
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z3) {
        if (this.f21108z != z3) {
            this.f21108z = z3;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z3) {
        this.f21106x = z3;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z3, int i, int i10, int i11, int i12) {
    }
}
