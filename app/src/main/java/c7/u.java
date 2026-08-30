package c7;
import c.g;
import t.h;
import t.i;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.ads.fu1;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.mlkit_vision_digital_ink.pw;
import com.google.android.gms.internal.play_billing.a3;
import com.google.android.gms.internal.play_billing.b3;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.u3;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.internal.play_billing.y3;

/* loaded from: classes.dex */
public final class u implements ServiceConnection {

    /* renamed from: u, reason: collision with root package name */
    public final d f3992u;

    /* renamed from: v, reason: collision with root package name */
    public final fu1 f3993v;

    /* renamed from: w, reason: collision with root package name */
    public final fu1 f3994w;

    /* renamed from: x, reason: collision with root package name */
    public final int f3995x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f3996y;

    public u(c cVar, d dVar, int i) {
        this.f3996y = cVar;
        com.google.android.gms.internal.play_billing.j jVar = cVar.D;
        this.f3993v = new fu1(jVar);
        this.f3994w = new fu1(jVar);
        this.f3992u = dVar;
        this.f3995x = i;
    }

    public final Long a(boolean z3) {
        c cVar = this.f3996y;
        try {
            if (z3) {
                synchronized (cVar.f3903a) {
                    try {
                        fu1 fu1Var = this.f3993v;
                        if (!fu1Var.f6167v) {
                            return null;
                        }
                        long a10 = ((com.google.android.gms.internal.play_billing.j) fu1Var.f6170y).a();
                        if (fu1Var.f6167v) {
                            fu1Var.f6167v = false;
                            long j10 = (a10 - fu1Var.f6169x) + fu1Var.f6168w;
                            fu1Var.f6168w = j10;
                            return Long.valueOf(j10 / 1000000);
                        }
                        throw new IllegalStateException("This stopwatch is already stopped.");
                    } finally {
                    }
                }
            }
            synchronized (cVar.f3903a) {
                try {
                    fu1 fu1Var2 = this.f3994w;
                    if (!fu1Var2.f6167v) {
                        return null;
                    }
                    long a11 = ((com.google.android.gms.internal.play_billing.j) fu1Var2.f6170y).a();
                    if (fu1Var2.f6167v) {
                        fu1Var2.f6167v = false;
                        long j11 = (a11 - fu1Var2.f6169x) + fu1Var2.f6168w;
                        fu1Var2.f6168w = j11;
                        return Long.valueOf(j11 / 1000000);
                    }
                    throw new IllegalStateException("This stopwatch is already stopped.");
                } finally {
                }
            }
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.i("BillingClient", "Exception getting connection establishment duration.", th);
            return null;
        }
        com.google.android.gms.internal.play_billing.i("BillingClient", "Exception getting connection establishment duration.", th);
        return null;
    }

