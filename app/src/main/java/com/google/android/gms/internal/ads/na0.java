package com.google.android.gms.internal.ads;
import ac.b;
import f9.k;
import g3.a;
import g9.r;
import k9.a0;
import k9.f0;
import l9.a;
import l9.i;
import n.r0;
import oa.a;
import oa.b;
import p.a;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class na0 extends z40 {
    public static final y51 J;
    public boolean A;
    public final uw B;
    public final of C;
    public final a D;
    public final Context E;
    public final pa0 F;
    public final zk0 G;
    public final HashMap H;
    public final ArrayList I;

    /* renamed from: l, reason: collision with root package name */
    public final Executor f8614l;

    /* renamed from: m, reason: collision with root package name */
    public final ra0 f8615m;

    /* renamed from: n, reason: collision with root package name */
    public final ua0 f8616n;

    /* renamed from: o, reason: collision with root package name */
    public final ab0 f8617o;

    /* renamed from: p, reason: collision with root package name */
    public final ta0 f8618p;

    /* renamed from: q, reason: collision with root package name */
    public final wa0 f8619q;

    /* renamed from: r, reason: collision with root package name */
    public final pr1 f8620r;

    /* renamed from: s, reason: collision with root package name */
    public final pr1 f8621s;

    /* renamed from: t, reason: collision with root package name */
    public final pr1 f8622t;

    /* renamed from: u, reason: collision with root package name */
    public final pr1 f8623u;

    /* renamed from: v, reason: collision with root package name */
    public final pr1 f8624v;

    /* renamed from: w, reason: collision with root package name */
    public ph f8625w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8626x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f8627y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8628z;

    static {
        b51 b51Var = d51.f5314v;
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        ct.h(objArr, 6);
        J = d51.w(objArr, 6);
    }

    public na0(hb hbVar, Executor executor, ra0 ra0Var, ua0 ua0Var, ab0 ab0Var, ta0 ta0Var, wa0 wa0Var, pr1 pr1Var, pr1 pr1Var2, pr1 pr1Var3, pr1 pr1Var4, pr1 pr1Var5, uw uwVar, of ofVar, a aVar, Context context, pa0 pa0Var, zk0 zk0Var) {
        super(hbVar);
        this.f8614l = executor;
        this.f8615m = ra0Var;
        this.f8616n = ua0Var;
        this.f8617o = ab0Var;
        this.f8618p = ta0Var;
        this.f8619q = wa0Var;
        this.f8620r = pr1Var;
        this.f8621s = pr1Var2;
        this.f8622t = pr1Var3;
        this.f8623u = pr1Var4;
        this.f8624v = pr1Var5;
        this.B = uwVar;
        this.C = ofVar;
        this.D = aVar;
        this.E = context;
        this.F = pa0Var;
        this.G = zk0Var;
        this.H = new HashMap();
        this.I = new ArrayList();
    }

    public static boolean d(View view) {
        if (((Boolean) r.e.f17698c.a(sl.Yb)).booleanValue()) {
            f0 f0Var = k.C.f16813c;
            long Q = f0.Q(view);
            if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
                if (Q >= ((Integer) r1.f17698c.a(sl.Zb)).intValue()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.z40
    public final void a() {
        la0 la0Var = new la0(this, 1);
        Executor executor = this.f8614l;
        executor.execute(la0Var);
        if (this.f8615m.q() != 7) {
            ua0 ua0Var = this.f8616n;
            Objects.requireNonNull(ua0Var);
            executor.execute(new e40(6, ua0Var));
        }
        super.a();
    }

    public final synchronized void c(View view, int i) {
        if (!((Boolean) r.e.f17698c.a(sl.Xc)).booleanValue()) {
            return;
        }
        ph phVar = this.f8625w;
        if (phVar == null) {
            int i10 = a0.f19634b;
            i.a("Ad should be associated with an ad view before calling performClickForCustomGesture()");
        } else {
            this.f8614l.execute(new ma0(this, view, phVar instanceof ya0, i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.Map, r0] */
    public final bi0 e(String str, boolean z3) {
        boolean z9;
        boolean z10;
        h00 h00Var;
        String str2;
        int i;
        int i10;
        k kVar;
        bi0 bi0Var;
        String str3;
        ta0 ta0Var = this.f8618p;
        if (ta0Var.c() && !TextUtils.isEmpty(str)) {
            ra0 ra0Var = this.f8615m;
            h00 j10 = ra0Var.j();
            h00 h3 = ra0Var.h();
            if (j10 == null && h3 == null) {
                int i11 = a0.f19634b;
                i.f("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            ta0Var.f();
            int G = ta0Var.f().G();
            int i12 = G - 1;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (G != 1) {
                        if (G != 2) {
                            str3 = "UNKNOWN";
                        } else {
                            str3 = "DISPLAY";
                        }
                    } else {
                        str3 = "VIDEO";
                    }
                    String o10 = a.o(new StringBuilder(str3.length() + 49), "Unknown omid media type: ", str3, ". Not initializing Omid.");
                    int i13 = a0.f19634b;
                    i.f(o10);
                    return null;
                }
                if (j10 != null) {
                    z10 = false;
                    z9 = true;
                } else {
                    int i14 = a0.f19634b;
                    i.f("Omid media type was display but there was no display webview.");
                    return null;
                }
            } else if (h3 != null) {
                z9 = false;
                z10 = true;
            } else {
                int i15 = a0.f19634b;
                i.f("Omid media type was video but there was no video webview.");
            }
            if (z9) {
                str2 = null;
                h00Var = j10;
            } else if (z10) {
                str2 = "javascript";
                h00Var = h3;
            } else {
                h00Var = 0;
                str2 = null;
            }
            if (h00Var != 0) {
                Context context = this.E;
                k kVar2 = k.C;
                kVar2.f16832x.getClass();
                if (!v80.d(context)) {
                    int i16 = a0.f19634b;
                    i.f("Failed to initialize omid in InternalNativeAd");
                    return null;
                }
                a aVar = this.D;
                int i17 = aVar.f20030v;
                int i18 = aVar.f20031w;
                StringBuilder sb2 = new StringBuilder(a.d(i17, 1) + String.valueOf(i18).length());
                sb2.append(i17);
                sb2.append(".");
                sb2.append(i18);
                String sb3 = sb2.toString();
                int i19 = 3;
                if (z10) {
                    i10 = 3;
                    i = 2;
                } else {
                    if (ra0Var.q() == 3) {
                        i19 = 4;
                    }
                    i = i19;
                    i10 = 2;
                }
                v80 v80Var = kVar2.f16832x;
                WebView u9 = h00Var.u();
                String str4 = this.f13068b.l0;
                v80Var.getClass();
                if (!((Boolean) r.e.f17698c.a(sl.f10760h6)).booleanValue() || !ct.D.f8992v) {
                    kVar = kVar2;
                    bi0Var = null;
                } else {
                    kVar = kVar2;
                    bi0Var = (bi0) v80.o(new yh0(str, sb3, str2, i10, u9, str4, i));
                }
                if (bi0Var == null) {
                    int i20 = a0.f19634b;
                    i.f("Failed to create omid session in InternalNativeAd");
                    return null;
                }
                synchronized (ra0Var) {
                    ra0Var.f10174l = bi0Var;
                }
                h00Var.S0(bi0Var);
                if (z10) {
                    tt0 tt0Var = bi0Var.f4801a;
                    if (h3 != null) {
                        View U = h3.U();
                        kVar.f16832x.getClass();
                        v80.i(tt0Var, U);
                    }
                    this.A = true;
                }
                if (z3) {
                    v80 v80Var2 = kVar.f16832x;
                    tt0 tt0Var2 = bi0Var.f4801a;
                    v80Var2.getClass();
                    v80.g(tt0Var2);
                    h00Var.b("onSdkLoaded", new r0(0));
                }
                return bi0Var;
            }
            int i21 = a0.f19634b;
            i.f("Webview is null in InternalNativeAd");
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(View view) {
        yx yxVar;
        ra0 ra0Var = this.f8615m;
        if (((Boolean) r.e.f17698c.a(sl.f10871o6)).booleanValue() && ra0Var.q() != 3) {
            synchronized (ra0Var) {
                yxVar = ra0Var.f10176n;
            }
            if (yxVar == null) {
                return;
            }
            com.google.android.gms.internal.mlkit_vision_digital_ink.gw gwVar = new com.google.android.gms.internal.mlkit_vision_digital_ink.gw(6, this, view, false);
            yxVar.a(new t81((Object) yxVar, (int) (0 == true ? 1 : 0), (Object) gwVar), this.f8614l);
            return;
        }
        n(view, ra0Var.k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.ads.ph, com.google.android.gms.internal.ads.mb0] */
    public final synchronized void g(mb0 mb0Var) {
        Iterator<String> keys;
        WeakReference weakReference;
        View view;
        lf lfVar;
        try {
            if (!this.f8626x) {
                this.f8625w = (ph) mb0Var;
                ab0 ab0Var = this.f8617o;
                ab0Var.f4436g.execute(new com.google.android.gms.internal.mlkit_vision_digital_ink.ra(ab0Var, mb0Var));
                this.f8616n.a(mb0Var.M0(), mb0Var.g(), mb0Var.f(), mb0Var, mb0Var);
                nl nlVar = sl.f10979v3;
                r rVar = r.e;
                if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue() && (lfVar = this.C.f9103b) != null) {
                    lfVar.g(mb0Var.M0());
                }
                if (((Boolean) rVar.f17698c.a(sl.f10918r2)).booleanValue()) {
                    qp0 qp0Var = this.f13068b;
                    if (qp0Var.f9943k0 && (keys = qp0Var.f9941j0.keys()) != null) {
                        while (keys.hasNext()) {
                            String next = keys.next();
                            Object r22 = this.f8625w;
                            if (r22 == 0) {
                                weakReference = null;
                            } else {
                                weakReference = (WeakReference) r22.d().get(next);
                            }
                            this.H.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                bi biVar = new bi(this.E, view);
                                this.I.add(biVar);
                                biVar.F.add(new ka0(this, next));
                                biVar.d(3);
                            }
                        }
                    }
                }
                if (mb0Var.b() != null) {
                    bi b10 = mb0Var.b();
                    b10.F.add(this.B);
                    b10.d(3);
                }
            }
        } finally {
        }
    }

    public final void h(mb0 mb0Var) {
        View M0 = mb0Var.M0();
        mb0Var.d();
        this.f8616n.l(M0);
        if (mb0Var.b4() != null) {
            mb0Var.b4().setClickable(false);
            mb0Var.b4().removeAllViews();
        }
        if (mb0Var.b() != null) {
            bi b10 = mb0Var.b();
            b10.F.remove(this.B);
        }
        this.f8625w = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.ph, com.google.android.gms.internal.ads.mb0] */
    public final synchronized void i(View view, Map map, Map map2) {
        this.f8617o.a(this.f8625w);
        this.f8616n.t(view, map, map2, k());
        this.f8627y = true;
    }

    public final synchronized void j(View view, Map map, Map map2) {
        View view2;
        if (!this.f8628z) {
            synchronized (this) {
                if (map != null) {
                    try {
                        y51 y51Var = J;
                        int i = y51Var.f12783x;
                        int i10 = 0;
                        while (i10 < i) {
                            WeakReference weakReference = (WeakReference) map.get((String) y51Var.get(i10));
                            i10++;
                            if (weakReference != null) {
                                view2 = (View) weakReference.get();
                            }
                        }
                    } finally {
                    }
                }
                view2 = null;
                if (view2 != null) {
                    nl nlVar = sl.f10801jf;
                    r rVar = r.e;
                    if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                        Rect rect = new Rect();
                        if (view2.getGlobalVisibleRect(rect, new Point()) && view2.getHeight() == rect.height() && view2.getWidth() == rect.width()) {
                            this.f8616n.s(view, map, map2, k());
                            this.f8628z = true;
                        }
                    } else {
                        if (((Boolean) rVar.f17698c.a(sl.f10815kf)).booleanValue()) {
                            if (d(view2)) {
                                this.f8616n.s(view, map, map2, k());
                                this.f8628z = true;
                            }
                        } else {
                            nl nlVar2 = sl.f10831lf;
                            if (((Float) rVar.f17698c.a(nlVar2)).floatValue() > 0.0d) {
                                double floatValue = ((Float) rVar.f17698c.a(nlVar2)).floatValue();
                                if (view2.getGlobalVisibleRect(new Rect(), new Point())) {
                                    if (r4.height() * r4.width() >= view2.getHeight() * view2.getWidth() * (floatValue / 100.0d)) {
                                        this.f8616n.s(view, map, map2, k());
                                        this.f8628z = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.ph, com.google.android.gms.internal.ads.mb0] */
    public final synchronized ImageView.ScaleType k() {
        Object r02 = this.f8625w;
        if (r02 == 0) {
            int i = a0.f19634b;
            i.a("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        a b02 = r02.b0();
        if (b02 != null) {
            return (ImageView.ScaleType) b.z1(b02);
        }
        return ab0.f4430k;
    }

    public final void l() {
        b bVar;
        if (((Boolean) r.e.f17698c.a(sl.f10871o6)).booleanValue()) {
            ra0 ra0Var = this.f8615m;
            synchronized (ra0Var) {
                bVar = ra0Var.f10175m;
            }
            if (bVar == null) {
                return;
            }
            lx0 lx0Var = new lx0(21, this);
            bVar.a(new t81(bVar, 0, lx0Var), this.f8614l);
            return;
        }
        e("Google", true);
    }

    public final void n(View view, bi0 bi0Var) {
        h00 j10 = this.f8615m.j();
        if (this.f8618p.c() && bi0Var != null && j10 != null && view != null) {
            v80 v80Var = k.C.f16832x;
            tt0 tt0Var = bi0Var.f4801a;
            v80Var.getClass();
            v80.i(tt0Var, view);
        }
    }

    public final synchronized void o() {
        this.f8626x = true;
        this.f8614l.execute(new la0(this, 0));
        e70 e70Var = this.f13069c;
        e70Var.getClass();
        e70Var.P1(new ll(null, 2));
    }

    public final synchronized boolean p(Bundle bundle) {
        if (this.f8627y) {
            return true;
        }
        boolean u9 = this.f8616n.u(bundle);
        this.f8627y = u9;
        return u9;
    }

    public final synchronized void q(mb0 mb0Var) {
        if (((Boolean) r.e.f17698c.a(sl.f10884p2)).booleanValue()) {
            f0.f19676l.post(new t81(this, mb0Var));
        } else {
            g(mb0Var);
        }
    }

    public final synchronized void r(mb0 mb0Var) {
        if (((Boolean) r.e.f17698c.a(sl.f10884p2)).booleanValue()) {
            f0.f19676l.post(new com.google.android.gms.internal.mlkit_vision_digital_ink.ra(this, mb0Var));
        } else {
            h(mb0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.ph, com.google.android.gms.internal.ads.mb0] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.Map, r0] */
    public final synchronized void s(View view, View view2, Map map, Map map2, boolean z3) {
        h00 h3;
        ib0 ib0Var;
        ab0 ab0Var = this.f8617o;
        Object r12 = this.f8625w;
        if (r12 != 0 && (ib0Var = ab0Var.e) != null && r12.b4() != null && ab0Var.f4433c.a()) {
            try {
                r12.b4().addView(ib0Var.a());
            } catch (o00 e) {
                a0.l("web view can not be obtained", e);
            }
        }
        this.f8616n.i(view, view2, map, map2, z3, k());
        if (this.A) {
            ra0 ra0Var = this.f8615m;
            if (ra0Var.h() != null && (h3 = ra0Var.h()) != 0) {
                h3.b("onSdkAdUserInteractionClick", new r0(0));
            }
        }
    }

    public final synchronized void t(View view, Map map, Map map2, boolean z3) {
        if (this.f8627y) {
            j(view, map, map2);
            return;
        }
        if (((Boolean) r.e.f17698c.a(sl.f10918r2)).booleanValue() && this.f13068b.f9943k0) {
            HashMap hashMap = this.H;
            Iterator it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                if (!((Boolean) hashMap.get((String) it.next())).booleanValue()) {
                    break;
                }
            }
        }
        if (!z3) {
            if (((Boolean) r.e.f17698c.a(sl.L4)).booleanValue() && map != null) {
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    View view2 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                    if (view2 != null && d(view2)) {
                        i(view, map, map2);
                        return;
                    }
                }
            }
            return;
        }
        i(view, map, map2);
        j(view, map, map2);
    }
}