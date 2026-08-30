package com.google.android.gms.internal.ads;
import f9.k;
import fa.y;
import g9.z1;
import k9.a0;
import l9.i;
import oa.a;
import oa.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class hc0 extends ph implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, IInterface {

    /* renamed from: u, reason: collision with root package name */
    public View f6667u;

    /* renamed from: v, reason: collision with root package name */
    public g9.z1 f6668v;

    /* renamed from: w, reason: collision with root package name */
    public na0 f6669w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f6670x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f6671y;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        x4();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        x4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.google.android.gms.internal.ads.oh] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.android.gms.internal.ads.hc0] */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.google.android.gms.internal.ads.ph, com.google.android.gms.internal.ads.nq] */
    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        pa0 pa0Var;
        g9.z1 z1Var = null;
        r5 = null;
        r5 = null;
        xn xnVar = null;
        nq nqVar = null;
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        if (i != 7) {
                            return false;
                        }
                        fa.y.d("#008 Must be called on the main UI thread.");
                        if (this.f6670x) {
                            int i10 = k9.a0.f19634b;
                            l9.i.c("getVideoController: Instream ad should not be used after destroyed");
                        } else {
                            na0 na0Var = this.f6669w;
                            if (na0Var != null && (pa0Var = na0Var.F) != null) {
                                synchronized (pa0Var) {
                                    xnVar = pa0Var.f9451a;
                                }
                            }
                        }
                        parcel2.writeNoException();
                        qh.e(parcel2, xnVar);
                    } else {
                        oa.a v12 = oa.b.v1(parcel.readStrongBinder());
                        qh.f(parcel);
                        fa.y.d("#008 Must be called on the main UI thread.");
                        v4(v12, new ph("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback"));
                        parcel2.writeNoException();
                    }
                } else {
                    oa.a v13 = oa.b.v1(parcel.readStrongBinder());
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                        if (queryLocalInterface instanceof nq) {
                            nqVar = (nq) queryLocalInterface;
                        } else {
                            nqVar = new oh(readStrongBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback", 0);
                        }
                    }
                    qh.f(parcel);
                    v4(v13, nqVar);
                    parcel2.writeNoException();
                }
            } else {
                fa.y.d("#008 Must be called on the main UI thread.");
                w4();
                na0 na0Var2 = this.f6669w;
                if (na0Var2 != null) {
                    na0Var2.o();
                }
                this.f6669w = null;
                this.f6667u = null;
                this.f6668v = null;
                this.f6670x = true;
                parcel2.writeNoException();
            }
        } else {
            fa.y.d("#008 Must be called on the main UI thread.");
            if (this.f6670x) {
                int i11 = k9.a0.f19634b;
                l9.i.c("getVideoController: Instream ad should not be used after destroyed");
            } else {
                z1Var = this.f6668v;
            }
            parcel2.writeNoException();
            qh.e(parcel2, z1Var);
        }
        return true;
    }

    public final void v4(oa.a aVar, nq nqVar) {
        String str;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        fa.y.d("#008 Must be called on the main UI thread.");
        if (this.f6670x) {
            int i = k9.a0.f19634b;
            l9.i.c("Instream ad can not be shown after destroy().");
            try {
                nqVar.u(2);
                return;
            } catch (RemoteException e) {
                int i10 = k9.a0.f19634b;
                l9.i.i(e, "#007 Could not call remote method.");
                return;
            }
        }
        View view = this.f6667u;
        if (view != null && this.f6668v != null) {
            if (this.f6671y) {
                int i11 = k9.a0.f19634b;
                l9.i.c("Instream ad should not be used again.");
                try {
                    nqVar.u(1);
                    return;
                } catch (RemoteException e8) {
                    int i12 = k9.a0.f19634b;
                    l9.i.i(e8, "#007 Could not call remote method.");
                    return;
                }
            }
            this.f6671y = true;
            w4();
            ((ViewGroup) oa.b.z1(aVar)).addView(this.f6667u, new ViewGroup.LayoutParams(-1, -1));
            fp fpVar = f9.k.C.B;
            cy cyVar = new cy(this.f6667u, this);
            View view2 = (View) ((WeakReference) cyVar.f11688u).get();
            ViewTreeObserver viewTreeObserver3 = null;
            if (view2 == null || (viewTreeObserver = view2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
                viewTreeObserver = null;
            }
            if (viewTreeObserver != null) {
                cyVar.U1(viewTreeObserver);
            }
            dy dyVar = new dy(this.f6667u, this);
            View view3 = (View) ((WeakReference) dyVar.f11688u).get();
            if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null && viewTreeObserver2.isAlive()) {
                viewTreeObserver3 = viewTreeObserver2;
            }
            if (viewTreeObserver3 != null) {
                dyVar.U1(viewTreeObserver3);
            }
            x4();
            try {
                nqVar.a();
                return;
            } catch (RemoteException e10) {
                int i13 = k9.a0.f19634b;
                l9.i.i(e10, "#007 Could not call remote method.");
                return;
            }
        }
        if (view == null) {
            str = "can not get video view.";
        } else {
            str = "can not get video controller.";
        }
        int i14 = k9.a0.f19634b;
        l9.i.c("Instream internal error: ".concat(str));
        try {
            nqVar.u(0);
        } catch (RemoteException e11) {
            int i15 = k9.a0.f19634b;
            l9.i.i(e11, "#007 Could not call remote method.");
        }
    }

    public final void w4() {
        View view = this.f6667u;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f6667u);
            }
        }
    }

    public final void x4() {
        View view;
        na0 na0Var = this.f6669w;
        if (na0Var != null && (view = this.f6667u) != null) {
            Map map = Collections.EMPTY_MAP;
            na0Var.t(view, map, map, na0.d(view));
        }
    }
}
