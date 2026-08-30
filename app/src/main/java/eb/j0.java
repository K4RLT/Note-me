package eb;
import d1.b;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.google.android.gms.internal.ads.ar;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class j0 implements Runnable {
    public final Object A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16189u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final int f16190v;

    /* renamed from: w, reason: collision with root package name */
    public final String f16191w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f16192x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f16193y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f16194z;

    public j0(String str, o0 o0Var, int i, IOException iOException, byte[] bArr, Map map) {
        fa.y.h(o0Var);
        this.f16192x = o0Var;
        this.f16190v = i;
        this.f16193y = iOException;
        this.f16194z = bArr;
        this.f16191w = str;
        this.A = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        switch (this.f16189u) {
            case 0:
                q0 q0Var = ((d1) ((k0) this.A).f3443v).B;
                b(q0Var);
                boolean z9 = q0Var.f16205w;
                k0 k0Var = (k0) this.A;
                if (!z9) {
                    Log.println(6, k0Var.I(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                boolean z10 = false;
                if (k0Var.f16202x == 0) {
                    e eVar = ((d1) k0Var.f3443v).A;
                    if (eVar.f16115z == null) {
                        synchronized (eVar) {
                            try {
                                if (eVar.f16115z == null) {
                                    ApplicationInfo applicationInfo = ((d1) eVar.f3443v).f16102u.getApplicationInfo();
                                    String f10 = la.b.f();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        if (str != null && str.equals(f10)) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        eVar.f16115z = Boolean.valueOf(z3);
                                    }
                                    if (eVar.f16115z == null) {
                                        eVar.f16115z = Boolean.TRUE;
                                        eVar.f().A.g("My process not in the list of running processes");
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    boolean booleanValue = eVar.f16115z.booleanValue();
                    k0 k0Var2 = (k0) this.A;
                    if (booleanValue) {
                        k0Var2.f16202x = 'C';
                    } else {
                        k0Var2.f16202x = 'c';
                    }
                }
                k0 k0Var3 = (k0) this.A;
                if (k0Var3.f16203y < 0) {
                    k0Var3.f16203y = 97001L;
                }
                char charAt = "01VDIWEA?".charAt(this.f16190v);
                k0 k0Var4 = (k0) this.A;
                char c10 = k0Var4.f16202x;
                long j10 = k0Var4.f16203y;
                String A = k0.A(true, this.f16191w, this.f16192x, this.f16193y, this.f16194z);
                StringBuilder sb2 = new StringBuilder("2");
                sb2.append(charAt);
                sb2.append(c10);
                sb2.append(j10);
                String k3 = a5.a.k(sb2, ":", A);
                if (k3.length() > 1024) {
                    k3 = this.f16191w.substring(0, 1024);
                }
                ar arVar = q0Var.A;
                if (arVar != null) {
                    String str2 = (String) arVar.f4603d;
                    String str3 = (String) arVar.f4602c;
                    q0 q0Var2 = (q0) arVar.e;
                    q0Var2.u();
                    if (((q0) arVar.e).D().getLong((String) arVar.f4601b, 0L) == 0) {
                        arVar.c();
                    }
                    long j11 = q0Var2.D().getLong(str3, 0L);
                    if (j11 <= 0) {
                        SharedPreferences.Editor edit = q0Var2.D().edit();
                        edit.putString(str2, k3);
                        edit.putLong(str3, 1L);
                        edit.apply();
                        return;
                    }
                    long j12 = j11 + 1;
                    if ((q0Var2.t().K0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j12) {
                        z10 = true;
                    }
                    SharedPreferences.Editor edit2 = q0Var2.D().edit();
                    if (z10) {
                        edit2.putString(str2, k3);
                    }
                    edit2.putLong(str3, j12);
                    edit2.apply();
                    return;
                }
                return;
            default:
                ((o0) this.f16192x).e(this.f16191w, this.f16190v, (Throwable) this.f16193y, (byte[]) this.f16194z, (Map) this.A);
                return;
        }
    }

    public j0(k0 k0Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f16190v = i;
        this.f16191w = str;
        this.f16192x = obj;
        this.f16193y = obj2;
        this.f16194z = obj3;
        this.A = k0Var;
    }
}
