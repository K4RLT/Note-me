package com.google.android.gms.internal.ads;
import l9.i;
import n9.a;
import n9.g;
import o9.a;
import s1.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* loaded from: classes.dex */
public final class tr extends ph implements vr {
    public tr() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.vr, com.google.android.gms.internal.ads.oh] */
    public static vr v4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        if (queryLocalInterface instanceof vr) {
            return (vr) queryLocalInterface;
        }
        return new oh(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator", 0);
    }

    @Override // com.google.android.gms.internal.ads.vr
    public final boolean C(String str) {
        try {
            return a.class.isAssignableFrom(Class.forName(str, false, tr.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION);
            sb2.append("Could not load custom event implementation class as Adapter: ");
            sb2.append(str);
            sb2.append(", assuming old custom event implementation.");
            i.f(sb2.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.vr
    public final zs H(String str) {
        try {
            return new dt((RtbAdapter) Class.forName(str, false, ct.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
        } catch (Throwable unused) {
            androidx.datastore.preferences.protobuf.b();
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.vr
    public final xr o(String str) {
        try {
            try {
                Class<?> cls = Class.forName(str, false, tr.class.getClassLoader());
                if (g.class.isAssignableFrom(cls)) {
                    return new ks((g) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (a.class.isAssignableFrom(cls)) {
                    return new ks((a) cls.getDeclaredConstructor(null).newInstance(null));
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 64);
                sb2.append("Could not instantiate mediation adapter: ");
                sb2.append(str);
                sb2.append(" (not a valid adapter).");
                i.f(sb2.toString());
                throw new RemoteException();
            } catch (Throwable unused) {
                i.a("Reflection failed, retrying using direct instantiation");
                if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                    return new ks(new AdMobAdapter());
                }
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    return new ks(new CustomEventAdapter());
                }
                androidx.datastore.preferences.protobuf.b();
                return null;
            }
        } catch (Throwable th) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 43);
            sb3.append("Could not instantiate mediation adapter: ");
            sb3.append(str);
            sb3.append(". ");
            i.g(sb3.toString(), th);
            androidx.datastore.preferences.protobuf.b();
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.vr
    public final boolean t(String str) {
        try {
            return a.class.isAssignableFrom(Class.forName(str, false, tr.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 88);
            sb2.append("Could not load custom event implementation class: ");
            sb2.append(str);
            sb2.append(", trying Adapter implementation class.");
            i.f(sb2.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return false;
                    }
                    String readString = parcel.readString();
                    qh.f(parcel);
                    boolean C = C(readString);
                    parcel2.writeNoException();
                    parcel2.writeInt(C ? 1 : 0);
                    return true;
                }
                String readString2 = parcel.readString();
                qh.f(parcel);
                zs H = H(readString2);
                parcel2.writeNoException();
                qh.e(parcel2, H);
                return true;
            }
            String readString3 = parcel.readString();
            qh.f(parcel);
            boolean t3 = t(readString3);
            parcel2.writeNoException();
            parcel2.writeInt(t3 ? 1 : 0);
            return true;
        }
        String readString4 = parcel.readString();
        qh.f(parcel);
        xr o10 = o(readString4);
        parcel2.writeNoException();
        qh.e(parcel2, o10);
        return true;
    }
}
