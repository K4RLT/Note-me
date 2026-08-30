package c2;
import x.o;
import b0.b;
import b0.x;
import b2.v1;
import c0.d0;
import c0.h;
import d1.c;
import d1.t;
import o0.e;
import r0.m;
import r0.r1;
import r0.u1;
import r0.u;
import r0.v0;
import r0.w0;
import y1.a;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.daren.scraply.R;
import java.lang.ref.WeakReference;
import ya.fd;

/* loaded from: classes.dex */
public abstract class a extends ViewGroup {
    public boolean A;
    public boolean B;

    /* renamed from: u, reason: collision with root package name */
    public WeakReference f3452u;

    /* renamed from: v, reason: collision with root package name */
    public IBinder f3453v;

    /* renamed from: w, reason: collision with root package name */
    public g3 f3454w;

    /* renamed from: x, reason: collision with root package name */
    public u f3455x;

    /* renamed from: y, reason: collision with root package name */
    public h f3456y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3457z;

    public a(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        a0 a0Var = new a0(1, this);
        addOnAttachStateChangeListener(a0Var);
        androidx.datastore.preferences.protobuf.s1 s1Var = new androidx.datastore.preferences.protobuf.s1(15);
        fd.a(this).f27705a.add(s1Var);
        this.f3456y = new h(1, this, a0Var, s1Var);
    }

