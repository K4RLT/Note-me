package c3;
import n.b;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import c.g0;
import c.i0;
import com.daren.scraply.R;

/* loaded from: classes.dex */
public final class v extends Dialog implements androidx.lifecycle.w, i0, m5.e {
    public final t A;
    public boolean B;

    /* renamed from: u, reason: collision with root package name */
    public androidx.lifecycle.y f3808u;

    /* renamed from: v, reason: collision with root package name */
    public final j6.c f3809v;

    /* renamed from: w, reason: collision with root package name */
    public final g0 f3810w;

    /* renamed from: x, reason: collision with root package name */
    public df.a f3811x;

    /* renamed from: y, reason: collision with root package name */
    public u f3812y;

    /* renamed from: z, reason: collision with root package name */
    public final View f3813z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v(df.a r7, c3.u r8, android.view.View r9, y2.m r10, y2.c r11, java.util.UUID r12) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.v.<init>(df.a, c3.u, android.view.View, y2.m, y2.c, java.util.UUID):void");
    }

    public static void b(v vVar) {
        super.onBackPressed();
    }

    public static final void c(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        viewGroup.setClipChildren(false);
        if (!(viewGroup instanceof t)) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) childAt;
                } else {
                    viewGroup2 = null;
                }
                if (viewGroup2 != null) {
                    c(viewGroup2);
                }
            }
        }
    }

    @Override // i0
    public final g0 a() {
        return this.f3810w;
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        e();
        super.addContentView(view, layoutParams);
    }

    public final androidx.lifecycle.y d() {
        androidx.lifecycle.y yVar = this.f3808u;
        if (yVar == null) {
            androidx.lifecycle.y yVar2 = new androidx.lifecycle.y(this, true);
            this.f3808u = yVar2;
            return yVar2;
        }
        return yVar;
    }

    public final void e() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // m5.e
    public final i0.m f() {
        return (i0.m) this.f3809v.f18915w;
    }

    @Override // androidx.lifecycle.w
    public final androidx.lifecycle.y g() {
        return d();
    }

    public final void h(df.a aVar, u uVar, y2.m mVar) {
        int i;
        int i10;
        boolean z3;
        int i11;
        this.f3811x = aVar;
        this.f3812y = uVar;
        c0 c0Var = uVar.f3805c;
        boolean b10 = b(this.f3813z);
        int ordinal = c0Var.ordinal();
        int i12 = 0;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    b10 = false;
                } else {
                    l4.a.o();
                    return;
                }
            } else {
                b10 = true;
            }
        }
        Window window = getWindow();
        window.getClass();
        if (b10) {
            i = 8192;
        } else {
            i = -8193;
        }
        window.setFlags(i, 8192);
        int ordinal2 = mVar.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                i10 = 1;
            } else {
                l4.a.o();
                return;
            }
        } else {
            i10 = 0;
        }
        t tVar = this.A;
        tVar.setLayoutDirection(i10);
        boolean z9 = uVar.e;
        boolean z10 = uVar.f3806d;
        Window window2 = tVar.C;
        if (tVar.G && z10 == tVar.E && z9 == tVar.F) {
            z3 = false;
        } else {
            z3 = true;
        }
        tVar.E = z10;
        tVar.F = z9;
        if (z3) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            if (z10) {
                i11 = -2;
            } else {
                i11 = -1;
            }
            if (i11 != attributes.width || !tVar.G) {
                window2.setLayout(i11, -2);
                tVar.G = true;
            }
        }
        setCanceledOnTouchOutside(uVar.f3804b);
        Window window3 = getWindow();
        if (window3 != null) {
            if (!z9) {
                if (Build.VERSION.SDK_INT < 31) {
                    i12 = 16;
                } else {
                    i12 = 48;
                }
            }
            window3.setSoftInputMode(i12);
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f3810w.c();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            g0 g0Var = this.f3810w;
            g0Var.e = onBackInvokedDispatcher;
            g0Var.d(g0Var.f3237g);
        }
        this.f3809v.f(bundle);
        d().d(androidx.lifecycle.o.ON_CREATE);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f3812y.f3803a && keyEvent.isTracking() && !keyEvent.isCanceled() && i == 111) {
            this.f3811x.invoke();
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.f3809v.g(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        d().d(androidx.lifecycle.o.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        d().d(androidx.lifecycle.o.ON_DESTROY);
        this.f3808u = null;
        super.onStop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if (r5 <= r1) goto L35;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = super.onTouchEvent(r10)
            c3.u r1 = r9.f3812y
            boolean r1 = r1.f3804b
            r2 = 3
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L8b
            c3.t r1 = r9.A
            r1.getClass()
            float r5 = r10.getX()
            boolean r6 = java.lang.Float.isInfinite(r5)
            if (r6 != 0) goto L6e
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L6e
            float r5 = r10.getY()
            boolean r6 = java.lang.Float.isInfinite(r5)
            if (r6 != 0) goto L6e
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L6e
            android.view.View r5 = r1.getChildAt(r3)
            if (r5 != 0) goto L39
            goto L6e
        L39:
            int r6 = r1.getLeft()
            int r7 = r5.getLeft()
            int r7 = r7 + r6
            int r6 = r5.getWidth()
            int r6 = r6 + r7
            int r1 = r1.getTop()
            int r8 = r5.getTop()
            int r8 = r8 + r1
            int r1 = r5.getHeight()
            int r1 = r1 + r8
            float r5 = r10.getX()
            int r5 = ff.a.b(r5)
            if (r7 > r5) goto L6e
            if (r5 > r6) goto L6e
            float r5 = r10.getY()
            int r5 = ff.a.b(r5)
            if (r8 > r5) goto L6e
            if (r5 > r1) goto L6e
            goto L8b
        L6e:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L88
            if (r10 == r4) goto L7c
            if (r10 == r2) goto L79
            goto L95
        L79:
            r9.B = r3
            return r0
        L7c:
            boolean r10 = r9.B
            if (r10 == 0) goto L95
            df.a r10 = r9.f3811x
            r10.invoke()
            r9.B = r3
            return r4
        L88:
            r9.B = r4
            return r4
        L8b:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L96
            if (r10 == r4) goto L96
            if (r10 == r2) goto L96
        L95:
            return r0
        L96:
            r9.B = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.v.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        view.getClass();
        e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        e();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        e();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
