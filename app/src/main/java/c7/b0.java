package c7;
import c0.b;
import c0.c;
import c0.z;
import e0.a;
import t.g;
import t.h;
import t.i;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import androidx.datastore.preferences.protobuf.s1;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.mlkit_vision_digital_ink.pw;
import com.google.android.gms.internal.play_billing.b3;
import com.google.android.gms.internal.play_billing.e3;
import com.google.android.gms.internal.play_billing.e4;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.o0;
import com.google.android.gms.internal.play_billing.p0;
import com.google.android.gms.internal.play_billing.q0;
import com.google.android.gms.internal.play_billing.r0;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class b0 extends c {
    public final Context E;
    public volatile int F;
    public volatile com.google.android.gms.internal.play_billing.h G;
    public volatile a0 H;
    public volatile ScheduledExecutorService I;

    public b0(va.t tVar, Context context, b bVar) {
        super(tVar, context, bVar);
        this.F = 0;
        this.E = context;
    }

    public final synchronized boolean H() {
        if (this.F == 2 && this.G != null) {
            if (this.H != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.play_billing.f4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.gms.internal.play_billing.c4, java.lang.Object] */
    public final r0 I(int i) {
        if (!H()) {
            com.google.android.gms.internal.play_billing.h("BillingClientTesting", "Billing Override Service is not ready.");
            J(94, 28, a(-1, "Billing Override Service connection is disconnected."));
            return new q0(0);
        }
        x xVar = new x(this, i, 0);
        Object obj = new Object();
        obj.f15397c = new Object();
        e4 e4Var = new e4(obj);
        obj.f15396b = e4Var;
        obj.f15395a = x.class;
        try {
            xVar.n(obj);
            obj.f15395a = "billingOverrideService.getBillingOverride";
            return e4Var;
        } catch (Exception e) {
            e4Var.b(e);
            return e4Var;
        }
    }

    public final void J(int i, int i10, f fVar) {
        int i11 = c0.f3927a;
        b3 b10 = b(i, i10, fVar, null, i3.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(b10, "ApiFailure should not be null");
        this.f3909h.m(b10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ba.q] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.gms.internal.play_billing.t0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.internal.play_billing.s0, java.lang.Object, java.lang.Runnable] */
    public final void K(int i, p3.a aVar, Runnable runnable) {
        ScheduledExecutorService scheduledExecutorService;
        r0 I = I(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.I == null) {
                    this.I = Executors.newSingleThreadScheduledExecutor();
                }
                scheduledExecutorService = this.I;
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean isDone = I.isDone();
        r0 r0Var = I;
        if (!isDone) {
            Object obj = new Object();
            obj.B = I;
            Object obj2 = new Object();
            obj2.f15522u = obj;
            obj.C = scheduledExecutorService.schedule((Runnable) obj2, 28500L, timeUnit);
            I.k(obj2, o0.f15497u);
            r0Var = obj;
        }
        Object obj3 = new Object();
        obj3.f3157u = i;
        obj3.f3158v = aVar;
        obj3.f3159w = runnable;
        obj3.f3160x = this;
        r0Var.k(new p0(r0Var, obj3), f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [p3.a, java.lang.Object] */
    @Override // c7.c
    public final void a(c4.s sVar, s1 s1Var) {
        K(3, new Object(), new ba.j(4, this, sVar, s1Var));
    }

    @Override // c7.c
    public final void b(final a aVar, final g gVar) {
        K(4, new p3.a() { // from class: c7.w
            @Override // p3.a
            public final void accept(Object obj) {
                String str = aVar.f3896v;
                gVar.a((f) obj, str);
            }
        }, new ba.j(3, this, aVar, gVar));
    }

    @Override // c7.c
    public final f c(Activity activity, z zVar) {
        int i = 0;
        try {
            i = ((Integer) I(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e) {
            J(FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH, 28, e0.f3945r);
            com.google.android.gms.internal.play_billing.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e);
        } catch (Exception e8) {
            if (e8 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            J(95, 28, e0.f3945r);
            com.google.android.gms.internal.play_billing.i("BillingClientTesting", "An error occurred while retrieving billing override.", e8);
        }
        if (i > 0) {
            f a10 = a(i, "Billing override value was set by a license tester.");
            J(93, 2, a10);
            G(a10);
            return a10;
        }
        try {
            return super.c(activity, zVar);
        } catch (Exception e10) {
            f fVar = e0.f3936h;
            J(FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT, 2, fVar);
            com.google.android.gms.internal.play_billing.i("BillingClientTesting", "An internal error occurred.", e10);
            return fVar;
        }
    }

    @Override // c7.c
    public final void d(pd.c cVar, j jVar) {
        K(7, new v(0, jVar), new ba.j(2, this, cVar, jVar));
    }

    @Override // c7.c
    public final void e(d dVar) {
        synchronized (this) {
            if (H()) {
                com.google.android.gms.internal.play_billing.g("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                int i = c0.f3927a;
                e3 c10 = c(26, i3.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(c10, "ApiSuccess should not be null");
                pw pwVar = this.f3909h;
                pwVar.getClass();
                try {
                    pwVar.C(c10, (l3) pwVar.f14821v);
                } catch (Throwable th) {
                    com.google.android.gms.internal.play_billing.i("BillingLogger", "Unable to log.", th);
                }
            } else {
                int i10 = 1;
                if (this.F == 1) {
                    com.google.android.gms.internal.play_billing.h("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                } else if (this.F == 3) {
                    com.google.android.gms.internal.play_billing.h("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                    J(38, 26, a(-1, "Billing Override Service connection is disconnected."));
                } else {
                    this.F = 1;
                    com.google.android.gms.internal.play_billing.g("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.H = new a0(0, this);
                    Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                    intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                    Context context = this.E;
                    List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") && str2 != null) {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                if (context.bindService(intent2, this.H, 1)) {
                                    com.google.android.gms.internal.play_billing.g("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                } else {
                                    com.google.android.gms.internal.play_billing.h("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                }
                            } else {
                                com.google.android.gms.internal.play_billing.h("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                            }
                            i10 = 39;
                        }
                    } else {
                        i10 = 41;
                    }
                    this.F = 0;
                    com.google.android.gms.internal.play_billing.g("BillingClientTesting", "Billing Override Service unavailable on device.");
                    J(i10, 26, a(2, "Billing Override Service unavailable on device."));
                }
            }
        }
        v(dVar, 0);
    }

    public b0(va.t tVar, Context context, l lVar, b bVar) {
        super(tVar, context, lVar, bVar);
        this.F = 0;
        this.E = context;
    }
}