    private final void setParentContext(u uVar) {
        if (this.f3455x != uVar) {
            this.f3455x = uVar;
            if (uVar != null) {
                this.f3452u = null;
            }
            g3 g3Var = this.f3454w;
            if (g3Var != null) {
                g3Var.a();
                this.f3454w = null;
                if (isAttachedToWindow()) {
                    d();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f3453v != iBinder) {
            this.f3453v = iBinder;
            this.f3452u = null;
        }
    }

    public abstract void a(int i, m mVar);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void b() {
        if (this.A) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void d() {
        if (this.f3454w == null) {
            try {
                this.A = true;
                this.f3454w = h3.a(this, g(), new c(-656146368, new d0(1, this), true));
            } finally {
                this.A = false;
            }
        }
    }

    public void e(boolean z3, int i, int i10, int i11, int i12) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i11 - i) - getPaddingRight(), (i12 - i10) - getPaddingBottom());
        }
    }

    public void f(int i, int i10) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i10);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i10)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.jvm.internal.y] */
    public final u g() {
        u1 u1Var;
        te.g gVar;
        a1 a1Var;
        androidx.lifecycle.y yVar;
        u uVar;
        u uVar2 = this.f3455x;
        if (uVar2 == null) {
            uVar2 = b(this);
            if (uVar2 == null) {
                Object parent = getParent();
                while (uVar2 == null && (parent instanceof View)) {
                    View view = (View) parent;
                    uVar2 = b(view);
                    parent = view.getParent();
                }
            }
            te.c cVar = null;
            if (uVar2 != null) {
                if ((uVar2 instanceof u1) && ((r1) ((u1) uVar2).f24412t.getValue()).compareTo(r1.f24362v) <= 0) {
                    uVar = null;
                } else {
                    uVar = uVar2;
                }
                if (uVar != null) {
                    this.f3452u = new WeakReference(uVar);
                }
            } else {
                uVar2 = null;
            }
            if (uVar2 == null) {
                WeakReference weakReference = this.f3452u;
                if (weakReference == null || (uVar2 = (u) weakReference.get()) == null || ((uVar2 instanceof u1) && ((r1) ((u1) uVar2).f24412t.getValue()).compareTo(r1.f24362v) <= 0)) {
                    uVar2 = null;
                }
                if (uVar2 == null) {
                    if (!isAttachedToWindow()) {
                        y1.a.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object parent2 = getParent();
                    View view2 = this;
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    u b10 = b(view2);
                    if (b10 == null) {
                        ((w2) x2.f3721a.get()).getClass();
                        te.h hVar = te.h.f25707u;
                        pe.n nVar = y0.G;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            gVar = (te.g) y0.G.getValue();
                        } else {
                            gVar = (te.g) y0.H.get();
                            if (gVar == null) {
                                x.o("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        te.g V = gVar.V(hVar);
                        w0 w0Var = (w0) V.L(v0.f24417v);
                        if (w0Var != null) {
                            a1 a1Var2 = new a1(w0Var);
                            com.google.android.gms.internal.ads.d dVar = (com.google.android.gms.internal.ads.d) a1Var2.f3462w;
                            synchronized (dVar.f5230v) {
                                dVar.f5229u = false;
                                a1Var = a1Var2;
                            }
                        } else {
                            a1Var = 0;
                        }
                        Object obj = new Object();
                        te.g gVar2 = (t) V.L(c.J);
                        if (gVar2 == null) {
                            gVar2 = new e2();
                            obj.f19787u = gVar2;
                        }
                        if (a1Var != 0) {
                            hVar = a1Var;
                        }
                        te.g V2 = V.V(hVar).V(gVar2);
                        u1 u1Var2 = new u1(V2);
                        synchronized (u1Var2.f24396b) {
                            u1Var2.f24411s = true;
                        }
                        uf.c b11 = pf.b(V2);
                        androidx.lifecycle.w e = androidx.lifecycle.e(view2);
                        if (e != null) {
                            yVar = e.g();
                        } else {
                            yVar = null;
                        }
                        if (yVar != null) {
                            view2.addOnAttachStateChangeListener(new y2(view2, u1Var2));
                            yVar.a(new b3(b11, a1Var, u1Var2, obj, view2));
                            view2.setTag(R.id.androidx_compose_ui_view_composition_context, u1Var2);
                            pf.y0 y0Var = pf.y0.f22811u;
                            Handler handler = view2.getHandler();
                            int i = qf.e.f24038a;
                            view2.addOnAttachStateChangeListener(new a0(2, pf.x(y0Var, new qf.d(handler, "windowRecomposer cleanup", false).f24037z, new b5.a(u1Var2, view2, cVar, 12), 2)));
                            u1Var = u1Var2;
                        } else {
                            y1.a.c("ViewTreeLifecycleOwner not found from " + view2);
                            l4.a.p();
                            return null;
                        }
                    } else if (b10 instanceof u1) {
                        u1Var = (u1) b10;
                    } else {
                        x.o("root viewTreeParentCompositionContext is not a Recomposer");
                        return null;
                    }
                    if (((r1) u1Var.f24412t.getValue()).compareTo(r1.f24362v) > 0) {
                        cVar = u1Var;
                    }
                    if (cVar != null) {
                        this.f3452u = new WeakReference(cVar);
                    }
                    return u1Var;
                }
            }
        }
        return uVar2;
    }

    public final boolean getHasComposition() {
        if (this.f3454w != null) {
            return true;
        }
        return false;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f3457z;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        if (this.B && !super.isTransitionGroup()) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            d();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i10, int i11, int i12) {
        e(z3, i, i10, i11, i12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        d();
        f(i, i10);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public final void setParentCompositionContext(u uVar) {
        setParentContext(uVar);
    }

    public final void setShowLayoutBounds(boolean z3) {
        this.f3457z = z3;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((x) ((v1) childAt)).setShowLayoutBounds(z3);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z3) {
        super.setTransitionGroup(z3);
        this.B = true;
    }

    public final void setViewCompositionStrategy(q2 q2Var) {
        h hVar = this.f3456y;
        if (hVar != null) {
            hVar.invoke();
        }
        ((n0) q2Var).getClass();
        a0 a0Var = new a0(1, this);
        addOnAttachStateChangeListener(a0Var);
        androidx.datastore.preferences.protobuf.s1 s1Var = new androidx.datastore.preferences.protobuf.s1(15);
        fd.a(this).f27705a.add(s1Var);
        this.f3456y = new h(1, this, a0Var, s1Var);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        b();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z3) {
        b();
        return super.addViewInLayout(view, i, layoutParams, z3);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i10) {
        b();
        super.addView(view, i, i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}