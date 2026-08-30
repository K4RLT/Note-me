package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.ArrayList;

/* loaded from: classes.dex */
public interface h00 extends g9.a, f90, qq, vq, ai, f9.g {
    l9.a A();

    sp0 A0();

    void B0();

    void C0(x0 x0Var);

    void D0(String str, String str2);

    bi0 E0();

    void F0(Context context);

    j9.d G0();

    ai0 H0();

    int I();

    boolean I0();

    qp0 J();

    void J0(int i, boolean z3, boolean z9);

    void K0(int i);

    void L0(boolean z3);

    void M0(ai0 ai0Var);

    void N0(long j10, boolean z3);

    void O(int i);

    void O0();

    String P();

    void P0(boolean z3, int i, String str, boolean z9, boolean z10);

    void Q0();

    void S0(bi0 bi0Var);

    of T0();

    View U();

    void U0(u00 u00Var);

    void V0(no0 no0Var);

    void W0(j9.e eVar, boolean z3, boolean z9, String str);

    void X0(String str, mp mpVar);

    void Y0(j9.d dVar);

    void Z0(int i);

    boolean a1();

    void b1(qn qnVar);

    p8 c1();

    boolean canGoBack();

    u00 d();

    jz d1(String str);

    void destroy();

    void e1(boolean z3);

    Activity f();

    void f1(String str, lx0 lx0Var);

    ul g();

    void g1(qp0 qp0Var, sp0 sp0Var);

    Context getContext();

    ViewGroup.LayoutParams getLayoutParams();

    ViewParent getParent();

    int getWidth();

    void goBack();

    void h();

    Context h0();

    void h1(String str, mp mpVar);

    j6.l i();

    cq0 i0();

    boolean i1();

    boolean isAttachedToWindow();

    j6.l j();

    x00 j0();

    qn j1();

    void k0(boolean z3, int i, String str, String str2, boolean z9);

    void k1();

    x0 l0();

    void l1();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    String m();

    void m0(int i);

    void m1(boolean z3);

    String n();

    void n0(String str, String str2);

    void n1(hc0 hc0Var);

    boolean o0();

    boolean o1();

    void onPause();

    void onResume();

    ArrayList p0();

    void p1(boolean z3);

    int q();

    int q0();

    boolean q1();

    void s();

    void s0();

    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    no0 t0();

    WebView u();

    void u0(String str, jz jzVar);

    ac.b v0();

    void w0(j9.d dVar);

    void x0(boolean z3);

    void y0(int i, boolean z3);

    j9.d z0();
}
