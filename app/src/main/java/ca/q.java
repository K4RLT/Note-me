package ca;
import d.c;
import g.b;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.ads.oh;
import fa.v;
import fa.w;
import fa.x;
import fa.y;
import wa.e7;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final l f4057a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f4058b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile x f4059c;

    /* renamed from: d, reason: collision with root package name */
    public static final Object f4060d;
    public static Context e;

    static {
        new l(m.T1("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"), 0);
        new l(m.T1("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"), 1);
        new l(m.T1("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"), 2);
        new l(m.T1("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"), 3);
        f4057a = new l(m.T1("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"), 4);
        f4058b = new l(m.T1("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"), 5);
        f4060d = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8, types: [fa.x] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static void a() {
        Object ohVar;
        if (f4059c != null) {
            return;
        }
        y.h(e);
        synchronized (f4060d) {
            try {
                if (f4059c == null) {
                    IBinder b10 = pa.c(e, pa.d.f22623d, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i = w.f16927v;
                    if (b10 == null) {
                        ohVar = 0;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        if (queryLocalInterface instanceof x) {
                            ohVar = (x) queryLocalInterface;
                        } else {
                            ohVar = new oh(b10, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 5);
                        }
                    }
                    f4059c = ohVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static t b(String str, n nVar, boolean z3, boolean z9) {
        try {
            a();
            y.h(e);
            try {
                x xVar = f4059c;
                oa.b bVar = new oa.b(e.getPackageManager());
                v vVar = (v) xVar;
                Parcel o12 = vVar.o1();
                int i = ua.g.f27145a;
                boolean z10 = true;
                o12.writeInt(1);
                int k3 = e7.k(o12, 20293);
                e7.e(o12, 1, str);
                e7.c(o12, 2, nVar);
                e7.j(o12, 3, 4);
                o12.writeInt(z3 ? 1 : 0);
                e7.j(o12, 4, 4);
                o12.writeInt(z9 ? 1 : 0);
                e7.l(o12, k3);
                ua.b(o12, bVar);
                Parcel R0 = vVar.R0(o12, 5);
                if (R0.readInt() == 0) {
                    z10 = false;
                }
                R0.recycle();
                if (z10) {
                    return t.f4066d;
                }
                return new s(new o(z3, str, nVar));
            } catch (RemoteException e8) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
                return c(e8, "module call");
            }
        } catch (pa.a e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            return c(e10, "module init: ".concat(String.valueOf(e10.getMessage())));
        }
    }
}