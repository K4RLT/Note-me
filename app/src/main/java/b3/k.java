package b3;
import a.a;
import c.b;
import j.f;
import k.a;
import p.d;

import a0.u;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.w;
import b2.i0;
import b2.k0;
import b2.v1;
import b2.w1;
import b2.x1;
import c2.d3;
import c2.x;
import com.daren.scraply.R;
import java.util.LinkedHashMap;
import pf.b0;
import q3.n0;
import q3.q0;
import r0.x0;
import v1.z;
import wa.b9;
import ya.be;
import ya.rd;
import ya.td;
import z1.h1;

/* loaded from: classes.dex */
public abstract class k extends ViewGroup implements r0.j, w1, q3.d {
    public df.a A;
    public d1.r B;
    public df.l C;
    public y2.c D;
    public df.l E;
    public w F;
    public m5.e G;
    public final int[] H;
    public long I;
    public q0 J;
    public final j K;
    public final j L;
    public df.l M;
    public final int[] N;
    public int O;
    public int P;
    public final nf.a Q;
    public boolean R;
    public final i0 S;

    /* renamed from: u, reason: collision with root package name */
    public final u1.d f1670u;

    /* renamed from: v, reason: collision with root package name */
    public final View f1671v;

    /* renamed from: w, reason: collision with root package name */
    public final v1 f1672w;

    /* renamed from: x, reason: collision with root package name */
    public df.a f1673x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1674y;

    /* renamed from: z, reason: collision with root package name */
    public df.a f1675z;

    /* JADX WARN: Type inference failed for: r10v6, types: [nf.a, java.lang.Object] */
    public k(Context context, r0.p pVar, int i, u1.d dVar, View view, v1 v1Var) {
        super(context);
        this.f1670u = dVar;
        this.f1671v = view;
        this.f1672w = v1Var;
        LinkedHashMap linkedHashMap = d3.f3507a;
        setTag(R.id.androidx_compose_ui_view_composition_context, pVar);
        int i10 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        s sVar = (s) this;
        q3.d(this, new b(sVar, i10));
        q3.f(this, this);
        this.f1673x = i.f1666x;
        this.f1675z = i.f1665w;
        this.A = i.f1664v;
        d1.o oVar = d1.o.f15687a;
        this.B = oVar;
        this.D = rd.a();
        int i11 = 2;
        this.H = new int[2];
        this.I = 0L;
        int i12 = 1;
        this.K = new j(sVar, i12);
        this.L = new j(sVar, i10);
        this.N = new int[2];
        this.O = Integer.MIN_VALUE;
        this.P = Integer.MIN_VALUE;
        this.Q = new Object();
        i0 i0Var = new i0(3);
        i0Var.I = sVar;
        d1.r a10 = j2.a(androidx.compose.ui.input.nestedscroll.a(oVar, l.f1676a, dVar), true, c.f1645x);
        z zVar = new z();
        zVar.f27372a = new e(sVar, i12);
        x0 x0Var = new x0();
        x0 x0Var2 = zVar.f27373b;
        if (x0Var2 != null) {
            x0Var2.f24433v = null;
        }
        zVar.f27373b = x0Var;
        x0Var.f24433v = zVar;
        setOnRequestDisallowInterceptTouchEvent$ui_release(x0Var);
        d1.r d2 = androidx.compose.ui.layout.a.d(androidx.compose.ui.draw.a(a10.d(zVar), new k0(i12, sVar, i0Var, sVar)), new d(sVar, i0Var, i11));
        i0Var.d0(this.B.d(d2));
        this.C = new u(i0Var, 5, d2);
        i0Var.Z(this.D);
        this.E = new a0.k0(7, i0Var);
        i0Var.f1484g0 = new d(sVar, i0Var, i10);
        i0Var.f1485h0 = new e(sVar, i10);
        i0Var.c0(new f(sVar, i0Var));
        this.S = i0Var;
    }

