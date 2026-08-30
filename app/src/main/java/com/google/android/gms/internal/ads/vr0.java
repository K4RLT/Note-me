package com.google.android.gms.internal.ads;
import f9.k;
import g9.r;
import k9.f0;
import l9.a;

import android.content.Context;
import android.os.Binder;
import java.util.AbstractCollection;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class vr0 implements Runnable {
    public static final Object D = new Object();
    public static final Object E = new Object();
    public static final Object F = new Object();
    public static Boolean G;
    public final AbstractCollection A;
    public final h10 B;

    /* renamed from: u, reason: collision with root package name */
    public final Context f11972u;

    /* renamed from: v, reason: collision with root package name */
    public final a f11973v;

    /* renamed from: y, reason: collision with root package name */
    public int f11976y;

    /* renamed from: z, reason: collision with root package name */
    public final nd0 f11977z;

    /* renamed from: w, reason: collision with root package name */
    public final yr0 f11974w = bs0.A();

    /* renamed from: x, reason: collision with root package name */
    public String f11975x = "";
    public boolean C = false;

    public vr0(Context context, a aVar, nd0 nd0Var, fp fpVar, h10 h10Var) {
        this.f11972u = context;
        this.f11973v = aVar;
        this.f11977z = nd0Var;
        this.B = h10Var;
        if (((Boolean) r.e.f17698c.a(sl.Z9)).booleanValue()) {
            this.A = f0.H();
        } else {
            b51 b51Var = d51.f5314v;
            this.A = y51.f12781y;
        }
    }

    public static boolean a() {
        boolean booleanValue;
        boolean z3;
        synchronized (D) {
            try {
                if (G == null) {
                    if (!((Boolean) rm.f10239b.p()).booleanValue()) {
                        G = Boolean.FALSE;
                    } else {
                        if (Math.random() < ((Double) rm.f10238a.p()).doubleValue()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        G = Boolean.valueOf(z3);
                    }
                }
                booleanValue = G.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final void b(tr0 tr0Var) {
        xx.f12651a.f(new com.google.android.gms.internal.mlkit_vision_digital_ink.ra(this, 25, tr0Var));
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] b10;
        if (a()) {
            Object obj = E;
            synchronized (obj) {
                try {
                    if (((bs0) this.f11974w.f4845v).z() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            yr0 yr0Var = this.f11974w;
                            b10 = ((bs0) yr0Var.c()).b();
                            yr0Var.b();
                            ((bs0) yr0Var.f4845v).C();
                        }
                        fh0 fh0Var = new fh0((String) r.e.f17698c.a(sl.T9), 60000, new HashMap(), b10, "application/x-protobuf");
                        Context context = this.f11972u;
                        String str = this.f11973v.f20029u;
                        Binder.getCallingUid();
                        new hq0(context, str, null, 14, false).s(fh0Var);
                    } catch (Exception e) {
                        if ((e instanceof cg0) && ((cg0) e).f5086u == 3) {
                            return;
                        }
                        k.C.f16817h.e("CuiMonitor.sendCuiPing", e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
