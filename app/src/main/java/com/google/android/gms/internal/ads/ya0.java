package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ya0 extends ph implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, mb0 {

    /* renamed from: u, reason: collision with root package name */
    public final WeakReference f12829u;

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f12830v;

    /* renamed from: w, reason: collision with root package name */
    public final HashMap f12831w;

    /* renamed from: x, reason: collision with root package name */
    public final HashMap f12832x;

    /* renamed from: y, reason: collision with root package name */
    public na0 f12833y;

    /* renamed from: z, reason: collision with root package name */
    public final bi f12834z;

    public ya0(View view, HashMap hashMap, HashMap hashMap2) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        ViewTreeObserver viewTreeObserver;
        this.f12830v = new HashMap();
        this.f12831w = new HashMap();
        this.f12832x = new HashMap();
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        fp fpVar = f9.k.C.B;
        cy cyVar = new cy(view, this);
        View view2 = (View) ((WeakReference) cyVar.f11688u).get();
        ViewTreeObserver viewTreeObserver2 = null;
        ViewTreeObserver viewTreeObserver3 = (view2 == null || (viewTreeObserver3 = view2.getViewTreeObserver()) == null || !viewTreeObserver3.isAlive()) ? null : viewTreeObserver3;
        if (viewTreeObserver3 != null) {
            cyVar.U1(viewTreeObserver3);
        }
        dy dyVar = new dy(view, this);
        View view3 = (View) ((WeakReference) dyVar.f11688u).get();
        if (view3 != null && (viewTreeObserver = view3.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            dyVar.U1(viewTreeObserver2);
        }
        this.f12829u = new WeakReference(view);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            View view4 = (View) entry.getValue();
            if (view4 != null) {
                this.f12830v.put(str, new WeakReference(view4));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view4.setOnTouchListener(this);
                    view4.setClickable(true);
                    view4.setOnClickListener(this);
                }
            }
        }
        this.f12832x.putAll(this.f12830v);
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            View view5 = (View) entry2.getValue();
            if (view5 != null) {
                this.f12831w.put((String) entry2.getKey(), new WeakReference(view5));
                view5.setOnTouchListener(this);
                view5.setClickable(false);
            }
        }
        this.f12832x.putAll(this.f12831w);
        this.f12834z = new bi(view.getContext(), view);
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final View M0() {
        return (View) this.f12829u.get();
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final synchronized View R(String str) {
        WeakReference weakReference = (WeakReference) this.f12832x.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final bi b() {
        return this.f12834z;
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final synchronized oa.a b0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final FrameLayout b4() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final synchronized Map d() {
        return this.f12832x;
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final synchronized Map f() {
        return this.f12831w;
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final synchronized Map g() {
        return this.f12830v;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.ads.mb0
    public final synchronized String h() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final synchronized JSONObject n() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final synchronized void o1(String str, View view) {
        this.f12832x.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.f12830v.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        na0 na0Var = this.f12833y;
        if (na0Var != null) {
            na0Var.s(view, M0(), d(), g(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        na0 na0Var = this.f12833y;
        if (na0Var != null) {
            na0Var.t(M0(), d(), g(), na0.d(M0()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        na0 na0Var = this.f12833y;
        if (na0Var != null) {
            na0Var.t(M0(), d(), g(), na0.d(M0()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        na0 na0Var = this.f12833y;
        if (na0Var != null) {
            View M0 = M0();
            synchronized (na0Var) {
                na0Var.f8616n.v(M0, motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final synchronized JSONObject p() {
        JSONObject m4;
        na0 na0Var = this.f12833y;
        if (na0Var != null) {
            View M0 = M0();
            Map d2 = d();
            Map g8 = g();
            synchronized (na0Var) {
                m4 = na0Var.f8616n.m(M0, d2, g8, na0Var.k());
            }
            return m4;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                oa.a v12 = oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                synchronized (this) {
                    try {
                        if (this.f12833y != null) {
                            Object z12 = oa.b.z1(v12);
                            if (!(z12 instanceof View)) {
                                int i10 = k9.a0.f19634b;
                                l9.i.f("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                            }
                            na0 na0Var = this.f12833y;
                            View view = (View) z12;
                            synchronized (na0Var) {
                                na0Var.f8616n.b(view);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                synchronized (this) {
                    na0 na0Var2 = this.f12833y;
                    if (na0Var2 != null) {
                        na0Var2.r(this);
                        this.f12833y = null;
                    }
                }
            }
        } else {
            oa.a v13 = oa.b.v1(parcel.readStrongBinder());
            qh.f(parcel);
            synchronized (this) {
                Object z13 = oa.b.z1(v13);
                if (!(z13 instanceof na0)) {
                    int i11 = k9.a0.f19634b;
                    l9.i.f("Not an instance of InternalNativeAd. This is most likely a transient error");
                } else {
                    na0 na0Var3 = this.f12833y;
                    if (na0Var3 != null) {
                        na0Var3.r(this);
                    }
                    na0 na0Var4 = (na0) z13;
                    if (na0Var4.f8618p.b()) {
                        this.f12833y = na0Var4;
                        na0Var4.q(this);
                        this.f12833y.f(M0());
                    } else {
                        int i12 = k9.a0.f19634b;
                        l9.i.c("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
                    }
                }
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
