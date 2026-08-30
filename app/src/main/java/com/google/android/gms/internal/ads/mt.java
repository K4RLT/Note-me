package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import java.util.Collections;

/* loaded from: classes.dex */
public final class mt extends mu {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public final Object G;
    public final h00 H;
    public final Activity I;
    public x0 J;
    public ImageView K;
    public LinearLayout L;
    public final hx0 M;
    public PopupWindow N;
    public RelativeLayout O;
    public ViewGroup P;

    /* renamed from: y, reason: collision with root package name */
    public String f8409y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8410z;

    static {
        n.f fVar = new n.f(7);
        Collections.addAll(fVar, "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
        Collections.unmodifiableSet(fVar);
    }

    public mt(q00 q00Var, hx0 hx0Var) {
        super(q00Var, 5, "resize");
        this.f8409y = "top-right";
        this.f8410z = true;
        this.A = 0;
        this.B = 0;
        this.C = -1;
        this.D = 0;
        this.E = 0;
        this.F = -1;
        this.G = new Object();
        this.H = q00Var;
        this.I = q00Var.f();
        this.M = hx0Var;
    }

    public final void u(boolean z3) {
        synchronized (this.G) {
            try {
                if (this.N != null) {
                    if (((Boolean) g9.r.e.f17698c.a(sl.f10798jc)).booleanValue() && Looper.getMainLooper().getThread() != Thread.currentThread()) {
                        xx.f12655f.f(new lt(0, this, z3));
                    } else {
                        v(z3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(boolean z3) {
        nl nlVar = sl.f10813kc;
        g9.r rVar = g9.r.e;
        ql qlVar = rVar.f17698c;
        ql qlVar2 = rVar.f17698c;
        boolean booleanValue = ((Boolean) qlVar.a(nlVar)).booleanValue();
        h00 h00Var = this.H;
        if (booleanValue) {
            this.O.removeView((View) h00Var);
            this.N.dismiss();
        } else {
            this.N.dismiss();
            this.O.removeView((View) h00Var);
        }
        if (((Boolean) qlVar2.a(sl.f10828lc)).booleanValue()) {
            View view = (View) h00Var;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.P;
        if (viewGroup != null) {
            viewGroup.removeView(this.K);
            boolean booleanValue2 = ((Boolean) qlVar2.a(sl.f10843mc)).booleanValue();
            ViewGroup viewGroup2 = this.P;
            if (booleanValue2) {
                try {
                    viewGroup2.addView((View) h00Var);
                    h00Var.C0(this.J);
                } catch (IllegalStateException e) {
                    int i = k9.a0.f19634b;
                    l9.i.d("Unable to add webview back to view hierarchy.", e);
                    f9.k.C.f16817h.d("MraidCallResizeHandler.collapseInternal", e);
                }
            } else {
                viewGroup2.addView((View) h00Var);
                h00Var.C0(this.J);
            }
        }
        if (z3) {
            q("default");
            hx0 hx0Var = this.M;
            if (hx0Var != null) {
                ((fd0) hx0Var.f6914v).f6025c.P1(f70.f5958z);
            }
        }
        this.N = null;
        this.O = null;
        this.P = null;
        this.L = null;
    }
}