    public static final int e(s sVar, int i, int i10, int i11) {
        if (i11 < 0 && i != i10) {
            if (i11 == -2 && i10 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
            }
            if (i11 == -1 && i10 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
            }
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        return View.MeasureSpec.makeMeasureSpec(b9.e(i11, i, i10), 1073741824);
    }

    public static j3.c f(j3.c cVar, int i, int i10, int i11, int i12) {
        int i13 = cVar.f18874a - i;
        int i14 = 0;
        if (i13 < 0) {
            i13 = 0;
        }
        int i15 = cVar.f18875b - i10;
        if (i15 < 0) {
            i15 = 0;
        }
        int i16 = cVar.f18876c - i11;
        if (i16 < 0) {
            i16 = 0;
        }
        int i17 = cVar.f18877d - i12;
        if (i17 >= 0) {
            i14 = i17;
        }
        return j3.b(i13, i15, i16, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x1 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            y1.a.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((x) this.f1672w).getSnapshotObserver();
    }

    @Override // r0.j
    public final void a() {
        this.A.invoke();
    }

    @Override // r0.j
    public final void b() {
        this.f1675z.invoke();
        removeAllViewsInLayout();
    }

    @Override // q3.d
    public final q0 c(View view, q0 q0Var) {
        this.J = new q0(q0Var);
        return g(q0Var);
    }

    public final q0 g(q0 q0Var) {
        n0 n0Var = q0Var.f23423a;
        j3.c g8 = n0Var.g(-1);
        j3.c cVar = j3.c.e;
        if (!g8.equals(cVar) || !n0Var.h(-9).equals(cVar) || n0Var.f() != null) {
            b2.s sVar = (b2.s) this.S.Z.f1458x;
            if (sVar.f1589k0.H) {
                long b10 = td.b(sVar.W(0L));
                int i = (int) (b10 >> 32);
                int i10 = 0;
                if (i < 0) {
                    i = 0;
                }
                int i11 = (int) (b10 & 4294967295L);
                if (i11 < 0) {
                    i11 = 0;
                }
                long k3 = h1.i(sVar).k();
                int i12 = (int) (k3 >> 32);
                int i13 = (int) (k3 & 4294967295L);
                long j10 = sVar.f31771w;
                long b11 = td.b(sVar.W((Float.floatToRawIntBits((int) (j10 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j10 & 4294967295L)) & 4294967295L)));
                int i14 = i12 - ((int) (b11 >> 32));
                if (i14 < 0) {
                    i14 = 0;
                }
                int i15 = i13 - ((int) (4294967295L & b11));
                if (i15 >= 0) {
                    i10 = i15;
                }
                if (i != 0 || i11 != 0 || i14 != 0 || i10 != 0) {
                    return q0Var.f23423a.n(i, i11, i14, i10);
                }
            }
        }
        return q0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.N;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final y2.c getDensity() {
        return this.D;
    }

    public final View getInteropView() {
        return this.f1671v;
    }

    public final i0 getLayoutNode() {
        return this.S;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f1671v.getLayoutParams();
        if (layoutParams == null) {
            return new ViewGroup.LayoutParams(-1, -1);
        }
        return layoutParams;
    }

    public final w getLifecycleOwner() {
        return this.F;
    }

    public final d1.r getModifier() {
        return this.B;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        this.Q.getClass();
        return 0;
    }

    public final df.l getOnDensityChanged$ui_release() {
        return this.E;
    }

    public final df.l getOnModifierChanged$ui_release() {
        return this.C;
    }

    public final df.l getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.M;
    }

    public final df.a getRelease() {
        return this.A;
    }

    public final df.a getReset() {
        return this.f1675z;
    }

    public final m5.e getSavedStateRegistryOwner() {
        return this.G;
    }

    public final df.a getUpdate() {
        return this.f1673x;
    }

    public final View getView() {
        return this.f1671v;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (this.R) {
            this.f1671v.postOnAnimation(new a(0, this.L));
            return null;
        }
        this.S.C();
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f1671v.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (this.R) {
            this.f1671v.postOnAnimation(new a(0, this.L));
        } else {
            this.S.C();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().f1618a.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i10, int i11, int i12) {
        this.f1671v.layout(0, 0, i11 - i, i12 - i10);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        View view = this.f1671v;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i10));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i10);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.O = i;
        this.P = i10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z3) {
        if (!this.f1671v.isNestedScrollingEnabled()) {
            return false;
        }
        b0.x(this.f1670u.c(), null, new g(z3, this, be.a(f10 * (-1.0f), f11 * (-1.0f)), (te.c) null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        if (!this.f1671v.isNestedScrollingEnabled()) {
            return false;
        }
        b0.x(this.f1670u.c(), null, new h(this, be.a(f10 * (-1.0f), f11 * (-1.0f)), null, 0), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // b2.w1
    public final boolean r() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        df.l lVar = this.M;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z3));
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    public final void setDensity(y2.c cVar) {
        if (cVar != this.D) {
            this.D = cVar;
            df.l lVar = this.E;
            if (lVar != null) {
                lVar.invoke(cVar);
            }
        }
    }

    public final void setLifecycleOwner(w wVar) {
        if (wVar != this.F) {
            this.F = wVar;
            setTag(R.id.view_tree_lifecycle_owner, wVar);
        }
    }

    public final void setModifier(d1.r rVar) {
        if (rVar != this.B) {
            this.B = rVar;
            df.l lVar = this.C;
            if (lVar != null) {
                lVar.invoke(rVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(df.l lVar) {
        this.E = lVar;
    }

    public final void setOnModifierChanged$ui_release(df.l lVar) {
        this.C = lVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(df.l lVar) {
        this.M = lVar;
    }

    public final void setRelease(df.a aVar) {
        this.A = aVar;
    }

    public final void setReset(df.a aVar) {
        this.f1675z = aVar;
    }

    public final void setSavedStateRegistryOwner(m5.e eVar) {
        if (eVar != this.G) {
            this.G = eVar;
            setTag(R.id.view_tree_saved_state_registry_owner, eVar);
        }
    }

    public final void setUpdate(df.a aVar) {
        this.f1673x = aVar;
        this.f1674y = true;
        this.K.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
