package com.google.android.gms.internal.ads;
import ac.a;
import ac.b;
import f9.g;
import f9.k;
import fa.y;
import g9.a;
import g9.r;
import j6.l;
import j9.d;
import j9.e;
import k9.b0;
import k9.f0;
import l9.a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.daren.scraply.R;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q00 extends FrameLayout implements h00 {

    /* renamed from: u, reason: collision with root package name */
    public final s00 f9696u;

    /* renamed from: v, reason: collision with root package name */
    public final p8 f9697v;

    /* renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f9698w;

    public q00(s00 s00Var, be0 be0Var) {
        super(s00Var.getContext());
        this.f9698w = new AtomicBoolean();
        this.f9696u = s00Var;
        this.f9697v = new p8(s00Var.f10434u.f5249c, this, this, be0Var);
        addView(s00Var);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final a A() {
        return this.f9696u.f10440y;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final sp0 A0() {
        return this.f9696u.E;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void B0() {
        String str;
        bi0 E0;
        ai0 H0;
        s00 s00Var = this.f9696u;
        TextView textView = new TextView(getContext());
        k kVar = k.C;
        f0 f0Var = kVar.f16813c;
        Resources c10 = kVar.f16817h.c();
        if (c10 != null) {
            str = c10.getString(R.string.s7);
        } else {
            str = "Test Ad";
        }
        textView.setText(str);
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        nl nlVar = sl.f10807k6;
        r rVar = r.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue() && (H0 = s00Var.H0()) != null) {
            synchronized (H0) {
                xt0 xt0Var = H0.f4516f;
                if (xt0Var != null) {
                    kVar.f16832x.getClass();
                    v80.p(new a(xt0Var, 19, textView));
                    return;
                }
                return;
            }
        }
        if (((Boolean) rVar.f17698c.a(sl.f10792j6)).booleanValue() && (E0 = s00Var.E0()) != null && ((st0) E0.f4802b.A) == st0.HTML) {
            v80 v80Var = kVar.f16832x;
            tt0 tt0Var = E0.f4801a;
            v80Var.getClass();
            v80.p(new a(tt0Var, 18, textView));
        }
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void C0(x0 x0Var) {
        this.f9696u.C0(x0Var);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void D0(String str, String str2) {
        this.f9696u.D0(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final bi0 E0() {
        return this.f9696u.E0();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void F0(Context context) {
        this.f9696u.F0(context);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final d G0() {
        return this.f9696u.G0();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final ai0 H0() {
        return this.f9696u.H0();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final int I() {
        if (((Boolean) r.e.f17698c.a(sl.K4)).booleanValue()) {
            return this.f9696u.getMeasuredHeight();
        }
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final boolean I0() {
        return this.f9696u.I0();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final qp0 J() {
        return this.f9696u.D;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void J0(int i, boolean z3, boolean z9) {
        this.f9696u.J0(i, z3, z9);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void K0(int i) {
        this.f9696u.K0(i);
    }

    @Override // a
    public final void L() {
        s00 s00Var = this.f9696u;
        if (s00Var != null) {
            s00Var.L();
        }
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void L0(boolean z3) {
        this.f9696u.L0(z3);
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void M() {
        s00 s00Var = this.f9696u;
        if (s00Var != null) {
            s00Var.M();
        }
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void M0(ai0 ai0Var) {
        this.f9696u.M0(ai0Var);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void N0(long j10, boolean z3) {
        this.f9696u.N0(j10, z3);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void O(int i) {
        ly lyVar = (ly) this.f9697v.f9423z;
        if (lyVar != null) {
            if (((Boolean) r.e.f17698c.a(sl.f10882p0)).booleanValue()) {
                lyVar.f8180v.setBackgroundColor(i);
                lyVar.f8181w.setBackgroundColor(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void O0() {
        this.f9696u.O0();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final String P() {
        return this.f9696u.P();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void P0(boolean z3, int i, String str, boolean z9, boolean z10) {
        this.f9696u.P0(z3, i, str, z9, z10);
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void Q() {
        s00 s00Var = this.f9696u;
        if (s00Var != null) {
            s00Var.Q();
        }
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void Q0() {
        setBackgroundColor(0);
        this.f9696u.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void S0(bi0 bi0Var) {
        this.f9696u.S0(bi0Var);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final of T0() {
        return this.f9696u.f10436v;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final View U() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void U0(u00 u00Var) {
        this.f9696u.U0(u00Var);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void V0(no0 no0Var) {
        this.f9696u.V0(no0Var);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void W0(e eVar, boolean z3, boolean z9, String str) {
        this.f9696u.W0(eVar, z3, z9, str);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void X0(String str, mp mpVar) {
        this.f9696u.X0(str, mpVar);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void Y0(d dVar) {
        this.f9696u.Y0(dVar);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void Z0(int i) {
        this.f9696u.Z0(i);
    }

    @Override // com.google.android.gms.internal.ads.vq
    public final void a(String str, JSONObject jSONObject) {
        this.f9696u.p(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final boolean a1() {
        return this.f9698w.get();
    }

    @Override // com.google.android.gms.internal.ads.qq
    public final void b(String str, Map map) {
        this.f9696u.b(str, map);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void b1(qn qnVar) {
        this.f9696u.b1(qnVar);
    }

    @Override // com.google.android.gms.internal.ads.qq
    public final void c(String str, JSONObject jSONObject) {
        this.f9696u.c(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final p8 c1() {
        return this.f9697v;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final boolean canGoBack() {
        return this.f9696u.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final u00 d() {
        return this.f9696u.d();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final jz d1(String str) {
        return this.f9696u.d1(str);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void destroy() {
        ai0 H0;
        s00 s00Var = this.f9696u;
        bi0 E0 = s00Var.E0();
        if (E0 != null) {
            b0 b0Var = f0.f19676l;
            b0Var.post(new f(24, E0));
            b0Var.postDelayed(new p00(s00Var, 1), ((Integer) r.e.f17698c.a(sl.f10776i6)).intValue());
        } else if (((Boolean) r.e.f17698c.a(sl.f10807k6)).booleanValue() && (H0 = s00Var.H0()) != null) {
            f0.f19676l.post(new com.google.android.gms.internal.mlkit_vision_digital_ink.ra(this, 11, H0));
        } else {
            s00Var.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void e1(boolean z3) {
        this.f9696u.H.Y = z3;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final Activity f() {
        return this.f9696u.f10434u.f5247a;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void f1(String str, lx0 lx0Var) {
        this.f9696u.f1(str, lx0Var);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final ul g() {
        return this.f9696u.f10422g0;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void g1(qp0 qp0Var, sp0 sp0Var) {
        s00 s00Var = this.f9696u;
        s00Var.D = qp0Var;
        s00Var.E = sp0Var;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void goBack() {
        this.f9696u.goBack();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void h() {
        this.f9696u.h();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final Context h0() {
        return this.f9696u.f10434u.f5249c;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void h1(String str, mp mpVar) {
        this.f9696u.h1(str, mpVar);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final l i() {
        return this.f9696u.A;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final cq0 i0() {
        return this.f9696u.f10438w;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final boolean i1() {
        return this.f9696u.i1();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final l j() {
        return this.f9696u.f10424i0;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final x00 j0() {
        return this.f9696u.H;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final qn j1() {
        return this.f9696u.j1();
    }

    @Override // com.google.android.gms.internal.ads.ai
    public final void k(zh zhVar) {
        this.f9696u.k(zhVar);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void k0(boolean z3, int i, String str, String str2, boolean z9) {
        this.f9696u.k0(z3, i, str, str2, z9);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void k1() {
        this.f9696u.f10437v0 = true;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final x0 l0() {
        return this.f9696u.l0();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void l1() {
        this.f9696u.l1();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void loadData(String str, String str2, String str3) {
        this.f9696u.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f9696u.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void loadUrl(String str) {
        this.f9696u.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final String m() {
        return this.f9696u.m();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void m0(int i) {
        this.f9696u.m0(i);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void m1(boolean z3) {
        this.f9696u.m1(z3);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final String n() {
        return this.f9696u.n();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void n0(String str, String str2) {
        this.f9696u.n0(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void n1(hc0 hc0Var) {
        this.f9696u.n1(hc0Var);
    }

    @Override // com.google.android.gms.internal.ads.vq
    public final void o(String str) {
        this.f9696u.w(str);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final boolean o0() {
        return this.f9696u.o0();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final boolean o1() {
        return this.f9696u.o1();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void onPause() {
        iy iyVar;
        p8 p8Var = this.f9697v;
        p8Var.getClass();
        y.d("onPause must be called from the UI thread.");
        ly lyVar = (ly) p8Var.f9423z;
        if (lyVar != null && (iyVar = lyVar.A) != null) {
            iyVar.i();
        }
        this.f9696u.onPause();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void onResume() {
        this.f9696u.onResume();
    }

    @Override // com.google.android.gms.internal.ads.vq
    public final void p(String str, String str2) {
        this.f9696u.p("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final ArrayList p0() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != this.f9696u) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void p1(boolean z3) {
        this.f9696u.p1(z3);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final int q() {
        return this.f9696u.q();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final int q0() {
        if (((Boolean) r.e.f17698c.a(sl.K4)).booleanValue()) {
            return this.f9696u.getMeasuredWidth();
        }
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final boolean q1() {
        return this.f9696u.q1();
    }

    public final void r() {
        p8 p8Var = this.f9697v;
        p8Var.getClass();
        y.d("onDestroy must be called from the UI thread.");
        ly lyVar = (ly) p8Var.f9423z;
        if (lyVar != null) {
            lyVar.f8183y.a();
            iy iyVar = lyVar.A;
            if (iyVar != null) {
                iyVar.g();
            }
            lyVar.d();
            ((q00) p8Var.f9421x).removeView((ly) p8Var.f9423z);
            p8Var.f9423z = null;
        }
        this.f9696u.r();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void s() {
        this.f9696u.s();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void s0() {
        this.f9696u.s0();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.h00
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f9696u.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.h00
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f9696u.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f9696u.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f9696u.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final no0 t0() {
        return this.f9696u.t0();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final WebView u() {
        return this.f9696u;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void u0(String str, jz jzVar) {
        this.f9696u.u0(str, jzVar);
    }

    @Override // g
    public final void v() {
        this.f9696u.v();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final b v0() {
        return this.f9696u.v0();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void w0(d dVar) {
        this.f9696u.w0(dVar);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void x0(boolean z3) {
        this.f9696u.x0(z3);
    }

    @Override // g
    public final void y() {
        this.f9696u.y();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void y0(int i, boolean z3) {
        this.f9696u.y0(i, z3);
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final d z0() {
        return this.f9696u.z0();
    }
}
