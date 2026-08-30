package c2;
import b0.x;
import r0.u1;

import android.view.View;
import b8.d5;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b3 implements androidx.lifecycle.u {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ uf.c f3476u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a1 f3477v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u1 f3478w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f3479x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ View f3480y;

    public b3(uf.c cVar, a1 a1Var, u1 u1Var, kotlin.jvm.internal.y yVar, View view) {
        this.f3476u = cVar;
        this.f3477v = a1Var;
        this.f3478w = u1Var;
        this.f3479x = yVar;
        this.f3480y = view;
    }

    @Override // androidx.lifecycle.u
    public final void k(androidx.lifecycle.w wVar, androidx.lifecycle.o oVar) {
        boolean z3;
        pf.k kVar = null;
        switch (z2.f3739a[oVar.ordinal()]) {
            case 1:
                pf.x(this.f3476u, null, new d5(this.f3479x, this.f3478w, wVar, this, this.f3480y, (te.c) null), 1);
                return;
            case 2:
                a1 a1Var = this.f3477v;
                if (a1Var != null) {
                    com.google.android.gms.internal.ads.d dVar = (com.google.android.gms.internal.ads.d) a1Var.f3462w;
                    synchronized (dVar.f5230v) {
                        try {
                            synchronized (dVar.f5230v) {
                                z3 = dVar.f5229u;
                            }
                            if (!z3) {
                                ArrayList arrayList = (ArrayList) dVar.f5231w;
                                dVar.f5231w = (ArrayList) dVar.f5232x;
                                dVar.f5232x = arrayList;
                                dVar.f5229u = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((te.c) arrayList.get(i)).resumeWith(pe.z.f22715a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                u1 u1Var = this.f3478w;
                synchronized (u1Var.f24396b) {
                    if (u1Var.f24411s) {
                        u1Var.f24411s = false;
                        kVar = u1Var.t();
                    }
                }
                if (kVar != null) {
                    ((pf.l) kVar).resumeWith(pe.z.f22715a);
                    return;
                }
                return;
            case 3:
                u1 u1Var2 = this.f3478w;
                synchronized (u1Var2.f24396b) {
                    u1Var2.f24411s = true;
                }
                return;
            case 4:
                this.f3478w.s();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                l4.a.o();
                return;
        }
    }
}
