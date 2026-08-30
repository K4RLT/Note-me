package c3;
import c.b0;
import c.i;
import l.a;
import n.b;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.lifecycle.o0;
import c0.d0;
import c2.s2;
import com.daren.scraply.R;
import com.facebook.ads.AdError;
import java.util.UUID;
import r0.g0;
import r0.i1;
import r0.q1;
import ya.r0;

/* loaded from: classes.dex */
public final class x extends c2.a {
    public df.a C;
    public b0 D;
    public String E;
    public final View F;
    public final z G;
    public final WindowManager H;
    public final WindowManager.LayoutParams I;
    public a0 J;
    public y2.m K;
    public final i1 L;
    public final i1 M;
    public y2.k N;
    public final g0 O;
    public final Rect P;
    public final b1.b0 Q;
    public b0 R;
    public final i1 S;
    public boolean T;
    public final int[] U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [c3.z] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public x(df.a aVar, b0 b0Var, String str, View view, y2.c cVar, a0 a0Var, UUID uuid) {
        super(view.getContext());
        Object r02;
        if (Build.VERSION.SDK_INT >= 29) {
            r02 = new Object();
        } else {
            r02 = new Object();
        }
        this.C = aVar;
        this.D = b0Var;
        this.E = str;
        this.F = view;
        this.G = r02;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.H = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        b0 b0Var2 = this.D;
        boolean b10 = b(view);
        boolean z3 = b0Var2.f3748b;
        int i = b0Var2.f3747a;
        if (z3 && b10) {
            i |= 8192;
        } else if (z3 && !b10) {
            i &= -8193;
        }
        layoutParams.flags = i;
        layoutParams.type = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.I = layoutParams;
        this.J = a0Var;
        this.K = y2.m.f30814u;
        this.L = r0.y.B(null);
        this.M = r0.y.B(null);
        this.O = r0.y.r(new a2.c(7, this));
        this.P = new Rect();
        this.Q = new b1.b0(new k(this, 2));
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, o0.e(view));
        setTag(R.id.view_tree_view_model_store_owner, o0.f(view));
        setTag(R.id.view_tree_saved_state_registry_owner, r0.a(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(cVar.l0((float) 8));
        setOutlineProvider(new s2(2));
        this.S = r0.y.B(s.f3802a);
        this.U = new int[2];
    }

    private final df.p getContent() {
        return (df.p) this.S.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z1.x getParentLayoutCoordinates() {
        return (z1.x) this.M.getValue();
    }

    private final y2.k getVisibleDisplayBounds() {
        this.G.getClass();
        View view = this.F;
        Rect rect = this.P;
        view.getWindowVisibleDisplayFrame(rect);
        return new y2.k(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void setContent(df.p pVar) {
        this.S.setValue(pVar);
    }

    private final void setParentLayoutCoordinates(z1.x xVar) {
        this.M.setValue(xVar);
    }

    @Override // c2.a
    public final void a(int i, r0.m mVar) {
        int i10;
        boolean z3;
        r0.r rVar = (r0.r) mVar;
        rVar.c0(-857613600);
        if (rVar.h(this)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i;
        if ((i11 & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i11 & 1, z3)) {
            getContent().invoke(rVar, 0);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new d0(this, i, 4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.D.f3749c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                df.a aVar = this.C;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // c2.a
    public final void e(boolean z3, int i, int i10, int i11, int i12) {
        super.e(z3, i, i10, i11, i12);
        this.D.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.I;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.G.getClass();
        this.H.updateViewLayout(this, layoutParams);
    }

    @Override // c2.a
    public final void f(int i, int i10) {
        this.D.getClass();
        y2.k visibleDisplayBounds = getVisibleDisplayBounds();
        super.f(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.d(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.b(), Integer.MIN_VALUE));
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.O.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.I;
    }

    public final y2.m getParentLayoutDirection() {
        return this.K;
    }

    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final y2.l m199getPopupContentSizebOM6tXw() {
        return (y2.l) this.L.getValue();
    }

    public final a0 getPositionProvider() {
        return this.J;
    }

    @Override // c2.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.T;
    }

    public final String getTestTag() {
        return this.E;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void i(r0.u uVar, df.p pVar) {
        setParentCompositionContext(uVar);
        setContent(pVar);
        this.T = true;
    }

    public final void j(df.a aVar, b0 b0Var, String str, y2.m mVar) {
        int i;
        this.C = aVar;
        this.E = str;
        if (!kotlin.jvm.internal.a(this.D, b0Var)) {
            b0Var.getClass();
            this.D = b0Var;
            boolean b10 = b(this.F);
            boolean z3 = b0Var.f3748b;
            int i10 = b0Var.f3747a;
            if (z3 && b10) {
                i10 |= 8192;
            } else if (z3 && !b10) {
                i10 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.I;
            layoutParams.flags = i10;
            this.G.getClass();
            this.H.updateViewLayout(this, layoutParams);
        }
        int ordinal = mVar.ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal != 1) {
                l4.a.o();
                return;
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    public final void k() {
        z1.x parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.i()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates != null) {
                long k3 = parentLayoutCoordinates.k();
                long f10 = parentLayoutCoordinates.f(0L);
                long round = (Math.round(Float.intBitsToFloat((int) (f10 >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (f10 & 4294967295L))) & 4294967295L);
                int i = (int) (round >> 32);
                int i10 = (int) (round & 4294967295L);
                y2.k kVar = new y2.k(i, i10, ((int) (k3 >> 32)) + i, ((int) (k3 & 4294967295L)) + i10);
                if (!kVar.equals(this.N)) {
                    this.N = kVar;
                    m();
                }
            }
        }
    }

    public final void l(z1.x xVar) {
        setParentLayoutCoordinates(xVar);
        k();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.jvm.internal.x] */
    public final void m() {
        y2.l m199getPopupContentSizebOM6tXw;
        y2.k kVar = this.N;
        if (kVar != null && (m199getPopupContentSizebOM6tXw = m199getPopupContentSizebOM6tXw()) != null) {
            long j10 = m199getPopupContentSizebOM6tXw.f30813a;
            y2.k visibleDisplayBounds = getVisibleDisplayBounds();
            long b10 = (visibleDisplayBounds.b() & 4294967295L) | (visibleDisplayBounds.d() << 32);
            Object obj = new Object();
            obj.f19786u = 0L;
            this.Q.d(this, c.A, new w(obj, this, kVar, b10, j10));
            long j11 = obj.f19786u;
            WindowManager.LayoutParams layoutParams = this.I;
            layoutParams.x = (int) (j11 >> 32);
            layoutParams.y = (int) (j11 & 4294967295L);
            boolean z3 = this.D.e;
            z zVar = this.G;
            if (z3) {
                zVar.a(this, (int) (b10 >> 32), (int) (b10 & 4294967295L));
            }
            zVar.getClass();
            this.H.updateViewLayout(this, layoutParams);
        }
    }

    @Override // c2.a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q.e();
        if (this.D.f3749c && Build.VERSION.SDK_INT >= 33) {
            if (this.R == null) {
                this.R = new b0(1, this.C);
            }
            i.e(this, this.R);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b1.b0 b0Var = this.Q;
        b1.h hVar = b0Var.f1313h;
        if (hVar != null) {
            hVar.k();
        }
        b0Var.a();
        if (Build.VERSION.SDK_INT >= 33) {
            i.f(this, this.R);
        }
        this.R = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.D.f3750d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            df.a aVar = this.C;
            if (aVar != null) {
                aVar.invoke();
                return true;
            }
        } else if (motionEvent != null && motionEvent.getAction() == 4) {
            df.a aVar2 = this.C;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void setParentLayoutDirection(y2.m mVar) {
        this.K = mVar;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m200setPopupContentSizefhxjrPA(y2.l lVar) {
        this.L.setValue(lVar);
    }

    public final void setPositionProvider(a0 a0Var) {
        this.J = a0Var;
    }

    public final void setTestTag(String str) {
        this.E = str;
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    public c2.a getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}