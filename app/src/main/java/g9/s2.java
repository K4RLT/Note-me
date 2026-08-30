package g9;
import b1.h;
import c.a;
import l.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.qh;

/* loaded from: classes.dex */
public final class s2 extends ph implements q1 {

    /* renamed from: u, reason: collision with root package name */
    public final z8.n f17701u;

    public s2(z8.n nVar) {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        this.f17701u = nVar;
    }

    public static q1 v4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        if (queryLocalInterface instanceof q1) {
            return (q1) queryLocalInterface;
        }
        return new p1(iBinder);
    }

    @Override // g9.q1
    public final boolean b() {
        if (this.f17701u == null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            boolean b10 = b();
            parcel2.writeNoException();
            ClassLoader classLoader = qh.f9846a;
            parcel2.writeInt(b10 ? 1 : 0);
            return true;
        }
        d3 d3Var = (d3) qh.b(parcel, d3.CREATOR);
        qh.f(parcel);
        y1(d3Var);
        parcel2.writeNoException();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r1 == null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // g9.q1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y1(g9.d3 r8) {
        /*
            r7 = this;
            z8.n r0 = r7.f17701u
            if (r0 == 0) goto L6a
            int r6 = r8.f17609v
            java.lang.String r5 = r8.f17610w
            long r3 = r8.f17611x
            h r0 = (h) r0
            java.lang.Object r8 = r0.f1344v
            com.google.android.gms.internal.ads.fw r8 = (com.google.android.gms.internal.ads.fw) r8
            r8.getClass()     // Catch: java.lang.Throwable -> L42
            r1 = 0
            com.google.android.gms.internal.ads.wv r8 = r8.f6189a     // Catch: android.os.RemoteException -> L1d java.lang.Throwable -> L42
            if (r8 == 0) goto L20
            g9.v1 r8 = r8.h()     // Catch: android.os.RemoteException -> L1d java.lang.Throwable -> L42
            goto L28
        L1d:
            r0 = move-exception
            r8 = r0
            goto L22
        L20:
            r8 = r1
            goto L28
        L22:
            java.lang.String r0 = "#007 Could not call remote method."
            l9.i.i(r8, r0)     // Catch: java.lang.Throwable -> L42
            goto L20
        L28:
            z8.q r0 = new z8.q     // Catch: java.lang.Throwable -> L42
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L42
            z8.j r8 = r0.f31999c     // Catch: java.lang.Throwable -> L42
            if (r8 == 0) goto L45
            g9.e3 r8 = r8.f31992a     // Catch: java.lang.Throwable -> L42
            java.lang.String r8 = r8.f17631y     // Catch: java.lang.Throwable -> L42
            if (r8 == 0) goto L45
            boolean r0 = mf.f.u(r8)     // Catch: java.lang.Throwable -> L42
            if (r0 != 0) goto L3e
            r1 = r8
        L3e:
            if (r1 == 0) goto L45
        L40:
            r2 = r1
            goto L48
        L42:
            r0 = move-exception
            r8 = r0
            goto L53
        L45:
            java.lang.String r1 = "AdMob"
            goto L40
        L48:
            java.lang.String r1 = e7.o.f15987o     // Catch: java.lang.Throwable -> L42
            r5.getClass()     // Catch: java.lang.Throwable -> L42
            f7.a(r1, r2, r3, r5, r6)     // Catch: java.lang.Throwable -> L42
            pe.z r8 = pe.z.f22715a     // Catch: java.lang.Throwable -> L42
            goto L59
        L53:
            pe.k r0 = new pe.k
            r0.<init>(r8)
            r8 = r0
        L59:
            java.lang.Throwable r8 = pe.a(r8)
            if (r8 == 0) goto L6a
            java.lang.String r8 = r8.getMessage()
            java.lang.String r0 = "no se pudo medir el ingreso: "
            java.lang.String r1 = "AdsManager"
            com.google.android.gms.internal.ads.wd0.o(r0, r8, r1)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.s2.y1(g9.d3):void");
    }
}
