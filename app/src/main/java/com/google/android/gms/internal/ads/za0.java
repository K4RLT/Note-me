package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class za0 extends co implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, mb0 {
    public static final y51 J;
    public View A;
    public na0 C;
    public bi D;
    public xn F;
    public boolean G;
    public GestureDetector I;

    /* renamed from: v, reason: collision with root package name */
    public final String f13126v;

    /* renamed from: x, reason: collision with root package name */
    public FrameLayout f13128x;

    /* renamed from: y, reason: collision with root package name */
    public FrameLayout f13129y;

    /* renamed from: z, reason: collision with root package name */
    public final wx f13130z;

    /* renamed from: w, reason: collision with root package name */
    public HashMap f13127w = new HashMap();
    public oa.a E = null;
    public boolean H = false;
    public final int B = ModuleDescriptor.MODULE_VERSION;

    static {
        b51 b51Var = d51.f5314v;
        Object[] objArr = {"2011", "1009", "3010"};
        ct.h(objArr, 3);
        J = d51.w(objArr, 3);
    }

    public za0(FrameLayout frameLayout, FrameLayout frameLayout2) {
        String str;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2 = null;
        this.f13128x = frameLayout;
        this.f13129y = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f13126v = str;
        fp fpVar = f9.k.C.B;
        cy cyVar = new cy(frameLayout, this);
        View view = (View) ((WeakReference) cyVar.f11688u).get();
        ViewTreeObserver viewTreeObserver3 = (view == null || (viewTreeObserver3 = view.getViewTreeObserver()) == null || !viewTreeObserver3.isAlive()) ? null : viewTreeObserver3;
        if (viewTreeObserver3 != null) {
            cyVar.U1(viewTreeObserver3);
        }
        dy dyVar = new dy(frameLayout, this);
        View view2 = (View) ((WeakReference) dyVar.f11688u).get();
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            dyVar.U1(viewTreeObserver2);
        }
        this.f13130z = xx.f12655f;
        this.D = new bi(this.f13128x.getContext(), this.f13128x);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final synchronized void A1(oa.a aVar, String str) {
        o1(str, (View) oa.b.z1(aVar));
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final /* synthetic */ View M0() {
        return this.f13128x;
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final synchronized void M2(oa.a aVar) {
        if (this.H) {
            return;
        }
        this.E = aVar;
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final synchronized View R(String str) {
        WeakReference weakReference;
        if (!this.H && (weakReference = (WeakReference) this.f13127w.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final synchronized void S0(oa.b bVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final synchronized void U3(oa.a aVar) {
        if (this.H) {
            return;
        }
        Object z12 = oa.b.z1(aVar);
        if (!(z12 instanceof na0)) {
            int i = k9.a0.f19634b;
            l9.i.f("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        na0 na0Var = this.C;
        if (na0Var != null) {
            na0Var.r(this);
        }
        synchronized (this) {
            this.f13130z.execute(new e40(7, this));
            na0 na0Var2 = (na0) z12;
            this.C = na0Var2;
            na0Var2.q(this);
            this.C.f(this.f13128x);
            na0 na0Var3 = this.C;
            FrameLayout frameLayout = this.f13129y;
            bi0 k3 = na0Var3.f8615m.k();
            if (na0Var3.f8618p.c() && k3 != null && frameLayout != null) {
                v80 v80Var = f9.k.C.f16832x;
                tt0 tt0Var = k3.f4801a;
                v80Var.getClass();
                v80.p(new ac.a(tt0Var, 18, frameLayout));
            }
            if (this.G) {
                pa0 pa0Var = this.C.F;
                xn xnVar = this.F;
                synchronized (pa0Var) {
                    pa0Var.f9451a = xnVar;
                }
            }
            if (((Boolean) g9.r.e.f17698c.a(sl.M4)).booleanValue() && !TextUtils.isEmpty(this.C.f8618p.e())) {
                w4(this.C.f8618p.e());
            }
            v4();
        }
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final bi b() {
        return this.D;
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final oa.a b0() {
        return this.E;
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final FrameLayout b4() {
        return this.f13129y;
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final synchronized Map d() {
        return this.f13127w;
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final synchronized Map f() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final synchronized Map g() {
        return this.f13127w;
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final synchronized String h() {
        return this.f13126v;
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final synchronized void j3(xn xnVar) {
        if (!this.H) {
            this.G = true;
            this.F = xnVar;
            na0 na0Var = this.C;
            if (na0Var != null) {
                pa0 pa0Var = na0Var.F;
                synchronized (pa0Var) {
                    pa0Var.f9451a = xnVar;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final synchronized void k() {
        try {
            if (this.H) {
                return;
            }
            na0 na0Var = this.C;
            if (na0Var != null) {
                na0Var.r(this);
                this.C = null;
            }
            this.f13127w.clear();
            this.f13128x.removeAllViews();
            this.f13129y.removeAllViews();
            this.f13127w = null;
            this.f13128x = null;
            this.f13129y = null;
            this.A = null;
            this.D = null;
            this.H = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final synchronized void m3(oa.a aVar) {
        na0 na0Var = this.C;
        View view = (View) oa.b.z1(aVar);
        synchronized (na0Var) {
            na0Var.f8616n.b(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final synchronized JSONObject n() {
        JSONObject f10;
        na0 na0Var = this.C;
        if (na0Var != null) {
            FrameLayout frameLayout = this.f13128x;
            Map d2 = d();
            Map g8 = g();
            synchronized (na0Var) {
                f10 = na0Var.f8616n.f(frameLayout, d2, g8, na0Var.k());
            }
            return f10;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final void n2(oa.a aVar) {
        onTouch(this.f13128x, (MotionEvent) oa.b.z1(aVar));
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final synchronized void o1(String str, View view) {
        if (!this.H) {
            HashMap hashMap = this.f13127w;
            if (view == null) {
                hashMap.remove(str);
                return;
            }
            hashMap.put(str, new WeakReference(view));
            if (!"1098".equals(str) && !"3011".equals(str)) {
                if (wa.h9.a(this.B)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        boolean z3;
        na0 na0Var = this.C;
        if (na0Var != null) {
            synchronized (na0Var) {
                z3 = na0Var.f8616n.z();
            }
            if (z3) {
                na0 na0Var2 = this.C;
                synchronized (na0Var2) {
                    na0Var2.f8616n.j();
                }
                this.C.s(view, this.f13128x, d(), g(), false);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        na0 na0Var = this.C;
        if (na0Var != null) {
            FrameLayout frameLayout = this.f13128x;
            na0Var.t(frameLayout, d(), g(), na0.d(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        na0 na0Var = this.C;
        if (na0Var != null) {
            FrameLayout frameLayout = this.f13128x;
            na0Var.t(frameLayout, d(), g(), na0.d(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        int x9;
        na0 na0Var = this.C;
        if (na0Var != null) {
            FrameLayout frameLayout = this.f13128x;
            synchronized (na0Var) {
                na0Var.f8616n.v(frameLayout, motionEvent);
            }
            if (((Boolean) g9.r.e.f17698c.a(sl.Xc)).booleanValue() && this.I != null) {
                na0 na0Var2 = this.C;
                synchronized (na0Var2) {
                    x9 = na0Var2.f8616n.x();
                }
                if (x9 != 0) {
                    this.I.onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final synchronized JSONObject p() {
        JSONObject m4;
        na0 na0Var = this.C;
        if (na0Var != null) {
            FrameLayout frameLayout = this.f13128x;
            Map d2 = d();
            Map g8 = g();
            synchronized (na0Var) {
                m4 = na0Var.f8616n.m(frameLayout, d2, g8, na0Var.k());
            }
            return m4;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final synchronized oa.a t(String str) {
        return new oa.b(R(str));
    }

    public final synchronized void v4() {
        int x9;
        if (((Boolean) g9.r.e.f17698c.a(sl.Xc)).booleanValue()) {
            na0 na0Var = this.C;
            synchronized (na0Var) {
                x9 = na0Var.f8616n.x();
            }
            if (x9 != 0) {
                this.I = new GestureDetector(this.f13128x.getContext(), new db0(this.C, this));
            }
        }
    }

    public final synchronized void w4(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.f13129y.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.f13129y.getContext();
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (!TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] decode = Base64.decode(str, 0);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (IllegalArgumentException e) {
                        l9.i.g("Encountered invalid base64 watermark.", e);
                    }
                }
            }
            this.f13129y.addView(frameLayout);
        } catch (Throwable th) {
            throw th;
        }
    }
}
