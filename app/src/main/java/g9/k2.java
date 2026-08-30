package g9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.ph;

/* loaded from: classes.dex */
public final class k2 extends ph implements k1 {

    /* renamed from: u, reason: collision with root package name */
    public final String f17666u;

    /* renamed from: v, reason: collision with root package name */
    public final String f17667v;

    public k2(String str, String str2) {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        this.f17666u = str;
        this.f17667v = str2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [g9.k1, com.google.android.gms.internal.ads.oh] */
    public static k1 v4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        if (queryLocalInterface instanceof k1) {
            return (k1) queryLocalInterface;
        }
        return new oh(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason", 0);
    }

    @Override // g9.k1
    public final String a() {
        return this.f17666u;
    }

    @Override // g9.k1
    public final String b() {
        return this.f17667v;
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeString(this.f17667v);
            return true;
        }
        parcel2.writeNoException();
        parcel2.writeString(this.f17666u);
        return true;
    }
}
