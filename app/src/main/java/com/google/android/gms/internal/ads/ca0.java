package com.google.android.gms.internal.ads;
import f9.a;
import f9.k;
import g9.i1;
import g9.k1;
import g9.k2;
import g9.p;
import g9.r;
import k9.a0;
import l9.a;
import l9.i;
import la.a;
import wa.h9;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ca0 implements ua0 {
    public final a70 A;
    public final q60 B;
    public final e90 C;
    public final qp0 D;
    public final a E;
    public final aq0 F;
    public final u30 G;
    public final eb0 H;
    public final a I;
    public final d90 J;
    public final xs0 K;
    public final jd0 L;
    public final ur0 M;
    public final wh0 N;
    public boolean P;
    public i1 W;
    public final s70 X;
    public final cb0 Y;
    public final a Z;

    /* renamed from: a0, reason: collision with root package name */
    public final c60 f5057a0;

    /* renamed from: u, reason: collision with root package name */
    public final Context f5058u;

    /* renamed from: v, reason: collision with root package name */
    public final wa0 f5059v;

    /* renamed from: w, reason: collision with root package name */
    public final JSONObject f5060w;

    /* renamed from: x, reason: collision with root package name */
    public final rc0 f5061x;

    /* renamed from: y, reason: collision with root package name */
    public final ra0 f5062y;

    /* renamed from: z, reason: collision with root package name */
    public final of f5063z;
    public boolean O = false;
    public boolean Q = false;
    public boolean R = false;
    public Point S = new Point();
    public Point T = new Point();
    public long U = 0;
    public long V = 0;

    public ca0(Context context, wa0 wa0Var, JSONObject jSONObject, rc0 rc0Var, ra0 ra0Var, of ofVar, a70 a70Var, q60 q60Var, e90 e90Var, qp0 qp0Var, a aVar, aq0 aq0Var, u30 u30Var, eb0 eb0Var, a aVar2, d90 d90Var, xs0 xs0Var, ur0 ur0Var, wh0 wh0Var, jd0 jd0Var, cb0 cb0Var, s70 s70Var, a aVar3, c60 c60Var) {
        this.f5058u = context;
        this.f5059v = wa0Var;
        this.f5060w = jSONObject;
        this.f5061x = rc0Var;
        this.f5062y = ra0Var;
        this.f5063z = ofVar;
        this.A = a70Var;
        this.B = q60Var;
        this.C = e90Var;
        this.D = qp0Var;
        this.E = aVar;
        this.F = aq0Var;
        this.G = u30Var;
        this.H = eb0Var;
        this.I = aVar2;
        this.J = d90Var;
        this.K = xs0Var;
        this.M = ur0Var;
        this.N = wh0Var;
        this.L = jd0Var;
        this.Y = cb0Var;
        this.X = s70Var;
        this.Z = aVar3;
        this.f5057a0 = c60Var;
    }

    public final boolean A(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z3, View view) {
        c60 c60Var;
        qp0 qp0Var = this.D;
        Context context = this.f5058u;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f5060w);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            nl nlVar = sl.f10935s4;
            r rVar = r.e;
            ql qlVar = rVar.f17698c;
            ql qlVar2 = rVar.f17698c;
            if (((Boolean) qlVar.a(nlVar)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z3);
            jSONObject6.put("screen", h9.h(context));
            if (((Boolean) qlVar2.a(sl.f10880of)).booleanValue() && (c60Var = this.f5057a0) != null) {
                AtomicLong atomicLong = c60Var.f5014a;
                if (atomicLong.get() > 0) {
                    jSONObject6.put(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, atomicLong.get());
                }
            }
            boolean booleanValue = ((Boolean) qlVar2.a(sl.N9)).booleanValue();
            rc0 rc0Var = this.f5061x;
            if (booleanValue) {
                rc0Var.b("/clickRecorded", new aa0(this, 1));
            } else {
                rc0Var.b("/logScionEvent", new aa0(this, 0));
            }
            rc0Var.b("/nativeImpression", new jp(this, view));
            rc0Var.b("/nativeImpressionFlowControl", new ba0(this, this.K, qp0Var.f9967x0, this.M));
            x21.i(rc0Var.a("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression", xx.f12657h);
            if (!this.O) {
                this.O = k.C.f16823o.d(context, this.E.f20029u, qp0Var.C.toString(), this.F.f4583g);
            }
            return true;
        } catch (JSONException e) {
            int i = a0.f19634b;
            i.d("Unable to create impression JSON.", e);
            return false;
        }
    }

    public final String B(View view) {
        if (!((Boolean) r.e.f17698c.a(sl.f10935s4)).booleanValue()) {
            return null;
        }
        try {
            return this.f5063z.f9103b.i(this.f5058u, view, null);
        } catch (Exception unused) {
            int i = a0.f19634b;
            i.c("Exception getting data.");
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:2|3|(1:5)(1:82)|6|(1:81)(1:10)|11|8a|16|(2:94|(22:23|24|(1:28)|29|(1:33)|(1:35)|36|(1:38)|39|40|41|42|(1:44)|45|46|(1:50)|51|(1:55)|56|(3:58|(1:60)|(1:62))|63|64))|75|24|(2:26|28)|29|(2:31|33)|(0)|36|(0)|39|40|41|42|(0)|45|46|(2:48|50)|51|(2:53|55)|56|(0)|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ff, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0113, code lost:
    
        r7 = a0.f19634b;
        i.d("Exception obtaining click signals", r0);
        r13 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9 A[Catch: JSONException -> 0x0081, TryCatch #0 {JSONException -> 0x0081, blocks: (B:3:0x000a, B:6:0x004b, B:8:0x0079, B:11:0x0085, B:12:0x008a, B:15:0x008d, B:16:0x008e, B:18:0x0094, B:21:0x0097, B:24:0x00a2, B:26:0x00ab, B:28:0x00b3, B:29:0x00b8, B:31:0x00c8, B:33:0x00d2, B:35:0x00d9, B:36:0x00de, B:39:0x00ed, B:46:0x011b, B:48:0x0135, B:50:0x013b, B:51:0x0140, B:53:0x0150, B:55:0x0156, B:56:0x015b, B:58:0x0187, B:60:0x018f, B:62:0x0197, B:63:0x019c, B:69:0x0113, B:74:0x00a1, B:80:0x01af, B:42:0x00f3, B:44:0x00f9, B:45:0x0102, B:14:0x008b, B:20:0x0095), top: B:2:0x000a, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f9 A[Catch: Exception -> 0x00ff, TryCatch #1 {Exception -> 0x00ff, blocks: (B:42:0x00f3, B:44:0x00f9, B:45:0x0102), top: B:41:0x00f3, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0187 A[Catch: JSONException -> 0x0081, TryCatch #0 {JSONException -> 0x0081, blocks: (B:3:0x000a, B:6:0x004b, B:8:0x0079, B:11:0x0085, B:12:0x008a, B:15:0x008d, B:16:0x008e, B:18:0x0094, B:21:0x0097, B:24:0x00a2, B:26:0x00ab, B:28:0x00b3, B:29:0x00b8, B:31:0x00c8, B:33:0x00d2, B:35:0x00d9, B:36:0x00de, B:39:0x00ed, B:46:0x011b, B:48:0x0135, B:50:0x013b, B:51:0x0140, B:53:0x0150, B:55:0x0156, B:56:0x015b, B:58:0x0187, B:60:0x018f, B:62:0x0197, B:63:0x019c, B:69:0x0113, B:74:0x00a1, B:80:0x01af, B:42:0x00f3, B:44:0x00f9, B:45:0x0102, B:14:0x008b, B:20:0x0095), top: B:2:0x000a, inners: #1, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(android.view.View r13, org.json.JSONObject r14, org.json.JSONObject r15, org.json.JSONObject r16, org.json.JSONObject r17, java.lang.String r18, org.json.JSONObject r19, org.json.JSONObject r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ca0.C(android.view.View, org.json.JSONObject, org.json.JSONObject, org.json.JSONObject, org.json.JSONObject, java.lang.String, org.json.JSONObject, org.json.JSONObject, boolean, boolean):void");
    }

    public final void D() {
        try {
            i1 i1Var = this.W;
            if (i1Var != null) {
                i1Var.v2(i1Var.g2(), 1);
            }
        } catch (RemoteException e) {
            int i = a0.f19634b;
            i.i(e, "#007 Could not call remote method.");
        }
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void H(String str) {
        C(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void L() {
        rc0 rc0Var = this.f5061x;
        synchronized (rc0Var) {
            c81 c81Var = rc0Var.f10210n;
            if (c81Var == null) {
                return;
            }
            v80 v80Var = new v80(14);
            c81Var.a(new t81(c81Var, 0, v80Var), rc0Var.e);
            rc0Var.f10210n = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void a(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.S = new Point();
        this.T = new Point();
        if (!this.P) {
            this.J.U1(view);
            this.P = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        u30 u30Var = this.G;
        u30Var.getClass();
        u30Var.D = new WeakReference(this);
        boolean a10 = h9.a(this.E.f20031w);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (a10) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (a10) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void b(View view) {
        if (!this.f5060w.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i = a0.f19634b;
            i.f("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            if (view == null) {
                return;
            }
            eb0 eb0Var = this.H;
            view.setOnClickListener(eb0Var);
            view.setClickable(true);
            eb0Var.A = new WeakReference(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void c(i1 i1Var) {
        this.W = i1Var;
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final boolean d() {
        return this.f5060w.optBoolean("allow_custom_click_gesture", false);
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void e() {
        this.R = true;
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final JSONObject f(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f5058u;
        JSONObject e = h9.e(context, map, map2, view, scaleType);
        JSONObject b10 = h9.b(context, view);
        JSONObject c10 = h9.c(view);
        JSONObject d2 = h9.d(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", e);
            jSONObject.put("ad_view_signal", b10);
            jSONObject.put("scroll_view_signal", c10);
            jSONObject.put("lock_screen_signal", d2);
            return jSONObject;
        } catch (JSONException e8) {
            int i = a0.f19634b;
            i.d("Unable to create native ad view signals JSON.", e8);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void g(Bundle bundle) {
        String str;
        if (bundle == null) {
            int i = a0.f19634b;
            i.a("Click data is null. No click is reported.");
        } else {
            if (!r("click_reporting")) {
                int i10 = a0.f19634b;
                i.c("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
                return;
            }
            Bundle bundle2 = bundle.getBundle("click_signal");
            if (bundle2 != null) {
                str = bundle2.getString("asset_id");
            } else {
                str = null;
            }
            C(null, null, null, null, null, str, null, p.f17688g.f17689a.l(bundle, null), false, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void h(vo voVar) {
        if (!this.f5060w.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i = a0.f19634b;
            i.f("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        eb0 eb0Var = this.H;
        rc0 rc0Var = eb0Var.f5634u;
        eb0Var.f5636w = voVar;
        jp jpVar = eb0Var.f5637x;
        if (jpVar != null) {
            rc0Var.c("/unconfirmedClick", jpVar);
        }
        jp jpVar2 = new jp(eb0Var, 4, voVar);
        eb0Var.f5637x = jpVar2;
        rc0Var.b("/unconfirmedClick", jpVar2);
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void i(View view, View view2, Map map, Map map2, boolean z3, ImageView.ScaleType scaleType) {
        View view3;
        Context context = this.f5058u;
        JSONObject e = h9.e(context, map, map2, view2, scaleType);
        JSONObject b10 = h9.b(context, view2);
        JSONObject c10 = h9.c(view2);
        JSONObject d2 = h9.d(context, view2);
        String w10 = w(view, map);
        JSONObject f10 = h9.f(w10, context, this.T, this.S);
        if (true == ((Boolean) r.e.f17698c.a(sl.f11043z4)).booleanValue()) {
            view3 = view2;
        } else {
            view3 = view;
        }
        C(view3, b10, e, c10, d2, w10, f10, null, z3, false);
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void j() {
        View view;
        if (this.f5060w.optBoolean("custom_one_point_five_click_enabled", false)) {
            eb0 eb0Var = this.H;
            if (eb0Var.f5636w != null && eb0Var.f5639z != null) {
                eb0Var.f5638y = null;
                eb0Var.f5639z = null;
                WeakReference weakReference = eb0Var.A;
                if (weakReference != null && (view = (View) weakReference.get()) != null) {
                    view.setClickable(false);
                    view.setOnClickListener(null);
                    eb0Var.A = null;
                }
                try {
                    vo voVar = eb0Var.f5636w;
                    voVar.v2(voVar.g2(), 2);
                } catch (RemoteException e) {
                    i.i(e, "#007 Could not call remote method.");
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void k() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f5060w);
            x21.i(this.f5061x.a("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression", xx.f12657h);
        } catch (JSONException e) {
            int i = a0.f19634b;
            i.d("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void l(View view) {
        this.S = new Point();
        this.T = new Point();
        if (view != null) {
            d90 d90Var = this.J;
            synchronized (d90Var) {
                WeakHashMap weakHashMap = d90Var.f5346w;
                if (weakHashMap.containsKey(view)) {
                    ((bi) weakHashMap.get(view)).F.remove(d90Var);
                    weakHashMap.remove(view);
                }
            }
        }
        this.P = false;
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final JSONObject m(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject f10 = f(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.R && this.f5060w.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (f10 != null) {
                jSONObject.put("nas", f10);
            }
            return jSONObject;
        } catch (JSONException e) {
            int i = a0.f19634b;
            i.d("Unable to create native click meta data JSON.", e);
            return jSONObject;
        }
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void n() {
        A(null, null, null, null, null, null, false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    @Override // com.google.android.gms.internal.ads.ua0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(android.view.View r17, android.view.View r18, java.util.Map r19, java.util.Map r20, boolean r21, android.widget.ImageView.ScaleType r22, int r23) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ca0.o(android.view.View, android.view.View, java.util.Map, java.util.Map, boolean, android.widget.ImageView$ScaleType, int):void");
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void p(Bundle bundle) {
        if (bundle == null) {
            int i = a0.f19634b;
            i.a("Touch event data is null. No touch event is reported.");
        } else {
            if (!r("touch_reporting")) {
                int i10 = a0.f19634b;
                i.c("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
                return;
            }
            this.f5063z.f9103b.a((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
            y();
        }
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void q(k1 k1Var) {
        k2 k2Var;
        k2 k2Var2;
        ur0 ur0Var = this.M;
        qp0 qp0Var = this.D;
        xs0 xs0Var = this.K;
        try {
            if (this.Q) {
                return;
            }
            if (k1Var == null) {
                ra0 ra0Var = this.f5062y;
                synchronized (ra0Var) {
                    k2Var = ra0Var.f10170g;
                }
                if (k2Var != null) {
                    this.Q = true;
                    synchronized (ra0Var) {
                        k2Var2 = ra0Var.f10170g;
                    }
                    xs0Var.b(k2Var2.f17667v, qp0Var.f9967x0, ur0Var, null);
                    D();
                    return;
                }
            }
            this.Q = true;
            xs0Var.b(k1Var.b(), qp0Var.f9967x0, ur0Var, null);
            D();
        } catch (RemoteException e) {
            int i = a0.f19634b;
            i.i(e, "#007 Could not call remote method.");
        }
    }

    public final boolean r(String str) {
        JSONObject optJSONObject = this.f5060w.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null || !optJSONObject.optBoolean(str, false)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void s(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f5058u;
        JSONObject e = h9.e(context, map, map2, view, scaleType);
        JSONObject b10 = h9.b(context, view);
        JSONObject c10 = h9.c(view);
        JSONObject d2 = h9.d(context, view);
        boolean g8 = h9.g(context, this.D);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f5060w);
            jSONObject.put("asset_view_signal", e);
            jSONObject.put("ad_view_signal", b10);
            jSONObject.put("scroll_view_signal", c10);
            jSONObject.put("lock_screen_signal", d2);
            if (((Boolean) r.e.f17698c.a(sl.f10935s4)).booleanValue()) {
                jSONObject.put("view_signals", B(view));
            }
            jSONObject.put("policy_validator_enabled", g8);
            jSONObject.put("screen", h9.h(context));
            x21.i(this.f5061x.a("google.afma.nativeAds.handleNativeAdSignalsLogging", jSONObject), "Error during performing handleNativeAdSignalsLogging", xx.f12657h);
        } catch (JSONException e8) {
            int i = a0.f19634b;
            i.d("Unable to create native ad signals logging JSON.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void t(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f5058u;
        A(h9.b(context, view), h9.e(context, map, map2, view, scaleType), h9.c(view), h9.d(context, view), B(view), null, h9.g(context, this.D), view);
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final boolean u(Bundle bundle) {
        if (!r("impression_reporting")) {
            int i = a0.f19634b;
            i.c("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        String str = null;
        JSONObject l10 = p.f17688g.f17689a.l(bundle, null);
        if (((Boolean) r.e.f17698c.a(sl.Qc)).booleanValue()) {
            str = B(null);
        }
        return A(null, null, null, null, str, l10, false, null);
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void v(View view, MotionEvent motionEvent) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        this.S = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
        this.I.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        this.V = currentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.L.f7421a = motionEvent;
            this.U = currentTimeMillis;
            this.T = this.S;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.S;
        obtain.setLocation(point.x, point.y);
        this.f5063z.f9103b.b(obtain);
        obtain.recycle();
        y();
    }

    public final String w(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int q10 = this.f5062y.q();
        if (q10 != 1) {
            if (q10 != 2) {
                if (q10 != 6) {
                    return null;
                }
                return "3099";
            }
            return "2099";
        }
        return "1099";
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final int x() {
        rn rnVar = this.F.f4585j;
        if (rnVar != null) {
            if (((Boolean) r.e.f17698c.a(sl.Xc)).booleanValue()) {
                return rnVar.C;
            }
            return 0;
        }
        return 0;
    }

    public final void y() {
        a aVar;
        if (((Boolean) r.e.f17698c.a(sl.f10846mf)).booleanValue() && (aVar = this.Z) != null) {
            aVar.f16785b = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final boolean z() {
        if (x() != 0) {
            if (((Boolean) r.e.f17698c.a(sl.Xc)).booleanValue()) {
                return this.F.f4585j.D;
            }
            return true;
        }
        return true;
    }
}
