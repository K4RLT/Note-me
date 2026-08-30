package h9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.qh;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class b extends ph implements c {
    /* JADX WARN: Type inference failed for: r1v1, types: [h9.c, com.google.android.gms.internal.ads.oh] */
    public static c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper");
        if (queryLocalInterface instanceof c) {
            return (c) queryLocalInterface;
        }
        return new oh(iBinder, "com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.gms.internal.ads.oh] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.oh] */
    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        boolean z3;
        g ohVar;
        e eVar = null;
        g gVar = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                oa.a v12 = oa.b.v1(parcel.readStrongBinder());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) qh.b(parcel, Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback");
                    if (queryLocalInterface instanceof g) {
                        gVar = (g) queryLocalInterface;
                    } else {
                        ohVar = new oh(readStrongBinder, "com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback", 0);
                        qh.f(parcel);
                        open(v12, readString, readString2, bundle, z3, ohVar);
                    }
                }
                ohVar = gVar;
                qh.f(parcel);
                open(v12, readString, readString2, bundle, z3, ohVar);
            } else {
                oa.a v13 = oa.b.v1(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                qh.f(parcel);
                endSession(v13, readString3);
            }
        } else {
            oa.a v14 = oa.b.v1(parcel.readStrongBinder());
            ArrayList createTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback");
                if (queryLocalInterface2 instanceof e) {
                    eVar = (e) queryLocalInterface2;
                } else {
                    eVar = new oh(readStrongBinder2, "com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback", 0);
                }
            }
            qh.f(parcel);
            prewarm(v14, createTypedArrayList, eVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
