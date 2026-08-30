package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ob0 implements ua0, g80 {
    public final qp0 A;
    public final l9.a B;
    public final aq0 C;
    public boolean D = false;
    public boolean E = false;
    public boolean F = true;
    public final ds G;
    public final es H;

    /* renamed from: u, reason: collision with root package name */
    public final gs f9078u;

    /* renamed from: v, reason: collision with root package name */
    public final a70 f9079v;

    /* renamed from: w, reason: collision with root package name */
    public final u70 f9080w;

    /* renamed from: x, reason: collision with root package name */
    public final q60 f9081x;

    /* renamed from: y, reason: collision with root package name */
    public final e90 f9082y;

    /* renamed from: z, reason: collision with root package name */
    public final Context f9083z;

    public ob0(ds dsVar, es esVar, gs gsVar, a70 a70Var, u70 u70Var, q60 q60Var, e90 e90Var, Context context, qp0 qp0Var, l9.a aVar, aq0 aq0Var) {
        this.G = dsVar;
        this.H = esVar;
        this.f9078u = gsVar;
        this.f9079v = a70Var;
        this.f9080w = u70Var;
        this.f9081x = q60Var;
        this.f9082y = e90Var;
        this.f9083z = context;
        this.A = qp0Var;
        this.B = aVar;
        this.C = aq0Var;
    }

    public static final HashMap y(Map map) {
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        hashMap.put((String) entry.getKey(), view);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashMap;
    }

    public final void A(View view) {
        boolean z3;
        try {
            gs gsVar = this.f9078u;
            e90 e90Var = this.f9082y;
            q60 q60Var = this.f9081x;
            if (gsVar != null && !gsVar.H1()) {
                gsVar.V(new oa.b(view));
                q60Var.L();
                if (((Boolean) g9.r.e.f17698c.a(sl.f10750gc)).booleanValue()) {
                    e90Var.M();
                    return;
                }
                return;
            }
            ds dsVar = this.G;
            boolean z9 = false;
            if (dsVar != null) {
                Parcel u22 = dsVar.u2(dsVar.g2(), 14);
                ClassLoader classLoader = qh.f9846a;
                if (u22.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                u22.recycle();
                if (!z3) {
                    oa.b bVar = new oa.b(view);
                    Parcel g22 = dsVar.g2();
                    qh.e(g22, bVar);
                    dsVar.v2(g22, 11);
                    q60Var.L();
                    if (((Boolean) g9.r.e.f17698c.a(sl.f10750gc)).booleanValue()) {
                        e90Var.M();
                        return;
                    }
                    return;
                }
            }
            es esVar = this.H;
            if (esVar != null) {
                Parcel u23 = esVar.u2(esVar.g2(), 12);
                ClassLoader classLoader2 = qh.f9846a;
                if (u23.readInt() != 0) {
                    z9 = true;
                }
                u23.recycle();
                if (!z9) {
                    oa.b bVar2 = new oa.b(view);
                    Parcel g23 = esVar.g2();
                    qh.e(g23, bVar2);
                    esVar.v2(g23, 9);
                    q60Var.L();
                    if (((Boolean) g9.r.e.f17698c.a(sl.f10750gc)).booleanValue()) {
                        e90Var.M();
                    }
                }
            }
        } catch (RemoteException e) {
            int i = k9.a0.f19634b;
            l9.i.g("Failed to call handleClick", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void H(String str) {
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void L() {
        try {
            gs gsVar = this.f9078u;
            if (gsVar != null) {
                gsVar.a3();
            }
        } catch (RemoteException e) {
            int i = k9.a0.f19634b;
            l9.i.g("Failed to call destroy", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void a(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Map map3;
        Map map4;
        Object obj;
        oa.a j10;
        try {
            oa.b bVar = new oa.b(view);
            JSONObject jSONObject = this.A.f9941j0;
            boolean booleanValue = ((Boolean) g9.r.e.f17698c.a(sl.f10708e2)).booleanValue();
            es esVar = this.H;
            ds dsVar = this.G;
            gs gsVar = this.f9078u;
            boolean z3 = true;
            if (booleanValue && jSONObject.length() != 0) {
                if (map == null) {
                    map3 = new HashMap();
                } else {
                    map3 = map;
                }
                if (map2 == null) {
                    map4 = new HashMap();
                } else {
                    map4 = map2;
                }
                HashMap hashMap = new HashMap();
                hashMap.putAll(map3);
                hashMap.putAll(map4);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        WeakReference weakReference = (WeakReference) hashMap.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) g9.r.e.f17698c.a(sl.f10724f2)).booleanValue() && next.equals("3010")) {
                                Object obj2 = null;
                                if (gsVar != null) {
                                    try {
                                        j10 = gsVar.j();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else if (dsVar != null) {
                                    j10 = dsVar.u4();
                                } else if (esVar != null) {
                                    j10 = esVar.x();
                                } else {
                                    j10 = null;
                                }
                                if (j10 != null) {
                                    obj2 = oa.b.z1(j10);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList arrayList = new ArrayList();
                                wa.g9.a(optJSONArray, arrayList);
                                k9.f0 f0Var = f9.k.C.f16813c;
                                ClassLoader classLoader = this.f9083z.getClassLoader();
                                int size = arrayList.size();
                                int i = 0;
                                while (i < size) {
                                    Object obj3 = arrayList.get(i);
                                    i++;
                                    if (Class.forName((String) obj3, false, classLoader).isAssignableFrom(cls)) {
                                        break;
                                    }
                                }
                            } catch (JSONException unused2) {
                                continue;
                            }
                        }
                        z3 = false;
                        break loop0;
                    }
                }
            }
            this.F = z3;
            HashMap y10 = y(map);
            HashMap y11 = y(map2);
            if (gsVar != null) {
                gsVar.V2(bVar, new oa.b(y10), new oa.b(y11));
                return;
            }
            if (dsVar != null) {
                oa.b bVar2 = new oa.b(y10);
                oa.b bVar3 = new oa.b(y11);
                Parcel g22 = dsVar.g2();
                qh.e(g22, bVar);
                qh.e(g22, bVar2);
                qh.e(g22, bVar3);
                dsVar.v2(g22, 22);
                Parcel g23 = dsVar.g2();
                qh.e(g23, bVar);
                dsVar.v2(g23, 12);
                return;
            }
            if (esVar != null) {
                oa.b bVar4 = new oa.b(y10);
                oa.b bVar5 = new oa.b(y11);
                Parcel g24 = esVar.g2();
                qh.e(g24, bVar);
                qh.e(g24, bVar4);
                qh.e(g24, bVar5);
                esVar.v2(g24, 22);
                Parcel g25 = esVar.g2();
                qh.e(g25, bVar);
                esVar.v2(g25, 10);
            }
        } catch (RemoteException e) {
            int i10 = k9.a0.f19634b;
            l9.i.g("Failed to call trackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void b(View view) {
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void c(g9.i1 i1Var) {
        int i = k9.a0.f19634b;
        l9.i.f("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final boolean d() {
        return this.A.L;
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void e() {
        this.E = true;
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final JSONObject f(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void g(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void i(View view, View view2, Map map, Map map2, boolean z3, ImageView.ScaleType scaleType) {
        if (this.E && this.A.L) {
            return;
        }
        A(view);
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void l(View view) {
        try {
            oa.b bVar = new oa.b(view);
            gs gsVar = this.f9078u;
            if (gsVar != null) {
                gsVar.p1(bVar);
                return;
            }
            ds dsVar = this.G;
            if (dsVar != null) {
                Parcel g22 = dsVar.g2();
                qh.e(g22, bVar);
                dsVar.v2(g22, 16);
            } else {
                es esVar = this.H;
                if (esVar != null) {
                    Parcel g23 = esVar.g2();
                    qh.e(g23, bVar);
                    esVar.v2(g23, 14);
                }
            }
        } catch (RemoteException e) {
            int i = k9.a0.f19634b;
            l9.i.g("Failed to call untrackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final JSONObject m(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void n() {
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void o(View view, View view2, Map map, Map map2, boolean z3, ImageView.ScaleType scaleType, int i) {
        if (!this.E) {
            int i10 = k9.a0.f19634b;
            l9.i.f("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (!this.A.L) {
            int i11 = k9.a0.f19634b;
            l9.i.f("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        } else {
            A(view2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void p(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void q(g9.k1 k1Var) {
        int i = k9.a0.f19634b;
        l9.i.f("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.g80
    public final void r() {
        try {
            gs gsVar = this.f9078u;
            if (gsVar != null && gsVar.M()) {
                qp0 qp0Var = this.A;
                if (qp0Var.e != 4 && !qp0Var.D0) {
                    return;
                }
                gsVar.A0();
                this.f9079v.l();
            }
        } catch (RemoteException e) {
            int i = k9.a0.f19634b;
            l9.i.g("Failed to report impression from an adapter", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void s(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void t(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        boolean z3;
        try {
            boolean z9 = this.D;
            qp0 qp0Var = this.A;
            if (!z9) {
                this.D = f9.k.C.f16823o.d(this.f9083z, this.B.f20029u, qp0Var.C.toString(), this.C.f4583g);
            }
            if (this.F) {
                gs gsVar = this.f9078u;
                a70 a70Var = this.f9079v;
                if (gsVar != null) {
                    if (qp0Var.D0) {
                        if (!gsVar.M()) {
                            gsVar.A0();
                            a70Var.l();
                            return;
                        }
                        return;
                    }
                    if (gsVar.M() && qp0Var.e == 4) {
                        this.f9080w.l();
                        return;
                    } else {
                        gsVar.A0();
                        a70Var.l();
                        return;
                    }
                }
                ds dsVar = this.G;
                boolean z10 = false;
                if (dsVar != null) {
                    Parcel u22 = dsVar.u2(dsVar.g2(), 13);
                    ClassLoader classLoader = qh.f9846a;
                    if (u22.readInt() != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    u22.recycle();
                    if (!z3) {
                        dsVar.v2(dsVar.g2(), 10);
                        a70Var.l();
                        return;
                    }
                }
                es esVar = this.H;
                if (esVar != null) {
                    Parcel u23 = esVar.u2(esVar.g2(), 11);
                    ClassLoader classLoader2 = qh.f9846a;
                    if (u23.readInt() != 0) {
                        z10 = true;
                    }
                    u23.recycle();
                    if (!z10) {
                        esVar.v2(esVar.g2(), 8);
                        a70Var.l();
                    }
                }
            }
        } catch (RemoteException e) {
            int i = k9.a0.f19634b;
            l9.i.g("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final boolean u(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.g80
    public final void w() {
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final int x() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final boolean z() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void k() {
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void h(vo voVar) {
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void v(View view, MotionEvent motionEvent) {
    }
}
