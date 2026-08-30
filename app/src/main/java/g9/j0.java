package g9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.gu;
import com.google.android.gms.internal.ads.hu;
import com.google.android.gms.internal.ads.lv;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.vi;
import com.google.android.gms.internal.ads.yl;

/* loaded from: classes.dex */
public abstract class j0 extends ph implements k0 {
    public j0() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.ads.oh] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.oh] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.gms.internal.ads.oh] */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.google.android.gms.internal.ads.oh] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.android.gms.internal.ads.oh] */
    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        x xVar = null;
        z0 z0Var = null;
        a0 a0Var = null;
        q1 q1Var = null;
        vi viVar = null;
        lv lvVar = null;
        x0 x0Var = null;
        u uVar = null;
        yl ylVar = null;
        u0 u0Var = null;
        switch (i) {
            case 1:
                oa.a zza = zza();
                parcel2.writeNoException();
                qh.e(parcel2, zza);
                return true;
            case 2:
                y();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean c10 = c();
                parcel2.writeNoException();
                ClassLoader classLoader = qh.f9846a;
                parcel2.writeInt(c10 ? 1 : 0);
                return true;
            case 4:
                z2 z2Var = (z2) qh.b(parcel, z2.CREATOR);
                qh.f(parcel);
                boolean n12 = n1(z2Var);
                parcel2.writeNoException();
                parcel2.writeInt(n12 ? 1 : 0);
                return true;
            case 5:
                a();
                parcel2.writeNoException();
                return true;
            case 6:
                b();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    if (queryLocalInterface instanceof x) {
                        xVar = (x) queryLocalInterface;
                    } else {
                        xVar = new v(readStrongBinder);
                    }
                }
                qh.f(parcel);
                G3(xVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    if (queryLocalInterface2 instanceof u0) {
                        u0Var = (u0) queryLocalInterface2;
                    } else {
                        u0Var = new t0(readStrongBinder2);
                    }
                }
                qh.f(parcel);
                O0(u0Var);
                parcel2.writeNoException();
                return true;
            case 9:
                i();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                h();
                parcel2.writeNoException();
                return true;
            case 12:
                c3 m4 = m();
                parcel2.writeNoException();
                qh.d(parcel2, m4);
                return true;
            case 13:
                c3 c3Var = (c3) qh.b(parcel, c3.CREATOR);
                qh.f(parcel);
                q2(c3Var);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                    if (queryLocalInterface3 instanceof gu) {
                    }
                }
                qh.f(parcel);
                p();
                parcel2.writeNoException();
                return true;
            case 15:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    if (queryLocalInterface4 instanceof hu) {
                    }
                }
                parcel.readString();
                qh.f(parcel);
                q();
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String j10 = j();
                parcel2.writeNoException();
                parcel2.writeString(j10);
                return true;
            case 19:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    if (queryLocalInterface5 instanceof yl) {
                        ylVar = (yl) queryLocalInterface5;
                    } else {
                        ylVar = new oh(readStrongBinder5, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener", 0);
                    }
                }
                qh.f(parcel);
                S2(ylVar);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    if (queryLocalInterface6 instanceof u) {
                        uVar = (u) queryLocalInterface6;
                    } else {
                        uVar = new oh(readStrongBinder6, "com.google.android.gms.ads.internal.client.IAdClickListener", 0);
                    }
                }
                qh.f(parcel);
                p2(uVar);
                parcel2.writeNoException();
                return true;
            case gl.zzm /* 21 */:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface7 instanceof x0) {
                        x0Var = (x0) queryLocalInterface7;
                    } else {
                        x0Var = new x0(readStrongBinder7);
                    }
                }
                qh.f(parcel);
                V0(x0Var);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean a10 = qh.a(parcel);
                qh.f(parcel);
                G2(a10);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean L = L();
                parcel2.writeNoException();
                ClassLoader classLoader2 = qh.f9846a;
                parcel2.writeInt(L ? 1 : 0);
                return true;
            case 24:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    if (queryLocalInterface8 instanceof lv) {
                        lvVar = (lv) queryLocalInterface8;
                    } else {
                        lvVar = new lv(readStrongBinder8);
                    }
                }
                qh.f(parcel);
                H0(lvVar);
                parcel2.writeNoException();
                return true;
            case 25:
                parcel.readString();
                qh.f(parcel);
                J();
                parcel2.writeNoException();
                return true;
            case 26:
                z1 U = U();
                parcel2.writeNoException();
                qh.e(parcel2, U);
                return true;
            case 29:
                w2 w2Var = (w2) qh.b(parcel, w2.CREATOR);
                qh.f(parcel);
                d3(w2Var);
                parcel2.writeNoException();
                return true;
            case 30:
                qh.f(parcel);
                s1();
                parcel2.writeNoException();
                return true;
            case 31:
                String M = M();
                parcel2.writeNoException();
                parcel2.writeString(M);
                return true;
            case 32:
                u0 x9 = x();
                parcel2.writeNoException();
                qh.e(parcel2, x9);
                return true;
            case 33:
                x z3 = z();
                parcel2.writeNoException();
                qh.e(parcel2, z3);
                return true;
            case 34:
                boolean a11 = qh.a(parcel);
                qh.f(parcel);
                t0(a11);
                parcel2.writeNoException();
                return true;
            case 35:
                String v2 = v();
                parcel2.writeNoException();
                parcel2.writeString(v2);
                return true;
            case 36:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    if (queryLocalInterface9 instanceof m0) {
                    }
                }
                qh.f(parcel);
                L2();
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle f10 = f();
                parcel2.writeNoException();
                qh.d(parcel2, f10);
                return true;
            case 38:
                String readString = parcel.readString();
                qh.f(parcel);
                n3(readString);
                parcel2.writeNoException();
                return true;
            case 39:
                f3 f3Var = (f3) qh.b(parcel, f3.CREATOR);
                qh.f(parcel);
                l1(f3Var);
                parcel2.writeNoException();
                return true;
            case 40:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
                    if (queryLocalInterface10 instanceof vi) {
                        viVar = (vi) queryLocalInterface10;
                    } else {
                        viVar = new oh(readStrongBinder10, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback", 0);
                    }
                }
                qh.f(parcel);
                q4(viVar);
                parcel2.writeNoException();
                return true;
            case 41:
                v1 A = A();
                parcel2.writeNoException();
                qh.e(parcel2, A);
                return true;
            case 42:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    if (queryLocalInterface11 instanceof q1) {
                        q1Var = (q1) queryLocalInterface11;
                    } else {
                        q1Var = new p1(readStrongBinder11);
                    }
                }
                qh.f(parcel);
                F1(q1Var);
                parcel2.writeNoException();
                return true;
            case 43:
                z2 z2Var2 = (z2) qh.b(parcel, z2.CREATOR);
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    if (queryLocalInterface12 instanceof a0) {
                        a0Var = (a0) queryLocalInterface12;
                    } else {
                        a0Var = new oh(readStrongBinder12, "com.google.android.gms.ads.internal.client.IAdLoadCallback", 0);
                    }
                }
                qh.f(parcel);
                P0(z2Var2, a0Var);
                parcel2.writeNoException();
                return true;
            case 44:
                oa.a v12 = oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                r4(v12);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    if (queryLocalInterface13 instanceof z0) {
                        z0Var = (z0) queryLocalInterface13;
                    } else {
                        z0Var = new oh(readStrongBinder13, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback", 0);
                    }
                }
                qh.f(parcel);
                z3(z0Var);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean s10 = s();
                parcel2.writeNoException();
                ClassLoader classLoader3 = qh.f9846a;
                parcel2.writeInt(s10 ? 1 : 0);
                return true;
            case 47:
                long i02 = i0();
                parcel2.writeNoException();
                parcel2.writeLong(i02);
                return true;
            case 48:
                long readLong = parcel.readLong();
                qh.f(parcel);
                B0(readLong);
                parcel2.writeNoException();
                return true;
        }
    }
}
