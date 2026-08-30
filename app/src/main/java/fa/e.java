package fa;
import k0.a;
import n.b;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class e {
    public static final ca.d[] R = new ca.d[0];
    public final Object A;
    public final Object B;
    public u C;
    public d D;
    public IInterface E;
    public final ArrayList F;
    public d0 G;
    public int H;
    public final b I;
    public final c J;
    public final int K;
    public final String L;
    public volatile String M;
    public ca.b N;
    public boolean O;
    public volatile g0 P;
    public final AtomicInteger Q;

    /* renamed from: u, reason: collision with root package name */
    public volatile String f16842u;

    /* renamed from: v, reason: collision with root package name */
    public l0 f16843v;

    /* renamed from: w, reason: collision with root package name */
    public final Context f16844w;

    /* renamed from: x, reason: collision with root package name */
    public final k0 f16845x;

    /* renamed from: y, reason: collision with root package name */
    public final ca.f f16846y;

    /* renamed from: z, reason: collision with root package name */
    public final b0 f16847z;

    public e(Context context, Looper looper, k0 k0Var, ca.f fVar, int i, b bVar, c cVar, String str) {
        this.f16842u = null;
        this.A = new Object();
        this.B = new Object();
        this.F = new ArrayList();
        this.H = 1;
        this.N = null;
        this.O = false;
        this.P = null;
        this.Q = new AtomicInteger(0);
        y.i(context, "Context must not be null");
        this.f16844w = context;
        y.i(looper, "Looper must not be null");
        y.i(k0Var, "Supervisor must not be null");
        this.f16845x = k0Var;
        y.i(fVar, "API availability must not be null");
        this.f16846y = fVar;
        this.f16847z = new b0(this, looper);
        this.K = i;
        this.I = bVar;
        this.J = cVar;
        this.L = str;
    }

    public final void a(d dVar) {
        this.D = dVar;
        z(2, null);
    }

    public final void c(i iVar, Set set) {
        Bundle r8 = r();
        String str = this.M;
        int i = this.K;
        int i10 = ca.f.f4035a;
        Scope[] scopeArr = g.I;
        Bundle bundle = new Bundle();
        ca.d[] dVarArr = g.J;
        g gVar = new g(6, i, i10, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        gVar.f16860x = this.f16844w.getPackageName();
        gVar.A = r8;
        if (set != null) {
            gVar.f16862z = (Scope[]) set.toArray(new Scope[0]);
        }
        if (l()) {
            Account p10 = p();
            if (p10 == null) {
                p10 = new Account("<<default account>>", "com.google");
            }
            gVar.B = p10;
            if (iVar != null) {
                gVar.f16861y = iVar.asBinder();
            }
        }
        gVar.C = R;
        gVar.D = q();
        if (x()) {
            gVar.G = true;
        }
        try {
            synchronized (this.B) {
                try {
                    u uVar = this.C;
                    if (uVar != null) {
                        uVar.R(new c0(this, this.Q.get()), gVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i11 = this.Q.get();
            b0 b0Var = this.f16847z;
            b0Var.sendMessage(b0Var.obtainMessage(6, i11, 3));
        } catch (RemoteException e8) {
            e = e8;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i12 = this.Q.get();
            e0 e0Var = new e0(this, 8, null, null);
            b0 b0Var2 = this.f16847z;
            b0Var2.sendMessage(b0Var2.obtainMessage(1, i12, -1, e0Var));
        } catch (SecurityException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i122 = this.Q.get();
            e0 e0Var2 = new e0(this, 8, null, null);
            b0 b0Var22 = this.f16847z;
            b0Var22.sendMessage(b0Var22.obtainMessage(1, i122, -1, e0Var2));
        }
    }

    public final void d(String str) {
        this.f16842u = str;
        o();
    }

    public final boolean e() {
        boolean z3;
        synchronized (this.A) {
            int i = this.H;
            z3 = true;
            if (i != 2 && i != 3) {
                z3 = false;
            }
        }
        return z3;
    }

    public final void f() {
        if (h() && this.f16843v != null) {
            return;
        }
        vd.b("Failed to connect when checking package");
    }

    public final void g(pd.c cVar) {
        ((ea.l) cVar.f22681u).G.G.post(new a6.x(8, cVar));
    }

    public final boolean h() {
        boolean z3;
        synchronized (this.A) {
            if (this.H == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        return z3;
    }

    public int i() {
        return ca.f.f4035a;
    }

    public final ca.d[] j() {
        g0 g0Var = this.P;
        if (g0Var == null) {
            return null;
        }
        return g0Var.f16864v;
    }

    public final String k() {
        return this.f16842u;
    }

    public boolean l() {
        return false;
    }

    public final void m() {
        int c10 = this.f16846y.c(this.f16844w, i());
        if (c10 != 0) {
            z(1, null);
            this.D = new l(this);
            int i = this.Q.get();
            b0 b0Var = this.f16847z;
            b0Var.sendMessage(b0Var.obtainMessage(3, i, c10, null));
            return;
        }
        a(new l(this));
    }

    public abstract IInterface n(IBinder iBinder);

    public final void o() {
        this.Q.incrementAndGet();
        ArrayList arrayList = this.F;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    t tVar = (t) arrayList.get(i);
                    synchronized (tVar) {
                        tVar.f16921a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.B) {
            this.C = null;
        }
        z(1, null);
    }

    public Account p() {
        return null;
    }

    public ca.d[] q() {
        return R;
    }

    public Bundle r() {
        return new Bundle();
    }

    public Set s() {
        return Collections.EMPTY_SET;
    }

    public final IInterface t() {
        IInterface iInterface;
        synchronized (this.A) {
            try {
                if (this.H != 5) {
                    if (h()) {
                        IInterface iInterface2 = this.E;
                        y.i(iInterface2, "Client is connected but service is null");
                        iInterface = iInterface2;
                    } else {
                        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                    }
                } else {
                    throw new DeadObjectException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String u();

    public abstract String v();

    public boolean w() {
        if (i() >= 211700000) {
            return true;
        }
        return false;
    }

    public boolean x() {
        return this instanceof ja.g;
    }

    public final /* synthetic */ boolean y(int i, int i10, IInterface iInterface) {
        synchronized (this.A) {
            try {
                if (this.H != i) {
                    return false;
                }
                z(i10, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(int i, IInterface iInterface) {
        boolean z3;
        boolean z9;
        boolean z10;
        l0 l0Var;
        boolean z11 = false;
        if (i != 4) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (iInterface == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z3 == z9) {
            z10 = true;
        } else {
            z10 = false;
        }
        y.b(z10);
        synchronized (this.A) {
            try {
                this.H = i;
                this.E = iInterface;
                Bundle bundle = null;
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        if (i == 4) {
                            y.h(iInterface);
                            IInterface iInterface2 = iInterface;
                            System.currentTimeMillis();
                        }
                    } else {
                        d0 d0Var = this.G;
                        if (d0Var != null && (l0Var = this.f16843v) != null) {
                            String str = l0Var.f16897b;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 70 + "com.google.android.gms".length());
                            sb2.append("Calling connect() while still connected, missing disconnect() for ");
                            sb2.append(str);
                            sb2.append(" on com.google.android.gms");
                            Log.e("GmsClient", sb2.toString());
                            k0 k0Var = this.f16845x;
                            String str2 = this.f16843v.f16897b;
                            y.h(str2);
                            this.f16843v.getClass();
                            if (this.L == null) {
                                this.f16844w.getClass();
                            }
                            k0Var.c(str2, d0Var, this.f16843v.f16896a);
                            this.Q.incrementAndGet();
                        }
                        d0 d0Var2 = new d0(this, this.Q.get());
                        this.G = d0Var2;
                        String v2 = v();
                        boolean w10 = w();
                        this.f16843v = new l0(v2, w10);
                        if (w10 && i() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f16843v.f16897b)));
                        }
                        k0 k0Var2 = this.f16845x;
                        String str3 = this.f16843v.f16897b;
                        y.h(str3);
                        this.f16843v.getClass();
                        String str4 = this.L;
                        if (str4 == null) {
                            str4 = this.f16844w.getClass().getName();
                        }
                        ca.b b10 = k0Var2.b(new h0(str3, this.f16843v.f16896a), d0Var2, str4, null);
                        if (b10.f4022v == 0) {
                            z11 = true;
                        }
                        if (!z11) {
                            String str5 = this.f16843v.f16897b;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                            sb3.append("unable to connect to service: ");
                            sb3.append(str5);
                            sb3.append(" on com.google.android.gms");
                            Log.w("GmsClient", sb3.toString());
                            int i10 = b10.f4022v;
                            if (i10 == -1) {
                                i10 = 16;
                            }
                            if (b10.f4023w != null) {
                                bundle = new Bundle();
                                bundle.putParcelable("pendingIntent", b10.f4023w);
                            }
                            int i11 = this.Q.get();
                            f0 f0Var = new f0(this, i10, bundle);
                            b0 b0Var = this.f16847z;
                            b0Var.sendMessage(b0Var.obtainMessage(7, i11, -1, f0Var));
                        }
                    }
                } else {
                    d0 d0Var3 = this.G;
                    if (d0Var3 != null) {
                        k0 k0Var3 = this.f16845x;
                        String str6 = this.f16843v.f16897b;
                        y.h(str6);
                        this.f16843v.getClass();
                        if (this.L == null) {
                            this.f16844w.getClass();
                        }
                        k0Var3.c(str6, d0Var3, this.f16843v.f16896a);
                        this.G = null;
                    }
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(android.content.Context r10, android.os.Looper r11, int r12, fa.b r13, fa.c r14) {
        /*
            r9 = this;
            fa.k0 r3 = fa.a(r10)
            ca.f r4 = ca.f.f4036b
            fa.y.h(r13)
            fa.y.h(r14)
            r8 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fa.e.<init>(android.content.Context, android.os.Looper, int, fa.b, fa.c):void");
    }
}
