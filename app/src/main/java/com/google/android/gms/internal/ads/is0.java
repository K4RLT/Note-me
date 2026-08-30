package com.google.android.gms.internal.ads;
import ca.b;
import fa.b;
import fa.c;
import g9.r;
import r.e;
import sg.b;
import sg.c;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class is0 implements fa.b, fa.c {

    /* renamed from: u, reason: collision with root package name */
    public boolean f7204u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7205v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f7206w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f7207x;

    /* renamed from: y, reason: collision with root package name */
    public Object f7208y;

    public is0(int i) {
        switch (i) {
            case 4:
                this.f7206w = new Object();
                this.f7207x = new sg.b(this);
                this.f7208y = new sg.c(this);
                return;
            default:
                this.f7204u = false;
                this.f7207x = new WeakHashMap();
                this.f7206w = new hg(9, this);
                return;
        }
    }

    public synchronized void a(Context context) {
        try {
            if (this.f7204u) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.f7208y = applicationContext;
            if (applicationContext == null) {
                this.f7208y = context;
            }
            sl.a((Context) this.f7208y);
            nl nlVar = sl.I4;
            g9.r rVar = g9.r.e;
            this.f7205v = ((Boolean) rVar.f17698c.a(nlVar)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (((Boolean) rVar.f17698c.a(sl.f10956tc)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
                ((Context) this.f7208y).registerReceiver((hg) this.f7206w, intentFilter, 4);
            } else {
                ((Context) this.f7208y).registerReceiver((hg) this.f7206w, intentFilter);
            }
            this.f7204u = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void b(boolean z3) {
        if (this.f7205v != z3) {
            this.f7205v = z3;
            if (this.f7204u) {
                e(true, z3);
            }
        }
    }

    public void c() {
        synchronized (this.f7208y) {
            try {
                qv0 qv0Var = (qv0) this.f7206w;
                if (!qv0Var.h()) {
                    if (qv0Var.e()) {
                    }
                    Binder.flushPendingCommands();
                }
                qv0Var.o();
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void d(Context context, hg hgVar) {
        if (this.f7205v) {
            ((WeakHashMap) this.f7207x).remove(hgVar);
        } else {
            context.unregisterReceiver(hgVar);
        }
    }

    public void e(final boolean z3, final boolean z9) {
        io0 io0Var = (io0) this.f7207x;
        if (z3 && z9) {
            io0Var.e(new xq0(0, this, z3, z9));
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        io0 io0Var2 = (io0) this.f7208y;
        io0Var2.f7185a.postDelayed(new com.google.android.gms.internal.mlkit_vision_digital_ink.ra(this, 24, atomicBoolean), 1000L);
        io0Var.e(new Runnable() { // from class: com.google.android.gms.internal.ads.kq0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                atomicBoolean.set(false);
                ((com.google.android.gms.internal.mlkit_vision_digital_ink.iw) is0.this.f7206w).C(z3, z9);
            }
        });
    }

    @Override // fa.b
    public void g0() {
        synchronized (this.f7208y) {
            try {
                if (this.f7205v) {
                    return;
                }
                this.f7205v = true;
                try {
                    tv0 tv0Var = (tv0) ((qv0) this.f7206w).t();
                    pv0 pv0Var = new pv0(((mv0) this.f7207x).b(), 1);
                    Parcel g22 = tv0Var.g2();
                    qh.c(g22, pv0Var);
                    tv0Var.v2(g22, 2);
                } catch (Exception unused) {
                } catch (Throwable th) {
                    c();
                    throw th;
                }
                c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // fa.b
    public void R(int i) {
    }

    @Override // fa.c
    public void r0(ca.b bVar) {
    }

    public is0(Context context, Looper looper, s6 s6Var) {
        this.f7206w = new com.google.android.gms.internal.mlkit_vision_digital_ink.iw(context.getApplicationContext());
        this.f7207x = s6Var.x(looper, null);
        this.f7208y = s6Var.x(Looper.getMainLooper(), null);
    }

    public is0(Context context, Looper looper, mv0 mv0Var) {
        this.f7208y = new Object();
        this.f7204u = false;
        this.f7205v = false;
        this.f7207x = mv0Var;
        this.f7206w = new qv0(context, looper, this, this, 12800000);
    }

    public is0(Context context, String str, iw0 iw0Var, boolean z3, boolean z9) {
        context.getClass();
        iw0Var.getClass();
        this.f7206w = context;
        this.f7207x = str;
        this.f7208y = iw0Var;
        this.f7204u = z3;
        this.f7205v = z9;
    }
}
