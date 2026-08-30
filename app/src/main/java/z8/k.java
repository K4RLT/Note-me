package z8;
import d.b;
import r.e;

import android.content.Context;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.sf0;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.um;
import fa.y;
import g9.c3;
import g9.e2;
import g9.k0;
import g9.s2;
import java.util.concurrent.atomic.AtomicLong;
import q.x;

/* loaded from: classes.dex */
public abstract class k extends ViewGroup {

    /* renamed from: u, reason: collision with root package name */
    public final e2 f31994u;

    public k(Context context) {
        super(context);
        this.f31994u = new e2(this);
    }

    public final void a(g gVar) {
        y.d("#008 Must be called on the main UI thread.");
        sl.a(getContext());
        if (((Boolean) um.f11680f.p()).booleanValue()) {
            if (((Boolean) g9.e.f17698c.a(sl.Cc)).booleanValue()) {
                l9.b.f20035b.execute(new uf.g(this, gVar));
                return;
            }
        }
        this.f31994u.g(gVar.f31983a);
    }

    public c getAdListener() {
        return (c) this.f31994u.f17619g;
    }

    public h getAdSize() {
        c3 m4;
        e2 e2Var = this.f31994u;
        e2Var.getClass();
        try {
            k0 k0Var = (k0) e2Var.f17621j;
            if (k0Var != null && (m4 = k0Var.m()) != null) {
                return new h(m4.f17589u, m4.f17593y, m4.f17590v);
            }
        } catch (RemoteException e) {
            l9.i.i(e, "#007 Could not call remote method.");
        }
        h[] hVarArr = (h[]) e2Var.f17620h;
        if (hVarArr != null) {
            return hVarArr[0];
        }
        return null;
    }

    public String getAdUnitId() {
        k0 k0Var;
        e2 e2Var = this.f31994u;
        if (((String) e2Var.f17623l) == null && (k0Var = (k0) e2Var.f17621j) != null) {
            try {
                e2Var.f17623l = k0Var.M();
            } catch (RemoteException e) {
                l9.i.i(e, "#007 Could not call remote method.");
            }
        }
        return (String) e2Var.f17623l;
    }

    public n getOnPaidEventListener() {
        return (n) this.f31994u.f17625n;
    }

    public long getPlacementId() {
        e2 e2Var = this.f31994u;
        AtomicLong atomicLong = (AtomicLong) e2Var.f17626o;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        try {
            k0 k0Var = (k0) e2Var.f17621j;
            if (k0Var == null) {
                return 0L;
            }
            atomicLong.set(k0Var.i0());
            return atomicLong.get();
        } catch (RemoteException e) {
            l9.i.i(e, "#007 Could not call remote method.");
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z8.q getResponseInfo() {
        /*
            r3 = this;
            g9.e2 r0 = r3.f31994u
            r0.getClass()
            r1 = 0
            java.lang.Object r0 = r0.f17621j     // Catch: android.os.RemoteException -> L11
            g9.k0 r0 = (g9.k0) r0     // Catch: android.os.RemoteException -> L11
            if (r0 == 0) goto L13
            g9.v1 r0 = r0.A()     // Catch: android.os.RemoteException -> L11
            goto L1b
        L11:
            r0 = move-exception
            goto L15
        L13:
            r0 = r1
            goto L1b
        L15:
            java.lang.String r2 = "#007 Could not call remote method."
            l9.i.i(r0, r2)
            goto L13
        L1b:
            if (r0 == 0) goto L22
            z8.q r1 = new z8.q
            r1.<init>(r0)
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z8.k.getResponseInfo():z8.q");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i10, int i11, int i12) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i13 = ((i11 - i) - measuredWidth) / 2;
            int i14 = ((i12 - i10) - measuredHeight) / 2;
            childAt.layout(i13, i14, measuredWidth + i13, measuredHeight + i14);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        h hVar;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            measureChild(childAt, i, i10);
            i15 = childAt.getMeasuredWidth();
            i11 = childAt.getMeasuredHeight();
        } else {
            try {
                hVar = getAdSize();
            } catch (NullPointerException e) {
                l9.i.d("Unable to retrieve ad size.", e);
                hVar = null;
            }
            if (hVar != null) {
                Context context = getContext();
                int i16 = hVar.f31986a;
                if (i16 != -3) {
                    if (i16 != -1) {
                        l9.d dVar = g9.p.f17688g.f17689a;
                        i12 = l9.b(context, i16);
                    } else {
                        i12 = context.getResources().getDisplayMetrics().widthPixels;
                    }
                } else {
                    i12 = -1;
                }
                int i17 = hVar.f31987b;
                if (i17 != -4 && i17 != -3) {
                    if (i17 != -2) {
                        l9.d dVar2 = g9.p.f17688g.f17689a;
                        i13 = l9.b(context, i17);
                    } else {
                        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                        float f10 = displayMetrics.heightPixels;
                        float f11 = displayMetrics.density;
                        int i18 = (int) (f10 / f11);
                        if (i18 <= 400) {
                            i14 = 32;
                        } else if (i18 <= 720) {
                            i14 = 50;
                        } else {
                            i14 = 90;
                        }
                        i13 = (int) (i14 * f11);
                    }
                } else {
                    i13 = -1;
                }
                i11 = i13;
                i15 = i12;
            } else {
                i11 = 0;
            }
        }
        setMeasuredDimension(View.resolveSize(Math.max(i15, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i11, getSuggestedMinimumHeight()), i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(c cVar) {
        e2 e2Var = this.f31994u;
        e2Var.f17619g = cVar;
        sf0 sf0Var = (sf0) e2Var.e;
        synchronized (sf0Var.f10605v) {
            sf0Var.f10606w = cVar;
        }
        if (cVar == 0) {
            e2Var.h(null);
            return;
        }
        if (cVar instanceof g9.a) {
            e2Var.h((g9.a) cVar);
        }
        if (cVar instanceof a9.d) {
            e2Var.j((a9.d) cVar);
        }
    }

    public void setAdSize(h hVar) {
        h[] hVarArr = {hVar};
        e2 e2Var = this.f31994u;
        if (((h[]) e2Var.f17620h) == null) {
            e2Var.i(hVarArr);
        } else {
            x.o("The ad size can only be set once on AdView.");
        }
    }

    public void setAdUnitId(String str) {
        e2 e2Var = this.f31994u;
        if (((String) e2Var.f17623l) == null) {
            e2Var.f17623l = str;
        } else {
            x.o("The ad unit ID can only be set once on AdView.");
        }
    }

    public void setOnPaidEventListener(n nVar) {
        e2 e2Var = this.f31994u;
        e2Var.getClass();
        try {
            e2Var.f17625n = nVar;
            k0 k0Var = (k0) e2Var.f17621j;
            if (k0Var != null) {
                k0Var.F1(new s2(nVar));
            }
        } catch (RemoteException e) {
            l9.i.i(e, "#007 Could not call remote method.");
        }
    }

    public void setPlacementId(long j10) {
        e2 e2Var = this.f31994u;
        ((AtomicLong) e2Var.f17626o).set(j10);
        try {
            k0 k0Var = (k0) e2Var.f17621j;
            if (k0Var != null) {
                k0Var.B0(j10);
            }
        } catch (RemoteException e) {
            l9.i.i(e, "#007 Could not call remote method.");
        }
    }
}