    public final void b(f fVar, int i, String str, boolean z3) {
        boolean z9;
        try {
            f3 p10 = g3.p();
            int i10 = fVar.f3946a;
            p10.b();
            g3.u((g3) p10.f15516v, i10);
            String str2 = fVar.f3948c;
            p10.b();
            g3.r((g3) p10.f15516v, str2);
            p10.b();
            g3.t((g3) p10.f15516v, i);
            if (str != null) {
                p10.b();
                g3.q((g3) p10.f15516v, str);
            }
            Long a10 = a(z3);
            c cVar = this.f3996y;
            if (z3) {
                x3 p11 = y3.p();
                int i11 = this.f3995x;
                if (i11 > 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                p11.c(z9);
                p11.d(i11);
                if (a10 != null) {
                    long longValue = a10.longValue();
                    p11.b();
                    y3.s((y3) p11.f15516v, longValue);
                }
                a3 s10 = b3.s();
                s10.c(p10);
                s10.b();
                b3.r((b3) s10.f15516v, 6);
                s10.d(p11);
                cVar.r((b3) s10.a());
                return;
            }
            u3 p12 = v3.p();
            p12.b();
            v3.q((v3) p12.f15516v, (g3) p10.a());
            if (a10 != null) {
                long longValue2 = a10.longValue();
                p12.b();
                v3.r((v3) p12.f15516v, longValue2);
            }
            cVar.f3909h.y((v3) p12.a());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void c(f fVar) {
        c cVar = this.f3996y;
        synchronized (cVar.f3903a) {
            try {
                if (cVar.f3904b == 3) {
                    return;
                }
                try {
                    this.f3992u.u(fVar);
                } catch (Throwable th) {
                    com.google.android.gms.internal.play_billing.i("BillingClient", "Exception while calling onBillingSetupFinished.", th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean z3;
        boolean z9;
        com.google.android.gms.internal.play_billing.h("BillingClient", "Billing service died.");
        try {
            c cVar = this.f3996y;
            synchronized (cVar.f3903a) {
                z3 = true;
                if (cVar.f3904b == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            }
            pw pwVar = cVar.f3909h;
            if (z9) {
                a3 s10 = b3.s();
                s10.b();
                b3.r((b3) s10.f15516v, 6);
                f3 p10 = g3.p();
                p10.b();
                g3.t((g3) p10.f15516v, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                s10.c(p10);
                x3 p11 = y3.p();
                int i = this.f3995x;
                if (i <= 0) {
                    z3 = false;
                }
                p11.c(z3);
                p11.d(i);
                s10.d(p11);
                pwVar.m((b3) s10.a());
            } else {
                pwVar.x(h3.p());
            }
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.i("BillingClient", "Unable to log.", th);
        }
        c cVar2 = this.f3996y;
        synchronized (cVar2.f3903a) {
            if (cVar2.f3904b != 3 && cVar2.f3904b != 0) {
                cVar2.u(0);
                cVar2.w();
                try {
                    this.f3992u.y();
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v4, types: [com.google.android.gms.internal.play_billing.c] */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object ohVar;
        com.google.android.gms.internal.play_billing.g("BillingClient", "Billing service connected.");
        c cVar = this.f3996y;
        synchronized (cVar.f3903a) {
            try {
                if (cVar.f3904b == 3) {
                    return;
                }
                int i = com.google.android.gms.internal.play_billing.b.f15381v;
                if (iBinder == null) {
                    ohVar = 0;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    if (queryLocalInterface instanceof com.google.android.gms.internal.play_billing.c) {
                        ohVar = (com.google.android.gms.internal.play_billing.c) queryLocalInterface;
                    } else {
                        ohVar = new oh(iBinder, "com.android.vending.billing.IInAppBillingService", 2);
                    }
                }
                cVar.i = ohVar;
                if (g(new t(0, this), 30000L, new a6.x(5, this), cVar.m(), cVar.f()) == null) {
                    int i10 = this.f3995x;
                    f p10 = cVar.p();
                    cVar.t(25, i10, p10);
                    c(p10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z3;
        boolean z9;
        com.google.android.gms.internal.play_billing.h("BillingClient", "Billing service disconnected.");
        try {
            c cVar = this.f3996y;
            synchronized (cVar.f3903a) {
                z3 = true;
                if (cVar.f3904b == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            }
            pw pwVar = cVar.f3909h;
            if (z9) {
                a3 s10 = b3.s();
                s10.b();
                b3.r((b3) s10.f15516v, 6);
                f3 p10 = g3.p();
                p10.b();
                g3.t((g3) p10.f15516v, FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD);
                s10.c(p10);
                x3 p11 = y3.p();
                int i = this.f3995x;
                if (i <= 0) {
                    z3 = false;
                }
                p11.c(z3);
                p11.d(i);
                s10.d(p11);
                pwVar.m((b3) s10.a());
            } else {
                pwVar.A(w3.p());
            }
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.i("BillingClient", "Unable to log.", th);
        }
        c cVar2 = this.f3996y;
        synchronized (cVar2.f3903a) {
            try {
                fu1 fu1Var = this.f3994w;
                fu1Var.f6168w = 0L;
                fu1Var.f6167v = false;
                fu1Var.c();
                if (cVar2.f3904b != 3) {
                    cVar2.u(0);
                    try {
                        this.f3992u.y();
                    } catch (Throwable th2) {
                        com.google.android.gms.internal.play_billing.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                    }
                }
            } finally {
            }
        }
    }
}