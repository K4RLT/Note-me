package g9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.lo;
import com.google.android.gms.internal.ads.lq;
import com.google.android.gms.internal.ads.mo;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.oo;
import com.google.android.gms.internal.ads.oq;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.qo;
import com.google.android.gms.internal.ads.rn;
import com.google.android.gms.internal.ads.so;
import com.google.android.gms.internal.ads.uo;

/* loaded from: classes.dex */
public abstract class f0 extends ph implements g0 {
    public f0() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.google.android.gms.internal.ads.oh] */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.ads.oh] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.oh] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.ads.oh] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.google.android.gms.internal.ads.oh] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.google.android.gms.internal.ads.oh] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.gms.internal.ads.oh] */
    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        qo qoVar;
        x xVar = null;
        oq oqVar = null;
        uo uoVar = null;
        so soVar = null;
        x0 x0Var = null;
        oo ooVar = null;
        mo moVar = null;
        lo loVar = null;
        switch (i) {
            case 1:
                d0 a10 = a();
                parcel2.writeNoException();
                qh.e(parcel2, a10);
                return true;
            case 2:
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
                f1(xVar);
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    if (queryLocalInterface2 instanceof lo) {
                        loVar = (lo) queryLocalInterface2;
                    } else {
                        loVar = new oh(readStrongBinder2, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener", 0);
                    }
                }
                qh.f(parcel);
                q1(loVar);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    if (queryLocalInterface3 instanceof mo) {
                        moVar = (mo) queryLocalInterface3;
                    } else {
                        moVar = new oh(readStrongBinder3, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener", 0);
                    }
                }
                qh.f(parcel);
                w3(moVar);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 == null) {
                    qoVar = null;
                } else {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    if (queryLocalInterface4 instanceof qo) {
                        qoVar = (qo) queryLocalInterface4;
                    } else {
                        qoVar = new oh(readStrongBinder4, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener", 0);
                    }
                }
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    if (queryLocalInterface5 instanceof oo) {
                        ooVar = (oo) queryLocalInterface5;
                    } else {
                        ooVar = new oh(readStrongBinder5, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener", 0);
                    }
                }
                qh.f(parcel);
                i2(readString, qoVar, ooVar);
                parcel2.writeNoException();
                return true;
            case 6:
                rn rnVar = (rn) qh.b(parcel, rn.CREATOR);
                qh.f(parcel);
                k4(rnVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface6 instanceof x0) {
                        x0Var = (x0) queryLocalInterface6;
                    } else {
                        x0Var = new x0(readStrongBinder6);
                    }
                }
                qh.f(parcel);
                x2(x0Var);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                    if (queryLocalInterface7 instanceof so) {
                        soVar = (so) queryLocalInterface7;
                    } else {
                        soVar = new oh(readStrongBinder7, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener", 0);
                    }
                }
                c3 c3Var = (c3) qh.b(parcel, c3.CREATOR);
                qh.f(parcel);
                y2(soVar, c3Var);
                parcel2.writeNoException();
                return true;
            case 9:
                c9.d dVar = (c9.d) qh.b(parcel, c9.d.CREATOR);
                qh.f(parcel);
                l4(dVar);
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                    if (queryLocalInterface8 instanceof uo) {
                        uoVar = (uo) queryLocalInterface8;
                    } else {
                        uoVar = new oh(readStrongBinder8, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener", 0);
                    }
                }
                qh.f(parcel);
                i3(uoVar);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                lq lqVar = (lq) qh.b(parcel, lq.CREATOR);
                qh.f(parcel);
                X2(lqVar);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
                    if (queryLocalInterface9 instanceof oq) {
                        oqVar = (oq) queryLocalInterface9;
                    } else {
                        oqVar = new oh(readStrongBinder9, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback", 0);
                    }
                }
                qh.f(parcel);
                K0(oqVar);
                parcel2.writeNoException();
                return true;
            case 15:
                c9.a aVar = (c9.a) qh.b(parcel, c9.a.CREATOR);
                qh.f(parcel);
                T3(aVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
