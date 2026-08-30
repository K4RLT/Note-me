package com.google.android.gms.internal.ads;
import g9.a2;
import l9.i;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final /* synthetic */ class t00 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u00 f11216u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f11217v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f11218w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f11219x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f11220y;

    public /* synthetic */ t00(u00 u00Var, int i, int i10, boolean z3, boolean z9) {
        this.f11216u = u00Var;
        this.f11217v = i;
        this.f11218w = i10;
        this.f11219x = z3;
        this.f11220y = z9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        Object r10;
        Object r12;
        Object r22;
        Object r122;
        Object r13;
        g9.a2 a2Var;
        g9.a2 a2Var2;
        g9.a2 a2Var3;
        u00 u00Var = this.f11216u;
        int i10 = this.f11217v;
        int i11 = this.f11218w;
        boolean z3 = this.f11219x;
        boolean z9 = this.f11220y;
        synchronized (u00Var.f11503v) {
            try {
                boolean z10 = u00Var.A;
                boolean z11 = false;
                if (!z10 && i11 == 1) {
                    i11 = 1;
                    i = 1;
                    r10 = true;
                } else {
                    i = i11;
                    r10 = false;
                }
                if (i10 != i11) {
                    r12 = true;
                } else {
                    r12 = false;
                }
                if (r12 != false && i == 1) {
                    r22 = true;
                    i = 1;
                } else {
                    r22 = false;
                }
                if (r12 != false && i == 2) {
                    r122 = true;
                } else {
                    r122 = false;
                }
                if (r12 != false && i == 3) {
                    r13 = true;
                } else {
                    r13 = false;
                }
                if (z10 || r10 != false) {
                    z11 = true;
                }
                u00Var.A = z11;
                if (r10 != false) {
                    try {
                        g9.a2 a2Var4 = u00Var.f11507z;
                        if (a2Var4 != null) {
                            a2Var4.a();
                        }
                    } catch (RemoteException e) {
                        l9.i.i(e, "#007 Could not call remote method.");
                    }
                }
                if (r22 != false && (a2Var3 = u00Var.f11507z) != null) {
                    a2Var3.v2(a2Var3.g2(), 2);
                }
                if (r122 != false && (a2Var2 = u00Var.f11507z) != null) {
                    a2Var2.e();
                }
                if (r13 != false) {
                    g9.a2 a2Var5 = u00Var.f11507z;
                    if (a2Var5 != null) {
                        a2Var5.d();
                    }
                    u00Var.f11502u.s();
                }
                if (z3 != z9 && (a2Var = u00Var.f11507z) != null) {
                    Parcel g22 = a2Var.g2();
                    ClassLoader classLoader = qh.f9846a;
                    g22.writeInt(z9 ? 1 : 0);
                    a2Var.v2(g22, 5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
